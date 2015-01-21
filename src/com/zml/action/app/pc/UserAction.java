package com.zml.action.app.pc;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.StudentDaoProxy;
import com.zml.model.Data;
import com.zml.model.Student;
import com.zml.model.app.pc.Password;
import com.zml.util.C;

public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 5693143267639213362L;
    private Data returnMsg;                //使用json返回单个值 

    private String stdNum;
    private String password;
    
    private Password pass;

    public Password getPass() {
		return pass;
	}

	public void setPass(Password pass) {
		this.pass = pass;
	}

	public Data getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(Data returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getStdNum() {
        return stdNum;
    }

    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private static StudentDaoProxy studentDao = null;
    static {
        try{
            studentDao = (StudentDaoProxy) DaoFactory.getDaoInstance(StudentDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /*返回UserInfo对象*/   
    public String login(){ 
    	returnMsg = new Data();
    	System.out.println("login"+"  stdNum:"+stdNum+"      password:"+password);
    	Student student = studentDao.checkUser(stdNum, password);
    	System.out.println("checkUser" + student.getPassword());
    	Map<String, Student> result = new HashMap<String, Student>();
    	result.put("Student", student);
    	returnMsg.setCode(C.code.login);
    	returnMsg.setMessage("SUCCESS");
    	returnMsg.setResult(result);
    	return SUCCESS;
    }
    
    public String password() {
    	if(studentDao.updatePass(pass.getStdNum(), pass.getNewPass())) {
	    	returnMsg = new Data();
	    	returnMsg.setCode(C.code.password);
	    	returnMsg.setMessage("SUCCESS");
	    	returnMsg.setResult(null);
    	}
    	return SUCCESS; 
    }
}
