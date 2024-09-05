package ejercicio4;//agrego el paquete ejercicio4

//importo el Scanner
import java.util.Scanner;

import ejercicio4_1.MetodosOperaciones;

//doy un nombre mas descriptivo a la clase Conversiones
public class Conversiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        
        //cambio el nombre de la variable a uno mas descriptivo numeroAOperar
        int numeroAOperar = input.nextInt();
        
        String resultado = MetodosOperaciones.realizarConversion(numeroAOperar);
        
        MetodosOperaciones.mostrarResultado(resultado);
      
        
        //elimino el metodo de la peticion de datos y lo pido en el main
        // y cierro el Scanner
        input.close();
    }
}
