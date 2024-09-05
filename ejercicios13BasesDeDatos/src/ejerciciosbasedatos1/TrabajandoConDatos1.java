package ejerciciosbasedatos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrabajandoConDatos1 {
	
	private Connection conexion=null;
	PreparedStatement sentencia =null;

	public void conectar() {
		
		try {
			String servidor = "jdbc:mysql://localhost:3306/";
			String bbdd = "videojuegos";
			String user = "root";
			String password = "";
			conexion = DriverManager.getConnection(servidor+bbdd,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void seleccionar() {
		String sentenciaSql = "SELECT * FROM videojuegos";
		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet resultado;
		
		try {
			resultado = sentencia.executeQuery();
		//mostramos
		while (resultado.next()) {
			System.out.println(resultado.getString(1)+", "+
					resultado.getString(2)+", "+
					resultado.getString(3)+", "+
					resultado.getString(4)+", "+
					resultado.getFloat(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (sentencia!=null) {
				try {
					sentencia.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void insertar(String nombre, String plataforma, 
			String genero, float precio) {
		
		 String sentenciaSql = "INSERT INTO videojuegos(nombre, plataforma,genero,"
			 		+ "precio) VALUES (?,?,?,?)";
			 PreparedStatement sentencia = null;
			try {
			sentencia = conexion.prepareStatement(sentenciaSql);
			 sentencia.setString(1,nombre);
			 sentencia.setString(2, plataforma);
			 sentencia.setString(3, genero);
			 sentencia.setFloat(4,precio);
			 sentencia.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (sentencia!=null) {
					try {
						sentencia.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
	}
	
	public void actualizar(String nombre, String plataforma, 
			String genero, float precio) {
		String sentenciaSql = "update videojuegos "
				+ "set plataforma =?, genero=?, precio = ? "
				+ "where nombre =?";
		PreparedStatement sentencia = null;
		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
		//cambia el orden segun el update
		sentencia.setString(1, plataforma);
		sentencia.setString(2, genero);
		sentencia.setFloat(3, precio);
		sentencia.setString(4, nombre);
		sentencia.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (sentencia!=null) {
				try {
					sentencia.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void eliminar(String nombre)  {
		//creo la sentenciaSql
		String sentenciaSql = "delete from videojuegos where nombre = ?";
		//llamo la sentencia
		PreparedStatement sentencia = null;
		try {
			sentencia = conexion.prepareStatement(sentenciaSql);
		//los parametros
		sentencia.setString(1, nombre);
		sentencia.executeUpdate();//como ultimo lo actulizo
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (sentencia != null) {
				try {
					sentencia.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void desconectar() {
		try {
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
