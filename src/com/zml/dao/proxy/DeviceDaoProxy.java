package com.zml.dao.proxy;

import java.util.ArrayList;

import com.zml.dao.DeviceDao;
import com.zml.dao.impl.DeviceDaoImpl;
import com.zml.model.app.pc.Device;

public class DeviceDaoProxy extends BaseDaoProxy implements DeviceDao{

    public DeviceDaoProxy() {
        super(DeviceDaoImpl.class);
    }
    
    public ArrayList<Device> getDevices(String type, int status, int datetime) {
        ArrayList<Device> result = null;
        result = ((DeviceDaoImpl) dao).getDevices(type, status, datetime);
        System.out.println(result.size());
        connPool.returnConnection(conn);
        return result;
    }

	@Override
	public boolean doCreate(Device obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Device findDao(Device obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
