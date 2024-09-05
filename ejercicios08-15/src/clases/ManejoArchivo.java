package clases;

public class ManejoArchivo {
	private Alumno[] alum;
	
	public ManejoArchivo (int maxAlumno) {
		this.alum = new Alumno [maxAlumno];
	}
	
	public void altaAlumno(String nombre, String apellido, double notaMedia, boolean aprobado) {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]==null) {
				alum[i] = new Alumno (nombre);
				alum[i].setApellido(apellido);
				alum[i].setNotaMedia(notaMedia);
				alum[i].setAprobado(aprobado);
				break;
			}
		}
	}
	public Alumno buscarAlumno(String nombre) {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]!=null) {
				if (alum[i].getNombre().equals(nombre)) {
					return alum[i];
				}
			}
		}
		return null;
	}
	public void eliminarAlumno(String nombre) {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]!=null) {
				if (alum[i].getNombre().equals(nombre)) {
					alum[i] = null;
				}
			}
		}
	}
	public void listarAlumno () {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]!=null) {
				System.out.println(alum[i]);
			}
		}
	}
	public void listarAlumnoPorNombre(String nombre) {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]!=null) {
				if (alum[i].getNombre().equals(nombre)) {
					System.out.println(alum[i]);
				}
			}
		}
	}
	public void cambiarNombreAlumno (String nombre1, String nombre2) {
		for (int i = 0; i < alum.length; i++) {
			if (alum[i]!=null) {
				if (alum[i].getNombre().equals(nombre1)) {
					alum[i].setNombre(nombre2);
				}
			}
		}
	}
}
