package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.DriverManager;

import java.sql.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con;
	
	public void init(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://35.190.146.242:3306/Store", "root" , "528119lv");
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello, from servlet");
		out.print("<br>");
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		try{
			PreparedStatement ps= con.prepareStatement("Select * from User where username=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			if(!rs.next()){
				out.println("<body text=red>");
				out.println("Invalid User :( " + name +")");
				out.println("<br>with password :( "+pass+")");
				out.println("</body>");
							
			}else{
				out.println("<body text=green>");
				out.println("Welcome to dashboard :) " + name);
				out.println("</body>");
			}
			
		
		}catch (Exception e){
			e.printStackTrace();
		}
		
//		
	}

}
