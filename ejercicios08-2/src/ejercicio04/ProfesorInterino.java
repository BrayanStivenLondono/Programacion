package ejercicio04;

public class ProfesorInterino extends Profesor {
	private int anyosCargo;

	//setter y getter
	public int getAnyosCargo() {
		return anyosCargo;
	}

	public void setAnyosCargo(int anyosCargo) {
		this.anyosCargo = anyosCargo;
	}

	public ProfesorInterino(String nombre, String apellido, int edad, String ciclo, int anyosCargo) {
		super(nombre, apellido, edad, ciclo);
		this.anyosCargo = anyosCargo;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [anyosCargo=" + anyosCargo + ", toString()=" + super.toString() + "]";
	}
	
}
