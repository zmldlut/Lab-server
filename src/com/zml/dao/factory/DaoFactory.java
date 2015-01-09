package com.zml.dao.factory;

import com.zml.dao.proxy.BaseDaoProxy;

public class DaoFactory {

	public static BaseDaoProxy getDaoInstance(Class<? extends BaseDaoProxy> daoClass) throws Exception {
		return daoClass.newInstance();
	}

//	public static StudentDaoProxy getStudentDaoInstance() throws Exception{
//		return new StudentDaoProxy() ;
//	}
//	
//	public static DoorDaoProxy getDoorDaoInstance() throws Exception{
//		return new DoorDaoProxy() ;
//	}
//	
//	public static SiginDaoProxy getSiginDaoInstance() throws Exception{
//		return new SiginDaoProxy() ;
//	}
//	
//	public static AdminDaoProxy getAdminDaoInstance() throws Exception{
//		return new AdminDaoProxy() ;
//	}
//	
//	public static ReportDaoProxy getReportDaoInstance() throws Exception{
//		return new ReportDaoProxy() ;
//	}
//	
//	public static DeviceDaoProxy getDeviceDaoInstance() throws Exception{
//		return new DeviceDaoProxy() ;
//	}
//	
//	public static OrderDaoProxy getOrderDaoInstance() throws Exception{
//		return new OrderDaoProxy() ;
//	}
}
