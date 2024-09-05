package ejercicio05;

public class Vehiculo {
	//atributos
	private String marca;
	private String modelo;
	private int autonomia;
	private float kilometraje;
	
	//constructor sin parametros
	public Vehiculo () {//sin nada solo la clase
		
	}
	//constructor con parametros
	public Vehiculo(String marca, String modelo, int autonomia, float kilometraje) {
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
		this.kilometraje = kilometraje;
	}
	
	//setter y getter
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public float getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(float kilometro) {
		this.kilometraje = kilometro;
	}

	//metodo esSeguro //sin toString
	boolean esSeguro (float kilometraje, int autonomia) {
		if (this.kilometraje < this.autonomia) {
			return true;
		} else {
			return false;
		}
	}
}
