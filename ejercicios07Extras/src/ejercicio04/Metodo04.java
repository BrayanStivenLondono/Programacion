package ejercicio04;

public class Metodo04 {

	public static void CalculoMedia () {
		int [] vector = new int [100];
		
		int suma = vector[0];
		int media =0;
		for (int i=0; i<100; i++) {
			vector[i] = i+1; //(i+1)La da valor de 100
			suma = suma+vector[i];
			media = suma/vector.length;
		}
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+(double)media+"%");	
	}
	
}
