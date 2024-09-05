package ejercicio5;//agrego el paquete el nombre ejercicio5

import java.util.Scanner;

import ejercicio5_1.MetodosContarCadena;

public class ContadorDePalabras {

    public static void main(String[] args) {
    	//cambio el nombre del Scanner al input y lo cierro
    	Scanner input = new Scanner(System.in);
    	
    	//elimino el metodo de la peticion de la cadena, le doy un nombre descriptivo cadenaAContar y la pido en el main
        System.out.print("Ingrese un texto: ");
        String cadenaAContar = input.nextLine();
    
        String[] palabras = MetodosContarCadena.dividirTextoEnPalabras(cadenaAContar);
        int cantidadPalabras = MetodosContarCadena.contarPalabras(palabras);
        MetodosContarCadena.mostrarResultado(cantidadPalabras);
        
        input.close();
    }
}
