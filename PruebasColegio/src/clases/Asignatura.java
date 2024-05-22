package clases;

public class Asignatura {
	
	private String codAsignatura;
	private String nombreAsignatura;
	private Profesor profesor;
	
	public Asignatura(String codAsignatura, String nombreAsignatura) {
		this.codAsignatura = codAsignatura;
		this.nombreAsignatura = nombreAsignatura;
	}
	
	public String getCodAsignatura() {
		return codAsignatura;
	}
	public void setCodAsignatura(String codAsignatura) {
		this.codAsignatura = codAsignatura;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [codAsignatura=" + codAsignatura + ", nombreAsignatura=" + nombreAsignatura
				+ ", profesor=" + profesor + "]";
	}
	
	
	
}
