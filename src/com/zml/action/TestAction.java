package com.zml.action;

import java.util.HashMap;

import com.zml.model.Data;
import com.zml.socket.SocketClient;
import com.zml.util.C;

public class TestAction extends BaseAction {
    private static final long serialVersionUID = 5486252238619700386L;
    
    private int packetType = 1003;
    private int node_id = 4;
    private int cmd = 1;
    private Data returnMsg;                //使用json返回单个值 

	public Data getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(Data returnMsg) {
		this.returnMsg = returnMsg;
	}
	public int getPacketType() {
		return packetType;
	}
	public void setPacketType(int packetType) {
		this.packetType = packetType;
	}
	public int getNode_id() {
		return node_id;
	}
	public void setNode_id(int node_id) {
		this.node_id = node_id;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String openDoor() {
		returnMsg = new Data();
		resultMsg = new HashMap<String, Object>();
    	SocketClient client = new SocketClient(packetType, node_id, cmd);
    	boolean result = client.runSocket();
    	resultMsg.put("result", result);
    	returnMsg.setCode(C.code.login);
    	returnMsg.setMessage("SUCCESS");
    	returnMsg.setResult(resultMsg);
    	return SUCCESS;
    }
}
