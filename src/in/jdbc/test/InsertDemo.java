package in.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	
	public static void main(String[] args) throws Exception {
		String name1 = "Annki";
		String email1 = "annkit@gmail.com";
		String pass1 = "annkit23";
		String gender1 = "male";
		String city1 = "noida";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("diver class successfully loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "SUDhar@!?234");
		//PreparedStatement ps = con.prepareStatement("insert into  register values('"+name1+"', '"+email+"', '"+pass1+"', '"+gender1+"', '"+city+"')");
		PreparedStatement ps = con.prepareStatement("insert into  register values(?,?,?,?,?)");
		
		ps.setString(1, name1);
		ps.setString(2,  email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		
		int i  = ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
					
		}else {
			System.out.println("fail");
		}
		
	}
	
	
}
