package mas;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char respuesta =0;
		
		do {
			System.out.println("Introduce grados centigrados");
			double centigrados = input.nextDouble();
			
			input.nextLine();//buffer
			
			System.out.println("Kelvin "+(centigrados+173));
			
			System.out.println("�Repito (S/N)");
			respuesta = input.nextLine() .charAt(0);
			
		} while (respuesta=='S' || respuesta=='s');
		
		input.close();

	}

}
