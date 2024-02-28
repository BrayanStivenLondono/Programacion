package clases;

public class Visita {
	//recibe vector monumento (instancia)
	private Monumento[] monu;
	
	public Visita (int maxMonumentos) {
		this.monu = new Monumento [maxMonumentos];
	}
	public void altaMonumento (String nombre, String ubicacion) {
		for (int i = 0; i < monu.length; i++) {
			if (monu[i]==null) {
				monu[i] = new Monumento (nombre);
				monu[i].setUbicacion(ubicacion);
				break;
			}
		}
	}
	public Monumento buscarMonumento (String nombre) {
		for (int i = 0; i < monu.length; i++) {
			if (monu[i]!=null) {
				if (monu[i].getNombre().equals(nombre)) {
					return monu[i];
				}
			}
		}
		return null;
	}
	public void eliminatMonumento (String nombre) {
		for (int i = 0; i < monu.length; i++) {
			if (monu[i]!=null) {
				if (monu[i].getNombre().equals(nombre)) {
					monu[i] = null;
				}
			}
		}
	}
	public void listarMonumento () {
		for (int i = 0; i < monu.length; i++) {
			if (monu[i]!=null) {
				System.out.println(monu[i]);
			}
		}
	}
	public void cambiarNombreMonumento (String nombre1, String nombre2) {
		for (int i = 0; i < monu.length; i++) {
			if (monu[i]!=null) {
				if (monu[i].getNombre().equals(nombre1)) {
					monu[i].setNombre(nombre2);
				}
			}
		}
	}
}





