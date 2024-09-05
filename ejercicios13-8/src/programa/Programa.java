package programa;

import clases.LaCasaDePapel;

public class Programa {

	public static void main(String[] args) {
		LaCasaDePapel gestor = new LaCasaDePapel();
		
		System.out.println("Alta ladrones");
		gestor.altaLadron("Pedro", "Berlin", "atracos joyerias",true);
		gestor.altaLadron("Jaime", "Denver", "peleas",false);
		gestor.altaLadron("Paco", "Moscu", "cajas acorazadas",false);
		gestor.altaLadron("Alba", "Nairobi", "falsificar",true);
		gestor.altaLadron("Miguel", "Tokyo", "ladrona",true);
		gestor.listarLadrones();
		
		System.out.println();
		System.out.println("Alta Inspectora");
		gestor.altaInpectora("Itziar", "Inspectora", 10);
		gestor.listarInspectora();
		
		System.out.println();
		System.out.println("Creo Robo");
		gestor.altaRobo("Banco Espa�a", "Itziar");
		System.out.println("Registro ladrones en robo");
		gestor.introducirLadronesRobo("Berlin", "Banco Espa�a");
		gestor.introducirLadronesRobo("Denver", "Banco Espa�a");
		gestor.introducirLadronesRobo("Moscu", "Banco Espa�a");
		gestor.introducirLadronesRobo("Nairobi", "Banco Espa�a");
		gestor.introducirLadronesRobo("Tokyo", "Banco Espa�a");
		gestor.listarRobos();
		
		System.out.println();
		System.out.println("Guardo en Fichero RAF");
		gestor.guardarLadronesFichero();
		
		System.out.println();
		System.out.println("Muestro Matriz");
		gestor.matrizLadrones();
		
		
		try {
			
			System.out.println("Conecto BBDD");
			gestor.conectarBBDD();
			
			System.out.println();
			System.out.println("Guardo Ladrones");
			gestor.guardarLadronesBBDD();
			
			System.out.println();
			System.out.println("Muestro Ladrones");
			gestor.mostrarLadronesBBDD();
			
			System.out.println();
			System.out.println("Modifico antecedente (tokyo - false)");
			gestor.modificarAntecentesLadronesBBDD("tokyo", false);
			
		} catch (Exception e) {
		}
		
	}

}
