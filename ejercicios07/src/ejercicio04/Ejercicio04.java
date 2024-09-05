package ejercicio04;

import java.util.Scanner;

import ejercicio03.Ejercicio03;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame el tamaño de vector");
		int tamaño = input.nextInt();
		//declaro vector con el tamaño pedido
		char [] letras = new char [tamaño];
		//relleno con letras aleatorias
		
		//imp. Math.Random = (fin-inicio+1)+inicio
		for (int i=0; i<letras.length; i++) {
<<<<<<< HEAD
			letras[i] = (char)((Math.random()) * ('z'-'a'+1)+'a');
=======
			letras[i] = (char)((Math.random())*('z'-'a'+1)+'a');
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		}
		System.out.println();
		Ejercicio03.cambiarLetra(letras);
		
		for (int i=0; i<letras.length; i++) {
			System.out.print(letras[i]+" ");
		}
		input.close();
	}

}