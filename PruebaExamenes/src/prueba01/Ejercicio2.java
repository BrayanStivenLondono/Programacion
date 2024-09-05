package prueba01;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//  USA IF TAMBIEN
		
int opcion = input.nextInt();
		
		if (opcion >=1 && opcion<=3) {
			
			switch (opcion) {
			case 1:
				System.out.println("Introduce el radio"); // consola
				double radio = input.nextDouble();
				
				if (radio<0) {
					System.out.println("El radio es negativo");
				} else {
					System.out.println("El radio es " + (Math.PI*radio*radio));
				}
				break;
				
			case 2:
				System.out.println("Introduce el radio"); 
				radio = input.nextDouble();
				
				if (radio < 0) {
					System.out.println("El radio es negativo");
				} else {
					System.out.println("El volumen es " + (4*Math.PI*radio*radio*radio)/3); 
				}				
				break;
				
			case 3 :
				input.close();
				System.out.println("Programa terminado");
				break; 
				
				} // FIN switch
			
		  } else {
			System.out.println("La opcion elegida no es valida, programa terminado");
				
			}
			
			
		input.close();
  
	}

}
