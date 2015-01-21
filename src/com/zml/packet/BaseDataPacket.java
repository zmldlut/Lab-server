package com.zml.packet;

public class BaseDataPacket {
	protected long Syn = 1000;
	protected int Id = -1;
	protected int PacketType = -1;
	protected int cmdType = 1;  //1代表是远程控制命令
	
	public long getSyn() {
		return Syn;
	}
	public void setSyn(long syn) {
		Syn = syn;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPacketType() {
		return PacketType;
	}
	public void setPacketType(int packetType) {
		PacketType = packetType;
	}
	public int getCmdType() {
		return cmdType;
	}
	public void setCmdType(int cmdType) {
		this.cmdType = cmdType;
	}
}
