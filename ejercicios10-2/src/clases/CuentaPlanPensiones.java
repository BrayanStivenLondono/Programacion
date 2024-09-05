package clases;

public class CuentaPlanPensiones extends Cuenta {
	double cotizacion;

	public CuentaPlanPensiones() {
		super();
		this.interes = 3.22;
		this.cotizacion = 6.5;
	}
	
	public CuentaPlanPensiones(String nombre, double saldo, double interes, double cotizacion) {
		super(nombre, saldo);
		//llamo los de aqui
		this.interes = interes;
		this.cotizacion = cotizacion;
	}

	//setter y getter
	public double getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
	}

	@Override
	public String toString() {
		return "CuentaPlanPensiones [cotizacion=" + cotizacion + ", numero=" + numero + ", saldo=" + saldo
				+ ", interes=" + interes + ", titular=" + titular + "]";
	}
	
}
