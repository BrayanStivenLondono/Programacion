package ejercicio08previo;

public class NaveEspacial {

	public static void main(String[] args) {
		Alien marciano = new Alien (); //sin parametro
		System.out.println(marciano.toString());
		System.out.println(marciano);
		//NO NECESARIO PONER toString, lo llama directamente
		
		Alien marciano1 = new Alien (4,"Urano",6,"Amarillo"); //con parametro
		System.out.println(marciano1.toString());
		System.out.println(marciano1);
		
		System.out.println();
		
		Astronauta Astro = new Astronauta();//sin parametro
		System.out.println(Astro);
		Astronauta Astro1 = new Astronauta("Felipe",56,"Piloto","Italiano");//con parametro
		System.out.println(Astro1);
		

	}

}
