package com.zml.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.model.Student;

public class TestAction extends ActionSupport {
    private static final long serialVersionUID = 5486252238619700386L;
    private String message;                //使用json返回单个值 
    private Student student;
    private List userInfosList;     //使用josn返回List对象 
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public List getUserInfosList() {
        return userInfosList;
    }
    public void setUserInfosList(List userInfosList) {
        this.userInfosList = userInfosList;
    }
    
    public String returnMsg(){   
        this.message = "成功返回单个值";  
        return SUCCESS; 
   }  
   /*返回UserInfo对象*/   
   public String returnUser(){ 
       student = new Student(); 
       student.setStdNum("100"); 
       student.setName("刘栋"); 
       student.setCardID("123456"); 
       return SUCCESS; 
   } 
   /*返回List对象*/   
   public String returnList(){   
       userInfosList = new ArrayList<Student>(); 
       Student u1 = new Student(); 
       u1.setStdNum("1010"); 
       u1.setName("刘栋"); 
       u1.setCardID("123456"); 
       Student u2 = new Student(); 
       u2.setStdNum("1020"); 
       u2.setName("刘栋"); 
       u2.setCardID("123456"); 
       userInfosList.add(u1);  
       userInfosList.add(u2);  
       return SUCCESS;   
   }
}
