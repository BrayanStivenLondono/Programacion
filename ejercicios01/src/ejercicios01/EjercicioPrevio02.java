package ejercicios01;

public class EjercicioPrevio02 {

	public static void main(String[] args) {
		// operador condicional
		// num2 > num1 ? "num2 es mayor" : "num1 es mayor"
		// condicion va delante de la ?
		// se considera condicion algo que voy a evaluar
		// despues de la ? lo que ocurrirá si es true
		// despues de los : lo que ocurrirá si es false
		// num2 > num1 ? "num2 es mayor" : "num1 es mayor"
		// si num2 es mayor de num1 -> escribirá num2 es mayor
		// sino -> escribirá num1 es mayor
		// System.out.println( num2 > num1 ? "num2 es mayor" : "num1 es mayor" );
		// se pone un syso para mostrarlo
	
		int num1 = 4;
		int num2 = 3;
		int num3 = 5;
		System.out.println(num1 > num2 ? "num1 es mayor" : "num2 es mayor");
		System.out.println(num1 > num2 && (num1 > num3) ? "num1 es el mayor de los tres" : "num1 no es el mayor de los tres");
		
		num1 = 14;
		System.out.println(num1 > num2 && (num1 > num3) ? "num1 es el mayor de los tres" : "num1 no es el mayor de los tres");
		
		char letra1 = 'a';
		char letra2 = 'b';
		System.out.println(letra1=='a'?"la letra es la primera del abecedario":"no lo es");
		System.out.println(letra2=='a'?"la letra es la primera del abecedario":"no lo es");
        
		double precio1 = 25;
		double precio2 = 32;
		System.out.println((precio1>20) && (precio2>20) ? "son caros " : " no son caros");
		System.out.println((precio1>20) || (precio2>20) ? "al menos uno es caro " : " no son caros");

		
		
	}

}
