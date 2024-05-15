package clases;

public class Receta {
	
	private String codReceta;
	private String medicamento;
	private Paciente paciente;
	
	public Receta(String codReceta, String medicamento) {
		this.codReceta = codReceta;
		this.medicamento = medicamento;
	}
	
	public String getCodReceta() {
		return codReceta;
	}
	public void setCodReceta(String codReceta) {
		this.codReceta = codReceta;
	}
	public String getMedicamento() {
		return medicamento;
	}
	public void setNombreAsignatura(String medicamento) {
		this.medicamento = medicamento;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Receta [codReceta=" + codReceta + ", medicamento=" + medicamento
				+ ", paciente=" + paciente + "]";
	}
	
	
	
}
