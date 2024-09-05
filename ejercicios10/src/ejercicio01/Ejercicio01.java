package ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		SuperClase padre = new SuperClase();
		SubClase hijo = new SubClase(5);
		
		System.out.println(padre);
		System.out.println(hijo);
		//cuando esta override no poner toString
	}
}
