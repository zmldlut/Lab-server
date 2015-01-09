package com.zml.action.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zml.action.AdminAction;
/**
 * ����Ա��¼������
 * @author zml
 */
public class UserLoginInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // ��ȡActionContext
        ActionContext context = invocation.getInvocationContext();
        // ��ȡMap���͵�session
        Map<String, Object> session = context.getSession();
        // �ж��û��Ƿ��¼ 
        if(session.get(AdminAction.USER_SESSION) != null){
            // ����ִ�з���
            return invocation.invoke();
        }
        // ���ص�¼
        return "input";
    }
}
