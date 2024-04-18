package principaldias;

import clasesnumerados.Dias;

public class PrincipalDias {

	public static void main(String[] args) {
		
		DiaEnumTest primerDia = new DiaEnumTest (Dias.LUNES);
		primerDia.dimeSiTeGusta();
		
		DiaEnumTest segundoDia = new DiaEnumTest (Dias.MIERCOLES);
		segundoDia.dimeSiTeGusta();
		
		DiaEnumTest tercerDia = new DiaEnumTest (Dias.VIERNES);
		tercerDia.dimeSiTeGusta();
		
		DiaEnumTest cuartoDia = new DiaEnumTest (Dias.DOMINGO);
		cuartoDia.dimeSiTeGusta();
		
		DiaEnumTest quintoDia = new DiaEnumTest (Dias.MARTES);
		quintoDia.dimeSiTeGusta();
		

	}

}
