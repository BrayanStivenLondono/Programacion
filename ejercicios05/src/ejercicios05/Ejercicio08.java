package ejercicios05;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Pedir el abecedario
		// una forma (int)
		
		
		for (char i='A'; i<='Z'; i++) {
			System.out.println(i);
			
			//ademas de imprimir todas
			//cuando la encuentra la N, pone la N y la Ñ
			if (i == 'N') {
				System.out.println("Ñ");
			}
			// otra forma 
			//   int  (i=65; i<91; i++)  <tabla ASCII
			//        syso    ((char)i)
		}
		
	}

}
