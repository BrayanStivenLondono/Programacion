package personales;

public class Programa {

	public static void main(String[] args) {
		System.out.println("1. Creo una instancia de Fruteria");
		Fruteria gestor = new Fruteria();
		
		System.out.println("\n2. Alta Proveedores");
		gestor.altaProveedor("ProveAll", "Madrid");
		gestor.altaProveedor("ProveAragon", "Zaragoza");
		gestor.altaProveedor("ProveSea", "Alicante");
		gestor.altaProveedor("ProveCata", "Barcelona");
		gestor.altaProveedor("ProveAll", "Sevilla"); 
		
		System.out.println("\n3. Alta Fruta");
		gestor.altaFruta(222, "Manzana", "rojo", "2024-02-05");
		gestor.altaFruta(333, "Banano", "Amarillo", "2023-02-09");
		gestor.altaFruta(111, "Kiwi", "Marron", "2019-07-03");
		gestor.altaFruta(444, "Pera", "Verde", "2000-02-05");
		gestor.altaFruta(222, "Manzana", "rojo", "2024-02-05");
		
		System.out.println("\n4. Asigno proveedor a Fruta");
		gestor.asignarProveedor("Manzana", "ProveAll");
		gestor.asignarProveedor("Banano", "ProveAragon");
		gestor.asignarProveedor("Kiwi", "ProveCata");
		gestor.asignarProveedor("Pera", "ProveSea");
		gestor.asignarProveedor("Manzana", "ProveAll");
		
		System.out.println("\n5. Listo Proveedores y frutas");
		gestor.listarProveedores();
		System.out.println();
		gestor.listarFrutas();
		
		System.out.println("\n6. Busco Proveedor (ProveAll)");
		System.out.println(gestor.buscarProveedor("ProveAll"));
		
		System.out.println("\n7. Busco Fruta (Manzana)");
		System.out.println(gestor.buscarFruta("Manzana"));
		
		System.out.println("\n8. Proveedor por año (2024)");
		gestor.buscarProveedorPorAnno(2024);
		
		System.out.println("\n9. Eliminar Fruta (Manzana)");
		gestor.eliminarFruta("Manzana");
		gestor.listarFrutas();
		
		System.out.println("\n10. Listo Fruta por Proveedor");
		gestor.listarFrutaPorProveedor("ProveSea");
		
		System.out.println("\n11. Cambiar nombre fruta  (Pera | MiPera)");
		gestor.cambiarNombreFruta("Pera", "MiPera");
		gestor.listarFrutas();
		
		System.out.println("\n12. Estadisticas");
		gestor.estadisticasFrutas();
	}

}
