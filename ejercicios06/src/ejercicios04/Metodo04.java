package ejercicios04;

public class Metodo04 {
	
	static boolean esPrimo (int numero) {
		
		 if (numero<=1) {
			  return false;
		 }
		 
		for (int i=2; i<numero; i++) {
			if (numero%i==0) {
				return false;
			}
		}
		return true;
	}

}
