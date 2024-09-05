package ejercicio08previo;

public class Alien {
	int ojos;
	String planeta;
	int extremidades;
	String color;
	//constructor
	public Alien () {
		this.ojos = 3;
		this.planeta = "marte";
		this.extremidades = 4;
		this.color = "azul";
	}
	public Alien (int ojos, String planeta, int extremidades, String color) {
		this.ojos = ojos;
		this.planeta = planeta;
		this.extremidades = extremidades;
		this.color = color;
		
	}
	//muestra datos
	@Override
	public String toString() {
		return "Alien [ojos=" + ojos + ", planeta=" + planeta + ", extremidades=" + extremidades + ", color=" + color
				+ "]";
	}
	

	
}
