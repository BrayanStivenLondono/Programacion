package programa;

import java.util.Scanner;

import clases.Estilo;
import clases.Visita;

public class MetodosDePeticionDatos {
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	public void opcionesAlta(Visita gestor) {
			
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
		
	}
	public void opcionesBuscar(Visita gestor) {
		System.out.print("\nNombre del Monumentos a buscar: ");
		String nombreMonumentoABuscar = input.nextLine().toLowerCase();
		System.out.println(gestor.buscarMonumento(nombreMonumentoABuscar));
		System.out.println("________________________|");
		//---------------------------------------------------------------------
		System.out.print("\nNombre del Arquitecto a buscar: ");
		String nombreArquitectoABuscar = input.nextLine().toLowerCase();
		System.out.println(gestor.buscarArquitecto(nombreArquitectoABuscar));
		System.out.println("________________________|");
		
	}
	public void opcionesEliminar(Visita gestor) {
		System.out.print("\nNombre del Monumentos a eliminar: ");
		String nombreMonumentoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarMonumento(nombreMonumentoAEliminar);
		gestor.listarMonumento();
		System.out.println("_________________________________________");
		System.out.print("Nombre del Arquitecto a eliminar: ");
		String nombreArquitectoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarArquitecto(nombreArquitectoAEliminar);
		gestor.listarArquitecto();
		
	}
	public void opcionesListar(Visita gestor) {
		System.out.println("\nListo los Monumentos");
		System.out.println("__________________________|");
		gestor.listarMonumento();
		//----------------------------------------
		System.out.println("Listo los Arquitectos");
		System.out.println("__________________________|");
		gestor.listarArquitecto();
		
	}
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
	public void opcionesListarPorAtributo(Visita gestor) {//darle al usuario la opcion de elegir
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
	public void estadisticas (Visita gestor) {
		System.out.println("Estadisticas Monumentos");
		gestor.estadisticasMonumento();
		//-------------------------------------------------------
		System.out.println("\nEstadisticas Arquitecto");
		gestor.estadisticasArquitecto();
	}
	public void ordenadorDeMonumentos (Visita gestor) {
		System.out.println("Monumentos de Mayor a Menor");
		gestor.ordenarMonumentoPorEdad();
	}
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
	public static Estilo estiloArquitecto () {
		Estilo estilo2 = new Estilo ("clasico");
		estilo2.setAnyoOrigen("siglo IV a.C.");
		return estilo2;
	}
	public static Estilo estiloMonumento () {
		Estilo estilo1 = new Estilo ("renacimiento");
		estilo1.setAnyoOrigen("siglo XIV");
		return estilo1;
	}
}
