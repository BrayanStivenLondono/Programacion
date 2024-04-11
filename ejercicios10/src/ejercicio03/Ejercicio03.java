package ejercicio03;

public class Ejercicio03 {

	public static void main(String[] args) {
		Barco barco = new Barco("1234", "Zodiac", 7, "Juanjo", false);
		System.out.println("BARCO");
		System.out.println(barco);

		// static mediante la clase
		System.out.println("Vehiculos creados " + Vehiculo.getCantidadInstanciasStatic());
		// no static mediante el objeto
		System.out.println("Vehiculos creados " + barco.getCantidadInstancias());

		Avion avion = new Avion("1251F", "Boeing", 2, 2);
		System.out.println("AVION");
		System.out.println(avion);

		// static mediante la clase
		System.out.println("Vehiculos creados " + Vehiculo.getCantidadInstanciasStatic());
		// no static mediante el objeto
		System.out.println("Vehiculos creados " + avion.getCantidadInstancias());

		Coche coche = new Coche("FDS-1234", "Peugeot", 5, 120.7);
		System.out.println("COCHE");
		System.out.println(coche);
		
		// static mediante la clase
		System.out.println("Vehiculos creados " + Vehiculo.getCantidadInstanciasStatic());
		// no static mediante el objeto
		System.out.println("Vehiculos creados " + coche.getCantidadInstancias());

		Vehiculo vehiculo = new Vehiculo("2314", "honda", 3);
		System.out.println("VEHICULO");
		System.out.println(vehiculo);

		// static mediante la clase
		System.out.println("Vehiculos creados " + Vehiculo.getCantidadInstanciasStatic());
		// no static mediante el objeto
		System.out.println("Vehiculos creados " + vehiculo.getCantidadInstancias());
	}

}
