package java_connection_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "Akk764489@";
		Class.forName("con.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Enter name and subject");
		String name = sc.next();
		String sub = sc.next();
		String sql = "insert into staff(name, subject) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, sub);
		int r = ps.executeUpdate();
		if(r>0)
			System.out.println("Inserted successfully");
		else
			System.out.println("error");
		
	} 
}
