package ejercicio1;//agrego el paquete

import ejercicio1_2.OperacionesCalculadora;

public class Calculadora {

    public static void main(String[] args) {
        
        int resultadoSuma = OperacionesCalculadora.sumar(5, 3);
        int resultadoResta = OperacionesCalculadora.restar(8, 4);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
    }

}
