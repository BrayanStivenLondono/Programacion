package clasemascota;

import enumeradomascota.Sexo;
import interfacesmascota.Mascota;

public class Gato extends Animal implements Mascota {

	//lo obliga a rellenarlos, pero deben estar implementados
	
	private String codigo;
	
	public Gato (Sexo s, String c) {
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
		this.maulla();
		this.ronronea();
		
	}

	public void maulla() {
		System.out.println("miauuuuu");
	}
	
	public void ronronea() {
		System.out.println("rrrrrrrrr");
	}
	
	@Override
	public void come (String comida) {
		if (comida.equals("percado")) {
			super.come();
			System.out.println("Hhhhhh Gracias");
		} else {
			System.out.println("Lo siento, yo solo como percado");
		}
	}
	
	@Override
	public void peleaConAnimal(Animal contrincante) {
		if (this.getSexo()==Sexo.HEMBRA) {
			System.out.println("No me gusta pelear");
		} else {
			if (contrincante.getSexo()==Sexo.HEMBRA) {
				System.out.println("No peleo con hembras");
			} else {
				System.out.println("Te vas a enterar");
			}
		}
	}
}
