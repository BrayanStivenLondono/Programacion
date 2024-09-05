package ejercicio02;

public class Ejercicio01 {

	public static void main(String[] args) {
		SuperClase padre = new SuperClase("Juan");
		SubClase hijo = new SubClase("Maria",5);
		
		System.out.println(padre);
		System.out.println(hijo);
		//cuando esta override no poner objeto.toString
		
		//lo muestro desde la padre
		System.out.println();
		padre.mostrarHora();
		
		//lo muestro desde la hija
		hijo.mostrarHora();
	}
}
