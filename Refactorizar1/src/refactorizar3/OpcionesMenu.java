package refactorizar3;

public class OpcionesMenu {

	
	public static String passworkCaracteres (int longitudPassword) {
		
		//creo la variable passworkFinal para usarla en todos lo metodos
		
		for (int i = 0; i < longitudPassword; i++) {
			//elimino la variable char para crearla en el mismo lugar donde la inicializo
			char letra1 = (char) ((Math.random() * 26) + 65);
			passworkFinal += letra1;
		}
		return passworkFinal;
	}
}
