<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.demo.service.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Site</title>

</head>
<body>
<h3>Hello from JSP </h3>
<jsp:useBean id="loginService" class="com.demo.service.LoginService" />

<%
	String uname = request.getParameter("username");
	String pword = request.getParameter("password");
	
	boolean flag = loginService.login(uname,pword);
	if(!flag){
		response.sendRedirect("error.jsp");
	}else{
		response.sendRedirect("success.jsp");
	}
	
%>



</body>
</html>