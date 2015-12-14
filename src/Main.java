import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		String url= "jdbc:mysql://localhost:3307/reservationsalle"+
				"?verifyServerCertificate=false"+
				"&useSSL=true";
		String login = "root";
		String passwd = "password";
		java.sql.Statement st = null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,login,passwd);
			
			st = conn.createStatement();
			
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
