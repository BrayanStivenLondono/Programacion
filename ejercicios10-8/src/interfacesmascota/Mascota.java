package interfacesmascota;

import clasemascota.Animal;

//definimos una interfas
//todos sus metodos seran abstractos
//no estan implementados, solo indicados

public interface Mascota {
	String getCodigo();
	void hazRuido();
	void come (String comida);
	void peleaConAnimal(Animal contrincante);
}
