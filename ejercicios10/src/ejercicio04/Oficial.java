package ejercicio04;

public final class Oficial extends Operario {
	//final no hereda
	public Oficial (String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial [toString()=" + super.toString() + "] > Oficial";
	}
}
