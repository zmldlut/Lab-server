package com.zml.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.zml.action.AdminAction;
import com.zml.dao.proxy.AdminDaoProxy;
import com.zml.model.Admin;
import com.zml.model.BaseModel;

public class CookieUtils {
    public static final String USER_COOKIE = "user.cookie";

    // ���һ��cookie
    public static Cookie addCookie(BaseModel user) {
        Admin admin = (Admin)user;
        Cookie cookie = new Cookie(USER_COOKIE, admin.getName() + ","
                + admin.getPassword());
        System.out.println("���cookie");
        cookie.setMaxAge(60 * 60 * 24 * 14);// cookie��������
        return cookie;
    }

    // �õ�cookie
    public static boolean getCookie(HttpServletRequest request, AdminDaoProxy adminDAO) {
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies: " + cookies);
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("cookie: " + cookie.getName());
                if (CookieUtils.USER_COOKIE.equals(cookie.getName())) {
                    String value = cookie.getValue();
                    if (StringUtils.isNotBlank(value)) {
                        String[] split = value.split(",");
                        String username = split[0];
                        String password = split[1];
//                        Admin admin = adminDAO.checkUser(username, password);
//                        if (admin != null) {
//                            HttpSession session = request.getSession();
//                            session.setAttribute(AdminAction.USER_SESSION, admin);// ����û���session��
//                            return true;
//                        }
                    }
                }
            }
        }
        return false;
    }

    // ɾ��cookie
    public static Cookie delCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (USER_COOKIE.equals(cookie.getName())) {
                    cookie.setValue("");
                    cookie.setMaxAge(0);
                    return cookie;
                }
            }
        }
        return null;
    }
}
