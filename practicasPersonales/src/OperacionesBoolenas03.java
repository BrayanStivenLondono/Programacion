
public class OperacionesBoolenas03 {

	public static void main(String[] args) {
		// EXPRESIONES BOOLEANAS (TRUE, FALSE)
		
				//O. COMPARATIVOS
				   // == iguales
				   // != distintos 
				   // >  mayor que 
				   // >= mayor o igual que 
				   // <  menor que 
				   // <= menor o igual que
				int numero1 = 6;
				int numero2 = numero1;
				boolean resultado = 5 > 5; //false
				resultado = 5 >= 5; //true
				resultado = numero1 == numero2; //true
				resultado = numero1 != (numero2 * 4); //true
				System.out.println();
				
				//O. LOGICAS > Crea expresiones a partir de otras mas pequeñas
			       // && true si las dos son true, false en cualquier otro caso
				   // || False si las dos son false, true en cualquier otro caso
				   //  ! invierte el valor booleano de la expresion.
				
				int num1 = 5;
				int num2 = 3;
				int num3 = -7;
				
				boolean conclusion = (num1 > num3) && (num3 > num2); //true
                conclusion = (num1 > num3) || (num3 > num2); // false
                
                conclusion = true;
                conclusion = !conclusion; // false (invierte el valor)
                
                //O. Condicional > Permite selecionar un valor dependiendo de una expresion boolena
                   // expresionBooleana ? valor1 : valor2
                
                int num4 = 56;
                int num5 = -14;
                
                String result = num5 > num4 ? "num4 es mayor" : "num5 es mayor";    
                int mayor = num5 > num4 ? num5 : num4;
                // Para mostrar directamente por consola
                System.out.println(num5 > num4 ? "num5 es mayor" : "num4 es mayor");
	}

}
