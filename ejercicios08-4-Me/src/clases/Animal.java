package clases;

public class Animal {
	private String nombreAnimal;
	private double peso;
	private String especie;
	private String zoo;
	
	public Animal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}
	
	//setter y getter
	public String getNombreAnimal() {
		return nombreAnimal;
	}
	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getZoo() {
		return zoo;
	}
	public void setZoo(String zoo) {
		this.zoo = zoo;
	}
	
	@Override
	public String toString() {
		return "Animal [nombreAnimal=" + nombreAnimal + ", peso=" + peso + ", especie=" + especie + ", zoo=" + zoo
				+ "]";
	}
	
}
