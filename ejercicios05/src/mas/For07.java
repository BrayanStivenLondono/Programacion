package mas;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que pide un n�mero binario de 8 cifras y muestra su conversi�n a sistema decimal.
        // benario de 8 cifras a decimal
		System.out.println("Introduce un numero binario (8 cifras)");
		int numero = input.nextInt();
		
		int acomulador =0;
		for (int i=0; i<8; i++) {
			
			int bit = numero%10; // cojo el bit menos pesado
			numero = numero/10; // elimino ese bit
			acomulador = acomulador + (int) (Math.pow(2, i)*bit); //acomulador
		}
		System.out.println("Su decimal es " + acomulador); // 
		
		//-----------------------------------------------------------------------
        // cualquier binario a decimal
		System.out.println("Introduce un binario de cualquier cifra");
		String binario = input.nextLine();
		
		int exponente=0;
		long acomulador2 =0;
		// Recorro desde el bit de menos peso hasta la de m�s
		
		for (int i= binario.length()-1; i>=0; i--) { //IMP
			if (binario.charAt(i)=='1') {  //IMP
				acomulador2 = acomulador2 + (long) (Math.pow(2, exponente));  //IMP
		
			}
			// incremento exponente
			exponente++;
		}
		System.out.println("La conversion es: " + acomulador2);
		
		input.close();
	}

}
