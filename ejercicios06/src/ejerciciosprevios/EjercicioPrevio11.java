package ejerciciosprevios;

public class EjercicioPrevio11 {

	public static void main(String[] args) {		
		// llamo a metodos
		EjercicioPrevio11.multiplica(3,4);    //int
		EjercicioPrevio11.multiplica(3.3,4.3);//dou
		EjercicioPrevio11.multiplica(3.3,4);  //dou
		EjercicioPrevio11.multiplica(3,4.3);  //dou

	}
	//recibe dos numeros int
	// suma (int numero1, int numero2)
	static void multiplica (int numero1, int numero2) {
		System.out.println("La multiplicacion entera es "+(numero1*numero2));
		
	}
	//recibe dos numeros double
	// suma (double numero1, double numero2)
	static void multiplica (double numero1, double numero2) {
		System.out.println("La multiplicacion double es "+(numero1*numero2));
		
	}

}
