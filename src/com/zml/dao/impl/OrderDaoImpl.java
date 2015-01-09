package com.zml.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zml.dao.OrderDao;
import com.zml.model.app.pc.Order;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao{

	public OrderDaoImpl() {
		
	}
	
	public OrderDaoImpl(Connection conn) {
		this.conn = conn;
	}

	//签到或开门身份验证
	public ArrayList<Order> findDao(String stdNum) {
		ArrayList<Order> result = new ArrayList<Order>();
		String sql = "select * from order_device where stdNum = ?";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, stdNum);
			ResultSet rs = this.pstmt.executeQuery();
			Order order;
			while(rs.next()) {
				order = new Order();
				order.setId(rs.getString(1));
				order.setDevice_id(rs.getString(2));
				order.setOrder_time(rs.getString(3));
				order.setStart_time(rs.getString(4));
				order.setEnd_time(rs.getString(5));
				order.setStatus(rs.getString(6));
				order.setStdNum(rs.getString(7));
				result.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
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
