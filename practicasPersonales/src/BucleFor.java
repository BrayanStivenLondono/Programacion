import java.util.Scanner;

public class BucleFor {
	
	static final String MENSAJE ="Fin de programa";

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// BUCLE FOR
		
		// for > necesita principio y final
		// for (variable que se usa en el bucle con su valor inicial;final;incremento)
	    // la variable que se usa en el bucle, se comienza siempre por i
		// se utiliza siempre que sepamos el número de veces que debemos repetir un bloque de código.
		
		//  Si creamos un bucle dentro de otro, se usan como identificadores: i, j, k, l, etc.
	
		// inic. i=0; cond. i<5; si la condicion es true, se ejecuta, sino no hara nada.
		// despues de ejecutar se raliza el  incremento, atuclizacion. i++
		
		//        i    c    ac
		for (int i=0; i<=10; i++) { // 1,2,3,4...10
			System.out.println(i+" ");
			
		} //en que numero quires que
		//       incie;acabe;avance
		for (int i=10; i>=0; i--) { // 10,9,8...0
			System.out.print(i+" ");
			
		} // i++ el bucle va de uno en uno
		for (int i=0; i<=10; i++) { // podiendo el <= sale la cifra exacta
			System.out.println(i);
			
		}
		System.out.println("");
		
		for (int i=1; i<=10; i++) {
			// System.out.println(numero + "x" + i + "=" + numero*i); // Las tablas || IMPAR (numero>=0) && (numero%2==0);	
		}
		//                               i=i-2 baja  dos en dos (10,8,6..0) i=10; i>=0
		for (int i=10; i>=0; i--) {   // i=i+2 Va de dos en dos (0,2,4..10) i=0;  i<=10
			System.out.print(i+ " "); // i=i+3 Va  tres en tres (0,3,6,9)   i=0;   ``
			                          //  i++  Va    uno en uno (1,2,3..10) i=0;  i<=10  aumenta
			                          //  i--  Baja  uno en uno (10,9,8..)  i=10; i>=0 baja
		}
		
		
		
		
		
		input.close();
	}

}

		
