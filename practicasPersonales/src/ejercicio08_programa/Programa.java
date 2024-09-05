package ejercicio08_programa;

import java.time.LocalDate;

import ejercicio08_7.Fruteria;
import ejercicio08_7.Proveedor;

public class Programa {

	public static void main(String[] args) {
		System.out.println("\n1. Creo una instancia de Fruteria");
		Fruteria gestor = new Fruteria (9,9);
		
		//proveedores
		Proveedor proveedor1 = new Proveedor ("Proveedor Frutas","2312", LocalDate.now());
		Proveedor proveedor2 = new Proveedor ("Proveedor Verduras","3434", LocalDate.now());
		
		System.out.println("\n2. Alta 4 frutas y 4 verduras");
		gestor.altaFrutas("mango", "amarillo", 12.5,"mediano", proveedor1);
		gestor.altaFrutas("fresa", "rojo", -10.5, "pequeño", proveedor1);
		gestor.altaFrutas("banano", "amarillo", 2.5,"mediano",  proveedor1);
		gestor.altaFrutas("manzana", "rojo", 12.5,"pequeño", proveedor1);
		
		gestor.altaVerduras("zanahoria", "amarillo", 11.4, "grande", proveedor2);
		gestor.altaVerduras("aguacate", "verde", 12.4, "mediano", proveedor2);
		gestor.altaVerduras("repollo", "verde", 4.6, "grande", proveedor2);
		gestor.altaVerduras("brocoli", "verde", 8.6, "pequeño", proveedor2);
		
		System.out.println("\n3. Listo las frutas");
		gestor.listarFrutas();
		System.out.println("\n3. Listo las verduras");
		gestor.listarVerduras();
		
		System.out.println("\n4. Busco a (mango)");
		System.out.println(gestor.buscarFruta("mango"));
		System.out.println("\n4. Busco a (aguacate)");
		System.out.println(gestor.buscarVerduras("aguacate"));
		
		System.out.println("\n5. Elimino una fruta (manzana)");
		gestor.eliminarFruta("manzana");
		gestor.listarFrutas();
		System.out.println("\n5. Elimino una verdura (brocoli)");
		gestor.eliminarVerdura("brocoli");
		gestor.listarVerduras();
		
		System.out.println("\n6. Doy de alta una fruta (sandia)");
		gestor.altaFrutas("sandia", "verde", 32.4, "grande", proveedor1);
		gestor.listarFrutas();
		System.out.println("\n6. Doy de alta una verdura (pimiento)");
		gestor.altaVerduras("pimiento", "rojo", 3.5, "pequeño", proveedor2);
		gestor.listarVerduras();
		
		System.out.println("\n7. Cambio nombre de fruta (banano)");
		gestor.cambiarNombreFruta("banano", "platano");
		gestor.listarFrutas();
		System.out.println("\n7. Cambio nombre de verdura (repollo)");
		gestor.cambiarNombreVerdura("repollo", "lechuga");
		gestor.listarVerduras();
		
		System.out.println("\n8. Frutas por tamaño (pequeño)");
		gestor.listaFrutasPorTamaño("pequeño");
		System.out.println("\n8. Verdura por colos (verde)");
		gestor.listarVerdurasPorColor("verde");
		
		System.out.println("\n9. Listo frutas por Proveedor");
		gestor.listarFrutasPorProveedor(proveedor1);
		System.out.println("\n9. Listo verduras por Proveedor");
		gestor.listarVerdurasPorProveedor(proveedor2);
		
		System.out.println("\n10. Estadisticas de Frutas");
		gestor.estadisticasFrutas();
		System.out.println("\n10. Estadisticas de Verduras");
		gestor.estadisticasVerduras();
	
		System.out.println("\nOtras Estadisticas Frutas");
		gestor.otrasEstadisticasFruta();
		System.out.println("\nOtras Estadisticas Verduras");
		gestor.otrasEstadisticasVerduras();
		
	}
}
