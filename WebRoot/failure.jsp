<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>login failured</title>
  </head>
  
  <body>
	登录失败，错误的用户名或密码：<s:property value="username"/><br>
	<a href="<%=request.getContextPath() %>/login.jsp">返回</a>
  </body>
</html>
