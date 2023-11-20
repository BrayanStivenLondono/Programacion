package mas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pone los numero del 100 al uno
		int contador = 100;
		
		while (contador>0) {
			System.out.print(contador+("-"));
			contador--;
		}
		//--------------------------------------------------------------------
		System.out.println("Introduce un numero");
		int numero = input.nextInt(); // cuenta las cifras de un numero (527 > 3) o (45 > 2)
		
		int contadorCifra =0;
		
		while (numero>0) {
			numero = numero/10; //acomulador
			contadorCifra++;
		}
		System.out.println("El numero de cifras es "+contadorCifra);
		
		input.close();

	}

}
