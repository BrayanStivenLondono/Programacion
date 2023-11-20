package ejercicios00;

public class EjercicioPrevio03 {

	public static void main(String[] args) {
		// incrementales
		
		int numero1 = 56;
		System.out.println("numero1" + numero1);
		numero1++;
		System.out.println("numero1" + numero1);
		numero1++;
		//declementamos 1
		numero1--;
		System.out.println("numero1" + numero1);
		//decrementamos 1
		numero1--;
		System.out.println("numero1" + numero1);
		System.out.println("-------------------");
		int numero2 = numero1 ++;
		//int numero2=numero1
		//numero1++
		//primero asigna numero2=numero1 y segundo incrementa en 1 numero1
		//el orden lo marca que el ++ esta detras de numero1
		System.out.println("numero1" + numero1);
		System.out.println("numero2" + numero2);
		System.out.println("--------------------");
		int numero3 = numero2 ;
		//numero2++
		//int numero3 = numero2
		//primero incrementa numero2++ y segundo asigna numero3=numero2
		//el orden lo marca que el ++ esta delante del numero2
		System.out.println("numero2" + numero2);
		System.out.println("numero3" + numero3);
		
		


	}

}
