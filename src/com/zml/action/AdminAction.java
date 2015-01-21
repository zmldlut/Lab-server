package com.zml.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.zml.dao.factory.DaoFactory;
import com.zml.dao.proxy.AdminDaoProxy;
import com.zml.model.Admin;
import com.zml.util.CookieUtils;

public class AdminAction extends ActionSupport implements ServletRequestAware,
ServletResponseAware, SessionAware {

    private static final long serialVersionUID = 6213764643791285401L;
    public static final String USER_SESSION = "user.session";
    private HttpServletResponse response;
    private HttpServletRequest request;
    private Map<String, Object> session;
    private String username;
    private String password;
    private boolean userCookie;

    public boolean isUserCookie() {
        return userCookie;
    }

    public void setUserCookie(boolean userCookie) {
        this.userCookie = userCookie;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static AdminDaoProxy admin = null;
    static {
        try{ 
            admin = (AdminDaoProxy) DaoFactory.getDaoInstance(AdminDaoProxy.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // 用户登录跳转
    public String autologin() {
        System.out.println(request);
        if (CookieUtils.getCookie(request, admin)) {
            return "success";
        } else
            return "failure";
    }

    //正常登陆
//    public String login() {
//        System.out.println("userCookie:" + userCookie);
//        Admin user = admin.checkUser(username, password);
//        if(user != null) {
//            System.out.println("isRemember:" + userCookie);
//            if (userCookie) {
//                Cookie cookie = CookieUtils.addCookie(user);
//                response.addCookie(cookie);// 添加cookie到response中
//            }
//            session.put(USER_SESSION, user);
//            return "success";
//        } else {
//            this.addActionError("该用户名不存在！");
//            return "failure";
//        }
//    }
//    public void getAllVenuesRestInfo(){
//        try {
//            //System.out.println(sport_id);
//            JSONObject infoJson =  VenuesService.getAllVenuesRestInfo(sport_id);
//            HttpServletResponse response = ServletActionContext.getResponse();      
//            response.setCharacterEncoding("UTF-8");      
//            response.getWriter().write(infoJson.toString());
//        } catch (JSONException | ParseException | IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }

    // 用户退出
    public String logout() {
        HttpSession session = request.getSession(false);
        if (session != null)
            session.removeAttribute(USER_SESSION);
        Cookie cookie = CookieUtils.delCookie(request);
        if (cookie != null)
            response.addCookie(cookie);
        return "input";
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
