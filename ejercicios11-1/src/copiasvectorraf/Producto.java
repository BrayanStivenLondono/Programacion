package copiasvectorraf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Producto {
	private int codigo;
	private double precio;
	
	public Producto() {
		this.codigo = 0;
		this.precio = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void rellenarProducto() {//buffer antiguo
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		boolean error = false;
		do {
			try {
				System.out.println("Codigo: ");
				this.codigo = Integer.parseInt(input.readLine());
				System.out.println("Precio: ");
				this.precio = Double.parseDouble(input.readLine());
				error = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Error de formato");
				error = true;
			
			} catch (IOException e) {
				System.out.println("Error de entrada salida");
				System.exit(0);
			} 
		} while (error);
	}
	
	public void visualizarProducto() {
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Precio: "+this.precio);
	}
	
}
