package parcialPrueba1;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		String[] cadena = Ejercicio02.rellenarVector();

		/* parseInt: int[] entero = new int [cadena.length];
		             for (int i=0; i<cadena.length; i++) {
			              entero[i] = Integer.parseInt(cadena[i]); */
		int opcion =0;
		do {
			System.out.println("________________________");
			System.out.println("1 - Acentos");
			System.out.println("2 - Ver palabras");
			System.out.println("3 - Frase larga");
			System.out.println("4 - Salir");
			System.out.println("________________________");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				Ejercicio02.contarAcentos(cadena);
			break;
			case 2://length (cantidad de letras)
				Ejercicio02.visualizarPalabras(cadena);
			break;
			case 3:
				Ejercicio02.fraseMaslarga(cadena);
			break;
			case 4:
				System.out.println("Salir");
			break;
			default:
				System.out.println("Opcion incorrecta");
			break;
			}
		} while (opcion!=4);
		input.close();
		System.out.println("Fin del programa, adios");
	}
	
	
	public static String[] rellenarVector() {
		String[] cadena = new String [3];
		for (int i=0; i<cadena.length; i++) {
			System.out.println("Introduce la cadena "+(i));
			cadena[i] = input.nextLine();
		}
		return cadena;
	}
	
	
	public static void contarAcentos (String[] cad) {
		int vocalAcento =0;
		for (int i=0; i<cad.length; i++) {//recorre frases
			System.out.println(cad[i]+" ");
			for (int j=0; j<cad[i].length(); j++) {//j Cad[i] dentro de cada frases recorremos sus letras
				if (cad[i].charAt(j)=='á'||cad[i].charAt(j)=='é'||cad[i].charAt(j)=='í'||cad[i].charAt(j)=='ó'||cad[i].charAt(j)=='ú') {
					vocalAcento++;
				}
			}
		}
		System.out.println("La cantidad de acentos es: "+vocalAcento);
		vocalAcento =0;//para empieza otra vez, en cada frase
	}
	
	
	public static void visualizarPalabras (String[] cadena) {
		System.out.println("Elige una frase");
		int elegida = input.nextInt();
		System.out.println("Elegiste: "+cadena[elegida]);
		
		int espacios =0;
		for (int i=0; i<cadena[elegida].length()-1; i++) { //elimina el espacio final
			if (cadena[elegida].charAt(i)==' ') {
				espacios++;
			}
		}
		for (int i=0; i<espacios+1; i++) { //+1 (si hay dos espacios hay tres palabras
			String[] cadenaFinal = cadena[elegida].split(" ");
			System.out.println(cadenaFinal[i]+" ");
		}
	}
	
	public static void fraseMaslarga (String[] cadena) {
		int cadenaLarga =0;   //String ="";
		int posicion =0;  //dar valor para que funciones
		for (int i=0; i<cadena.length; i++) {
			if (cadena[i].length() > cadenaLarga) {  //String.lenght
				cadenaLarga = cadena[i].length(); //sin lenght
				posicion = i;   //dice donde esta (exam;Superherore)
			}		
		}//con String funciona bien
		System.out.println("La cadena mas larga es: "+cadenaLarga);
		System.out.println("Su posicion es: "+posicion);
		//con String muestro la cadena larga no sus caracteres
	}
}
