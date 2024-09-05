package clases;

import java.time.LocalDate;

public class Trabajo {
	private String nombre;
	private String cliente;
	private double presupuesto;
	private LocalDate fechaConcepcion;
	private Responsable ResponsableTrabajo;
	
	public Trabajo(String nombre, String cliente, double presupuesto) {
		this.nombre = nombre;
		this.cliente = cliente;
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public LocalDate getFechaConcepcion() {
		return fechaConcepcion;
	}
	public void setFechaConcepcion(LocalDate fechaContratacion) {
		this.fechaConcepcion = fechaContratacion;
	}
	public Responsable getResponsableTrabajo() {
		return ResponsableTrabajo;
	}
	public void setResponsableTrabajo(Responsable responsableTrabajo) {
		ResponsableTrabajo = responsableTrabajo;
	}

	@Override
	public String toString() {
		return "Trabajo [nombre=" + nombre + ", cliente=" + cliente + ", presupuesto=" + presupuesto
				+ ", fechaConcepcion=" + fechaConcepcion + ", ResponsableTrabajo=" + ResponsableTrabajo + "]";
	}
	
}
