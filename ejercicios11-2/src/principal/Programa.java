package principal;

import comparableserialisable.GrupoPensonas;

public class Programa {

	public static void main(String[] args) {
		GrupoPensonas grupo = new GrupoPensonas();
		grupo.altaPersona("Mario", 22, 187);
		grupo.altaPersona("Juan", 14, 160);
		grupo.altaPersona("Carla", 32, 177);
		grupo.altaPersona("Kevin", 25, 197);
		
		System.out.println();
		System.out.println("Guardo datos");
		grupo.guardarDatos();
		
		System.out.println();
		System.out.println("Cargo datos");
		grupo.cargarDatos();
		
		System.out.println();
		System.out.println("Muestro");
		grupo.listarPersonas();
		
	}

}
