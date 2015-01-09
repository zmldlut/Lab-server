package com.zml.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zml.dao.StudentDao;
import com.zml.model.Student;

public class StudentDaoImpl extends BaseDaoImpl implements StudentDao{

	public StudentDaoImpl() {
		
	}
	
	public StudentDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public boolean doCreate(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findDao(Student obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//电脑预约登录
	public Student checkUser(String stdNum, String pwd) {
        Student result = null;
        if (findDao(stdNum, pwd)) {
            result = new Student();
            result.setStdNum(stdNum);
            result.setPassword(pwd);
        }
        return result;
    }
	
	//签到或开门身份验证
	public boolean findDao(String cardID) {
		boolean result = false;
		String sql = "select * from student where cardID = ?";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, cardID);
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
	
	//电脑预约身份验证
	public boolean findDao(String stdNum, String password) {
        boolean result = false;
        String sql = "select * from student where stdNum = ? and password = ?";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1, stdNum);
            this.pstmt.setString(2, password);
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
	
	public Student _findDao(String cardID) {
		Student result = null;
		String sql = "select stdnum from student where cardID = ?";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, cardID);
			ResultSet rs = this.pstmt.executeQuery();
			if(rs.next()) {
				result = new Student();
				result.setStdNum(rs.getString(1));
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
	
	//电脑预约更新密码
	public boolean updatePass(String stdNum, String password) {
		boolean result = false;
        String sql = "update student set password = ? where stdNum = ?";
        try {
            this.pstmt = this.conn.prepareStatement(sql);
            this.pstmt.setString(1, password);
            this.pstmt.setString(2, stdNum);
            if(this.pstmt.executeUpdate() > 0) {
                result = true;
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
}
