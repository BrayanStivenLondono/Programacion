package programa;

import clases.Fruteria;

public class Programa {

	public static void main(String[] args) {
		Fruteria fruta = new Fruteria (4);
		System.out.println("1 - Creo una instancia de frutas");
		
		System.out.println("\n2 - Damos de alta frutas");
		fruta.altaFruta("MAZ","dulce", 21, "AZZ");
		fruta.altaFruta("PER","Agridulce", 12, "AZZ");
		fruta.altaFruta("BAN","dulce", 21, "AZZ");
		fruta.altaFruta("PI�","dulce", 34, "PPA");
		
		System.out.println("\n3 - Listar las frutas");
		fruta.listarFrutas();
		
		System.out.println("\n4 - Buscar fruta por su codigo (PER)");
		System.out.println(fruta.buscarFruta("PER"));
		System.out.println("__________________________________________________________________________");
		fruta.listarFrutas();
		
		System.out.println("\n5 - Eliminar fruta diferente a la anterior (PI�)");
		fruta.eliminarFruta("PI�");
		fruta.listarFrutas();
		
		System.out.println("\n6 - A�adir una nueva fruta (MANG)");
		fruta.altaFruta("MANG","dulce", 50, "MOP");
		fruta.listarFrutas();
		
		System.out.println("\n7- Modificar el tipo de fruta de una fruta (BAN)");
		fruta.cambiarCodigoFrutas("BAN", "MMI");
		fruta.listarFrutas();
		
		System.out.println("\n8 - Listar las frutas de una fruteria");
		fruta.listarFrutasPorFruteria("AZZ");
		fruta.listarFrutas();
	}
}
