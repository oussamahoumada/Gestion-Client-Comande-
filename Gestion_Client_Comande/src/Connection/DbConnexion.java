package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnexion {
	public Connection connection;
	public Connection getConnection() {
		try {
			   String DB_URL = "jdbc:mysql://localhost:3306/fxdb";
			   String USER = "root";
			   String PASS = "";

			  connection = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return connection;
	}
}
