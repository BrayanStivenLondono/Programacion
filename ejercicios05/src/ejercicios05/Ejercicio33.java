package ejercicios05;

public class Ejercicio33 {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					for (int l=0; l<10; l++) {
						for (int m=0; m<10; m++) {
					
							System.out.println((i+"-"+j+"-"+k+"-"+l+"-"+m).replace('3', 'e'));
						}
					}
				}
			}
		}



	}

}
