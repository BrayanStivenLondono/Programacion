package ejercicios05;

public class Ejercicio37 {

	public static void main(String[] args) {
		// Mostrar los n�meros perfectos entre 1 y 1000.
		
		//recordamos, un numero es perfecto si la suma de todos sus divisores
		//coincide con el numero
	
		for (int i=1; i<=1000; i++) {
			int numero=i;
			
			int sumaDivisores =0; //acomulador para despues guardar las uma
			
			for (int j=1; j<numero; j++) {
				if (numero%j==0) {
					// se guarda y se acomula
					sumaDivisores=sumaDivisores+j; //acomulador
				}
			}
			if (sumaDivisores==numero) {
				System.out.println("Numero "+sumaDivisores);
			}
		}
			
	}

}
