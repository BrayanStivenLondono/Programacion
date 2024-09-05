package ejerciciosprevios;

public class EjercicioPrevio01 {

	public static void main(String[] args) {
		// for > necesita principio y final
		// for (variable que se usa en el bucle con su valor inicial;final;incremento)
		// la variable que se usa en el bucle, se comienza siempre por i
		
		System.out.println("Bucle1");
		for (int i=0; i<5; i++) {
			System.out.println("La variable tiene el valor " +i);	
		}
		System.out.println("bucle2");
		for (int i=5; i>0; i--) {
			System.out.println("La variable tiene el valor "+i);		
		}
		System.out.println("Bucle3");
		for (int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Bucle4");
		for (int i=0; i<=10; i++) {
			System.out.print(i+" ");
		}



 
	}

}
