package programa;

import java.util.Scanner;

import clases.GestorMonumentos;

public class MenuOperaciones {
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	public void opcionesAlta(GestorMonumentos gestor) {
		System.out.println("\nDatos del Monumento para dar de alta");
		System.out.print("Nombre: ");
		String nombreMonumentoAlta = input.nextLine().toLowerCase();
		System.out.print("Ubicacion: ");
		String paisMonumento = input.nextLine().toLowerCase();
		System.out.print("Anyo: ");
		int anyosAntiguedad = input2.nextInt();
		System.out.print("Material: ");
		String materialMonumento = input.nextLine().toLowerCase();
		System.out.print("Estilo: ");
		String estiloMonumento = input.nextLine().toLowerCase();
		System.out.print("¿Disponible? (si/no): ");
		String esDisponible = input.nextLine().toLowerCase();	
		gestor.altaMonumento(nombreMonumentoAlta, paisMonumento, anyosAntiguedad, materialMonumento, estiloMonumento, esDisponible);
		gestor.listarMonumento();
		//---------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("\nDatos del Arquitecto para dar de alta");
		System.out.print("Nombre: ");
		String nombreArquitecto = input.nextLine().toLowerCase();
		System.out.print("Apellido: ");
		String apellidoArquitecto = input.nextLine().toLowerCase();
		System.out.print("Nacionalidad: ");
		String nacionalidadArquitecto = input.nextLine().toLowerCase();
		System.out.print("Estilo: ");
		String estiloArquitecto = input.nextLine().toLowerCase();
		System.out.print("Edad: ");
		int edadArquitecto = input2.nextInt();
		gestor.altaArquitecto(nombreArquitecto, apellidoArquitecto, nacionalidadArquitecto, estiloArquitecto, edadArquitecto);
		gestor.listarArquitecto();
		
	}
	public void opcionesBuscar(GestorMonumentos gestor) {
		System.out.print("\nNombre del Monumentos a buscar: ");
		String nombreMonumentoABuscar = input.nextLine().toLowerCase();
		System.out.println(gestor.buscarMonumento(nombreMonumentoABuscar));
		System.out.println("-------------------------------------");
		gestor.listarMonumento();
		//--------------------------------------------------------------------
		System.out.print("\nNombre del Arquitecto a buscar: ");
		String nombreArquitectoABuscar = input.nextLine().toLowerCase();
		System.out.println(gestor.buscarArquitecto(nombreArquitectoABuscar));
		System.out.println("----------------------------------------");
		gestor.listarArquitecto();
		
	}
	public void opcionesEliminar(GestorMonumentos gestor) {
		System.out.print("\nNombre del Monumentos a eliminar: ");
		String nombreMonumentoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarMonumento(nombreMonumentoAEliminar);
		gestor.listarMonumento();
		//------------------------------------------------------------
		System.out.print("\nNombre del Arquitecto a eliminar: ");
		String nombreArquitectoAEliminar = input.nextLine().toLowerCase();
		gestor.eliminarArquitecto(nombreArquitectoAEliminar);
		gestor.listarArquitecto();
		
	}
	public void opcionesListar(GestorMonumentos gestor) {
		System.out.println("\nListo los Monumentos");
		System.out.println("--------------------------------");
		gestor.listarMonumento();
		//----------------------------------------
		System.out.println("\nListo los Arquitectos");
		System.out.println("--------------------------------");
		gestor.listarArquitecto();
		
	}
	public void opcionesCambiar(GestorMonumentos gestor) {
		System.out.println("\nCambiar nombre de un Monumento");
		System.out.print("¿Cual Monumento?: ");
		String nombreMonumentoACambiar = input.nextLine().toLowerCase();
		System.out.print("Dime el nuevo nombre: ");
		String nuevoNombreMonumento = input.nextLine().toLowerCase();
		gestor.cambiarNombreMonumento(nombreMonumentoACambiar,nuevoNombreMonumento);
		gestor.listarMonumento();
		//------------------------------------------------------
		System.out.println("\nCambiar nombre de un Arquitecto");
		System.out.print("¿Cual Arquitecto?: ");
		String nombreArquitectoACambiar = input.nextLine().toLowerCase();
		System.out.print("Dime el nuevo nombre: ");
		String nuevoNombreArquitecto = input.nextLine().toLowerCase();
		gestor.cambiarNombreArquitecto(nombreArquitectoACambiar, nuevoNombreArquitecto);
		gestor.listarArquitecto();
		
	}
	public void opcionesListarPorAtributo(GestorMonumentos gestor) {
		System.out.println("\nListar Monumentos por país");
		System.out.print("Introduce el país: ");
		String paisListarMonumento = input.nextLine().toLowerCase();
		gestor.listarMonumentoPorUbicacion(paisListarMonumento);
		System.out.println("-----------------------------------------------");
		gestor.listarMonumento();
		//----------------------------------------------------------
		System.out.println("\nListar Arquitectos por edad");
		System.out.print("Introduce la edad: ");
		int edadListarArquitecto = input2.nextInt();
		gestor.listarArquitectoPorEdad(edadListarArquitecto);
		System.out.println("-----------------------------------------------");
		gestor.listarArquitecto();
		
	}
	public static void altasIntroducidasDirectamente(GestorMonumentos gestor) {
		gestor.altaMonumento("el partenon", "grecia",900,"marmol","dorico clasico","si");
		gestor.altaMonumento("el coliseo romano", "italia",800,"piedra y hormigon","arquitectura romana","si");
		gestor.altaMonumento("la sagrada familia","espanya",95,"piedra caliza","modernismo catalan","si");
		
		gestor.altaArquitecto("ictinos", "calicrates", "grecia", "dorica clasica", 70);
		gestor.altaArquitecto("antonio", "gaudi", "espanya", "modernismo catalan", 64);
		gestor.altaArquitecto("frederic", "augusto", "francia", "neoclasico", 70);
	}
}
