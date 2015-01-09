package com.zml.dao.proxy;

import java.util.ArrayList;

import com.zml.dao.OrderDao;
import com.zml.dao.impl.OrderDaoImpl;
import com.zml.model.app.pc.Order;

public class OrderDaoProxy extends BaseDaoProxy implements OrderDao{
    
    public OrderDaoProxy() {
        super(OrderDaoImpl.class);
    }

    //ǩ��������֤���
    public ArrayList<Order> findDao(String stdNum) {
        ArrayList<Order> result = null;
        result = ((OrderDaoImpl) dao).findDao(stdNum);
        connPool.returnConnection(conn);
        return result;
    }

	@Override
	public boolean doCreate(Order obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findDao(Order obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
