/**
 * ejercicio20.java
 * Programa para resolver el siguiente problema:
 * Una compa��a de transporte internacional tiene servicio
 * en algunos pa�ses de Am�rica del Norte, Am�rica Central,
 *  Am�rica del Sur, Europa y Asia.
 *  El costo por el servicio de transporte se basa
 *  en el peso del paquete y la zona a la que va dirigido.
 *  Lo anterior se muestra en la tabla:
 *  ZONA	UBICACI�N	        COSTO/GRAMO
 *  1	Am�rica del Norte	24.00 euros
 *  2	Am�rica Central	    20.00 euros
 *  3	Am�rica del Sur	    21.00 euros
 *  4	Europa	            10.00 euros
 *  5	Asia	            18.00 euros
 * 
 *  Parte de su pol�tica implica que los paquetes 
 *  con un peso superior a 5 kg no son transportados,
 *  esto por cuestiones de log�stica y de seguridad. 
 *  Determinar el cobro por la entrega de un paquete o,
 *  en su caso, el rechazo de la entrega.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio20{

	public static void main( String[] args ){

		float peso;
		float precio = 0;
		int zona;
		boolean zonaCorrecta = true;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el peso del paquete en gramos: " );
		peso = teclado.nextFloat();
		System.out.print( "Introduzca el n�mero de zona: " );
		zona = teclado.nextInt();

		if( peso <= 0 )
			System.out.println( "ERROR: peso incorrecto." );
		else{
			if( peso > 5000 )
				System.out.println( "Se rechaza el paquete por exceso de peso" );
			else
				switch( zona ){
					case 1:
						precio = 24 * peso;
						break;
					case 2:
						precio = 20 * peso;
						break;
					case 3:
						precio = 21 * peso;
						break;
					case 4:
						precio = 10 * peso;
						break;
					case 5:
						precio = 18 * peso;
						break;
					default:
						zonaCorrecta = false;
					}

			if( zonaCorrecta )
				System.out.println( "El cobro es de " + precio );
			else
				System.out.println( "ERROR: zona incorrecta." );
			}
		}
	} // Fin del programa
