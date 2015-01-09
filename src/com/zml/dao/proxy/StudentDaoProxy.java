package com.zml.dao.proxy;

import com.zml.dao.StudentDao;
import com.zml.dao.impl.StudentDaoImpl;
import com.zml.model.Student;

public class StudentDaoProxy extends BaseDaoProxy implements StudentDao{
    
    public StudentDaoProxy() {
        super(StudentDaoImpl.class);
    }

    //����ԤԼ��¼
    public Student checkUser(String stdNum, String pwd) {
        Student result = null;
        result = ((StudentDaoImpl) dao).checkUser(stdNum, pwd);
        connPool.returnConnection(conn);
        return result;
    }

    //ǩ��������֤���
    public boolean findDao(String cardID) {
        boolean result = false;
        result = ((StudentDaoImpl) dao).findDao(cardID);
        connPool.returnConnection(conn);
        return result;
    }
    
  //����ԤԼ��¼
    public boolean updatePass(String stdNum, String pwd) {
        boolean result = false;
        result = ((StudentDaoImpl) dao).updatePass(stdNum, pwd);
        connPool.returnConnection(conn);
        return result;
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

}
