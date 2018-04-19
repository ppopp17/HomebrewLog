package popp.pat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteJDBCDriverConnection {

	public static void connect() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:C:/Users/ppopp/OneDrive/Documents/Homebrew/homebrew.db3";
			
			conn = DriverManager.getConnection(url);
			
			System.out.println("Connection has been established");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		connect();
	}
}
