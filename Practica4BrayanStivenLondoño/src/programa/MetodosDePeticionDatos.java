package programa;

import java.util.Scanner;

import altayestilo.AltasYEstilos;
import clases.Estilo;
import clases.Visita;

public class MetodosDePeticionDatos {
	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	/**
	 * Metodo con la peticion de datos para dar de alta un monumento y un Edificio
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo altaMonumento y
	 *               altaEdificioHistorico
	 */

	public void opcionesAlta(Visita gestor) {
		int opcionClaseADarAlta = 0;
		do {
			System.out.println("------------------------");
			System.out.println("Dar de alta, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Edificio");
			System.out.println("3. Salir de Alta");
			System.out.println("------------------------");
			System.out.print("Opción: ");
			opcionClaseADarAlta = input2.nextInt();

			switch (opcionClaseADarAlta) {
			case 1:
				System.out.println("\nDatos del Monumento para dar de alta");
				System.out.print("Nombre (sin preposicion): ");
				String nombreMonumentoAlta = input.nextLine().toLowerCase();
				System.out.print("Ubicacion: ");
				String paisMonumento = input.nextLine().toLowerCase();
				System.out.print("AnyosAntiuedad: ");
				int anyosAntiguedad = input2.nextInt();
				System.out.print("Material: ");
				String materialMonumento = input.nextLine().toLowerCase();
				System.out.print("¿Disponible? (si/no): ");
				String Disponible = input.nextLine().toLowerCase();
				Estilo estilo1 = AltasYEstilos.estiloMonumento();// jar
				gestor.altaMonumento(nombreMonumentoAlta, paisMonumento, anyosAntiguedad, materialMonumento, Disponible,
						estilo1);
				break;
			case 2:
				System.out.println("______________________________________________");
				System.out.println("\nDatos del Edificio Historico para dar de alta");
				System.out.print("Nombre (sin preposicion): ");
				String nombreEdificio = input.nextLine().toLowerCase();
				System.out.print("Ubicación: ");
				String ubicacionEdificio = input.nextLine().toLowerCase();
				System.out.print("Edad: ");
				int anyosEdificio = input2.nextInt();
				System.out.print("Material: ");
				String materialEdificio = input.nextLine().toLowerCase();

				Estilo estiloEdificio = AltasYEstilos.estiloEdificio();// jar
				gestor.altaEdificioHistorico(nombreEdificio, ubicacionEdificio, anyosEdificio, materialEdificio,
						estiloEdificio);
				break;
			case 3:
				System.out.println("Fin Alta");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcionClaseADarAlta != 3);
	}

	/**
	 * Metodo que busca el nombre de un monumento y de un Edificio
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo buscarMonumento
	 *               y buscarEdificio
	 * 
	 */
	public void opcionesBuscar(Visita gestor) {
		int opcionClaseABuscar = 0;
		do {
			System.out.println("------------------------");
			System.out.println("Buscar, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Edificio");
			System.out.println("3. Salir de Buscar");
			System.out.println("------------------------");
			System.out.print("Opción: ");
			opcionClaseABuscar = input2.nextInt();

			switch (opcionClaseABuscar) {
			case 1:
				System.out.print("\nNombre del Monumentos a buscar (sin preposicion): ");
				String nombreMonumentoABuscar = input.nextLine().toLowerCase();
				System.out.println(gestor.buscarMonumento(nombreMonumentoABuscar));
				System.out.println("________________________|");
				break;
			case 2:
				System.out.print("\nNombre del Edificio a buscar (sin preposicion): ");
				String nombreEdificioABuscar = input.nextLine().toLowerCase();
				System.out.println(gestor.buscarEdificioHistorico(nombreEdificioABuscar));
				System.out.println("________________________|");
				break;
			case 3:
				System.out.println("Fin Buscar");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcionClaseABuscar != 3);
	}

	/**
	 * Metodo que elimina un monumento y un edificio
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo
	 *               eliminarMonumento y eliminarEdificio
	 */
	public void opcionesEliminar(Visita gestor) {
		int opcionClaseAEliminar = 0;

		do {
			System.out.println("------------------------");
			System.out.println("Eliminar, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Edificio");
			System.out.println("3. Salir de Eliminar");
			System.out.println("------------------------");
			System.out.print("Opción: ");
			opcionClaseAEliminar = input2.nextInt();

			switch (opcionClaseAEliminar) {
			case 1:
				System.out.print("\nNombre del Monumentos a eliminar (sin preposicion): ");
				String nombreMonumentoAEliminar = input.nextLine().toLowerCase();
				gestor.eliminarMonumento(nombreMonumentoAEliminar);
				gestor.listarMonumento();
				System.out.println("_________________________________________");
				break;
			case 2:
				System.out.print("Nombre del Edificio a eliminar (sin preposicion): ");
				String nombreEdificioAEliminar = input.nextLine().toLowerCase();
				gestor.eliminarEdificioHistorico(nombreEdificioAEliminar);
				gestor.listarEdificioHistorico();
				break;
			case 3:
				System.out.println("Fin Eliminar");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcionClaseAEliminar != 3);
	}

	/**
	 * Metodo que lista a los monumentos y los edificios
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo listarMonumentos
	 *               y listarEdificio
	 */
	public void opcionesListar(Visita gestor) {
		System.out.println("\nListo los Monumentos");
		System.out.println("__________________________|");
		gestor.listarMonumento();
		// ----------------------------------------
		System.out.println("\nListo los Edificios");
		System.out.println("__________________________|");
		gestor.listarEdificioHistorico();

	}

	/**
	 * Metodo que cambia el nombre un monumento y de un edificio
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo
	 *               cambiarNombreMonumento y cambiarNombreEdificio
	 */
	public void opcionesCambiar(Visita gestor) {
		int opcionClaseCambiar = 0;

		do {
			System.out.println("------------------------");
			System.out.println("Cambiar, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Edificio");
			System.out.println("3. Salir de Cambiar");
			System.out.println("------------------------");
			System.out.print("Opción: ");
			opcionClaseCambiar = input2.nextInt();

			switch (opcionClaseCambiar) {
			case 1:
				System.out.println("____________________________________________");
				System.out.println("\nCambiar nombre de un Monumento (sin preposicion)");
				System.out.print("¿Cual Monumento?: ");
				String nombreMonumentoACambiar = input.nextLine().toLowerCase();

				System.out.print("Dime el nuevo nombre: ");
				String nuevoNombreMonumento = input.nextLine().toLowerCase();
				gestor.cambiarNombreMonumento(nombreMonumentoACambiar, nuevoNombreMonumento);
				gestor.listarMonumento();
				break;
			case 2:
				System.out.println("____________________________________________");
				System.out.println("\nCambiar nombre de un Edificio (sin preposicion)");
				System.out.print("¿Cual Edificio?: ");
				String nombreEdificioACambiar = input.nextLine().toLowerCase();

				System.out.print("Dime el nuevo nombre: ");
				String nuevoNombreEdificio = input.nextLine().toLowerCase();
				gestor.cambiarNombreEdificioHistorico(nombreEdificioACambiar, nuevoNombreEdificio);
				gestor.listarEdificioHistorico();
				break;
			case 3:
				System.out.println("Fin Cambiar");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcionClaseCambiar != 3);
	}

	/**
	 * Metodo que lista lo monumentos por un material y lista a los edificio a
	 * partir de una edad
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo
	 *               listarMonumentoPorMaterial y listarEdificioPorEdad
	 */
	public void opcionesListarPorAtributo(Visita gestor) {
		int opcionClaseListarAtributo = 0;
		do {
			System.out.println("------------------------");
			System.out.println("Listar, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Edificio");
			System.out.println("3. Salir de Listar");
			System.out.println("------------------------");
			System.out.print("Opción: ");
			opcionClaseListarAtributo = input2.nextInt();

			switch (opcionClaseListarAtributo) {
			case 1:
				System.out.println("Listar Monumentos Por Material");
				System.out.print("Introduce el material: ");
				String materialMonumentoAListar = input.nextLine().toLowerCase();
				gestor.listarMonumentoPorMaterial(materialMonumentoAListar);
				System.out.println("__________________________|");
				break;
			case 2:
				System.out.println("\nListar Edificio por encima de una Edad");
				System.out.print("Introduce la edad: ");
				int edadListarEdificio = input2.nextInt();
				gestor.listarEdificioHistoricoPorEdad(edadListarEdificio);
				System.out.println("__________________________|");
				break;
			case 3:
				System.out.println("Fin Listar");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcionClaseListarAtributo != 3);
	}

	/**
	 * Metodo que muestra las estadisticas de los monumentos y edificios
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo
	 *               estadisticasMonumento y estadisticasEdificio
	 */
	public void estadisticas(Visita gestor) {
		System.out.println("\nEstadisticas Monumentos");
		gestor.estadisticasMonumento();
		// -------------------------------------------------------
		System.out.println("\nEstadisticas Edificio");
		gestor.estadisticasEdificioHistorico();
	}

	/**
	 * Metodo que contiene una carga de datos de 4 monumentos y 4 edificios
	 * 
	 * @param gestor  Llama a la clase Visita, donde estan el metodo altaMonumento y
	 *                altaEdificioHistorico
	 * @param estilo2 Llama al metodo estiloMonumento que contiene el nombre del
	 *                estilo y su anyo de nacimiento
	 * @param estilo1 Llama al metodo estiloEdificio que contiene el nombre del
	 *                estilo y su anyo de nacimiento
	 */

}
