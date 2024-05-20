package copiasvectorraf;

public class Principal {

	public static void main(String[] args) {
		System.out.println("crear el vector");
		ListaProductos unaLista = new ListaProductos();
		System.out.println("Rellenar vector");
		unaLista.rellenarLista();
		System.out.println("Visualizar vector");
		unaLista.visualizarLista();
		System.out.println("Pasamos vector a archivo");
		unaLista.copiarListaArchivo("datos2");
		System.out.println("Mostrando datos del archivo");
		unaLista.visualizarArchivo("datos2");
		System.out.println("Modificamos precio");
		unaLista.modificarPrecioArchivo("datos2");
		System.out.println("Mostrando datos del archivo modificado");
		unaLista.visualizarArchivo("datos2");
	
	}

}
