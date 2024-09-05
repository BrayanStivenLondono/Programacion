package clases;

import java.time.LocalDate;

public class TallerVehiculos {
	//creo vector de albaran
	private Albaran[] albaranes; //constructor de Albaran

	//inicializo el vector de albaranes con un entero que se usara en toda la clase
	
	public TallerVehiculos (int maxAlbaranes) {
		this.albaranes = new Albaran [maxAlbaranes];//lo inicializo
	}
	//alta albaran 
	//con parametros (codVehiculo, precio y codAlbaran)
	//insertar en espacio vacio (null)
	//llamo constructor con codAlbaran
	//completo el resto de campos con set
	
	public void altaAlbaran (String codAlbaran, double precio, String codVehiculo) {
		for (int i=0; i<albaranes.length; i++) {
			if (albaranes[i]==null) {//añado posicion libre
				//inserto
				albaranes[i] = new Albaran(codAlbaran);
				albaranes[i].setPrecio(precio);
				albaranes[i].setCodVehiculo(codVehiculo);
				albaranes[i].setFecha(LocalDate.now());//fecha actual
				break;
			}
		}
	}
	//lista albaranes
	public void listarAlbaranes () {
		for (int i = 0; i < albaranes.length; i++) {
			if (albaranes[i]!=null) {
				System.out.println(albaranes[i]);
			}
		}
	}
	//buscar albaran
	//metodo que devuelve un albran recibiendo un codAlbaran
	public Albaran buscarAlbaran (String codAlbaran) {
		for (int i = 0; i < albaranes.length; i++) {
			if (albaranes[i]!=null) {//busca si hay datos
				if (albaranes[i].getCodAlbaran().equals(codAlbaran)) {//comparo 
					return albaranes[i];
				}
			}
		}
		return null;
	}
	//elimino un albaran
	public void eliminarAlbaran (String codAlbaran) {
		for (int i = 0; i < albaranes.length; i++) {
			if (albaranes[i]!=null) {//busca si hay datos
				if (albaranes[i].getCodAlbaran().equals(codAlbaran));//compararo
				albaranes[i] = null;
			}
		}
	}
	//cambiar albaran
	//metodo que recibe un codAlbaran y un codVehiculo
	//cambia el vehucilo del albaran selecionado
	public void cambiarAlbaran (String codAlbaran, String codVehiculo) {
		for (int i = 0; i < albaranes.length; i++) {
			if (albaranes[i]!=null) {//busca si hay datos
				if (albaranes[i].getCodAlbaran().equals(codAlbaran)) {
					albaranes[i].setCodVehiculo(codVehiculo);//set (cambia)
				}
			}
		}
	}
	public void listarAlbaranesPorVehiculo(String codVehiculo) {
		for (int i = 0; i < albaranes.length; i++) {
			if (albaranes[i]!=null) {
				if (albaranes[i].getCodVehiculo().equals(codVehiculo)) {
					System.out.println(albaranes[i]);
				}
			}
		}
	}
}
