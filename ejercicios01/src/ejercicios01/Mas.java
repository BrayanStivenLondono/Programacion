package ejercicios01;

public class Mas {

	public static void main(String[] args) {
		// operador condicional
	double precio1 = 25;
		double precio2 = 32;
		System.out.println((precio1>20) && (precio2>20)?"son caros":"no son caros");
		System.out.println((precio1>20) || (precio2>20)?"al menos es caro":"no son caros");

		
		int num1 = 5;
		int num2 = 3;
		int num3 = -7;
		boolean resultado = (num1 > num3) && (num3 > num2);
		resultado = (num1 > num3) || (num3 > num2);
		System.out.println(resultado);
		resultado = true;
		resultado = !resultado;
		System.out.println(!resultado);
	

	}

}
