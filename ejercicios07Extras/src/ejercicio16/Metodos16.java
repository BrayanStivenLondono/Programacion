package ejercicio16;

import java.util.Arrays;

public class Metodos16 {
	public static void ordenar () {
		int[] vectorNum = new int[5];//ordena el vector
		vectorNum[0] = 6;
		vectorNum[1] = 3;
		vectorNum[2] = 9;
		vectorNum[3] = 4;
		vectorNum[4] = 1;
		Arrays.sort(vectorNum);
		
		for (int i=0; i<vectorNum.length; i++) {
			System.out.println(vectorNum[i]);
		}
	}

}
