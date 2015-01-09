package com.zml.action.app.pc;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.OrderDaoProxy;
import com.zml.model.Data;

public class OrderAction extends ActionSupport {

    private static final long serialVersionUID = 5693143267639213362L;
    private Data returnMsg;                //使用json返回单个值 

    private static OrderDaoProxy OrderDao = null;
    static {
        try{
            OrderDao = (OrderDaoProxy) DaoFactory.getDaoInstance(OrderDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /*返回UserInfo对象*/   
//    public String login(){ 
//    	returnMsg = new Data();
//    	Student student = studentDao.checkUser(stdNum, password);
//    	Map<String, Student> result = new HashMap<String, Student>();
//    	result.put("Student", student);
//    	returnMsg.setCode(C.code.login);
//    	returnMsg.setMessage("SUCCESS");
//    	returnMsg.setResult(result);
//    	return SUCCESS; 
//    }
//    
//    public String password() {
//    	if(studentDao.updatePass(pass.getStdNum(), pass.getNewPass())) {
//	    	returnMsg = new Data();
//	    	returnMsg.setCode(C.code.password);
//	    	returnMsg.setMessage("SUCCESS");
//	    	returnMsg.setResult(null);
//    	}
//    	return SUCCESS; 
//    }
}
