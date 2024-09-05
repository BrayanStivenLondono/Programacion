import java.util.Scanner;

public class ConversionStringPrimitivo07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// CONVERSION ENTRE STRING Y PRIMITIVO (No casting)
		// usaremos los métodos de una serie de clases (inicial Mayus)
		// Hay una para cada primitivo, pero con la misma estructura
		// ...integer, boolen, bouble < . PARSE > INT, BOOLEAN, BOUEBLE....
		// Integer.parseInt || Boolean.parseBoolean || Double.parseDouble
		
		//STRING >> PRIMITIVO
		String cadenaEntero = "123";
		// a primitivo
		int entero = Integer.parseInt(cadenaEntero);
		boolean valor = Boolean.parseBoolean("true");
		double decimal = Double.parseDouble("23.45");
		byte peque = Byte.parseByte("23");	
		System.out.println();
	
		// String.valueOf()
		
		//PRIMITIVO >> STRING
		int numero = 46;
		double decimal1 = 34.75;
		// a string
		String cadenaNumero = String.valueOf(numero); // 46
		String cadenadecimal = String.valueOf(decimal1); // 34.75
		System.out.println();
		
		// PRIVILEGIO DE LA CLASE STRING
		// El valor de un string no se puede modificar, ya que si lo cambiamos 
		// estamos constituyendo un nuevo objecto de forma transparente
		//
		String cadena1 = new String ("texto");
		String cadena2 = new String ("texto");
		
		//cadena1 == cadena2; //false, son diferentes (esta mal)
		cadena1.equals(cadena2); //true, son iguales (esta bien, EQUALS)
		
		cadena1 = "otro texto";
		cadena2 = "otro texto";
		
		//cadena1 == cadena2; // false y mal
		cadena1.equals(cadena2);// true y correcto (equals)
		
		// EQUALS. Compara los objectos String.

        input.close();

	}

}
