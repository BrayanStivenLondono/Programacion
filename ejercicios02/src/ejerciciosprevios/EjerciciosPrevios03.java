package ejerciciosprevios;

public class EjerciciosPrevios03 {

	public static void main(String[] args) {
		String cadena = "hola caracola";
		
		System.out.println(cadena.contains("hola")); //true
		System.out.println(cadena.startsWith("ho")); //true
		System.out.println(cadena.endsWith("las"));  //false
		System.out.println(cadena.substring(0,5));   //hola
		System.out.println(cadena.indexOf('a'));     // 3
		System.out.println(cadena.length());         // 13: totalcadena

	}

}
