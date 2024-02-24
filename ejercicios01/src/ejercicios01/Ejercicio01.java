package ejercicios01;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Programa java que realice lo siguiente: declarar una variable de tipo int, una variable de tipo
		// double y una variable de tipo char y asigna a cada una un valor.
        
		int num1= 21;
        double costo = 20.4;
        char letra2 = 'b';
        char letra3 = 66;
        
        System.out.println(num1);
        System.out.println(costo);
        System.out.println(letra2);
        System.out.println(letra3);

        
        //sumo el int con el double
        System.out.println(num1+costo);
        System.out.println(costo-num1);
        
        //muestro el valor numerico de un carecter
        System.out.println((int)letra2);
        // casteo explicito

		
	}

}
