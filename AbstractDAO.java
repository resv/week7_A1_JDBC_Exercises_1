package week7_A1_JDBC_Exercises_1;

import java.sql.Connection;
import java.sql.DriverManager;

abstract class AbstractDAO {
	protected static Connection conn;
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "C##ADAMJDBC";
			String pass = "password";
			
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch(Exception e) {}
	}	
}
