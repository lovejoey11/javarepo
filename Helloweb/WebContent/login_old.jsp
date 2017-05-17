<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%!
	Connection con;
	static String DB_URL = null;
	
	static String User = null;
	static String Pass = null;
	public void jspInit(){
		try {
			
			
				Properties prop = new Properties();
				prop.load(new FileInputStream("credentials.txt"));
				DB_URL = prop.getProperty("DB_URL");
				User = prop.getProperty("Username");
				Pass = prop.getProperty("Passwd");
				
				//System.out.println("User name: " + User);
				//System.out.println("Password: " + Pass);
				
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, User ,Pass);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
%>

</head>
<body>
<h3>Hello from JSP </h3>
<%
	String name = "James";
	out.println(name);
	String uname = request.getParameter("username");
	String pword = request.getParameter("password");
	
	try{
		PreparedStatement ps = con.prepareStatement("Select * from User where username=? and password=?");
		ps.setString(1, uname);
		ps.setString(2, pword);
		ResultSet rs = ps.executeQuery();
		
		if(!rs.next()){
			response.sendRedirect("error.jsp");
		}else{
			response.sendRedirect("success.jsp");
		}
	}catch (Exception e){
		e.printStackTrace();
	}
%>



</body>
</html>