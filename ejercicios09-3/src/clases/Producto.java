package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {
	private String nombre;
	private double precio;
	
	Scanner input = new Scanner (System.in);
	
	
	public Producto() {
		this.nombre = "";
		this.precio = 0;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean rellenar() {
		boolean error = false;
		do {
			try {
				System.out.println("Introduce el precio del producto:");
				this.precio = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Caracter introducido no valido.");
				error = true;
				input.nextLine();
			} catch (Exception e) {
				System.out.println("Algo ha fallado");
				error = true;
				input.nextLine();
			}
		} while (error);
		return false;
	}
	public void visualizar () {
		System.out.println("Producto: "+this.nombre);
		System.out.println("Precio: "+this.precio);
	}
}
