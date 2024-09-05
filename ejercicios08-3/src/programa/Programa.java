package programa;

import clases.TallerVehiculos;

public class Programa {

	public static void main(String[] args) {
		System.out.println("\n1.- Creo una instancia de vehiculos llamada taller con 4 albaranes");
		int maxAlbaranes=4;
		TallerVehiculos taller = new TallerVehiculos(maxAlbaranes);
		System.out.println("\nInstancia creada");
		
		System.out.println("2.- Damos de alta 4 albaranes distintos");
		System.out.println("Damos de alta A1-A2-A3-A4");
		taller.altaAlbaran("A1", 20,"V1");
		taller.altaAlbaran("A2", 23.10,"V1");
		taller.altaAlbaran("A3", 25.95,"V1");
		taller.altaAlbaran("A4", 16.99,"V2");
		
		System.out.println("\n3.- Listar albaranes");
		taller.listarAlbaranes();
		
		System.out.println("\n4.- Buscar un albaran por su codigo y mostrar sus datos");
		System.out.println("Buscamos albaran A2");
		System.out.println(taller.buscarAlbaran("A2"));
		
		System.out.println("\n5.- Eliminar un albaran diferente al anterior");
		System.out.println("Eliminamos el albaran A3");
		taller.eliminarAlbaran("A3");
		taller.listarAlbaranes();
		
		System.out.println("\n6.- Damos de alta un nuevo albaran");
		System.out.println("Damos de alta A5");
		taller.altaAlbaran("A5", 27.33,"V3");
		taller.listarAlbaranes();
		
		System.out.println("\n7.- Modificar el codVehiculo de un albaran");
		System.out.println("Modificamos el albaran A1 de V1 a V2");
		taller.cambiarAlbaran("A1","V2");
		taller.listarAlbaranes();
		
		System.out.println("\n8.- Listar los albaranes solo de un vehiculo");
		System.out.println("Listamos albaranes del vehiculo V2");
		taller.listarAlbaranesPorVehiculo("V2");
		
	}
}
