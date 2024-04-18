package clases;

public class CuentaAhorroFija extends Cuenta {
	
	public CuentaAhorroFija () {
		super();
		this.interes = 2.6;//coge el interes de cuenta y doy un valor mas alto
	}
	
	public CuentaAhorroFija (String numero, double saldo, double interes) {
		super(numero,saldo);//cogo el contructor de arriba
		this.interes = interes;//le asigno el interes de aqui
		
	}

	@Override//cogo toString con los datos heredados
	public String toString() {
		return "CuentaAhorroFija [numero=" + numero + ", saldo=" + saldo + ", interes=" + interes + ", titular="
				+ titular + "]";
	}
	
	public double ingresoMes () {
		this.saldo += 100;
		return saldo;
	}
}
