package ejercicio05;

public final class Tecnico extends Operario {
	public Tecnico (String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Tecnico [toString()=" + super.toString() + "] > Tecnico";
	}
	
	
}
