package comparableserialisable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class GrupoPensonas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Persona> listaPersonas;
	
	public GrupoPensonas() {
		listaPersonas = new ArrayList<Persona>();
	}
	
	//dar de alta
	
	public void altaPersona(String nombre, int altura, int edad) {
		listaPersonas.add(new Persona(nombre, altura, edad));
		Collections.sort(listaPersonas);//entran los datos ordenados
		
	}
	
	//listar persona
	public void listarPersonas() {
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
	}
	
	//guardar datos
	public void guardarDatos() {
		try {//guarda el objeto entero
			ObjectOutputStream escritor = new ObjectOutputStream
										(new FileOutputStream
										(new File("src/datos.dat")));
		escritor.writeObject(listaPersonas);
		escritor.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//guardar datos
	@SuppressWarnings("unchecked")
	public void cargarDatos() {
		try {
			ObjectInputStream lector = new ObjectInputStream
										(new FileInputStream
										(new File("src/datos.dat")));
		listaPersonas = (ArrayList<Persona>) lector.readObject();
		lector.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
