package ejerciciosbasedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;//CUIDADO
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrabajandoConDatos {
	
	private Connection conexion = null;
	PreparedStatement sentencia = null;

	public void conectar() throws SQLException {
		String servidor = "jdbc:mysql://localhost:3306/";
		String bbdd = "videojuegos";
		String user = "root";
		String password = "";
		conexion = DriverManager.getConnection(servidor+bbdd,user,password);
	}
	
	public void seleccionar() throws SQLException {
		String sentenciaSql = "SELECT * FROM videojuegos";//consulta
		sentencia = conexion.prepareStatement(sentenciaSql);
		ResultSet resultado = sentencia.executeQuery();//IMP (seleciona)
		//mostramos
		while (resultado.next()) {
			System.out.println(
					resultado.getString(1)+", "+
					resultado.getString(2)+", "+
					resultado.getString(3)+", "+
					resultado.getString(4)+", "+
					resultado.getFloat (5));
		}
	}
	
	public void insertar(String nombre, String plataforma, 
			String genero, float precio) throws SQLException {
		 String sentenciaSql = "INSERT INTO videojuegos(nombre, plataforma, genero, precio) "
		 					 + "VALUES (?,?,?,?)";
		 //preparo la sentencia
		 PreparedStatement sentencia = conexion.prepareStatement(sentenciaSql);
		 sentencia.setString(1, nombre);
		 sentencia.setString(2, plataforma);
		 sentencia.setString(3, genero);
		 sentencia.setFloat (4, precio);
		 sentencia.executeUpdate();//executeQuery (coge), executeUpdate (actaliza)
	}
	
	public void actualizar(String nombre, String plataforma, 
			String genero, float precio) throws SQLException {
		String sentenciaSql = "UPDATE videojuegos "
							+ "SET plataforma =?, genero=?, precio=? "
							+ "WHERE nombre =?";
		
		PreparedStatement sentencia = conexion.prepareStatement(sentenciaSql);
		//cambia el orden segun el update
		sentencia.setString(1, plataforma);
		sentencia.setString(2, genero);
		sentencia.setFloat (3, precio);
		sentencia.setString(4, nombre);
		sentencia.executeUpdate();
	}
	
	public void eliminar(String nombre) throws SQLException {
		//creo la sentenciaSql
		String sentenciaSql = "delete from videojuegos where nombre=?";
		//preraro la sentencia
		PreparedStatement sentencia = conexion.prepareStatement(sentenciaSql);
		//los parametros
		sentencia.setString(1, nombre);
		sentencia.executeUpdate();//como ultimo lo actulizo

	}
	
	public void desconectar() throws SQLException {
		sentencia.close();
	}
}
