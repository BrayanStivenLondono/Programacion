package ejercicios00;

public class EjercicioPrevio05 {

	public static void main(String[] args) {
		// // && and
		// || or
		// !  not
		int numero1=4;
		int numero2=5;
		int numero3=6;
		System.out.println((numero1>3)&&(numero2>4));  //true &&  > true
		System.out.println((numero1>=5)&&(numero3>=5));//false && true > false
		System.out.println((numero1==2)&&(numero3==6));//false || true > true
		System.out.println((numero1==5)&&(numero3!=6));//false || false > false
		boolean resultado = (numero1==numero3); // true > !true > false
		System.out.println("resultado:" + resultado);
		







	}

}
