<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete user</title>
</head>
<body>
<div class="container">
		<jsp:useBean id="UserService" class="com.demo.service.UserService" />
		
		<% 
			int id = Integer.parseInt(request.getParameter("id"));
			UserService.delete(id);
			response.sendRedirect("showall.jsp");
		%>


	</div>
</body>
</html>