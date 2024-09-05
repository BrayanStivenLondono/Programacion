package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo coche1 = new Vehiculo ("Coche", "Audi", 5.6F, 4);
		System.out.println(coche1.getVehiculoCreados());
		System.out.println(Vehiculo.getVehiculoCreados());
		
		Vehiculo coche2 = new Vehiculo ("moto", "Yamaha");
		System.out.println(coche2.getVehiculoCreados());
		System.out.println(Vehiculo.getVehiculoCreados());
		
		Vehiculo coche3 = new Vehiculo ();		
		System.out.println(coche3.getVehiculoCreados());
		System.out.println(Vehiculo.getVehiculoCreados());
	}
}
