package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Raquel");
		Operario operario = new Operario("Juan");
		Directivo director = new Directivo("Maria");
		Oficial oficial = new Oficial("Andrea");
		Tecnico tecnico = new Tecnico("Carlos");
		
		System.out.println(empleado);
		System.out.println(operario);
		System.out.println(director);
		System.out.println(oficial);
		System.out.println(tecnico);

	}
}
