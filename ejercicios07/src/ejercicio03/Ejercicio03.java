package ejercicio03;

public class Ejercicio03 {

	public static void main(String[] args) {
		char [] letras = new char [11];
		char caracter = 'a';
		
		for (char i=0; i<letras.length; i++) {
			letras[i] = caracter++;
		}
		letras = cambiarLetra(letras);
		for (int i=0; i<letras.length; i++) {
			System.out.print(letras[i]+" ");
		}
		
	}
	public static char[] cambiarLetra (char [] letras) {
		for (int i=0; i<letras.length; i++) {
			if (letras[i]=='a' || letras[i]=='e' || letras[i]=='i' || letras[i]=='o' || letras[i]=='u') {
				letras[i] = '*';
			}
		}
		return letras;
	}

}
