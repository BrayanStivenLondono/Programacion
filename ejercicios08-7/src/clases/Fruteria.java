package clases;

public class Fruteria {
	
	private Frutas[] frutas;
	private Verduras[] verduras;
	
	public Fruteria (int maxFrutas, int maxVerduras) {
		this.frutas = new Frutas[maxFrutas];
		this.verduras = new Verduras[maxVerduras];
	}
	public void altaFruta(String codigoFruta, String tipoFruta, double precio, String fruteria, Proveedor proveedor) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]==null) {
				frutas[i] = new Frutas(codigoFruta);
				frutas[i].setTipoFruta(tipoFruta);
				frutas[i].setPrecio(precio);
				frutas[i].setFruteria(fruteria);
				frutas[i].setProveedor(proveedor);
				break;
			}
		}
	}
	public void altaVerdura (String codigoVerdura, String tipoVerdura, double precio, String fruteria, Proveedor proveedor) {
		for (int i = 0; i < verduras.length; i++) {
			if (verduras[i]==null) {
				verduras[i] = new Verduras (codigoVerdura);
				verduras[i].setTipoVerdura(tipoVerdura);
				verduras[i].setPrecio(precio);
				verduras[i].setFruteria(fruteria);
				verduras[i].setProveedor(proveedor);
				break;
			}
		}
	}
	public Frutas buscarFruta(String codigoFruta) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(codigoFruta)) {
					return frutas[i];
				}
			}
		}
		return null;
	}
	public Verduras buscarVerdura(String codigoVerdura) {
		for (int i = 0; i < verduras.length; i++) {
			if (verduras[i]!=null) {
				if (verduras[i].getCodigoVerdura().equals(codigoVerdura)) {
					return verduras[i];
				}
			}
		}
		return null;
	}
	public void eliminarFruta(String codigoFruta) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(codigoFruta)) {
					frutas[i] = null;
				}
			}
		}
	}
	public void eliminarVerdura(String codigoVerdura) {
		for (int i = 0; i < verduras.length; i++) {
			if (verduras[i]!=null) {
				if (verduras[i].getCodigoVerdura().equals(codigoVerdura)) {
					verduras[i] = null;
				}
			}
		}
	}
	public void listarFrutas() {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				System.out.println(frutas[i]);
			}
		}
	}
	public void listarVerduras() {
		for (int i = 0; i < verduras.length; i++) {
			if (verduras[i]!=null) {
				System.out.println(verduras[i]);
			}
		}
	}
	public void  cambiarNombreFrutas (String codigoFruta, String tipoFruta) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(codigoFruta)) {
					frutas[i].setTipoFruta(tipoFruta);
				}
			}
		}
	}
	public void cambiarNombreVerduras (String codigoVerdura, String tipoVerdura) {
		for (int i = 0; i < verduras.length; i++) {
			if (verduras[i]!=null) {
				if (verduras[i].getCodigoVerdura().equals(codigoVerdura)) {
					verduras[i].setTipoVerdura(tipoVerdura);
				}
			}
		}
	}
	public void listarFrutasPorFruteria(String fruteria1, String fruteria2) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getFruteria().equals(fruteria1)) {
					System.out.println(frutas[i]);
				}
			}
		}
	}
	public void listarFrutasPorProveedor (Proveedor proveedor) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getProveedor().equals(proveedor)) {
					System.out.println(frutas[i]);
				}
			}
		}
	}
}




