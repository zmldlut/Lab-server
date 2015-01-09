package com.zml.action.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zml.action.AdminAction;
/**
 * 管理员登录拦截器
 * @author zml
 */
public class UserLoginInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        // 获取ActionContext
        ActionContext context = invocation.getInvocationContext();
        // 获取Map类型的session
        Map<String, Object> session = context.getSession();
        // 判断用户是否登录 
        if(session.get(AdminAction.USER_SESSION) != null){
            // 调用执行方法
            return invocation.invoke();
        }
        // 返回登录
        return "input";
    }
}
