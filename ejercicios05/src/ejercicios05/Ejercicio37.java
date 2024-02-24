package ejercicios05;

public class Ejercicio37 {

	public static void main(String[] args) {
		// Mostrar los números perfectos entre 1 y 1000.
		
		//recordamos, un numero es perfecto si la suma de todos sus divisores
		//coincide con el numero
	
		for (int i=1; i<=1000; i++) {
			int numero=i;
			
			int sumaDivisores =0; 
			
			for (int j=1; j<numero; j++) {
				if (numero%j==0) {
					sumaDivisores += j; 
				}
			}
			if (sumaDivisores==numero) {
				System.out.println("Numero "+sumaDivisores);
			}
		}
			
	}

}
