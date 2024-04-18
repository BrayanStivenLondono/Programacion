package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorCuentas {
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Cuenta> listaCuentas;
	
	//constructor que inicializa los ArrayList
	public GestorCuentas () {
		listaClientes = new ArrayList<Cliente>();
		listaCuentas = new ArrayList<Cuenta>();
	
	}
	
	public void altaCliente(String nombre, String dni, String fechaNacimiento) {
		Cliente cliente = new Cliente (nombre, dni);
		cliente.setFechaNacimiento(LocalDate.parse(fechaNacimiento));
		listaClientes.add(cliente);
	}
	
	public void altaCuenta (String numero, double saldo, double interes) {
		Cuenta cuenta = new Cuenta (numero, saldo, interes);
		listaCuentas.add(cuenta);
	}
	
	public void altaCuentaCorriente(String numero, double saldo, double interes) {
		CuentaCorriente corriente = new CuentaCorriente (numero, saldo, interes);
		listaCuentas.add(corriente);
	}
	
	public void altaCuentaAhorroFija(String numero, double saldo, double interes) {
		CuentaAhorroFija cuentaAhorro = new CuentaAhorroFija (numero, saldo, interes);
		listaCuentas.add(cuentaAhorro);
	}
	
	public void altaCuentaPlanPensiones (String numero, double saldo, double interes, double cotizacion) {
		CuentaPlanPensiones cuentaPension = new CuentaPlanPensiones (numero, saldo, interes, cotizacion);
		listaCuentas.add(cuentaPension);
	}
	
	public void listarCliente () {
		for (Cliente cliente : listaClientes) {
			if (cliente!=null) {
				System.out.println(cliente);
			}
		}
	}
	
	public void listarCuenta () {
		for (Cuenta cuenta : listaCuentas) {
			if (cuenta!=null) {
				System.out.println(cuenta);
			}
		}
	}
	
	public Cliente buscarCliente (String dni) {
		for (Cliente cliente : listaClientes) {
			if (cliente!=null && cliente.getDni().equalsIgnoreCase(dni)) {
				return cliente;
			}
		}
		return null;
	}
	
	public Cuenta buscarCuenta (String numero) {
		for (Cuenta cuenta : listaCuentas) {
			if (cuenta!=null && cuenta.getNumero().equalsIgnoreCase(numero)) {
				return cuenta;
			}
		}
		return null;
	}
	
	//un solo eliminar
	public void eliminarCuenta (String numero) {
		Iterator<Cuenta> iterador = listaCuentas.iterator();
		while (iterador.hasNext()) {
			Cuenta cuenta = iterador.next();//elemento
			if (cuenta.getNumero().equalsIgnoreCase(numero)) {
				iterador.remove();
			}
		}
	}
	
	public void asignarCuentaCliente (String dni, String numero) {
		Cliente cliente =  buscarCliente (dni);
		Cuenta cuenta =  buscarCuenta(numero);
		cuenta.setTitular(cliente);
	}
	
	public void listarCuentasTitular (String dni) {
		for (Cuenta cuenta : listaCuentas) {
			//tambien comparo que el titular no es null
			if (cuenta.getTitular()!=null && 
				cuenta.getTitular().getDni().equalsIgnoreCase(dni)) {
				System.out.println(cuenta);
			}
		}
	}
	
	//recibiendo un objeto (no usarlo)(es igual)
	public void listarCuentasTitularObjeto(Cliente titular) {
		for (Cuenta cuenta: listaCuentas) {
			if (cuenta!=null && 
				cuenta.getTitular().getDni().equals(titular.getDni())) {
				System.out.println(cuenta);
			}
		}
	}
	
	public void ingreso (Cuenta cuenta, int dinero) {
		//llamo el metodo ingreso
		cuenta.ingreso(dinero);
	}
	
	public void reintegro (CuentaCorriente cuenta, int dinero) {
		cuenta.ingreso(dinero);
	}
	
	public void ingresoMes (CuentaAhorroFija cuenta) {
		cuenta.ingresoMes();
	}
}


