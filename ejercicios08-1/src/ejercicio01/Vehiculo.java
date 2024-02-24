package ejercicio01;

public class Vehiculo {
	private String tipo;
	private String marca;
	private float consumo;
	private float kmTotales;
	private int numRuedas;
	private boolean funciona;
	
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
	
	//constructor con 2 parametros
	public Vehiculo(String tipo, String marca) {
		this.tipo = tipo;
		this.marca = marca;
		this.kmTotales = 0;
		this.funciona = true;
	}
	
	//constructor con 4 parametros
	public Vehiculo(String tipo, String marca, float consumo, int numRuedas) {
		this.tipo = tipo;
		this.marca = marca;
		this.consumo = consumo;
		this.numRuedas = numRuedas;
		this.kmTotales = 0;
		this.funciona = true;
	}
	
	//constructor sin argumentos
	public Vehiculo () {
		
	}
	
	//metodos
	public float combustibleConsumido () {
		float consumoTotal = this.kmTotales-this.kmTotales;
		return consumoTotal;
	}
	public float combustibleConsumido (float kmTotales) {
		return kmTotales;
	}
	public float trucarCuentaKm (float kmTotales) {
		return kmTotales;
	}
	public float trucarCuentaKm () {
		this.kmTotales =0;
		return kmTotales;
	}
}



