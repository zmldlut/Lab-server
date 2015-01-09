package com.zml.action.app.pc;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.ReportDaoProxy;
import com.zml.model.Data;
import com.zml.model.app.pc.Report;
import com.zml.util.C;

public class ReportAction extends ActionSupport {

	private static final long serialVersionUID = 6145745746035380215L;
	private Data returnMsg;                //使用json返回单个值 
    private Report report;

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public Data getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(Data returnMsg) {
        this.returnMsg = returnMsg;
    }

    private static ReportDaoProxy reportDao = null;
    static {
        try{
            reportDao = (ReportDaoProxy) DaoFactory.getDaoInstance(ReportDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String report() {
    	if(reportDao.doCreate(report)) {
	    	returnMsg = new Data();
	    	returnMsg.setCode(C.code.report);
	    	returnMsg.setMessage("SUCCESS");
	    	returnMsg.setResult(null);
    	}
    	return SUCCESS; 
    }
}
