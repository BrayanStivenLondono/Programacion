package ejercicio01;

public class Profesor {//atributo, constructor, setter y letter, toString
	//atributos
	//los atributos de una clase, salvo que se tenga que usar 
	//en otro paquete o clase, los haremos private,
	
	private String nombre;//modificardor de acceso
	private String apellidos;
	private String ciclo;
	
	//constructor por defecto
	//sino creas uno, siempres tenfras en vacio para poder usarlo
	//aunque tu no lo escribas
	public Profesor () {
		
	}
	public Profesor(String nombre, String apellidos, String ciclo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciclo = ciclo;
	}
	
	//setter y getter
	public String getNombre() {//metodo que recooge/get
		return nombre;
	}
	public void setNombre(String nombre) {//lo pone/set
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	//aqui aparece @override (sobrescribir)
	//cuando aparece @overtide, significa que el metodo ya existe en java
	//pero yo puedo sobreescribirlo, hacerlo a mi gusto
	//este metodo (toString) no es obligatorio usarlo
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", ciclo=" + ciclo + "]";
	}
	
	
	
}
