import java.sql.*;
import java.util.*;
import java.io.*;


public class Store{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static String DB_URL = null;
	
	static String User = null;
	static String Pass = null;
	private void readcredential() throws IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("credentials.txt"));
		DB_URL = prop.getProperty("DB_URL");
		User = prop.getProperty("Username");
		Pass = prop.getProperty("Passwd");
		
		//System.out.println("User name: " + User);
		//System.out.println("Password: " + Pass);
		}
	public void connectsql() throws IOException{
		readcredential();
		Connection conn = null; 
		Statement stmt = null; 
		try{
			//register JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Open a connection
			System.out.println("Connecting to Database...");
			conn = DriverManager.getConnection(DB_URL, User, Pass);
			
			//Execute a query
			System.out.println("Creating Statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM Category";
			ResultSet rs = stmt.executeQuery(sql);
			
			//Extract data from result
			while(rs.next()){
				String CID = rs.getNString("idCategory");
				String nameCategory = rs.getNString("Namecategory");
				
				System.out.println("Category Id : " + CID);
				System.out.println("Category Name: " + nameCategory);
			}
			
			rs.close();
			stmt.close();
			conn.close();
				
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if (stmt != null )
					stmt.close();
			}catch(SQLException se2){}
			try{
				if (conn != null )
					conn.close();
			}catch(SQLException se){}
		}
		
	}
}