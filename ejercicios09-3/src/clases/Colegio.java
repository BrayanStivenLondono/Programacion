package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {
	private String nombre;
	private ArrayList<Botiquin> botiquin;
	
	Scanner input = new Scanner (System.in);
	
	public Colegio() {
		this.nombre = "";
		this.botiquin = new ArrayList<Botiquin>();
	}
	
	public Colegio(String nombre, ArrayList<Botiquin> botiquin) {
		this.nombre = nombre;
		this.botiquin = botiquin;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Botiquin> getBotiquin() {
		return botiquin;
	}
	public void setBotiquin(ArrayList<Botiquin> botiquin) {
		this.botiquin = botiquin;
	}
	
	public void rellenarColegio () {
		System.out.println("Nombre del Colegio");
		this.nombre = input.nextLine();
		
		String respuesta = "";
		while (true) {
			Botiquin boti = new Botiquin();
			boti.rellenarBotiquin();
			this.botiquin.add(boti);
			
			System.out.println("Mas botiquines? (si/no)");
			respuesta = input.nextLine();
			
			if (respuesta.equalsIgnoreCase("no")) {
				break;
			} 
		}
	}
	
	public void visualizar () {
		System.out.println("Colegio "+this.nombre);
		System.out.println("\nLista Botiquines");
		for (Botiquin i : botiquin) {
			i.visualizar();
			System.out.println(i);
			System.out.println("Media Precios "+i.mediaPrecio());
			System.out.println("Total Precios "+i.totalPrecio());

		}
	}
	public void modificar () {
		boolean existe = false;
		System.out.println("\nBotiquin a modificar");
		String nombre = input.nextLine();
		for (Botiquin i : botiquin) {
			if (i.getNombre().equalsIgnoreCase(nombre)) {
				i.modificar();
				existe = true;
			}
			if (!existe) {
				System.out.println("Botiquin no encontrado");
			}
		}
	}
	public void ordenar () {
		for (int i = 0; i < botiquin.size()-1; i++) {	
			for (int j = i+1; j < botiquin.size(); j++) {
				if (botiquin.get(i).getNombre().compareTo(botiquin.get(j).getNombre()) < 0) {
					Botiquin aux = botiquin.get(i);
					botiquin.set(i, botiquin.get(j));
					botiquin.set(i, aux);
				}
			}
		}
		System.out.println();
		System.out.println("Lista ordenada:");
		System.out.println();
	}
	public double mediaBotiquin () {
		double media = 0;
		for (Botiquin i : botiquin) {
			media += i.totalPrecio();
		}
		return media/botiquin.size();
	}
}
