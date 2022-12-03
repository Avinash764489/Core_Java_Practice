package java_connection_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnection {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "Akk764489@";
	//	Class.forName("con.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		String sql = "Select * from staff";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}
}
