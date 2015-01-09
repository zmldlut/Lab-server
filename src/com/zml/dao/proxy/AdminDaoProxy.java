package com.zml.dao.proxy;

import com.zml.dao.AdminDao;
import com.zml.dao.impl.AdminDaoImpl;
import com.zml.model.Admin;

public class AdminDaoProxy extends BaseDaoProxy implements AdminDao {
    
    public AdminDaoProxy() {
    	super(AdminDaoImpl.class);
    }
    
    public boolean findDao(String name, String pwd) {
        boolean result = false;
        result = ((AdminDaoImpl) dao).findDao(name, pwd);
        connPool.returnConnection(conn);
        return result;
    }

    public Admin checkUser(String name, String pwd) {
        Admin result = null;
        result = ((AdminDaoImpl) dao).checkUser(name, pwd);
        connPool.returnConnection(conn);
        return result;
    }

    @Override
    public boolean doCreate(Admin obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Admin findDao(Admin obj) {
        // TODO Auto-generated method stub
        return null;
    }

}
