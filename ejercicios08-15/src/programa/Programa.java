package programa;

import clases.ManejoArchivo;

public class Programa {

	public static void main(String[] args) {
		ManejoArchivo alum = new ManejoArchivo (4);
		System.out.println("\n1 - Creo una instancia de alumno");
		
		
		System.out.println("\n2 - Doy de alta 4 alumnos");
		alum.altaAlumno("Pedro", "Gomez", 6.8, true);
		alum.altaAlumno("Maria", "Jose", 8.8, true);
		alum.altaAlumno("David", "Jose", 4.8, false);
		alum.altaAlumno("Kevin", "Felipe", 9.8, true);
		
		System.out.println("\n3 - Listo los alumnos");
		alum.listarAlumno();
		
		System.out.println("\n4 - Busco alumno por su nombre (Kevin)");
		System.out.println(alum.buscarAlumno("Kevin"));
		System.out.println("__________________________________________________________________________");
		alum.listarAlumno();
		
		System.out.println("\n5 - Elimino alumno diferente al anterior (Pedro)");
		alum.eliminarAlumno("Pedro");
		alum.listarAlumno();
		
		System.out.println("\n6 - Añado nuevo alumno");
		alum.altaAlumno("Santiago", "Rodriguez", 7.8, true);
		alum.listarAlumno();
		
		System.out.println("\n7 - Modifico el nombre de un alumno (David)");
		alum.cambiarNombreAlumno("David", "Maria");
		alum.listarAlumno();
		
		System.out.println("\n8 - Mostar alumno por nombre");
		alum.listarAlumnoPorNombre("Maria");
		System.out.println("__________________________________________________________________________");
		alum.listarAlumno();
	}
}
