package com.zml.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zml.dao.AdminDao;
import com.zml.model.Admin;

public class AdminDaoImpl extends BaseDaoImpl implements AdminDao{

	public AdminDaoImpl() {
		
	}
	
    public AdminDaoImpl(Connection conn) {
        this.conn = conn;
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

    public Admin checkUser(String name, String pwd) {
        Admin result = null;
        if (findDao(name, pwd)) {
            result = new Admin();
            result.setName(name);
            result.setPassword(pwd);
        }
        return result;
    }

    public boolean findDao(String name, String pwd) {
        boolean result = false;
        String sql = "select * from admin where name=? and password=?";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1, name);
            this.pstmt.setString(2, pwd);
            ResultSet rs = this.pstmt.executeQuery();
            if(rs.next()) {
                result = true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                this.pstmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }

}
