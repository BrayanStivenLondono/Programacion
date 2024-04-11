package programa;

import java.time.LocalDate;

import clases.GestorTrabajos;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Creamos gestor trabajos");
		GestorTrabajos gestor = new GestorTrabajos();
		
		System.out.println();
		
		System.out.println("Creamos dos responsables");
		gestor.altaResponsable("54321", "responsable1");
		gestor.altaResponsable("12345", "responsable2");
		System.out.println();
		
		System.out.println("Creamos uno mas con dni repetido");
		gestor.altaResponsable("12345", "responsable3");
		System.out.println();
		
		System.out.println("Listamos responsables");
		gestor.listarResponsables();
		System.out.println();
		
		System.out.println("Buscamos responsable 12345");
		System.out.println(gestor.buscarResponsable("12345"));
		System.out.println();
		
		System.out.println("Buscamos responsable que no existe");
		System.out.println(gestor.buscarResponsable("123456"));
		System.out.println();
		
		System.out.println("Damos de alta trabajos");
		gestor.altaTrabajo("trabajo1", "cliente1", 10.0, "2019-04-02");
		gestor.altaTrabajo("trabajo2", "cliente2", 20.0, "2019-05-02");
		gestor.altaTrabajo("trabajo3", "cliente3", 30.0, "2018-04-02");
		System.out.println();
		
		System.out.println("Asignamos responsables a trabajos");
		gestor.asignarResponsable("12345", "trabajo1");
		gestor.asignarResponsable("12345", "trabajo2");
		System.out.println();
		
		System.out.println("Listamos trabajos de responsable 12345");
		gestor.listarTrabajosDeResponsable("12345");
		System.out.println();
		
		System.out.println("Listamos trabajos año");
		gestor.listarTrabajosAnno(2019);
		System.out.println();
		
		System.out.println("Eliminamos trabajo trabajo2");
		gestor.eliminarTrabajo("trabajo2");
		System.out.println();
		
		System.out.println("Listamos trabajos de responsable 12345");
		gestor.listarTrabajosDeResponsable("12345");
		System.out.println();
		
		System.out.println("Uso el ere");
		gestor.ere();
		System.out.println();
		
		System.out.println("Creo un nuevo responsable");
		gestor.altaResponsable("44444", "responsable4");
		System.out.println("Cambio fecha contratación del responsable4");
		
		gestor.buscarResponsable("44444").setFechaContratacion(LocalDate.parse("2022-05-05"));
		gestor.listarResponsables();
		System.out.println();
		
		System.out.println("Damos de alta otro trabajo del 2023");
		gestor.altaTrabajo("trabajo4", "cliente4", 40.0, "2023-05-05");
		System.out.println("Asignamos responsable experto");
		gestor.asignarResponsableExperto("trabajo4");
		System.out.println("Listamos trabajo año 2023");
		gestor.listarTrabajosAnno(2023);
		

	}

}
