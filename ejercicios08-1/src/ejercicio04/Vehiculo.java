package ejercicio04;

public class Vehiculo {
	//atributo static vehiculoCreado. Me interesa que se accesible y global
	//atributos
	private static int vehiculoCreados;
	
	private String marca;
	private String tipo;
	private float consumo;
	private float kmTotales;
	private int numRuedas;
	private boolean funciona;
	
	//constructor con 2 parametros
	public Vehiculo(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
		this.kmTotales = 0;
		this.funciona = true;
		vehiculoCreados++;
	}
	//constructor con 4 parametros
	public Vehiculo(String marca, String tipo, float consumo, int numRuedas) {
		//puedo tambien this.(tipo, marca, kmRuedas, funciona y dejo solo los dos) porque ya estan arriba en otro constructor
		this.marca = marca;
		this.tipo = tipo;
		this.consumo = consumo;
		this.numRuedas = numRuedas;
		this.kmTotales = 0;
		this.funciona = true;
		vehiculoCreados++;
	}
	//constructor sin parametros
	public Vehiculo () {
		vehiculoCreados++;
	}
	
	//setter y getter
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public float getKmTotales() {
		return kmTotales;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getVehiculoCreados() {
		return vehiculoCreados;
	}
	
	
	//metodos sobrecargados
	public float combustibleConsumido () {
		return (this.consumo*this.kmTotales)/100; //consumo*kmTotales
	}
	public float combustibleConsumido (float kmTotales) {
		return (this.consumo*this.kmTotales)/100;
	}
	public void  trucarCuentaKm () {
		this.kmTotales =0;
	}
	public void trucarCuentaKm (float kmTotales) {
		this.kmTotales = kmTotales;
	}
	
	public static void mostrarDatosVehiculo (Vehiculo coches) {
		System.out.println("\nMarca: "+coches.getMarca());
		System.out.println("Tipo: "+coches.getTipo());
		System.out.println("Consumo: "+coches.getConsumo());
		System.out.println("Numero ruedas: "+coches.getNumRuedas());
		System.out.println("Funciona: "+coches.isFunciona());
		System.out.println("Km: "+coches.getKmTotales());
	}
}



