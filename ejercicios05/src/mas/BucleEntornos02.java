package mas;

import java.util.Scanner;

public class BucleEntornos02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="Vamos a ver si averiguamos"
				+ " que hace este código.";
		System.out.println(cadena);
		Scanner input= new Scanner(System.in);
		
		System.out.println("Mete un numero cualquiera");
		int numero=input.nextInt();
		int unaVariable=cuadrado(numero);
		System.out.println(unaVariable);
		System.out.println("¿Qué valor toma unaVariable si introduces 5?"); //25
		System.out.println("¿Qué relación hay entre numero y unaVariable?");
		System.out.println("¿Qué relación hay entre numero y x?");
		input.close();
	}
	
	static int cuadrado(int x) { // devuelve el cuadrado del numero dado
		int devuelve=x*x;
		return devuelve;
	}

}