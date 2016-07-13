<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
    <a href="user/user!add?name=xiewei&age=25">使用action属性接收参数  user/user!add?name=xiewei&age=25 约定方式</a> <br/>
    <a href="user/userAdd?name=xiewei&age=25">使用action属性接收参数  user/userAdd?name=xiewei&age=25</a>
     <br/>
    <a href="user/userAdd?user.name=xiewei&user.age=25">使用action属性接收参数  user/userAdd?user.name=xiewei&user.age=25</a>
    
         <br/>
    <a href="user/userModelDriven!add?name=xiewei&age=25">action继承ModelDriven接口接收参数  user/userModelDriven!add?name=xiewei&age=25</a>
    
    
  </body>
</html>
