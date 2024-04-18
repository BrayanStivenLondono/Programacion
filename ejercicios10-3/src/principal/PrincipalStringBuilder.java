package principal;

public class PrincipalStringBuilder {

	public static void main(String[] args) {
		// es clase es dinamica, se puede acceder automaticamente
		//pesa más, no es recomendable usar StringBuilder
		//si puedes usar String
		
		StringBuilder texto = new StringBuilder("Una prueba");
		System.out.println(texto);
		System.out.println();
		
		texto.append(" mas");
		System.out.println(texto);
		System.out.println();
		
		System.out.println("Insertamos");
		texto.insert(2, "xxx");
		System.out.println(texto);
		
		System.out.println("Invertimos: "+texto.reverse());
		
		//paso a mayuscula
		System.out.println(texto.toString().toUpperCase());

	}

}
