package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		int [] aleatorio = new int [10];
		
		
		//(fin-inicio+1)+inicio
		for (int i=0; i<aleatorio.length; i++) {
			aleatorio [i] = (int) ((Math.random()*12)+4);
		}
		Ejercicio02.mostrarArray(aleatorio);

	}
	//metodo que recibe array pero no delvuelve nada
	static void mostrarArray (int [] numero) {
		for (int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
	}

}
