package ejercicio02;

public class Vehiculo {
	//atributos
	private String tipo;
	private String marca;
	private float consumo;
	private float kmTotales;
	private int numRuedas;
	private boolean funciona;
	
	//constructor con 2 parametros
	public Vehiculo(String tipo, String marca) {
		this.tipo = tipo;
		this.marca = marca;
		this.kmTotales = 0;
		this.funciona = true;
	}
	//constructor con 4 parametros
	public Vehiculo(String tipo, String marca, float consumo, int numRuedas) {
		//puedo tambien this.(tipo, marca, kmRuedas, funciona y dejo solo los dos) porque ya estan arriba en otro constructor
		this.tipo = tipo;
		this.marca = marca;
		this.consumo = consumo;
		this.numRuedas = numRuedas;
		this.kmTotales = 0;
		this.funciona = true;
	}
	//constructor sin parametros
	public Vehiculo () {
		
	}
	
	//setter y getter
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
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
}



