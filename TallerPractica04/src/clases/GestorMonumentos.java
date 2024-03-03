package clases;

public class GestorMonumentos {
	
	private Monumento[] monumento;
	private Arquitecto[] arquitecto;
	
	public GestorMonumentos (int maxMonumentos, int maxArquitectos) {
		this.monumento = new Monumento [maxMonumentos];
		this.arquitecto = new Arquitecto [maxArquitectos];
	}
	public void elecionClaseParaOperaciones (int numero1, int numero2) {
		
	}
	public void altaMonumento (String nombre, String ubicacion, int anyosAntiguedad, String material, String estilo, String disponible) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]==null) {
				monumento[i] = new Monumento (nombre);
				monumento[i].setUbicacion(ubicacion);
				monumento[i].setAnyosAntiguedad(anyosAntiguedad);
				monumento[i].setMaterial(material);
				monumento[i].setEstilo(estilo);
				monumento[i].setDisponible(disponible);
				break;
			}
		}
	}
	public void altaArquitecto (String nombre, String apellido, String nacionalidad, String estilo, int edad) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]==null) {
				arquitecto[i] = new Arquitecto (nombre);
				arquitecto[i].setApellido(apellido);
				arquitecto[i].setNacionalidad(nacionalidad);
				arquitecto[i].setEstilo(estilo);				
				arquitecto[i].setEdad(edad);
				break;
			}
		}
	}
	public Monumento buscarMonumento (String nombre) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getNombre().equals(nombre)) {
					return monumento[i];
				} 
			}
		}
		return null;
	}
	public Arquitecto buscarArquitecto (String nombre) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getNombre().equals(nombre)) {
					return arquitecto[i];
				}
			}
		}
		return null;
	}
	public void eliminarMonumento (String nombre) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getNombre().equals(nombre)) {
					monumento[i] = null;
				}
			}
		}
	}
	public void eliminarArquitecto (String nombre) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getNombre().equals(nombre)) {
					arquitecto[i] = null;
				}
			}
		}
	}
	public void listarMonumento () {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				System.out.println(monumento[i]);
			}
		}
	}
	public void listarArquitecto () {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				System.out.println(arquitecto[i]);
			}
		}
	}
	public void cambiarNombreMonumento (String nombre1, String nombre2) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getNombre().equals(nombre1)) {
					monumento[i].setNombre(nombre2);
				}
			}
		}
	}
	public void cambiarNombreArquitecto (String nombre1, String nombre2) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getNombre().equals(nombre1)) {
					arquitecto[i].setNombre(nombre2);
				}
			}
		}
	}
	public void listarMonumentoPorUbicacion (String ubicacion) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getUbicacion().equals(ubicacion)) {
					System.out.println(monumento[i]);
				}
			}
		}
	}
	public void listarArquitectoPorEdad(int edad) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getEdad()==(edad)) {
					System.out.println(arquitecto[i]);
				}
			}
		}
	}
}





