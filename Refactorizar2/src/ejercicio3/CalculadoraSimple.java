package ejercicio3;//agrego el nombre del paquete ejercicio3

import java.util.Scanner;

import ejercicio3_1.MenuOperaciones;

//cambio el nombre de la clase a uno mas descriptivo calculadoraSimple
public class CalculadoraSimple {

    public static void main(String[] args) {
    	
    	//cambio el nombre del Scanner a input
        Scanner input = new Scanner(System.in);

        //cambio el nombre de variable num1 a uno mas descriptivo primeroNumeroAOperar
        System.out.print("Ingrese el primer número: ");
        double primeroNumeroAOperar = input.nextDouble();

        //cambio el nombre de variable num2 a uno mas descriptivo segundoNumeroAOperar
        System.out.print("Ingrese el segundo número: ");
        double segundoNumeroAOperar = input.nextDouble();

        //agrego un syso diciendo que es un menu y agregando un (\n) para el salto de linea y sea mas legible
        System.out.println("\nMenu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Seleccione la operación: ");
        int opcionOperacionMenu = input.nextInt();

        //paso el metodo a otra clase en otro paquete, lo hago estatico, lo hago .jar y lo llamo 
        double resultadoOperacion = MenuOperaciones.realizarOperacion(primeroNumeroAOperar, segundoNumeroAOperar, opcionOperacionMenu);

        System.out.println("Resultado de la operación: " + resultadoOperacion);

        input.close();
    }
}
