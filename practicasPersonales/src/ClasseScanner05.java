import java.util.Scanner;

public class ClasseScanner05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// crear objeto scanner > Scanner input = .. + input.close();

		// La clase Scanner tiene métodos para leer directamente los siguientes tipos de
		// datos: String, short, byte, int, float, long, double y boolean.
				
		int entero = input.nextInt();
		boolean booleano = input.nextBoolean();
		double real = input.nextDouble();
		byte peque = input.nextByte();
		String cadena = input.nextLine();
				
		// El método nextLine() lee todos los caracteres que haya en el buffer de entrada
		// No podemos leer un char, pero podemos leerlo como String y coger el primer caracter.
				
		char caracter = input.nextLine().charAt(0);
		// que es lo mismo que
		String cadena1 = input.nextLine();
		char caracter1 = cadena.charAt(0);
	
		// Con el método next() podemos obtener un String con la siguiente palabra, separada por espacios.
		System.out.println("Introduce una cadena de texto");
		String palabra1 = input.next();
		String palabra2 = input.next();
		String palabra3 = input.nextLine();
		System.out.println("palabra 1" + palabra1);
		System.out.println("palabra 2" + palabra2);
		System.out.println("palabra 3" + palabra3);
		
		//LIMPIAR EL BUFFER
		//Cada vez que introducimos datos por teclado terminamos presionando intro.
		// Scanner guarda en el buffer de entrada todos los caracteres introducidos, incluido la tecla intro.
		
		// "53\n" < estado del buffer de entrada (\n representa enter)
		
		int numero = input.nextInt(); //"\n"   < luego queda asi
		
		String cad = input.nextLine();
		// Siempre que vaya a leer un String después de haber leido un número, debemos
		// limpiar el buffer de entrada antes de leer el String.
		// ASI >>>  input.nextLine();		
		
		
		input.close();  //el close no cierra cierra el scanner
		                // sino el flujo de System.in

	}

}
