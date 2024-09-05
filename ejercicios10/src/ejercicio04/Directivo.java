package ejercicio04;

public final class Directivo extends Empleado {
	public Directivo (String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Director [toString()=" + super.toString() + "] > Director";
	}
	
}
