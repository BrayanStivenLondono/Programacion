package ejercicio08;

public class ElementNotFoundRuntimeException extends RuntimeException {

	/**
	 * tuneamos ElementNotFoundRuntimeException
	 */
	private static final long serialVersionUID = 1L;

	public ElementNotFoundRuntimeException(String matricula) {
		super("No existe el vehiculo con matricula "+matricula);
	}
	
}