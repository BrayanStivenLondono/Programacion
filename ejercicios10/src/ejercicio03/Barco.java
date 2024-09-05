package ejercicio03;

public class Barco extends Vehiculo {
	private String nombreCapitan;
	private boolean tieneVela;
	
	//con todos (los de arriba (padre) y los de ahora
	public Barco(String matricula, String marca, int plazas, String nombreCapitan, boolean tieneVela) {
		super(matricula, marca, plazas);//llamo al constructor de la clase padre
		
		//los de ahora
		this.nombreCapitan = nombreCapitan;
		this.tieneVela = tieneVela;
	}

	//setter y getter
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	public boolean isTieneVela() {
		return tieneVela;
	}
	public void setTieneVela(boolean tieneVela) {
		this.tieneVela = tieneVela;
	}

	@Override
	public String toString() {
		return "Barco [nombreCapitan=" + nombreCapitan + ", tieneVela=" + tieneVela 
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
