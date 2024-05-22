package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class OperacionesCrud {
	// borrar todos los registros
	public void borramosTodosRegistros() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		con = Conexion.getConnection();
		if (con == null) {
			System.out.println("Error de conexion, " + "comprueba que el servidor esta en marcha");
			return;
		}
		ps = con.prepareStatement("DELETE FROM PERSONA");
		ps.execute();
		ps.close();
		con.close();
	}

	// borrar persona partiendo de un id
	public void borramosPersona(int id) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		con=Conexion.getConnection();
		ps = con.prepareStatement("DELETE FROM PERSONA WHERE ID=?");
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}

	//recuperar una persona por id
	public Persona recuperamosPersona(int id) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		Persona persona = new Persona();
		con=Conexion.getConnection();
		if (con==null) {
			System.out.println("Error de conexion, " + "comprueba que el servidor esta en marcha");
			return persona;
		}
		ps = con.prepareStatement("SELECT * FROM PERSONA WHERE ID=?");
		ps.setInt(1, id);
		rs=ps.executeQuery();
		
		while (rs.next()) {
			persona.setId(rs.getInt("ID"));
			persona.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
			persona.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
			persona.setEmail(rs.getString(4));//recupero usando indice
			persona.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
		}
		
		ps.close();
		con.close();
		rs.close();
		return persona;	
	}
	
	//actualizar primer apellido persona
	public void actualizarPrimerApellidoPersona(Persona persona) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		con=Conexion.getConnection();
		if (con == null) {
			System.out.println("Error de conexion, " + "comprueba que el servidor esta en marcha");
			return;
		}
		ps = con.prepareStatement("UPDATE PERSONA SET PRIMER_APELLIDO=? "
				+ "WHERE ID=?");
		ps.setString(1, persona.getPrimerApellido());
		ps.setInt(2, persona.getId());
		ps.execute();
		ps.close();
		con.close();
	}
	
	//insertar una persona
	public void insertamosPersona(Persona persona) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		con=Conexion.getConnection();
		if (con == null) {
			System.out.println("Error de conexion, " + "comprueba que el servidor esta en marcha");
			return;
		}
		ps = con.prepareStatement("INSERT INTO PERSONA(ID, PRIMER_APELLIDO, "
				+ "SEGUNDO_APELLIDO,EMAIL, FECHA_NACIMIENTO) "
				+ "VALUES (?,?,?,?,?)");
		ps.setInt(1, persona.getId());
		ps.setString(2, persona.getPrimerApellido());
		ps.setString(3, persona.getSegundoApellido());
		ps.setString(4, persona.getEmail());
		ps.setDate(5, new Date(persona.getFechaNacimiento().getTime()));
		ps.execute();
		ps.close();
		con.close();
	}
	
	//recuperar personas
	public List<Persona> recuperarPersonas() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		List<Persona> personas = new ArrayList<Persona>();
		con=Conexion.getConnection();
		if (con==null) {
			System.out.println("Error de conexion, " + "comprueba que el servidor esta en marcha");
			return personas;
		}
		ps = con.prepareStatement("SELECT ID, PRIMER_APELLIDO, SEGUNDO_APELLIDO,"
				+ "EMAIL, FECHA_NACIMIENTO FROM PERSONA");
		rs=ps.executeQuery();
		
		while (rs.next()) {
			Persona persona = new Persona();
			persona.setId(rs.getInt("ID"));
			persona.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
			persona.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
			persona.setEmail(rs.getString(4));//recupero usando indice
			persona.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
			personas.add(persona);
		}
		
		ps.close();
		con.close();
		rs.close();
		return personas;
	}
}


