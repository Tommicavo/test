package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private String username = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/ecommerce";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection getConnection() {

		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection(Connection con) {

		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
