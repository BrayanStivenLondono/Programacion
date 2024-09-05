package clasemascota;

import enumeradomascota.Sexo;
import interfacesmascota.Mascota;

public class Perro extends Animal implements Mascota {

	//lo obliga a rellenarlos, pero deben estar implementados
	
	private String codigo;
	
	public Perro (Sexo s, String c) {
		super(s);
		this.codigo = c;
		
	}
	
	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void hazRuido() {
		this.ladra();
		
	}

	public void ladra() {
		System.out.println("guau guau");
	}
	
	@Override
	public void come (String comida) {
		if (comida.equals("carne")) {
			super.come();
			System.out.println("Hhhhhh Gracias");
		} else {
			System.out.println("Lo siento, yo solo como carne");
		}
	}
	
	@Override
	public void peleaConAnimal(Animal contrincante) {
		if (contrincante.getClass().getSimpleName().equals("Perro")) {
			System.out.println("Te vas a enterar");
		} else {
			System.out.println("No me gusta pelear");
		}
	}
	
}
