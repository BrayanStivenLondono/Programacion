package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorCuentas {
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Cuenta> listaCuentas;
	private ArrayList<CuentaCorriente> listaCuentasCorrientes;
	private ArrayList<CuentaAhorroFija> listaCuentaAhorro;
	private ArrayList<CuentaPlanPensiones> listaCuentaPlanPensiones;
	
	//constructor que inicializa los ArrayList
	public GestorCuentas () {
		listaClientes = new ArrayList<Cliente>();
		listaCuentas = new ArrayList<Cuenta>();
		listaCuentasCorrientes = new ArrayList<CuentaCorriente>();
		listaCuentaAhorro = new ArrayList<CuentaAhorroFija>();
		listaCuentaPlanPensiones = new ArrayList<CuentaPlanPensiones>();
	
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
		listaCuentasCorrientes.add(corriente);
	}
	
	public void altaCuentaAhorroFija(String numero, double saldo, double interes) {
		CuentaAhorroFija cuentaAhorro = new CuentaAhorroFija (numero, saldo, interes);
		listaCuentaAhorro.add(cuentaAhorro);
	}
	
	public void altaCuentaPlanPensiones (String numero, double saldo, double interes, double cotizacion) {
		CuentaPlanPensiones cuentaPension = new CuentaPlanPensiones (numero, saldo, interes, cotizacion);
		listaCuentaPlanPensiones.add(cuentaPension);
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
	
	public void listarCuentaCorrientes () {
		for (CuentaCorriente cuenta : listaCuentasCorrientes) {
			if (cuenta!=null) {
				System.out.println(cuenta);
			}
		}
	}
	
	public void listarCuentaAhorroFija () {
		for (CuentaAhorroFija cuenta : listaCuentaAhorro) {
			if (cuenta!=null) {
				System.out.println(cuenta);
			}
		}
	}
	
	public void listaCuentaPlanPensiones () {
		for (CuentaPlanPensiones cuenta : listaCuentaPlanPensiones) {
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
	
	public CuentaCorriente buscarCuentaCorriente (String numero) {
		for (CuentaCorriente cuenta : listaCuentasCorrientes) {
			if (cuenta!=null && cuenta.getNumero().equalsIgnoreCase(numero)) {
				return cuenta;
			}
		}
		return null;
	}
	
	public CuentaAhorroFija buscarCuentaAhorroFija (String numero) {
		for (CuentaAhorroFija cuenta : listaCuentaAhorro) {
			if (cuenta!=null && cuenta.getNumero().equalsIgnoreCase(numero)) {
				return cuenta;
			}
		}
		return null;
	}
	
	public CuentaPlanPensiones buscarCuentaPlanPensiones (String numero) {
		for (CuentaPlanPensiones cuenta : listaCuentaPlanPensiones) {
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
	
	public void asignarCuentaCorrienteCliente (String dni, String numero) {
		Cliente cliente = buscarCliente(dni);
		CuentaCorriente cuenta = buscarCuentaCorriente(numero);
		cuenta.setTitular(cliente);
	}
	
	public void asignarCuentaAhorroCliente (String dni, String numero) {
		Cliente cliente = buscarCliente(dni);
		CuentaAhorroFija cuenta = buscarCuentaAhorroFija(numero);
		cuenta.setTitular(cliente);
	}
	
	public void asignarCuentaPlanPensionesCliente (String dni, String numero) {
		Cliente cliente = buscarCliente(dni);
		CuentaPlanPensiones cuenta = buscarCuentaPlanPensiones(numero);
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


