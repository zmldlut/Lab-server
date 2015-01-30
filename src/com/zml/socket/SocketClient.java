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

public class SocketClient{

	private final int MAX_TIMEOUT = 3000;//ms
	private final int SYN = 1001;
	
	private Socket socket;
	private BufferedReader in_buff;
	private OutputStream out_buff;
	
	private int cmdType;
	private int id;
	private int cmd;
	
	public SocketClient(int cmdType, int id, int cmd) {
		this.cmdType = cmdType;
		this.id = id;
		this.cmd = cmd;
		try {
			socket = new Socket("192.168.9.123", 3334);
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
	
	private void send(int cmdType, int id, int cmd) {
		switch (cmdType) {
		case C.cmd.open_door:
			BaseDataPacket openDoorCmd = new CmdPacket(SYN, id, C.packet.DOOROPENPACKETTYPE, cmd);
			sendPacket(out_buff, openDoorCmd);
			break;
		case C.cmd.open_curtain:
			BaseDataPacket openCurtainCmd = new CmdPacket(SYN, id, C.packet.CURTIONPACKETTYPE, cmd);
			sendPacket(out_buff, openCurtainCmd);
			break;
		case C.cmd.open_lamp:
			BaseDataPacket openLampCmd = new CmdPacket(SYN, id, C.packet.LAMPPACKETTYPE, cmd);
			sendPacket(out_buff, openLampCmd);
			break;
		default:
			break;
		}
	}
	
	public boolean runSocket() {
		boolean acceptMessage=true;
		boolean result = false;
		String msg=null;//保存接收到的数据信息
		JSONObject json =null;
		int ack = 0;//数据类型
		send(cmdType, id, cmd);
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
					result = true;
					acceptMessage = false;
				} else {
					acceptMessage =  false;
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
		return result;
	}
}
