package com.demo.service;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;



public class LoginService {
	
	Connection con;
	static String DB_URL = null;
	static String User = null;
	static String Pass = null;
	public LoginService(){
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("C:\\Users\\Lovejoy\\Documents\\GitHub\\javarepo\\Helloweb\\credentials.txt"));
			DB_URL = prop.getProperty("DB_URL");
			User = prop.getProperty("Username");
			Pass = prop.getProperty("Passwd");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL,User,Pass);
			
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
