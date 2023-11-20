package ejercicios01;

public class Mas1 {

	public static void main(String[] args) {
		int numeroEntero = 23;
		long numeroLargo = numeroEntero;
		System.out.println(numeroLargo);
		
		
		int entero =13;
		short enteroPequeño = (short)entero;
		System.out.println(enteroPequeño);
		
		long numLargo = 16;
		entero = (int)numLargo;
		System.out.println(entero);
		
		double decimal = 2323.13223;
		entero = (int) decimal;
		System.out.println(entero);
		
		char letraA = 65;
		int valorA =letraA;
		int valorB ='B';
		char letraB = (char)valorB;
		
	
		System.out.println(letraB);
		

	}

}
