package ejercicios05;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Pedir el abecedario
		// una forma (int)
		
		
		for (char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
			
			//ademas de imprimir todas
			//cuando la encuentra la N, pone la N y la �
			if (i == 'N') {
				System.out.print("�");
			}
			// otra forma 
			//   int  (i=65; i<91; i++)  <tabla ASCII
			//        syso    ((char)i)
		}
		
	}

}
