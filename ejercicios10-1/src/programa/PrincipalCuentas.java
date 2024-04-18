package programa;

import clases.GestorCuentas;

public class PrincipalCuentas {

	public static void main(String[] args) {
		System.out.println("Creamos un banco");
		GestorCuentas banco = new GestorCuentas();
		System.out.println("Creamos dos clientes y listamos");
		banco.altaCliente("11111", "Maria", "1981-04-02");
		banco.altaCliente("22222", "Carlos", "1960-09-03");
		banco.listarCliente();
		
		System.out.println("");
		System.out.println("Buscamos cliente 11111");
		System.out.println(banco.buscarCliente("11111"));
		
		System.out.println("");
		System.out.println("Creamos tres cuentas y listamos");
		banco.altaCuenta("11-1111-11", 124, 0.2);
		banco.altaCuenta("22-2222-22", 654, 0.3);
		banco.altaCuenta("33-3333-33", 351, 0.2);
		banco.listarCuenta();
		
		System.out.println("Asignamos titulares y listamos");
		banco.asignarCuentaCliente("11111", "11-1111-11");
		banco.asignarCuentaCliente("11111", "22-2222-22");
		banco.asignarCuentaCliente("22222", "33-3333-33");
		banco.listarCuenta();

		System.out.println("");
		System.out.println("Buscamos cuenta 11-1111-11");
		System.out.println(banco.buscarCuenta("11-1111-11"));
		
		System.out.println("");
		System.out.println("Listamos cuentas de titular 11111");
		banco.listarCuentasTitular("11111");
		
		System.out.println("");
		System.out.println("Eliminamos cuenta 11-1111-11");
		banco.eliminarCuenta("11-1111-11");
		banco.listarCuenta();
		
		System.out.println("");
		System.out.println("Creamos cuenta plan pensiones, asignamos, listamos");
		banco.altaCuentaPlanPensiones("44-4444-44", 321, 0.15, 0.35);
		banco.asignarCuentaPlanPensionesCliente("11111", "44-4444-44");
		banco.listaCuentaPlanPensiones();
		
		System.out.println("");
		System.out.println("Creamos cuenta ahorro fija, asignamos, listamos");
		banco.altaCuentaAhorroFija("55-5555-55", 354, 0.15);
		banco.asignarCuentaAhorroCliente("11111", "55-5555-55");
		banco.listarCuentaAhorroFija();
		
		System.out.println("");
		System.out.println("Creamos cuenta corriente, asignamos, listamos");
		banco.altaCuentaCorriente("66-6666-66", 784, 0.3);
		banco.asignarCuentaCorrienteCliente("22222", "66-6666-66");
		banco.listarCuentaCorrientes();
		
		System.out.println("");
		System.out.println("Ingreso en cuenta y listamos");
		banco.ingreso(banco.buscarCuenta("33-3333-33"), 215);
		banco.listarCuenta();
		
		System.out.println("");
		System.out.println("Reintegro de una cuenta corriente y listamos");
		banco.reintegro(banco.buscarCuentaCorriente("66-6666-66"), 120);
		banco.listarCuentaCorrientes();
		
		System.out.println("");
		System.out.println("Ingreso mes en cuenta ahorro fija y listamos");
		banco.ingresoMes(banco.buscarCuentaAhorroFija("55-5555-55"));
		banco.listarCuentaAhorroFija();
		
		
	}

}
