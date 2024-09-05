package clases;

public class CuentaCorriente extends Cuenta {
	public CuentaCorriente () {
		super();
	}
	
	public CuentaCorriente (String numero, double saldo, double interes) {
		super(numero, saldo, interes);
		
	}

	
	@Override
	public String toString() {
		return "CuentaCorriente [numero=" + numero + ", saldo=" + saldo + ", interes=" + interes + ", titular="
				+ titular + "]";
	}

	public double reintegro (int perras) {
		this.saldo -= perras;
		return saldo;
	}
}
