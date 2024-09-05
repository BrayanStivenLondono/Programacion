package ejercicios01;

public class Ejercicio04 {

	public static void main(String[] args) {
		// cuatro variables de tipo int variableA, variableB, variableC y variableD, 
		// asígnale un valor a cada una y muestra su valor por consola.
		
		int variableA = 6;
		int variableB = 45;
		int variableC = 500;
		int variableD = -1234;
		System.out.println("variableA:" + variableA);
		System.out.println("variableB:" + variableB);
		System.out.println("variableC:" + variableC);
		System.out.println("variableD:" + variableD);
		
		// intercambio
		// para intercambiar el valor entre variable 
		// sin perder ningun valor 
		// necesito como minimo una variable mas.
		
		int aux = variableA;
		variableA = variableB;
		variableB = variableC;
		variableC = variableD;
		variableD = aux;
		
		System.out.println(variableA);
		System.out.println(variableB);
		System.out.println(variableC);
		System.out.println(variableD);



        
		
		
		
		
		
	}

}
