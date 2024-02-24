package ejercicio05;

public class ProfesorTitular  extends Profesor {
	private int añoCargo;

	//seter y getter
	public int getAñoCargo() {
		return añoCargo;
	}

	public void setAñoCargo(int añoCargo) {
		this.añoCargo = añoCargo;
	}

	public ProfesorTitular(String nombre, String apellido, int edad, String ciclo, int añoCargo) {
		super(nombre, apellido, edad, ciclo);//llama a clase padre (Profesor)
		this.añoCargo = añoCargo;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [añoCargo=" + añoCargo + ", toString()=" + super.toString() + "]";
	}
	public double obtenerSalarioBase () {
		return 1100+this.añoCargo*63.25;
	}
	
}
