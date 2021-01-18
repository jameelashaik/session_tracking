<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <form action="login">  
	Name:<input type="text" name="name"/><br/>  
	Password:<input type="password" name="password"/><br/>  
	  
	<input type="submit" value="submit">  
  
	</form> 
    This is my JSP page. <br>
    <form action="add" method= "get">
    Enter Number1: <input type="text" name="num1"> <br>
    Enter Number2: <input type="text" name="num2"><br>
    <input type="submit" value="submit">
                                                                    
    </form>
  </body>
</html>
