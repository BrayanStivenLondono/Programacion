package clases;

public class Fruteria {
	
	private Frutas[] frutas;
	
	public Fruteria (int maxFrutas) {
		this.frutas = new Frutas [maxFrutas];
	}
	public void altaFruta(String codigoFruta, String tipoFruta, double precio, String fruteria) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]==null) {
				frutas[i] = new Frutas (codigoFruta);
				frutas[i].setTipoFruta(tipoFruta);
				frutas[i].setPrecio(precio);
				frutas[i].setFruteria(fruteria);
				break; //IMP
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
	public void eliminarFruta(String codigoFruta) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(codigoFruta)) {
					frutas[i] = null;
				}
			}
		}
	}
	public void listarFrutas () {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				System.out.println(frutas[i]);
			}
		}
	}
	public void listarFrutasPorFruteria(String fruteria) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(fruteria)) {
					System.out.println(frutas[i]);
				}
			}
		}
	}
	public void cambiarCodigoFrutas (String codigoFruta1, String codigoFruta2) {
		for (int i = 0; i < frutas.length; i++) {
			if (frutas[i]!=null) {
				if (frutas[i].getCodigoFruta().equals(codigoFruta1)) {
					frutas[i].setCodigoFruta(codigoFruta2);
				}
			}
		}
	}
}
