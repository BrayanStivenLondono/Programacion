package mas;

public class Mas06 {

	public static void main(String[] args) {
		
		double aleatorio = Math.random()*101;
		
		// lo paso a int
		
		int enteroAleatorio = (int) aleatorio;
		
		// los muestro hasta en -100 de 7 en 7
		for (int i=enteroAleatorio; i>=-100; i=i-7) {
			System.out.println(i);
		}

	}

}