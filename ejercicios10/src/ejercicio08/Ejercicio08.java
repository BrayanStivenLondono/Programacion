package ejercicio08;

import java.util.ArrayList;

import ejercicio03.Avion;
import ejercicio03.Barco;
import ejercicio03.Coche;
import ejercicio03.Vehiculo;

public class Ejercicio08 {

	public static void main(String[] args) {
		// creamos solo ArrayList de vehiculos
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		vehiculos.add(new Coche("FDF-11", "Audi", 5, 123.6));
		vehiculos.add(new Coche("RDF-44", "Porsche", 2, 45));
		vehiculos.add(new Avion("EDF-124", "Airbus", 2, 2));
		vehiculos.add(new Avion("HDH-254", "Boeing", 2, 45));
		vehiculos.add(new Barco("1254", "Zodiac", 7, "Willy", false));
		vehiculos.add(new Barco("2345", "Legend", 3, "Francisco", true));
		vehiculos.add(new Vehiculo("FDEEF", "Honda", 2));
		vehiculos.add(new Vehiculo("DFRE", "Yamaha", 5));

		System.out.println("Muestro los datos usando Vehiculo");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}

		// filtramos el tipo de vehiculo usando instanceof
		System.out.println("Muestro los datos filtrando por tipoVehiculo");
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo instanceof Coche) {
				// casteo vehiculo a coche
				Coche coche = (Coche) vehiculo;
				System.out.println("");
				System.out.println("Datos de coche");
				System.out.println(coche.getMatricula());
				System.out.println(coche.getMarca());
				System.out.println(coche.getPlazas());
				System.out.println(coche.getKm());
			} else if (vehiculo instanceof Barco) {
				// casteo vehiculo a barco
				Barco barco = (Barco) vehiculo;
				System.out.println("");
				System.out.println("Datos de barco");
				System.out.println(barco.getMatricula());
				System.out.println(barco.getMarca());
				System.out.println(barco.getPlazas());
				System.out.println(barco.getNombreCapitan());
				System.out.println(barco.isTieneVela());
			} else if (vehiculo instanceof Avion) {
				// casteo vehiculo a avion
				Avion avion = (Avion) vehiculo;
				System.out.println("");
				System.out.println("Datos de avion");
				System.out.println(avion.getMatricula());
				System.out.println(avion.getMarca());
				System.out.println(avion.getPlazas());
				System.out.println(avion.getNumeroMisiles());
			} else {
				System.out.println("");
				System.out.println("Datos de vehiculo");
				System.out.println(vehiculo.getMatricula());
				System.out.println(vehiculo.getMarca());
				System.out.println(vehiculo.getPlazas());
			}
		}

		System.out.println("Busco un vehiculo");
		System.out.println("Lanzo la excepcion");
		Vehiculo vehiculo1 = buscarVehiculoV2("fsdfsdfsdfsdf-45", vehiculos);
		System.out.println(vehiculo1);

		// controlo aqui la excepcion, en buscarVehiculo la he lanzado
		try {
			System.out.println("Buscamos un vehiculo");
			System.out.println("Controlamos la excepcion");
			Vehiculo vehiculo2 = buscarVehiculo("DSDSDSDsdsdsds-874", vehiculos);
			// incorporada una matricula que no he insertado en el ArrayList
			System.out.println(vehiculo2);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
	}

	// este metodo es un buscar estandar salvo por un detalle
	// sino encuentra el vehiculo
	// en lugar de devolver un null, lanzo una excepcion ElementNotFoundException
	static Vehiculo buscarVehiculo(String matricula, ArrayList<Vehiculo> lista) throws ElementNotFoundException {
		for (Vehiculo vehiculo : lista) {
			if (vehiculo.getMatricula().equals(matricula)) {
				return vehiculo;
			}
		}
		throw new ElementNotFoundException(matricula);
	}

	// este metodo es un buscar estandar salvo por un detalle
	// sino encuentra vehiculo
	// lanzo una excepcion ElementNotFoundRuntimeException
	static Vehiculo buscarVehiculoV2(String matricula, ArrayList<Vehiculo> lista) {
		for (Vehiculo vehiculo : lista) {
			if (vehiculo.getMatricula().equals(matricula)) {
				return vehiculo;
			}
		}
		throw new ElementNotFoundRuntimeException(matricula);
	}

}
