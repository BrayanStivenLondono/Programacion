package ejercicios01;

public class EjercicioPrevio01 {

	public static void main(String[] args) {
		// casteo (envolver) transforma a otro tipo de datos
		//(tipo datos) variable
		int numero1 = 34;
		int numero2 = 25;
		int divide = numero1/numero2;
		System.out.println(" numero1= "+numero1+" dividido por numero2= "+numero2+" es "+divide); // (el igual que) 34/25 = 1
		
		// division entera
		double numero3 = 34;
		double numero4 = 25;
		double divide1=numero3/numero4;
		System.out.println(" numero3= " + numero3+ " dividido por numero4 = " + numero4+ " es "+divide1);
      
		//division double 
		double divide2 = (double) numero1/(double)numero2;
		System.out.println(" numero1= " + numero1 + " dividido por numero2 = " + numero2+ " es " + divide2);
      
		////// cuidado
		double num1 = 5.22;
		double num2 = 3.66;
		
		//casteo a int (cada numero y la division) perdemos los decimales
		int divide3= (int)num1/(int)num2;
		System.out.println(" num1= " + num1+ " dividido por num2= " +num2+ " es " + divide3);
	    
		double numerito1 = 2.55;
		System.out.println(numerito1);
		int numerito2= (int) numerito1;
		System.out.println (numerito2);
		
		//casteo especial
		// char con int
		char caracter ='&';
		System.out.println(caracter);
		System.out.println((int) caracter);
		int miNumero = 38;
		System.out.println(miNumero);
		System.out.println((char)miNumero);
		
		

		
		
		
		
		
		
		

	}

}
