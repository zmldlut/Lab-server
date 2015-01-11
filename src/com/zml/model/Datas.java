package com.zml.model;

import java.util.ArrayList;
import java.util.Map;

import com.zml.model.app.pc.Device;

public class Datas {
    private int code;
    private String message;
    private Map<String, ArrayList<Device>> result;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, ArrayList<Device>> getResult() {
		return result;
	}
	public void setResult(Map<String, ArrayList<Device>> result2) {
		this.result = result2;
	}
}
