package ejercicios05;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        // Pasar de grados cent�grados a grados kelvin.
		//El proceso de leer grados cent�grados y convertirlos se debe repetir mientras que se responda �S� a la pregunta:
		//�Repetir proceso? (S/N). (Conversi�n: oK = oC + 273)
        char respuesta =0;
		
		do {
			System.out.println("Introduce grados centigrados");
			double centigrados = input.nextDouble();
			
			input.nextLine();//buffer
			
			System.out.println("Kelvin "+(centigrados+173));
			
			System.out.println("�Repito (S/N)?");
			respuesta = input.nextLine().charAt(0);//char
			
		} while (respuesta=='S' || respuesta=='s');

		input.close ();
		
	}

}
