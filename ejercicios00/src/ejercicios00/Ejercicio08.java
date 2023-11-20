package ejercicios00;

public class Ejercicio08 {

	public static void main(String[] args) {
		// && and
	    // || or
		// !  not
		
		// Declarar num1 y darle un valor entero
		int num1 = 8;
		// Declarar num2 y darle un valor entero
		int num2 = 6;
		// Declarar num3 y darle un valor entero
		
		int num3 = 10;
		boolean resultado;
		resultado = (num1>num3);
		System.out.println(resultado);
		resultado = (num3>num2);
		System.out.println(resultado);
		resultado = (num1>num3)&&(num3>num2);
		System.out.println(resultado);
		resultado = (num1>num3)||(num3>num2);
		System.out.println(resultado);
		resultado = true;
		resultado = !resultado;
		System.out.println(resultado);
		
		//otra forma
		resultado = true;
		System.out.println(!resultado);
		
		
		
		
		
	
		
		
		
	}

}
