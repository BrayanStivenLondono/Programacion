
public class ConversionPremitivos04 {

	public static void main(String[] args) {
		// Casting
		// convertir directamente un tipo de datos a otro tipo se conoce como casting.
		// solo se pueden hacer cuando los 2 tipos de datos involucrados, guardan una relaci�n.
		// Esto ocurre solo con los tipos de datos num�ricos y con los char.
		
		// Existen dos tipos de conversiones:
		
		// Casting IMPLICITO. Es cuando se mete un valor peque�o en un contenedor m�s grande.
		
		byte varPeque�a = 127;
		short varGrande = 12345;
		// C. literal de int > long
		long enteroGrande = 24556;
		// C. long > float
		float decimalSimple = enteroGrande;
		//    float > double
		double decimalDoble = decimalSimple;
		//    literal floar > double
		decimalDoble = 3.14F;
		System.out.println();	
		
		// Casting EXPLICITO. 
		// Cuando intento asignar un tipo de datos m�s grande a una variable m�s peque�a
		// Formato > (tipo)ValorAConvertir;
		
		int entero = 13;
		short enteroPeque�o = (short)entero;
		
		long numeroLargo = 13;
		entero = (int)numeroLargo;
		
		double decimal = 2344.3455;
		entero = (int)decimal;
		
		System.out.println();
		
		// Casting de caracter-entero (tabla ASCII)
		
		//implicito
		char letraA = 65;
		int valorA = letraA;
		
		int valorB = 'B';
		
		// explicito
		char letraB = (char)valorB;
		
		System.out.println();
		
		
		
	}

}
