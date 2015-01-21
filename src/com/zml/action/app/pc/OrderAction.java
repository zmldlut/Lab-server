package com.zml.action.app.pc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.OrderDaoProxy;
import com.zml.model.Data;
import com.zml.model.Order;
import com.zml.util.C;

public class OrderAction extends ActionSupport {

    private static final long serialVersionUID = 5693143267639213362L;
    
    private String stdNum;
    private String device_id;
    private String start;
    private String stop;
	private Data returnMsg;                //使用json返回单个值 
    public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
    public Data getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(Data returnMsg) {
		this.returnMsg = returnMsg;
	}
	
	private static OrderDaoProxy OrderDao = null;
    static {
        try{
            OrderDao = (OrderDaoProxy) DaoFactory.getDaoInstance(OrderDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getOrders() {
    	returnMsg = new Data();
    	ArrayList<Order> orders = OrderDao.findDao(stdNum);
    	System.out.println("zml---" +orders.size());
    	Map<String, ArrayList<Order>> result = new HashMap<String, ArrayList<Order>>();
    	result.put("Order.List", orders);
    	returnMsg.setCode(C.code.order_list);
    	returnMsg.setMessage("SUCCESS");
    	returnMsg.setResult(result);
    	return SUCCESS;
    }
//    
    public String doCreate() {
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	
    	returnMsg = new Data();
    	Order order = new Order();
    	order.setId(UUID.randomUUID().toString());
    	order.setDevice_id(device_id);
    	order.setOrder_time(new Date());
    	try {
			order.setStart_time(formatter.parse(start));
			order.setEnd_time(formatter.parse(stop));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	order.setStatus(0);
    	order.setStdNum(stdNum);
    	if(OrderDao.doCreate(order)) {
        	returnMsg.setCode(C.code.order);
        	returnMsg.setMessage("SUCCESS");
        	returnMsg.setResult(null);
    	} else {
        	returnMsg.setCode(C.code.order);
        	returnMsg.setMessage("FAILURE");
        	returnMsg.setResult(null);
    	}
    	return SUCCESS; 
    }
}
