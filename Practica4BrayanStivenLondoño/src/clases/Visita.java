package clases;

public class Visita {
	
	private Monumento[] monumento;
	private Arquitecto[] arquitecto;
	
	public Visita (int maxMonumentos, int maxArquitectos) {
		this.monumento = new Monumento [maxMonumentos];
		this.arquitecto = new Arquitecto [maxArquitectos];
	}
	/**
	 * @author Brayan Stiven
	 * 
	 * Da de alta un nuevo monumento en la lista de monumentos
	 * 
	 * @param nombre El nombre del monumento
	 * @param ubicacion Pais donde esta en monumento
	 * @param anyosAntiguedad Antiguedad del monumento en anyos
	 * @param material El material principal del monumento
	 * @param disponible Indica si el monumento esta disponible para ser visitado (si/no)
	 * @param estilo El estilo arquitectonico del monumento
	 * 
	 */
	public void altaMonumento (String nombre, String ubicacion, int anyosAntiguedad, String material, String disponible, Estilo estilo) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]==null) {
				monumento[i] = new Monumento (nombre, ubicacion, anyosAntiguedad, material, disponible, estilo);
				monumento[i].setUbicacion(ubicacion);
				monumento[i].setAnyosAntiguedad(anyosAntiguedad);
				monumento[i].setMaterial(material);
				monumento[i].setDisponible(disponible);
				monumento[i].setEstilo(estilo);
				break;
			}
		}
	}
	/**
	 *
	 * Da de alta un nuevo arquitecto en la lista de arquitectos
	 * 
	 * @param nombre El nombre del arquitecto
	 * @param apellido El apellido del arquitecto
 	 * @param nacionalidad El pais donde nacio el arquitecto
	 * @param edad Edad del arquitecto, anyos vividos en caso de no estar vivo
	 * @param estilo El estilo aquitectonico del arquitecto
	 * 
	 */
	public void altaArquitecto (String nombre, String apellido, String nacionalidad, int edad, Estilo estilo) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]==null) {
				arquitecto[i] = new Arquitecto (nombre, apellido, nacionalidad, edad, estilo);
				arquitecto[i].setApellido(apellido);
				arquitecto[i].setNacionalidad(nacionalidad);				
				arquitecto[i].setEdad(edad);
				arquitecto[i].setEstilo(estilo);
				break;
			}
		}
	}
	/**
	 * Busca un monumento en la lista de monumentos por su nombre
	 * 
	 * @param nombre El nombre del monumento a buscar
	 * @return El monumento encotrado si se encuentra, null en caso contrario
	 * 
	 */
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
	/**
	 * Busca un arquitecto por su nombre, en la lista de arquitectos
	 * 
	 * @param nombre El nombre del arquitecto a buscar
	 * @return El arquitecto si no encuentra, null en caso contrario
	 */
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
	/**
	 * Metodo que elimina un monumento de las lista de monumento
	 * @param nombre El nombre del monumento a bucar, si lo encuentra pasara a sel null, no en caso contrario
	 */
	public void eliminarMonumento (String nombre) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getNombre().equals(nombre)) {
					monumento[i] = null;
				} 
			}
		}
	}
	/**
	 * Metodo que elimina un arquitecto de la lista de arquitectos
	 * 
	 * @param nombre El nombre del arquitecto a buscar, si lo encientra pasara a ser null, no en caso contrario
	 */
	public void eliminarArquitecto (String nombre) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getNombre().equals(nombre)) {
					arquitecto[i] = null;
				}
			}
		}
	}
	/**
	 * Metodo que muestra la lista de los monumentos dados de baja
	 */
	public void listarMonumento () {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				System.out.println(monumento[i]);
			}
		}
	}
	/**
	 * Metodo que muestra la lista de los arquitectos dados de baja
	 */
	public void listarArquitecto () {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				System.out.println(arquitecto[i]);
			}
		}
	}
	/**
	 * Metodo que cambia el nombre de un monumento
	 * 
	 * @param monumentoACambiar El nombre del monumento que se quiere cambiar
	 * @param nuevoNombreMonumento El nuevo nombre que se le dara al monumento
	 */
	public void cambiarNombreMonumento (String monumentoACambiar, String nuevoNombreMonumento) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getNombre().equals(monumentoACambiar)) {
					monumento[i].setNombre(nuevoNombreMonumento);
				}
			}
		}
	}
	/**
	 * Metodo que cambia el nombre de un arquitecto
	 * 
	 * @param arquitectoACambiar El nombre del arquitecto se que quiere cambiar
	 * @param nuevoNombreArquitecto El nuevo del nombre del arquitecto
	 */
	public void cambiarNombreArquitecto (String arquitectoACambiar, String nuevoNombreArquitecto) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getNombre().equals(arquitectoACambiar)) {
					arquitecto[i].setNombre(nuevoNombreArquitecto);
				}
			}
		}
	}
	/**
	 * Metodo que lista los monumentos por su material
	 * 
	 * @param materialAListar El material que con el que se listara los monumento
	 */
	public void listarMonumentoPorMaterial (String materialAListar) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				if (monumento[i].getMaterial().equals(materialAListar)) {
					System.out.println(monumento[i]);
				}
			}
		}
	}
	/**
	 * Metodo que lista lo arquitectos apartir de un entero, mostrara los arquitectos menores o igual a esa edad
	 * 
	 * @param edadAListar La edad con que se va a listar
	 */
	public void listarArquitectoPorEdad(int edadAListar) {
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				if (arquitecto[i].getEdad()>=(edadAListar)) {
					System.out.println(arquitecto[i]);
				}
			}
		}
	}
	/**
	 * Metodo que calcula la cantidad de monumentos, promedio edad de los monumentos,monumento con la mayor y menor edad
	 * 
	 * @param cantidadMonumentos Calcula la cantidad de monumentos
	 * @param promedioEdadMonumentos Calcula la edad promedio de los monumentos
	 * @param monumentoMenorEdad Calcula cual es el monumento más actual
	 * @param monumentoMayorEdad Calcula cual es el monumento más antiguo
	 * 
	 */
	public void estadisticasMonumento () {
		int cantidadMonumentos = 0;
		double totalAnyosMonumentos = 0;
		double promedioEdadMonumentos = 0;
		Monumento monumentoMenorEdad = null;
		Monumento monumentoMayorEdad = null;
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i]!=null) {
				cantidadMonumentos++;
				totalAnyosMonumentos += monumento[i].getAnyosAntiguedad();			
				promedioEdadMonumentos = totalAnyosMonumentos/cantidadMonumentos;
				
				if (monumentoMenorEdad==null || monumento[i].getAnyosAntiguedad() < monumentoMenorEdad.getAnyosAntiguedad()) {
					monumentoMenorEdad = monumento[i];
				} 
				if (monumentoMayorEdad==null || monumento[i].getAnyosAntiguedad() > monumentoMayorEdad.getAnyosAntiguedad()) {
					monumentoMayorEdad = monumento[i];
				}
			}
		}
		System.out.println("\nCantidad Arquitectos: "+cantidadMonumentos);
		System.out.println("Promedio edad Monumentos: "+promedioEdadMonumentos);
		System.out.println("Monumento Más Actual: "+monumentoMenorEdad.getNombre());
		System.out.println("Monumento Más Antiguo: "+monumentoMayorEdad.getNombre());
		
	}
	/**
	 * Metodo que calcula la cantidad de arquitectos, promedio edad de los arquitectos, monumento con la más joven y más menor
	 * 
	 * @param cantidadArquitectos Calcula la cantidad de arquitectos
	 * @param promedioEdadArquitecto Calcula la edad promedio de los arquitectos
	 * @param ArquitectoMeyorEdad Muestra al arquitecto más mayor
	 * @param ArquitectoMenorEdad Muestra el arquitecto más joven
	 * 
	 */
	public void estadisticasArquitecto () {
		int cantidadArquitectos = 0;
		double totalAnyoArquitecto = 0;
		double promedioEdadArquitecto = 0;
		Arquitecto ArquitectoMeyorEdad = null;
		Arquitecto ArquitectoMenorEdad = null;
		for (int i = 0; i < arquitecto.length; i++) {
			if (arquitecto[i]!=null) {
				cantidadArquitectos++;
				totalAnyoArquitecto += arquitecto[i].getEdad();
				promedioEdadArquitecto = totalAnyoArquitecto/cantidadArquitectos;
				
				if (ArquitectoMeyorEdad==null || arquitecto[i].getEdad() > ArquitectoMeyorEdad.getEdad()) {
					ArquitectoMeyorEdad = arquitecto[i];
				}
				if (ArquitectoMenorEdad==null || arquitecto[i].getEdad() < ArquitectoMenorEdad.getEdad()) {
					ArquitectoMenorEdad = arquitecto[i];
				}
			}
		}
		System.out.println("\nCantidad Arquitectos: "+cantidadArquitectos);
		System.out.println("Promedio Edad Arquitectos: "+promedioEdadArquitecto);
		System.out.println("Arquitecto Más Joven: "+ArquitectoMenorEdad.getNombre());
		System.out.println("Arquitecto Más Mayor: "+ArquitectoMeyorEdad.getNombre());
	}
}





