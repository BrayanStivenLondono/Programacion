package ejercicio03;

public class Vehiculo {
	protected static int cantidadInstancias;//es estatico
	
	protected String matricula;
	protected String marca;
	protected int plazas;
	
	public Vehiculo(String matricula, String marca, int plazas) {
		this.matricula = matricula;
		this.marca = marca;
		this.plazas = plazas;
		
		Vehiculo.cantidadInstancias++;//cuanta los vehiculos
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	//solo el get estatico 
	public static int getCantidadInstanciasStatic() {
		return cantidadInstancias;
	}
	
	//solo get no estatico
	public int getCantidadInstancias() {
		return cantidadInstancias;
	}
	
}
