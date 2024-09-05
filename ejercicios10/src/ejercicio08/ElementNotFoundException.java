package ejercicio08;

public class ElementNotFoundException extends Exception{
	/**
	 * tuneamos la clase ElementNotFoundException
	 */
	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(String matricula) {
		super("No existe vehiculo con matricula "+matricula);
	}
}