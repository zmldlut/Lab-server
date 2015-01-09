<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>智能实验室后台管理系统</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/bootstrap.min.css">
        <link rel="stylesheet" href="./css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="./css/unicorn.login.css">
    </head>
    <body>
        <div id="logo">
            <img src="./img/logo.png" alt="">
        </div>
        <div id="loginbox">
            <form id="loginform" class="form-vertical" action="bg_main.jsp">
                <p>请先登录</p>
                <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-user" icon-white></i></span><input type="text" name="username" placeholder="Username">
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span><input type="password" name="password" placeholder="Password">
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left">
                    <div class="checkbox">
                      <label>
                        <input type="checkbox" name="userCookie" value="true"> 记住我一周
                      </label>
                    </div></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="Login"></span>
                </div>
            </form>
        </div>
        <script src="./js/jquery.min.js"></script>  
        <script src="./js/unicorn.login.js"></script> 
</body></html>