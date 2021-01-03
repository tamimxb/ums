package ums;
import java.sql.*;

public class getCon {
	Connection con;
	Statement s;
	
	public getCon() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");
			s = con.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
