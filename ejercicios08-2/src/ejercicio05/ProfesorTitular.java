package ejercicio05;

public class ProfesorTitular  extends Profesor {
	private int a�oCargo;

	//seter y getter
	public int getA�oCargo() {
		return a�oCargo;
	}

	public void setA�oCargo(int a�oCargo) {
		this.a�oCargo = a�oCargo;
	}

	public ProfesorTitular(String nombre, String apellido, int edad, String ciclo, int a�oCargo) {
		super(nombre, apellido, edad, ciclo);//llama a clase padre (Profesor)
		this.a�oCargo = a�oCargo;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [a�oCargo=" + a�oCargo + ", toString()=" + super.toString() + "]";
	}
	public double obtenerSalarioBase () {
		return 1100+this.a�oCargo*63.25;
	}
	
}
