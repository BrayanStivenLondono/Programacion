package practicabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TrabajoDatos {
	private Connection conexion = null;
	PreparedStatement sentencia 
	= null;
	
	
	public void conectar() throws SQLException {
		String servidor = "jdbc:mysql://localhost:3306/";
		String bbdd = "basejava";
		String user = "root";
		String password = "";
		conexion = DriverManager.getConnection(servidor+bbdd, user, password);
	}
	
	public void seleccionar() throws SQLException {
		String setenciaSql = "select * from jugador";//consulta
		sentencia = conexion.prepareStatement(setenciaSql);//la preparo
		ResultSet resultado = sentencia.executeQuery();//similar a una variable de referencia, pero de ResultSet
		while (resultado.next()) {
			System.out.println(
					resultado.getString(1)+", "+
					resultado.getString(2)+", "+
					resultado.getString(3)+", ");//los tres atributos
		}
	}
}
