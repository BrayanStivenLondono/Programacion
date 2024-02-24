package ejercicios01;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Programa que declare una variableA de tipo entero y asígnale un valor. 
		// A continuación muestra un mensaje indicando si A es par o impar.
        int variableA = 36;
        
        System.out.println(variableA%2==1? "impar" : "par");
        
        System.out.println(variableA%2==0 && variableA%3==0? "es multiplo de 2 y de 3" : "no lo es");
		
	
	}

}
