package ejercicios17;

import ejercicios17matematicas.Matematicas;

public class Ejercicio17 {

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

}
