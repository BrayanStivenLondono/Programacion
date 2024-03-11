package principal;

public class MetodosTiposContrasena {
	public String contrasenaLetras(int longitudContrasena, String password) {
		for (int i = 0; i < longitudContrasena; i++) {
			char letra1;
			letra1 = (char) ((Math.random() * 26) + 65);
			password += letra1;
		}
		return password;
	}
}
