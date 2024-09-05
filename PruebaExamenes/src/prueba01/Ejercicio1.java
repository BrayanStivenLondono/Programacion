package prueba01;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame una nota");
		double nota1= input.nextDouble();

		System.out.println("Dame otra nota");
		double nota2 = input.nextDouble();

		System.out.println("Dame una ultima nota");
		double nota3 = input.nextDouble();
		
		

         if (nota1>=10 && nota2>=9 && nota3>=3) {
			 System.out.println("Matricula de honor " + nota1);
			 
		 } else if (nota1>=9 && nota2>=9 && nota3>=9) { 
			 System.out.println("Beca " + nota2);

		 } else if (nota3>=8 && nota2>=8 && nota3>=8) {
			 System.out.println("Beca parcial " + nota3);

		 } else  {
			 System.out.println("Nota inferior a 8, no tienes beca");

		 }
         
        
         //Tambien es posible
         // nota1 = float.input.nextFloat
         // nota2 = float.input.nextFloat
         // nota3 = float.input.nextFloat
         // if (nota1==10 and nota2==10 and nota3==10) > matricula honor
         // else if (nota1>=9 and nota2>=9 and nota3>=9) > beca         
		 // else if (nota1>=8 and nota2>=8 and nota3>=8) > beca parcial 
		 // else (tu nota es inferior a 8, no tiene beza) 
		input.close();

	}

}
