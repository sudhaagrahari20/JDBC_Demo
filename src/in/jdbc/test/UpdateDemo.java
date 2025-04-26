package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {
		
		String gender1 = "female";
		String email1 = "sudha@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "SUDhar@!?234");
		PreparedStatement ps = con.prepareStatement("update register set gender=? where email=?");
		
		ps.setString(1, gender1);
		ps.setString(2, email1);
		
		int count = ps.executeUpdate();
		if(count > 0) {
			System.out.println("updated successfully");
		} else {
			System.out.println("updation failed");
		}
		
		
	}

}
