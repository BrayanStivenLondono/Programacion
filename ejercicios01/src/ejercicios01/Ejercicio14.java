package ejercicios01;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Crea 4 variables String y les introducimos una cadena que represente un n�mero 
		// decimal, un n�mero entero largo (long), un n�mero tipo byte, y un n�mero int.
        
		String textoEntero = "1350";
		String textoEnteroLargo = "3442223";
		String textoDecimal = "12.710";
		String textoByte = "20";
		// transformar a numero
		
		int entero=Integer.parseInt(textoEntero);
		long  enteroLargo=Long.parseLong(textoEnteroLargo);
		double decimal=Double.parseDouble(textoDecimal);
		byte numByte=Byte.parseByte(textoByte);

		// mostrar
		
		System.out.println(textoEntero);
		System.out.println(textoEnteroLargo);
		System.out.println(textoDecimal);
		System.out.println(textoByte);

		
		
		
		
		
		
		
		
	}

}
