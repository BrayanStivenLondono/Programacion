package clases;

public class Visita {

	private Monumento[] monumento;
	private EdificioHistorico[] edificio;

	public Visita(int maxMonumentos, int maxEdificios) {
		this.monumento = new Monumento[maxMonumentos];
		this.edificio = new EdificioHistorico[maxEdificios];
	}

	/**
	 * @author Brayan Stiven
	 * 
	 *         Da de alta un nuevo monumento en la lista de monumentos
	 * 
	 * @param nombre          El nombre del monumento
	 * @param ubicacion       Pais donde esta en monumento
	 * @param anyosAntiguedad Antiguedad del monumento en anyos
	 * @param material        El material principal del monumento
	 * @param disponible      Indica si el monumento esta disponible para ser
	 *                        visitado (si/no)
	 * @param estilo          El estilo arquitectonico del monumento
	 * 
	 */
	public void altaMonumento(String nombre, String ubicacion, int anyosAntiguedad, String material, String disponible,
			Estilo estilo) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] == null) {
				monumento[i] = new Monumento(nombre, ubicacion, anyosAntiguedad, material, disponible, estilo);
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
	 * Da de alta un nuevo edificio en la lista de edificioHistorico
	 * 
	 * @param nombre    El nombre del edificio
	 * @param ubicacion Pais donde se encuentra en edificio
	 * @param edad      Años que tiene el edificio
	 * @param material  Material principal del edificio
	 * @param estilo    El estilo aquitectonico del edificio
	 * 
	 */
	public void altaEdificioHistorico(String nombre, String ubicacion, int edad, String material, Estilo estilo) {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] == null) {
				edificio[i] = new EdificioHistorico(nombre, ubicacion, edad, material, estilo);
				edificio[i].setNombre(nombre);
				edificio[i].setUbicacion(ubicacion);
				edificio[i].setEdad(edad);
				edificio[i].setMaterial(material);
				edificio[i].setEstilo(estilo);
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
	public Monumento buscarMonumento(String nombre) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				if (monumento[i].getNombre().equals(nombre)) {
					return monumento[i];
				}
			}
		}
		return null;
	}

	/**
	 * Busca un edificio por su nombre, en la lista de edificio
	 * 
	 * @param nombre El nombre del edificio a buscar
	 * @return devuelve El edificio si lo encuentra, null en caso contrario
	 */
	public EdificioHistorico buscarEdificioHistorico(String nombre) {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				if (edificio[i].getNombre().equals(nombre)) {
					return edificio[i];
				}
			}
		}
		return null;
	}

	/**
	 * Metodo que elimina un monumento de las lista de monumento
	 * 
	 * @param nombre El nombre del monumento a bucar, si lo encuentra pasara a sel
	 *               null, no en caso contrario
	 */
	public void eliminarMonumento(String nombre) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				if (monumento[i].getNombre().equals(nombre)) {
					monumento[i] = null;
				}
			}
		}
	}

	/**
	 * Metodo que elimina un edificio de la lista de edificio
	 * 
	 * @param nombre El nombre del edificio a buscar, si lo encientra pasara a ser
	 *               null, no en caso contrario
	 */
	public void eliminarEdificioHistorico(String nombre) {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				if (edificio[i].getNombre().equals(nombre)) {
					edificio[i] = null;
				}
			}
		}
	}

	/**
	 * Metodo que muestra la lista de los monumentos dados de baja
	 */
	public void listarMonumento() {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				System.out.println(monumento[i]);
			}
		}
	}

	/**
	 * Metodo que muestra la lista de los edificios dados de baja
	 */
	public void listarEdificioHistorico() {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				System.out.println(edificio[i]);
			}
		}
	}

	/**
	 * Metodo que cambia el nombre de un monumento
	 * 
	 * @param monumentoACambiar    El nombre del monumento que se quiere cambiar
	 * @param nuevoNombreMonumento El nuevo nombre que se le dara al monumento
	 */
	public void cambiarNombreMonumento(String monumentoACambiar, String nuevoNombreMonumento) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				if (monumento[i].getNombre().equals(monumentoACambiar)) {
					monumento[i].setNombre(nuevoNombreMonumento);
				}
			}
		}
	}

	/**
	 * Metodo que cambia el nombre de un edificio
	 * 
	 * @param edificioACambiar    El nombre del edificio se que quiere cambiar
	 * @param nuevoNombreEdificio El nuevo del nombre del edificio
	 */
	public void cambiarNombreEdificioHistorico(String edificioACambiar, String nuevoNombreEdificio) {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				if (edificio[i].getNombre().equals(edificioACambiar)) {
					edificio[i].setNombre(nuevoNombreEdificio);
				}
			}
		}
	}

	/**
	 * Metodo que lista los monumentos por su material
	 * 
	 * @param materialAListar El material que con el que se listara los monumento
	 */
	public void listarMonumentoPorMaterial(String materialAListar) {
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				if (monumento[i].getMaterial().equals(materialAListar)) {
					System.out.println(monumento[i]);
				}
			}
		}
	}

	/**
	 * Metodo que lista lo edificios apartir de un entero, mostrara los edificio
	 * menores o igual a esa edad
	 * 
	 * @param edadAListar La edad con que se va a listar
	 */
	public void listarEdificioHistoricoPorEdad(int edadAListar) {
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				if (edificio[i].getEdad() >= (edadAListar)) {
					System.out.println(edificio[i]);
				}
			}
		}
	}

	/**
	 * Metodo que calcula la cantidad de monumentos, promedio edad de los
	 * monumentos,monumento con la mayor y menor edad
	 * 
	 * @param cantidadMonumentos     Calcula la cantidad de monumentos
	 * @param promedioEdadMonumentos Calcula la edad promedio de los monumentos
	 * @param monumentoMenorEdad     Calcula cual es el monumento más actual
	 * @param monumentoMayorEdad     Calcula cual es el monumento más antiguo
	 * 
	 */
	public void estadisticasMonumento() {
		int cantidadMonumentos = 0;
		double totalAnyosMonumentos = 0;
		double promedioEdadMonumentos = 0;
		Monumento monumentoMenorEdad = null;
		Monumento monumentoMayorEdad = null;
		for (int i = 0; i < monumento.length; i++) {
			if (monumento[i] != null) {
				cantidadMonumentos++;
				totalAnyosMonumentos += monumento[i].getAnyosAntiguedad();
				promedioEdadMonumentos = totalAnyosMonumentos / cantidadMonumentos;

				if (monumentoMenorEdad == null
						|| monumento[i].getAnyosAntiguedad() < monumentoMenorEdad.getAnyosAntiguedad()) {
					monumentoMenorEdad = monumento[i];
				}
				if (monumentoMayorEdad == null
						|| monumento[i].getAnyosAntiguedad() > monumentoMayorEdad.getAnyosAntiguedad()) {
					monumentoMayorEdad = monumento[i];
				}
			}
		}
		System.out.println("\nCantidad Monumentos: " + cantidadMonumentos);
		System.out.println("Promedio edad Monumentos: " + promedioEdadMonumentos);
		System.out.println("Monumento Más Actual: " + monumentoMenorEdad.getNombre());
		System.out.println("Monumento Más Antiguo: " + monumentoMayorEdad.getNombre());

	}

	/**
	 * Metodo que calcula la cantidad de edificio, promedio edad de los edificio,
	 * edificio mas viejo y mas actual
	 * 
	 * @param cantidadEdificios  Calcula la cantidad de edificio
	 * @param totalAnyosEdificio Calcula la edad promedio de los edificio
	 * @param EdificioMeyorEdad  Muestra al edificio más viejo
	 * @param EdificioMenorEdad  Muestra el edificio más joven
	 * 
	 */
	public void estadisticasEdificioHistorico() {
		int cantidadEdificios = 0;
		double totalAnyosEdificio = 0;
		double promedioEdadEdificio = 0;
		EdificioHistorico EdificioMeyorEdad = null;
		EdificioHistorico EdificioMenorEdad = null;
		for (int i = 0; i < edificio.length; i++) {
			if (edificio[i] != null) {
				cantidadEdificios++;
				totalAnyosEdificio += edificio[i].getEdad();
				promedioEdadEdificio = totalAnyosEdificio / cantidadEdificios;

				if (EdificioMeyorEdad == null || edificio[i].getEdad() > EdificioMeyorEdad.getEdad()) {
					EdificioMeyorEdad = edificio[i];
				}
				if (EdificioMenorEdad == null || edificio[i].getEdad() < EdificioMenorEdad.getEdad()) {
					EdificioMenorEdad = edificio[i];
				}
			}
		}
		System.out.println("\nCantidad edificio: " + cantidadEdificios);
		System.out.println("Promedio Edad edificio: " + promedioEdadEdificio);
		System.out.println("Edificio Más Nuevo: " + EdificioMenorEdad.getNombre());
		System.out.println("Edificio Más Antiguo: " + EdificioMeyorEdad.getNombre());
	}
}