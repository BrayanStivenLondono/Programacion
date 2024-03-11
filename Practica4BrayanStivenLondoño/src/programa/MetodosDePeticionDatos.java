package programa;

import java.util.Scanner;

import clases.Estilo;
import clases.Visita;

public class MetodosDePeticionDatos {
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	/**
	 * Metodo con la peticion de datos para dar de alta un monumento y un arquitecto
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo altaMonumento y altaArquitecto
	 */
	
	public void opcionesAlta(Visita gestor) {
		int opcionClaseADarAlta = 0;
		do {
			
		System.out.println("\nDar de alta, ¿Cual?");
		System.out.println("1. Monumento");
		System.out.println("2. Arquitecto");
		System.out.println("3. Salir de Alta");
		System.out.print("Opción: ");
		opcionClaseADarAlta = input2.nextInt();
		
		switch (opcionClaseADarAlta) {
		case 1:
			System.out.println("\nDatos del Monumento para dar de alta");
			System.out.print("Nombre: ");
			String nombreMonumentoAlta = input.nextLine().toLowerCase();
			System.out.print("Ubicacion: ");
			String paisMonumento = input.nextLine().toLowerCase();		
			System.out.print("AnyosAntiuedad: ");
			int anyosAntiguedad = input2.nextInt();
			System.out.print("Material: ");
			String materialMonumento = input.nextLine().toLowerCase();
			System.out.print("¿Disponible? (si/no): ");
			String Disponible = input.nextLine().toLowerCase();
			Estilo estilo1 = estiloMonumento();
			gestor.altaMonumento(nombreMonumentoAlta, paisMonumento, anyosAntiguedad, materialMonumento, Disponible, estilo1);
			break;
		case 2:
			System.out.println("______________________________________________");
			System.out.println("\nDatos del Arquitecto para dar de alta");
			System.out.print("Nombre: ");
			String nombreArquitecto = input.nextLine().toLowerCase();
			System.out.print("Apellido: ");
			String apellidoArquitecto = input.nextLine().toLowerCase();
			System.out.print("Nacionalidad: ");
			String nacionalidadArquitecto = input.nextLine().toLowerCase();
			System.out.print("Edad: ");
			int edadArquitecto = input2.nextInt();
			Estilo estilo2 = estiloArquitecto();
			gestor.altaArquitecto(nombreArquitecto, apellidoArquitecto, nacionalidadArquitecto, edadArquitecto, estilo2);
			break;
		case 3:
			break;
			default:
				System.out.println("Opción incorrecta");
			break;
			}
		} while (opcionClaseADarAlta!=3);
	}
	/**
	 * Metodo que busca el nombre de un monumento y de un arquitecto
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo buscarMonumento y buscarArquitecto
	 * 
	 */
	public void opcionesBuscar(Visita gestor) {
		int opcionClaseABuscar = 0;
		do {
			System.out.println("\nBuscar, ¿Cual?");
			System.out.println("1. Monumento");
			System.out.println("2. Arquitecto");
			System.out.println("3. Salir de Buscar");
			System.out.print("Opción: ");
			opcionClaseABuscar = input2.nextInt();
			
			switch (opcionClaseABuscar) {
			case 1:
				System.out.print("\nNombre del Monumentos a buscar: ");
				String nombreMonumentoABuscar = input.nextLine().toLowerCase();
				System.out.println(gestor.buscarMonumento(nombreMonumentoABuscar));
				System.out.println("________________________|");
				break;
			case 2:
				System.out.print("\nNombre del Arquitecto a buscar: ");
				String nombreArquitectoABuscar = input.nextLine().toLowerCase();
				System.out.println(gestor.buscarArquitecto(nombreArquitectoABuscar));
				System.out.println("________________________|");
				break;
			case 3:
				break;
				default:
					System.out.println("Opción incorrecta");
					break;
			}
		} while (opcionClaseABuscar!=3);
	}
	/**
	 * Metodo que elimina un monumento y un arquitecto
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo eliminarMonumento y eliminarArquitecto
	 */
	public void opcionesEliminar(Visita gestor) {
		System.out.print("\nNombre del Monumentos a eliminar: ");
		String nombreMonumentoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarMonumento(nombreMonumentoAEliminar);
		gestor.listarMonumento();
		System.out.println("_________________________________________");
		//-------------------------------------------------------------
		System.out.print("Nombre del Arquitecto a eliminar: ");
		String nombreArquitectoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarArquitecto(nombreArquitectoAEliminar);
		gestor.listarArquitecto();
		
	
	}
	/**
	 * Metodo que lista a los monumentos y los arquitectos
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo listarMonumentos y listarArquitectos
	 */
	public void opcionesListar(Visita gestor) {
		System.out.println("\nListo los Monumentos");
		System.out.println("__________________________|");
		gestor.listarMonumento();
		//----------------------------------------
		System.out.println("Listo los Arquitectos");
		System.out.println("__________________________|");
		gestor.listarArquitecto();
		
	}
	/**
	 * Metodo que cambia el nombre un monumento y de un arquitcto
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo cambiarNombreMonumento y cambiarNombreArquitecto
	 */
	public void opcionesCambiar(Visita gestor) {
		System.out.println("\nCambiar nombre de un Monumento");
		System.out.print("¿Cual Monumento?: ");
		String nombreMonumentoACambiar = input.nextLine().toLowerCase();
		System.out.print("Dime el nuevo nombre: ");
		String nuevoNombreMonumento = input.nextLine().toLowerCase();
		gestor.cambiarNombreMonumento(nombreMonumentoACambiar,nuevoNombreMonumento);
		gestor.listarMonumento();
		System.out.println("____________________________________________");
		System.out.println("\nCambiar nombre de un Arquitecto");
		System.out.print("¿Cual Arquitecto?: ");
		String nombreArquitectoACambiar = input.nextLine().toLowerCase();
		System.out.print("Dime el nuevo nombre: ");
		String nuevoNombreArquitecto = input.nextLine().toLowerCase();
		gestor.cambiarNombreArquitecto(nombreArquitectoACambiar, nuevoNombreArquitecto);
		gestor.listarArquitecto();
		
	}
	/**
	 * Metodo que lista lo monumentos por un material y lista a los arquitectos a partir de una edad
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo listarMonumentoPorMaterial y listarArquitectoPorEdad
	 */
	public void opcionesListarPorAtributo(Visita gestor) {
		System.out.println("Listar Monumentos Por Material");
		System.out.print("Introduce el material: ");
		String materialMonumentoAListar = input.nextLine().toLowerCase();
		gestor.listarMonumentoPorMaterial(materialMonumentoAListar);
		System.out.println("__________________________|");
		
		//----------------------------------------------------------
		System.out.println("\nListar Arquitectos por edad");
		System.out.print("Introduce la edad: ");
		int edadListarArquitecto = input2.nextInt();
		gestor.listarArquitectoPorEdad(edadListarArquitecto);
		System.out.println("__________________________|");
	
	}
	
	/**
	 * Metodo que muestra las estadisticas de los monumentos y arquitectos
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo estadisticasMonumento y estadisticasArquitecto
	 */
	public void estadisticas (Visita gestor) {
		System.out.println("Estadisticas Monumentos");
		gestor.estadisticasMonumento();
		//-------------------------------------------------------
		System.out.println("\nEstadisticas Arquitecto");
		gestor.estadisticasArquitecto();
	}
	
	/**
	 * Metodo que contiene una carga de datos de 4 monumentos y 4 arquitectos
	 * 
	 * @param gestor Llama a la clase Visita, donde estan el metodo altaMonumento y altaArquitecto
	 * @param estilo2 Llama al metodo estiloMonumento que contiene el nombre del estilo y su anyo de nacimiento
	 * @param estilo1 Llama al metodo estiloArquitecto que contiene el nombre del estilo y su anyo de nacimiento
	 */
	public static void altasIntroducidasDirectamente(Visita gestor) {
		Estilo estilo1 = estiloMonumento();
		gestor.altaMonumento("el partenon", "grecia",900,"marmol","si",estilo1);
		gestor.altaMonumento("el coliseo", "italia",800,"marmol","si", estilo1);
		gestor.altaMonumento("la sagrada familia","espanya",95,"granito","si", estilo1);
		gestor.altaMonumento("piramide de guiza", "egipto", 4500,"piedra", "si", estilo1);
		
		Estilo estilo2 = estiloArquitecto();
		gestor.altaArquitecto("walter", "gropius", "alemania", 86,estilo2);
		gestor.altaArquitecto("antonio", "gaudi", "espanya",64, estilo2);
		gestor.altaArquitecto("frederic", "augusto", "francia", 70, estilo2);
		gestor.altaArquitecto("miguel", "angel","italia", 88, estilo2);
	}
	/**
	 * Metodo que que contiene el estilo de los arquitectos
	 * @return devuelve un objeto de estiloArquitecto
	 */
	public static Estilo estiloArquitecto () {
		Estilo estilo2 = new Estilo ("clasico");
		estilo2.setAnyoOrigen("siglo IV a.C.");
		return estilo2;
	}
	/**
	 * Metodo que que contiene el estilo de los monumentos
	 * @return devuelve un objeto de estiloMonumento
	 */
	public static Estilo estiloMonumento () {
		Estilo estilo1 = new Estilo ("renacimiento");
		estilo1.setAnyoOrigen("siglo XIV");
		return estilo1;
	}
}
