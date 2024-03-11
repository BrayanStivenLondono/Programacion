package ejercicio2; //agrego el paquete ejercicio2

import calculos.CalculadorSumaProducto;

public class CalcularTotalesYProductos {

    public static void main(String[] args) {
    	
    	//cambio el nombre de vector a uno mas descriptivo vectorDeNumerosAOperar
        int[] vectorDeNumerosAOperar = {4, 2, 7, 1, 9, 5, 8};
        
        //elimino la instancia listaNumeros, ya no necesaria
        
    	//cambio el nombre del suma a uno mas descriptivo totalSuma
        int totalSuma = CalculadorSumaProducto.calcularSumaVectorDeEnteros(vectorDeNumerosAOperar);
        
      //cambio el nombre del producto a uno mas descriptivo totalProducto
        int totalProducto = CalculadorSumaProducto.calcularProductoDeVectorDeEnteros(vectorDeNumerosAOperar);

        System.out.println("Suma de los números: " + totalSuma);
        System.out.println("Producto de los números: " + totalProducto);
    }
    //cambio el nombre del metodo calcularSuma a calcularSumaVectorDeEnteros y el parametro que recibe a vectorDeNumerosAOperar
    
    //cambio el nombre del metodo calcularProducto a calcularProductoDeVectorDeEnteros y el parametro que recibe a vectorDeNumerosAOperar
}
