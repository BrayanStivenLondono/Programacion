package programa;

import clases.Juego;

public class Principal {
	public static void main(String[] args) {
		
		Juego game = new Juego();
		
		System.out.println("Creo los Cj's");
		game.altaCj(1,"Juan","2015-08-05");
		game.altaCj(2, "Maria","2015-08-05");
		game.altaCj(3, "Lucia","2015-08-05");
		game.listarCj();
		
		System.out.println();
		game.altaRelleno(1, "Pedro", 154);
		game.altaRelleno(2, "Santiago", 200);
		game.altaRelleno(3, "Cristian", 210);
		game.listarRelleno();
		
		System.out.println();
		game.altaPartida("Robo", 154, "Juan");
		game.altaPartida("Rescate", 300, "Lucia");
		game.listarPartidas();
		
		game.registrarRellenoPartida("Pedro", "Robo");
		game.registrarRellenoPartida("Cristian", "Rescate");
		
		System.out.println("Guardo las datos en fichero RAF");
		game.guardarNombreCj();
		
		try {
			System.out.println("Conecto con la base");
			game.conectarBase();
			
			System.out.println();
			System.out.println("Guardo los Cj");
			game.guardarCj();
			
			System.out.println();
			System.out.println("Cargo los Cj");
			game.cargarCj();
			
			System.out.println();
			System.out.println("Guardo relleno");
			game.guardarRelleno();
			
			System.out.println();
			System.out.println("Cargo relleno");
			game.cargarRelleno();
			
			System.out.println();
			System.out.println("Elimino rellerno Pedro");
			game.eliminarRelleno("Pedro");
			game.cargarRelleno();
			
			System.out.println();
			System.out.println("Actualizo nombre del id(1) a Jaime");
			game.actualizarNombreCj(1, "Jaime");
			game.cargarCj();
							
			System.out.println();
			System.out.println("Muestro cj 3");
			game.cargarCjEspecifico(3);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
