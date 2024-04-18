package principaldias;

import clasesnumerados.Dias;

public class DiaEnumTest {
	Dias dia;
	
	public DiaEnumTest (Dias dia) {
		this.dia = dia;
	}
	
	public void dimeSiTeGusta () {
		switch (dia) {
		case LUNES:
			System.out.println("Lunes Aburridos");
			break;
		case VIERNES:
			System.out.println("Viernes mejores");
			break;
		case SABADO:
			System.out.println("Me encanta fin de semana");
			break;
		case DOMINGO:
			System.out.println("Los domingos me encantan");
			break;
		default:
			System.out.println("Lo demas no me importa");
			break;
		}
	}
}
