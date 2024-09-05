package ejercicios07;

public class Metodo07Bis {

	public static void main(String[] args) {
		Metodo07.abecedario();

	}
	static void abecedario () {
		for (int i='A'; i<='Z'; i++) {
			for (int j='A'; j<='Z'; j++) {
				for (int k='A'; k<='Z'; k++) {
					System.out.print((char)i);	
					System.out.print((char)j);	
					System.out.println((char)k);	
				}
			}
		}
	}
}
