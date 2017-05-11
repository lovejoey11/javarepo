import java.sql.*;


public class Store{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = null;
	
	static final String User = null;
	static final String Pass = null;
	
	public void connectsql(){
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