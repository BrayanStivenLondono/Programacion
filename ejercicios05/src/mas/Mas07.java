package mas;

import java.util.Scanner;

public class Mas07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Medidor de deposito de agua
		System.out.println("Introduce el tama�o del deposito");
		float totalDeposito = input.nextFloat();
		float litrosActuales=0;

		do {
			System.out.println("Introduce litros (positivo: llena,negativo: extrae)");
			
			litrosActuales += input.nextFloat(); //acomulador
			
			if (litrosActuales<totalDeposito) {
				System.out.println("Faltan "+(totalDeposito-litrosActuales)+" Litros para llenar deposito");
			}
			
		} while (litrosActuales<totalDeposito);
		System.out.println("Se ha llenado el deposito");
		
		
		input.close();

		
	}

}