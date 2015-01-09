<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--     为了让 Bootstrap 开发的网站对移动设备友好，确保适当的绘制和触屏缩放，需要在网页的 head 之中添加 viewport meta 标签， -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link rel="icon" href="img/favicon.ico">
    
    <title>Please sign in</title>
    
    <link href="bootstrap-3.3.1-dist/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script src="bootstrap-3.3.1-dist/dist/js/bootstrap.min.js"></script>
    
    <link href="css/signin.css" rel="stylesheet">
  </head>
  <body>
    <script language="javascript">
        function validate(f) {
            if(!(/^\w{8}$/.test(f.username.value))) {
                alert("用户ID必须是8位！");
                f.username.focus();
                return false;
            }
//             if(!(/^\w{8}$/.test(f.password.value))) {
//                 alert("密码必须是8位！");
//                 f.password.focus();
//                 return false;
//             }
        }
    </script>

    <div class="container">

      <form class="form-signin" role="form" action="user/admin_login" method="post" onSubmit="return validate(this)">
        <h2 class="form-signin-heading">智能实验室管理系统</h2>
        <input type="text" id="inputUserName" class="form-control" placeholder="Admin" name="username" required autofocus>
        <s:fielderror fieldName="username" cssStyle="color:red;"/> 
        <s:actionerror cssStyle="color:red;"/> 
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
        <s:fielderror fieldName="password" cssStyle="color:red;"/> 
        <div class="checkbox">
          <label>
            <input type="checkbox" name="userCookie" value="true"> 记住我一周
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
    </div> <!-- /container -->
  </body>
</html>
