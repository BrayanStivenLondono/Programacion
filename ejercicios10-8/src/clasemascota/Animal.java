package clasemascota;

import enumeradomascota.Sexo;

public abstract class Animal {
	private Sexo sexo;
	
	public Animal() {
		this.sexo = sexo.MACHO;
	}
	
	public Animal(Sexo x) {
		this.sexo = x;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + "]";
	}
	
	
	public void duerme() {
		System.out.println("zzzzzzzzzzzzzzzzz");
	}
	
	public void come() {
		System.out.println("Que rico");
	}
	
	public void come(String comida) {
		System.out.println("Que rico, me gusta comer "+comida);
	}
}
