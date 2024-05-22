package practicabases;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws SQLException {
		TrabajoDatos datos = new TrabajoDatos();
		System.out.println("Muestro");
		datos.seleccionar();
	}

}
