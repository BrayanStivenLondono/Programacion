package ejercicios07;

public class Metodo07 {
	
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
