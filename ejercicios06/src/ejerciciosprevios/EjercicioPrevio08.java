package ejerciciosprevios;

public class EjercicioPrevio08 {

	public static void main(String[] args) {		
		// llamo a metodos
		EjercicioPrevio08.suma(3,4);    //int
		EjercicioPrevio08.suma(3.3,4.3);//dou
		EjercicioPrevio08.suma(3.3,4);  //dou
		EjercicioPrevio08.suma(3,4.3);  //dou

	}
	//recibe dos numeros int
	// suma (int numero1, int numero2)
	static void suma (int numero1, int numero2) {
		System.out.println("La suma entera es "+(numero1+numero2));
		
	}
	//recibe dos numeros double
	// suma (double numero1, double numero2)
	static void suma (double numero1, double numero2) {
		System.out.println("La suma double es "+(numero1+numero2));
		
	}

}
