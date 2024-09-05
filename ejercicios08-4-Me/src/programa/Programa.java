package programa;

import clases.Zoo;

public class Programa {

	public static void main(String[] args) {
		Zoo zoo = new Zoo (4);
		System.out.println("1 - Creo la Instancia");
		
		System.out.println("\n2.- Damos de alta 4 albaranes distintos");
		System.out.println("Damos de alta 4 animales");
		zoo.altaAnimal("cesar", 30, "chimpanse", "loca");
		zoo.altaAnimal("victor", 43, "leon", "nacional");
		zoo.altaAnimal("juan", 45, "foca", "inter");
		zoo.altaAnimal("luis", 62, "jirafa", "local");
		
		System.out.println("\n3 - Listo animales");
		zoo.listarAnimales();
		
		System.out.println("\n4 - Busco un animale por su nombre (cesar)");
		System.out.println(zoo.buscarAnimal("cesar"));
		System.out.println("________________________________________________________________________");
		zoo.listarAnimales();
		
		System.out.println("\n5 - Elimino animal diferente al anterior");
		zoo.eliminarAnimal("juan");
		zoo.listarAnimales();
		
		System.out.println("\n6 - Agregar un nuevo animal (santiago)");
		zoo.altaAnimal("santiago", 23, "cebra", "internacional");
		zoo.listarAnimales();
		
		System.out.println("\n7 - Cambiar nombre de animal");
		zoo.cambiarNombreAnimal("victor", "victoria");
		zoo.listarAnimales();
		
		System.out.println("\n8 - Listar animales por zoo");
		zoo.listarAnimalPorZoo("local");
		zoo.listarAnimales();
	}
}
