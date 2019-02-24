
//STEP 1. Import required packages

import java.sql.*;

class Delete {

	public static void main(String args[]) {

		try {
			// STEP 2: initialize JDBC driver
 
			Class.forName("org.postgresql.Driver");


			// STEP 3: Open a connection
			System.out.println("Connecting to database...");

			Connection con = DriverManager.getConnection("jdbc:postgresql://mod-databases-dubai.cs.bham.ac.uk:5432/ibrahima",
					USER_Name, PASSWORD);

			System.out.println("Connected...");
			
			// STEP 4: Execute a query
			
			Statement stmt = con.createStatement();
			
			String sql = "Delete from authors " + "where firstname='John' and lastname='Shakespeare'";
			stmt.executeUpdate(sql);
			System.out.println("Record Deleted...");
			// STEP 6: Clean-up environment			 
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Goodbye!");

	}

	// Database credentials
	static final String USER_Name = "aaaaa";
	static final String PASSWORD = "aaaaa";

}