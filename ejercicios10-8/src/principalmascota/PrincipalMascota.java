package principalmascota;

import clasemascota.Gato;
import clasemascota.Perro;
import enumeradomascota.Sexo;
import interfacesmascota.Mascota;

public class PrincipalMascota {

	public static void main(String[] args) {
		//la clase mascota es abstracta
		//no se puede crear objetos de esa clase
		//se crean de las heredadas
		Mascota garfield = new Gato(Sexo.MACHO,"12345");
		Mascota lisa = new Gato(Sexo.HEMBRA,"9876");
		Mascota kuki = new Perro(Sexo.HEMBRA,"456");
		
		System.out.println("Muestro los codigo");
		System.out.println("Garfield "+garfield.getCodigo());
		System.out.println("Lisa "+lisa.getCodigo());
		System.out.println("Kuki "+kuki.getCodigo());
		
		System.out.println();
		System.out.println("Metodo Comer");
		System.out.println("Garfield");
		garfield.come("percado");
		
		System.out.println();
		System.out.println("Lisa");
		lisa.come("pan");
		
		System.out.println();
		System.out.println("Kuki");
		kuki.come("pescado");
		
		System.out.println();
		System.out.println("Metodo Pelear");
		System.out.println("Lisa contra Garfield");
		lisa.peleaConAnimal((Gato)garfield);
		System.out.println("Lisa contra Kuki");
		lisa.peleaConAnimal((Perro)kuki);
		

	}

}
