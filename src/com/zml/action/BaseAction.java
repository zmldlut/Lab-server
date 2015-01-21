package com.zml.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
    protected Map<String, Object> resultMsg;

	public Map<String, Object> getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(Map<String, Object> resultMsg) {
		this.resultMsg = resultMsg;
	}
}
