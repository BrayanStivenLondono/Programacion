package ejercicios00;

public class EjercicioPrevio04 {

	public static void main(String[] args) {
		// TODO operaciones booleanos
		//== iguales
		//!= distintos
		// > mayor  >= mayor o igual < menor <= menor o igual
		
		int numero1 = 9;
		int numero2 = 6;
        System.out.println(numero1==numero2); // son iguales? no > false
		int numero3 = 9;
        System.out.println(numero1==numero3); // son iguales? si > true        
        System.out.println(numero1!=numero3); //son distinto? no > false
        System.out.println(numero1>numero2);  // true
        System.out.println(numero2>numero3);  //false
        System.out.println(numero3<numero1);  //false
        System.out.println(numero2<numero3);  // true
        boolean resultado = (numero1==numero3);
        System.out.println(resultado);
        boolean resultado1 = (numero1!=numero3);
        System.out.println(resultado1);
        
        
        
        
        
	}

}
