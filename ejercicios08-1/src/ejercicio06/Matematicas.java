package ejercicio06;

public final class Matematicas {

	public static final double PI = 3.1415;
	
	private Matematicas(){
		/**
		 * 
		 */
	}
	
	/**
	 * Metodo que calcula el valor absoluto
	 * 
	 * @param a el valor sobre el que 
	 * calculare el valor absoluto 
	 * 
	 * @return un entero con el valor absoluto
	 */
	public static int absoluto(int a){
		if(a < 0){
			a = -a;
		}
		return a;
	}
	
	/**
	 * 
	 * @param a el valor sobre el que 
	 * calculare el valor absoluto 
	 * 
	 * @return un double con el valor absoluto
	 */
	public static double absoluto(double a){
		if(a < 0){
			a = -a;
		}
		return a;
	}
	
	/**
	 * 
	 * @param a int valor1 para calcular el máximo
	 * @param b int valor2 para calcular el máximo
	 * @return un int con el valor máximo
	 */
	public static int maximo(int a, int b){
		if( a > b){
			return a;
		}
		return b;
	}
	
	/**
	 * 
	 * @param a double valor1 para calcular el máximo
	 * @param b double valor2 para calcular el máximo
	 * @return un double con el valor máximo
	 */
	public static double maximo(double a, double b){
		if( a >= b){
			return a;
		}
		return b;
	}
	
	/**
	 * 
	 * @param a int valor1 para calcular el mínimo
	 * @param b int valor2 para calcular el mínimo
	 * @return un int con el valor mínimo
	 */
	public static int minimo(int a, int b){
		if( a > b){
			return b;
		}
		return a;
	}

	/**
	 * 
	 * @param a double valor1 para calcular el mínimo
	 * @param b double valor2 para calcular el mínimo
	 * @return un double con el valor mínimo
	 */

	public static double minimo(double a, double b){
		if( a > b){
			return b;
		}
		return a;
	}
	
	/**
	 * 
	 * @param a double valor a redondear
	 * @return un int con el valor redondeado
	 */
	
	public static int redondear(double a){
		
		if(a - (int)a >= 0.5){
			return (int)a + 1;
		}
		return (int)a;
	}
	
	/**
	 * 
	 * @param a double valor a redondear
	 * @return un int con el valor redondeado al alza
	 */
	
	public static int redondearAlza(double a){
		//6.1 -> 7
		//6.0 -> 6.0 
		
		if( a != (int) a ){
			return (int)a + 1;
		}
		return (int)a;
		
	}
	
	/**
	 * 
	 * @param a double valor a redondear
	 * @return un int con el valor redondeado a la baja
	 */
	
	public static int redondearBaja(double a){
		
		return (int)a;
	}
	
	/**
	 * 
	 * @param base int valor de la base para calcular la potencia
	 * @param exponente int valor del exponente para calcular la pontencia
	 * @return un int con la potencia
	 */
	
	public static int potencia(int base, int exponente){
		int resultado = 1;
		
		for(int i = 0; i < exponente; i++){
			resultado = resultado * base;
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param fin int valor final para mostrar un aleatorio
	 * @return un int con un aleatorio
	 */
	
	public static int aleatorio(int fin){
		
		return (int)(random() * (fin + 1));
	}

	/**
	 * 
	 * @param inicio int valor inicial para mostrar un aleatorio
	 * @param fin int valor final para mostrar un aleatorio
	 * @return un int con un aleatorio
	 */
	
	public static int aleatorio(int inicio, int fin){
		
		return (int)(random()* (fin-inicio)) + inicio;
	}

	/**
	 * 
	 * @return un Double con un aleatorio
	 */

	public static Double random(){
		//Obtengo nanosegundos de 1 a 999
		int semilla = (int)System.nanoTime() % 1000;
		//lo divido entre 1000
		double aleatorio = semilla / 1000.0;  
		return aleatorio;
	}
}
