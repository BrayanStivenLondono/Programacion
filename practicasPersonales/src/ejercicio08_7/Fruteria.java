package ejercicio08_7;

public class Fruteria {
	private Frutas[] fruta;
	private Verduras[] verdura;
	
	public Fruteria(int maxFrutas, int maxVerduras) {
		this.fruta = new Frutas [maxFrutas];
		this.verdura = new Verduras [maxVerduras];
	}
	
	public void altaFrutas (String nombre, String color, double precio, 
			String tamaño, Proveedor proveedor) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]==null) {
				fruta[i] = new Frutas (nombre, color, precio, tamaño, proveedor);
				fruta[i].setNombre(nombre);
				fruta[i].setColor(color);
				fruta[i].setPrecio(precio);
				fruta[i].setTamaño(tamaño);
				fruta[i].setProveedor(proveedor);
				break;
			}
		}	
	}
	public void altaVerduras (String nombre, String color, double precio, String tamaño, Proveedor proveedor) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]==null) {
				verdura[i] = new Verduras (nombre, color, precio, tamaño, proveedor);
				verdura[i].setNombre(nombre);
				verdura[i].setColor(color);
				verdura[i].setPrecio(precio);
				verdura[i].setTamaño(tamaño);
				verdura[i].setProveedor(proveedor);
				break;
			}
		}
	}
	public Frutas buscarFruta (String nombreFruta) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				if (fruta[i].getNombre().equals(nombreFruta)) {
					return fruta[i];
				}
			}
		}
		return null;
	}
	public Verduras buscarVerduras (String nombreVerdura) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				if (verdura[i].getNombre().equals(nombreVerdura)) {
					return verdura[i];
				}
			}
		}
		return null;
	}
	public void eliminarFruta (String frutaEliminar) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				if (fruta[i].getNombre().equals(frutaEliminar)) {
					fruta[i] = null;
				}
			}
		}
	}
	public void eliminarVerdura (String verduraEliminar) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				if (verdura[i].getNombre().equals(verduraEliminar)) {
					verdura[i] = null;
				}
			}
		}
	}
	public void listarFrutas () {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				System.out.println(fruta[i]);
			}
		}
	}
	public void listarVerduras () {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				System.out.println(verdura[i]);
			}
		}
	}
	public void cambiarNombreFruta (String nombreFruta, String nuevoNombre) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				if (fruta[i].getNombre().equals(nombreFruta)) {
					fruta[i].setNombre(nuevoNombre);
				}
			}
		}
	}
	public void cambiarNombreVerdura (String nombreVedura, String nuevoNombre) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				if (verdura[i].getNombre().equals(nombreVedura)) {
					verdura[i].setNombre(nuevoNombre);
				}
			}
		}
	}
	public void listaFrutasPorTamaño (String tamaño) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				if (fruta[i].getTamaño().equals(tamaño)) {
					System.out.println(fruta[i]);
				}
			}
		}
	}
	public void listarVerdurasPorColor (String color) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				if (verdura[i].getColor().equals(color)) {
					System.out.println(verdura[i]);
				}
			}
		}
	}
	public void listarFrutasPorProveedor (Proveedor proveedor) {
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				if (fruta[i].getProveedor().equals(proveedor)) {
					System.out.println(fruta[i]);
				}
			}
		}
	}
	public void listarVerdurasPorProveedor (Proveedor proveedor) {
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				if (verdura[i].getProveedor().equals(proveedor)) {
					System.out.println(verdura[i]);
				}
			}
		}
	}
	public void estadisticasFrutas () {
		int contidadtFrutas = 0;
		int sumaPrecioFrutas = 0;
		double promedioPrecioFrutas = 0;
		Frutas frutaMasCara = null;
		Frutas frutaMasBarata = null;
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				contidadtFrutas++;
				sumaPrecioFrutas += fruta[i].getPrecio();
				promedioPrecioFrutas = sumaPrecioFrutas/contidadtFrutas;
				
				if (frutaMasCara==null || fruta[i].getPrecio() > frutaMasCara.getPrecio()) {
					frutaMasCara = fruta[i];
				}
				if (frutaMasBarata==null || fruta[i].getPrecio() < frutaMasBarata.getPrecio()) {
					frutaMasBarata = fruta[i];
				}
			}
		}
		System.out.println("Cantidad de Frutas: "+contidadtFrutas);
		System.out.println("Precio Promedio: "+promedioPrecioFrutas);
		System.out.println("Fruta Más cara: "+frutaMasCara.getNombre());
		System.out.println("Fruta Más barata: "+frutaMasBarata.getNombre());
	}
	public void estadisticasVerduras () {
		int cantidadVerduras = 0;
		int sumaPrecioVerduras = 0;
		double precioPromedioVerduras = 0;
		Verduras verduraMasCara = null;
		Verduras verdurasMasBarata = null;
		
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				cantidadVerduras++;
				sumaPrecioVerduras += verdura[i].getPrecio();
				precioPromedioVerduras = sumaPrecioVerduras/cantidadVerduras;
				
				if (verduraMasCara==null || verdura[i].getPrecio() > verduraMasCara.getPrecio()) {
					verduraMasCara = verdura[i];
				}
				if (verdurasMasBarata==null || verdura[i].getPrecio() < verdurasMasBarata.getPrecio()) {
					verdurasMasBarata = verdura[i];
				}
			}
		}
		System.out.println("Cantidad verduras: "+cantidadVerduras);
		System.out.println("Precio Promedio verduras: "+precioPromedioVerduras);
		System.out.println("Verdura Más Cara: "+verduraMasCara.getNombre());
		System.out.println("Verdura Más Barata: "+verdurasMasBarata.getNombre());
	}
	public void otrasEstadisticasFruta () {
		int cantidadPares = 0;
		int cantidadNegativos = 0;
		double sumaPrecioFrutas = 0;
		String nombreMasLargo = "";
		
		for (int i = 0; i < fruta.length; i++) {
			if (fruta[i]!=null) {
				sumaPrecioFrutas += fruta[i].getPrecio();
				
				if (fruta[i].getPrecio()%2==0) {
					cantidadPares++;
				}
				if (fruta[i].getPrecio() < 0) {
					cantidadNegativos++;
				}
				if (fruta[i].getNombre().length() > nombreMasLargo.length()) {
					nombreMasLargo = fruta[i].getNombre();
				}
			} 
		}
		System.out.println("Cantidad pares: "+cantidadPares);
		System.out.println("Cantidad de Negativos: "+cantidadNegativos);
		System.out.println("Fruta con el nombre más largo: "+nombreMasLargo +" y tiene "+nombreMasLargo.length()+" caracteres");
		System.out.println("Suma Precio de Frutas: "+sumaPrecioFrutas);
	}
	public void otrasEstadisticasVerduras () {
		int cantidadPares = 0;
		int cantidadNegativos = 0;
		String verduraMasLarga = "";
		double sumaTotalPrecio = 0;
		for (int i = 0; i < verdura.length; i++) {
			if (verdura[i]!=null) {
				sumaTotalPrecio += verdura[i].getPrecio();
				
				if (verdura[i].getPrecio()%2==0) {
					cantidadPares++;
				}
				if (verdura[i].getPrecio() < 0) {
					cantidadNegativos++;
				}
				if (verdura[i].getNombre().length() > verduraMasLarga.length()) {
					verduraMasLarga = verdura[i].getNombre();
				}
			}
		}
		System.out.println("Cantidad de Pares: "+cantidadPares);
		System.out.println("Canridad de Negativos: "+cantidadNegativos);
		System.out.println("Verdura con el nombre mas largo: "+verduraMasLarga+ " y tiene "+verduraMasLarga.length()+ " caracteres");
		System.out.println("Suma Precio de verduras: "+sumaTotalPrecio);
	}
} 
