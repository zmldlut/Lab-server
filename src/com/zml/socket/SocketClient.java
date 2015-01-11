package com.zml.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import net.sf.json.JSONObject;

import com.zml.packet.BaseDataPacket;
import com.zml.packet.CmdPacket;
import com.zml.util.C;

public class SocketClient {

	private final int MAX_TIMEOUT = 3000;//ms
	private final int SYN = 1000;
	
	private Socket socket;
	private BufferedReader in_buff;
	private OutputStream out_buff;
	
	public SocketClient() {
		try {
			socket = new Socket("127.0.0.1", 3333);
			socket.setSoTimeout(MAX_TIMEOUT);
			in_buff = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			out_buff = socket.getOutputStream();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void sendPacket(OutputStream out_buff, BaseDataPacket packet) {
		String msg = JSONObject.fromObject(packet).toString();
		System.out.println("发送 "+msg);
		try {
			out_buff.write(msg.getBytes("utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private
	void send(int cmdType, int id) {
		int cmd = 1;
		switch (cmdType) {
		case C.cmd.open_door:
			BaseDataPacket openDoorCmd = new CmdPacket(SYN, id, C.packet.DOOROPENPACKETTYPE, cmd);
			sendPacket(out_buff, openDoorCmd);
			break;
		case C.cmd.open_curtain:
			BaseDataPacket openCurtainCmd = new CmdPacket(SYN, id, C.packet.CURTIONPACKETTYPE, cmd);
			sendPacket(out_buff, openCurtainCmd);
			break;
		case C.cmd.close_curtain:
			BaseDataPacket closeCurtainCmd = new CmdPacket(SYN, id, C.packet.CURTIONPACKETTYPE, cmd);
			sendPacket(out_buff, closeCurtainCmd);
			break;
		case C.cmd.open_lamp:
			BaseDataPacket openLampCmd = new CmdPacket(SYN, id, C.packet.LAMPPACKETTYPE, cmd);
			sendPacket(out_buff, openLampCmd);
			break;
		case C.cmd.close_lamp:
			BaseDataPacket closeLampCmd = new CmdPacket(SYN, id, C.packet.LAMPPACKETTYPE, cmd);
			sendPacket(out_buff, closeLampCmd);
			break;
		default:
			break;
		}
	}
	
	public boolean runSocket(int cmdType, int id) {
		boolean acceptMessage=true;
		String msg=null;//保存接收到的数据信息
		JSONObject json =null;
		int ack = 0;//数据类型
		send(cmdType, id);
		while(acceptMessage) {
			try {
				System.out.println("socket正在读取数据。。。。。。");
				msg = in_buff.readLine();
				if (msg != null) {
					System.out.println("socket "+msg);
				} else {
					continue;
				}
				json =  JSONObject.fromObject(msg);
				ack = json.getInt("ack");
				if (ack == 1) {
					return true;
				} else {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
				acceptMessage = false;
				break;
			}
		}
		//关闭socket连接，释放数据库连接
		if(socket!=null) {
			try {
				in_buff.close();
				out_buff.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
