package com.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginService {
	
	Connection con;
	public LoginService(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://35.190.146.242:3306/Store", "root" , "528119lv");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public boolean login(String uname, String pword)
	{
		try{
		PreparedStatement ps = con.prepareStatement("Select * from User where username=? and password=?");
		ps.setString(1, uname);
		ps.setString(2, pword);
		ResultSet rs = ps.executeQuery();
		
		if(!rs.next())
		{
			return false;
		}else{
			return true;
		}
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
		
	}
	
}
