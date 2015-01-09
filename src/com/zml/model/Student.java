package com.zml.model;

import java.io.Serializable;

public class Student extends BaseModel implements Serializable{
    private static final long serialVersionUID = -2728579659761392141L;
    private String stdNum;
    private String cardID;
    private String name;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getStdNum() {
        return stdNum;
    }
    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }
    public String getCardID() {
        return cardID;
    }
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
