package com.demo.service;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.User;

public class UserService {
	Connection con;

	public UserService() {
		try{
				
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdcb:mysql://localhost:3306/devops","root","password");
			
		}catch(Exception e ){
			e.printStackTrace();
		}
	}
	
	public int register(User user){
		return 0;
		
	}
	
	public List<User> retriveAll(){
		ArrayList<User> list = new ArrayList<User>();
		try{
			PreparedStatement ps = con.prepareStatement("Select * form User_001");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				User user = new User(rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("State"));
				user.setId(1);
				
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;		
	}
}
