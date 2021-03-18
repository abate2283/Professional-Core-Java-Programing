package learningJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			// establish connection
			Connection conn = DriverManager.getConnection(url, "root", " Devopsaws1234");
			// Create a statement object to send to database
			
			
			Statement statement = conn.createStatement();
			
			
			// Execute the statement object.
			
			ResultSet resultSet = statement.executeQuery("select * from employee_tbl");
			
			while(resultSet.next()) {
				
				
				System.out.println(resultSet.getString(("name")));
			}
			
			
			// process the results.
			
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
	}

}
