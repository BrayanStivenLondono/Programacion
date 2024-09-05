package mas;

import java.util.Scanner;

public class DoWhile06 {
	
		static final String CODIGO_IMPORTE = "TYN";
		static final String CODIGO_TRANSPORTE = "UPS";
		static final double DESCUENTO_IMPORTE = 0.15;
		static final double DESCUENTO_TRANSPORTE = 4.95;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// variable para el menu
				int opcion = 0;
				do {
					System.out.println("\n1.- Calcular importe de compra");
					System.out.println("2.- Ordena jugadores");
					System.out.println("3.- Frecuencia de las vocales");
					System.out.println("4.- Dinero en cuenta");
					System.out.println("5.- Salir");
					System.out.println("Introduce opción");

					opcion = input.nextInt(); // leer opcion
					input.nextLine(); //  buffer

					switch (opcion) {
					case 1:
						double compra = 0;
						String descuento = "";
						System.out.println("Introduce el total de la compra");
						compra = input.nextDouble();
						
						input.nextLine(); // buffer
						
						System.out.println("Introduce el descuento");
						descuento = input.nextLine();

						if (descuento.equals(CODIGO_IMPORTE)) { // STRING equals.   char y numero ==
							System.out.println("El descuento es " + descuento);
							System.out.println("El total con descuento por importe es " + (compra-DESCUENTO_IMPORTE));
						} else if (descuento.equals(CODIGO_TRANSPORTE)) {
							System.out.println("El descuento es " + descuento);
							System.out.println("El total con descuento por importe es " + (compra-DESCUENTO_TRANSPORTE));
						}

						break;
					case 2:
						//jugador1
						System.out.println("Introduzca el NOMBRE del primer jugador");
						String nombrePersona1=input.nextLine();
						System.out.println("Introduzca el APODO del primer jugador");
						String apodoPersona1=input.nextLine();
						System.out.println("Introduzca la puntuación del primer jugador");
						int puntuaPersona1=input.nextInt();
						input.nextLine();
						
						//jugador2
						System.out.println("Introduzca el NOMBRE del segundo jugador");
						String nombrePersona2=input.nextLine();
						System.out.println("Introduzca el APODO del segundo jugador");
						String apodoPersona2=input.nextLine();
						System.out.println("Introduzca la puntuación del segundo jugador");
						int puntuaPersona2=input.nextInt();
						input.nextLine();
						
						//jugador3
						System.out.println("Introduzca el NOMBRE del tercer jugador");
						String nombrePersona3=input.nextLine();
						System.out.println("Introduzca el APODO del tercer jugador");
						String apodoPersona3=input.nextLine();
						System.out.println("Introduzca la puntuación del tercer jugador");
						int puntuaPersona3=input.nextInt();

						//creo los nombres completos  // pasa a mayuscula
						String jugador1 = apodoPersona1.toUpperCase() + " - "+nombrePersona1+ " ("+puntuaPersona1+")";
						String jugador2 = apodoPersona2.toUpperCase() + " - "+nombrePersona2+ " ("+puntuaPersona2+")";
						String jugador3 = apodoPersona3.toUpperCase() + " - "+nombrePersona3+ " ("+puntuaPersona3+")";
						//                               ignora masyus y minus
						boolean unoMenorADos =  jugador1.compareToIgnoreCase(jugador2)<=0;						
						boolean unoMenorATres = jugador1.compareToIgnoreCase(jugador3)<=0;
						boolean dosMenorAUno =  jugador2.compareToIgnoreCase(jugador1)<=0;
						boolean dosMenorATres = jugador2.compareToIgnoreCase(jugador3)<=0;
						boolean tresMenorAUno = jugador3.compareToIgnoreCase(jugador1)<=0;
						boolean tresMenorADos = jugador3.compareToIgnoreCase(jugador2)<=0;
						
						if (unoMenorADos && dosMenorATres) {        //1<2<3
							System.out.println(jugador1);
							System.out.println(jugador2);
							System.out.println(jugador3);
						} else if (dosMenorATres && tresMenorAUno) {//2<3<1
							System.out.println(jugador2);
							System.out.println(jugador3);
							System.out.println(jugador1);
						} else if (tresMenorAUno && unoMenorADos ) { //3<1<2
							System.out.println(jugador3);
							System.out.println(jugador1);
							System.out.println(jugador2);				
						} else if (dosMenorAUno && unoMenorATres) { //2<1<3
							System.out.println(jugador1);
							System.out.println(jugador2);
							System.out.println(jugador3);
						} else if (tresMenorADos && dosMenorAUno) { //3<2<1
							System.out.println(jugador3);
							System.out.println(jugador2);
							System.out.println(jugador1);
						} else if (unoMenorATres && tresMenorADos) { //1<3<2
							System.out.println(jugador1);
							System.out.println(jugador3);
							System.out.println(jugador2);
						
						}
						break;

					case 3:
						int contadorA = 0;
						int contadorE = 0;
						int contadorI = 0;
						int contadorO = 0;
						int contadorU = 0;
						String cadena;
						String totalA = ""; // importante
						String totalE = "";
						String totalI = "";
						String totalO = "";
						String totalU = "";

						System.out.println("Dame el texto a evaluar");
						cadena = input.nextLine();
						cadena = cadena.toLowerCase();

						for (int i = 0; i < cadena.length(); i++) {
							if (cadena.charAt(i)=='a') {
								contadorA++;
								totalA += "*";
							}
							if (cadena.charAt(i)=='e') {
								contadorE++;
								totalE += "*";
							}
							if (cadena.charAt(i)=='i') {
								contadorI++;
								totalI += "*";
							}
							if (cadena.charAt(i)=='o') {
								contadorO++;
								totalO += "*";
							}
							if (cadena.charAt(i)=='u') {
								contadorU++;
								totalU += "*";
							}
						}
						System.out.println("a  " + contadorA + "  " + totalA);
						System.out.println("e  " + contadorE + "  " + totalE);
						System.out.println("i  " + contadorI + "  " + totalI);
						System.out.println("o  " + contadorO + "  " + totalO);
						System.out.println("u  " + contadorU + "  " + totalU);
						break;
					case 4:
						System.out.println("Dame el saldo de la cuenta");
						double saldo = input.nextDouble();
						
						double saldoActual = saldo;
						double cantidad;
						
						do {
							System.out.println("Realiza ingreso (positivo), reintegro (negativo)");
							cantidad = input.nextDouble();
							saldoActual = saldoActual+cantidad; //acomulador
							
							System.out.println("Queda " + (saldoActual) + " ");
						} while (saldoActual >= 0);
						System.out.println("No queda saldo");
						
						break;
					case 5:
						input.close();
						System.out.println("Programa terminado");
						break;
					default:
						System.out.println("La opción no es correcta");
					}

				} while (opcion != 5); // fin del while
			
		
	}

}
