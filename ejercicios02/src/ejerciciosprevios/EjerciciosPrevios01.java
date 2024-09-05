package ejerciciosprevios;

public class EjerciciosPrevios01 {

	public static void main(String[] args) {
		// 
		String cadena1 = "hola mundo";	
		String cadena2 = "Hola mundo";
		String cadena3 = "hola mundo";
		
		// replaceAll permite remplazar caracteres en una cadena
		String cadenaRemplazo = cadena1.replaceAll("a" , "*");
		
		String cadenaRemplazo1 = cadena1.replaceAll("hola" , "adios");

		
		System.out.println(cadena1);
		System.out.println(cadenaRemplazo);
		
		// equals compara cadenas (para numero ==, para cadenas equals)
		// equals tiene en cuenta mayusculas y minusculas
		
		System.out.println(" iguales? " + cadena1.equals(cadena2));
		System.out.println(" iguales? " + cadena1.equals(cadena3));
		
		// equalsIgnoreCase no tiene en cuenta mayuscula y minusculas
		System.out.println(" iguales? " + cadena1.equalsIgnoreCase(cadena2));

		

	}

}
