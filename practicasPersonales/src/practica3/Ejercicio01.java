package practica3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dime un pueblo y te indicaré su comarca");
		String pueblo = input.nextLine();

		String comarca = mostrarComarca(pueblo);

		if (!comarca.equals("error")) {
			System.out.println("El pueblo " + pueblo + " pertenece a la comarca de " + comarca);
		} else {
			System.out.println("El pueblo introducido no es válido o no lo tenemos registrado");
		}
		
		input.close();
	}

	public static String mostrarComarca(String pueblo) {
		switch (pueblo) {
		case "Biota":
		case "Tauste":
			return "Ejea de los Caballeros";
		case "Fabara":
			return "Caspe";
		case "Anento":
		case "Gallocanta":
			return "Daroca";
		case "Calatorao":
		case "Codos":
			return "La Almunia de Dońa Godina";
		case "Gallur":
		case "Tarazona":
			return "Comarca Borja";
		case "Cadrete":
		case "Pedrola":
		case "Quinto":
		case "Zuera":
			return "Zaragoza";
		case "Ateca":
		case "Calatayud":
		case "Jaraba":
			return "Calatayud";
		default:
			return "error";
		}

	}

}
