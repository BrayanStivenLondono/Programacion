package ficheroscadenas;

public class Principal {

	public static void main(String[] args) {
		ListaNombres unaLista = new ListaNombres("datoscadenas.txt");
		
		System.out.println("Rellenar archivo");
		unaLista.rellenarArchivo();
		System.out.println("Mostrar archivo");
		unaLista.visualizarArchivo();
		System.out.println("Modificar archivo");
		unaLista.modificarArchivo();
		System.out.println("Mostrar archivo modificado");
		unaLista.visualizarArchivo();
	}

}
