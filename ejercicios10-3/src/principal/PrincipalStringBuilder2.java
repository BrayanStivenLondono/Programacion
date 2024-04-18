package principal;

public class PrincipalStringBuilder2 {

	public static void main(String[] args) {
		String s = "1234567890";
		System.out.println(s);
		
		s = separarMiles(s);
		
		System.out.println("Separado: "+s);

	}
	public static String separarMiles (String s) {
		//creomos un StringBuilder a partir de un String
		StringBuilder aux = new StringBuilder(s);
		
		//le doy la vuelta
		aux.reverse();
		
		//variable que indica donde tengo que insertar el punto
		int posicion = 3;
		
		//miestras no lleguemos al final de numero
		while(posicion<aux.length()) {
			//insertamos punto en la posicion
			aux.insert(posicion, '.');
			//muevo posicion a la siguiente posicion donde esta el punto
			posicion +=4;
		}
		//le damos la vuelta otra vez
		aux.reverse();
		//lo devuelvo el StringBuilder
		return aux.toString();
	}

}
