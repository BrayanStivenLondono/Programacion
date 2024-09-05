package ejercicio05;

public final class Director extends Empleado {
	public Director (String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Director [toString()=" + super.toString() + "] > Director";
	}
	
}
