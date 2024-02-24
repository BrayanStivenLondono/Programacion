package ejercicios17;

import ejercicios17matematicas.Matematicas;

public class Metodo17Bis {

	public static void main(String[] args) {
		System.out.println(Matematicas.absoluto(1));
		System.out.println(Matematicas.absoluto(-6.2));
		System.out.println(Matematicas.maximo(2, -3));
		System.out.println(Matematicas.maximo(1.345, Math.PI));
		System.out.println(Matematicas.minimo(-6, -8));
		System.out.println(Matematicas.minimo(-5.123,-4.234));
		System.out.println(Matematicas.potencia(4, 6));
		System.out.println(Matematicas.aleatorio(4, 7));
		System.out.println(Matematicas.aleatorio(32));
		System.out.println(Matematicas.redondear(3.223));
		System.out.println(Matematicas.redondearAlza(5.332));
		System.out.println(Matematicas.redondearBaja(5.233));
		
	}
	public static int absoluto (int a) {
		if (a<0) {
			a = -a;
		}
		return a;
	}
	
	public static double absoluto (double a) {
		if (a<0) {
			a = -a;			
		}
		return a;
	}
	
	public static int maximo (int a, int b) {
		if (a>b) {	
			return a;
		}
		return b;
	}
	
	public static double maximo (double a, double b) {
		if (a>=b) {
			return a;
		}
		return b;
	}
	
	public static int minimo (int a, int b) {
		if (a>b) {
			return a;
		}
		return b;
	}
	
	public static double minimo (double a, double b) {
		if (a>b) {
			return a;
		}
		return b;
	}
	
	public static int redondear (double a) {
		if (a-(int)a>=0.5) {
			return (int) a+1;
		}
		return (int) a;
	}
	
	public static int redondearAlza (double a) {
		if (a != (int)a) {
			return (int) a+1;
		}
		return (int) a;
	}
	
	public static int redondearBaja (double a) {
		return (int) a;
	}
	
	public static int potencia (int base, int exponente) {
		int resultado = 1;
		
		for (int i=0; i<exponente; i++) {
			resultado = resultado*base;
		}
		return resultado;
	}
	
	public static int aleatorio (int fin) {
		
		return (int)(Math.random()*(fin+1));
	}
	
	public static int aleatorio (int inicio, int fin) {
		
		return (int)(Math.random()*(fin-inicio))+inicio; 
	}

}
