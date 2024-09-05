package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int [] miVector = {1,2,3,4,5};
		
		//calcular suma
		
		int suma =0;
		for (int i=0; i<miVector.length; i++) {
			suma = suma+miVector[i]; // suma += miVector[i];
		}
		//mostrar por pantalla
		System.out.println("La suma es "+suma);

	}

}
