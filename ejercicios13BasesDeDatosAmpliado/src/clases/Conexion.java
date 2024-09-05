package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static final String SERVIDOR = "jdbc:mysql://localhost:3306/";
	static final String BBDD = "personas";
	static final String USER = "root";
	static final String PASSWORD = "";
	static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection(SERVIDOR+BBDD,USER,PASSWORD);
		return connection;
	}

}
