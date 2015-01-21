package com.zml.action.app.pc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.DeviceDaoProxy;
import com.zml.model.Data;
import com.zml.model.Device;
import com.zml.util.C;

public class DeviceAction extends ActionSupport {

    private static final long serialVersionUID = 5693143267639213362L;
    private Data returnMsg;                //ʹ��json���ص���ֵ 
   
	private String type;
    private int status;
    private int datetime;
    public Data getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(Data returnMsg) {
		this.returnMsg = returnMsg;
	}
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDatetime() {
		return datetime;
	}
	public void setDatetime(int datetime) {
		this.datetime = datetime;
	}
	private static DeviceDaoProxy DeviceDao = null;
    static {
        try{
            DeviceDao = (DeviceDaoProxy) DaoFactory.getDaoInstance(DeviceDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getDevices() {
    	returnMsg = new Data();
    	ArrayList<Device> devices = DeviceDao.getDevices(type, status, datetime);
//    	System.out.println("zml" + devices.size());
    	Map<String, ArrayList<Device>> result = new HashMap<String, ArrayList<Device>>();
    	result.put("Device.List", devices);
    	returnMsg.setCode(C.code.login);
    	returnMsg.setMessage("SUCCESS");
    	returnMsg.setResult(result);
    	return SUCCESS;
    }
}
