package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Profesor profe1 = new Profesor ("Juan","Gomez",30,"DAW");
		Profesor profe2 = new Profesor ("Pedro","Gonzales",45,"ASIR");
		Profesor profe3 = new Profesor ("Maria","Lopez",40,"DAM");
		Profesor profe4 = new Profesor ("Eva","Morales",44,"DAW");
		
		System.out.println(profe1);
		System.out.println(profe2);
		System.out.println(profe3);
		System.out.println(profe4);
	}
}
