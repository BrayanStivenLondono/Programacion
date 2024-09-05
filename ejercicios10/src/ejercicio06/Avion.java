package ejercicio06;

public class Avion extends Vehiculo {
	private int numeroMisiles;

	//los recibe todos (los de arriba y el nuevo)
	public Avion(String matricula, String marca, int plazas, int numeroMisiles) {
		super(matricula, marca, plazas);//los de arriba
		this.numeroMisiles = numeroMisiles;//el nuevo
	}

	public int getNumeroMisiles() {
		return numeroMisiles;
	}

	public void setNumeroMisiles(int numeroMisiles) {
		this.numeroMisiles = numeroMisiles;
	}
	//toString con el metodo heredado (el de clase padre)
	@Override
	public String toString() {
		return "Avion [numeroMisiles=" + numeroMisiles 
				+ ", toString()=" + super.toString() + "]";//super.toString (llama al constructor de arriba)
	}
	
	public void disparar () {
		if (numeroMisiles > 0) {
			numeroMisiles--;
		}
	}
}
