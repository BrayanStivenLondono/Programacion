package clases;

public class Zoo {
	
	private Animal[] animales;
	
	public Zoo (int maxAnimales) {
		this.animales = new Animal [maxAnimales];
	}
	public void altaAnimal(String nombreAnimal, double peso, String especie, String zoo) {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]==null) {
				animales[i] = new Animal (nombreAnimal);
				animales[i].setPeso(peso);
				animales[i].setEspecie(especie);
				animales[i].setZoo(zoo);
				break; //IMP SIEMPRE
			}
		}
	}
	public Animal buscarAnimal(String nombreAnimal) {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]!=null) {
				if (animales[i].getNombreAnimal().equals(nombreAnimal)) {
					return animales[i];
				}
			} 
		}
		return null;
	}
	public void eliminarAnimal(String nombreAnimal) {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]!=null) {
				if (animales[i].getNombreAnimal().equals(nombreAnimal)) {
					animales[i] = null;
				}
			}
		}
	}
	public void listarAnimales() {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]!=null) {
				System.out.println(animales[i]);
			}
		}
	}
	public void cambiarNombreAnimal(String nombreAnimal1, String nombreAnimal2) {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]!=null) {
				if (animales[i].getNombreAnimal().equals(nombreAnimal1)) {
					animales[i].setNombreAnimal(nombreAnimal2);
				}
			} 
		}
	}
	public void listarAnimalPorZoo(String zoo) {
		for (int i = 0; i < animales.length; i++) {
			if (animales[i]!=null) {
				if (animales[i].getZoo().equals(zoo)) {
					System.out.println(animales[i]);
				}
			}
		}
	}
}

