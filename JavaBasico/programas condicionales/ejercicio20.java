/**
 * ejercicio20.java
 * Programa para resolver el siguiente problema:
 * Una compañía de transporte internacional tiene servicio
 * en algunos países de América del Norte, América Central,
 *  América del Sur, Europa y Asia.
 *  El costo por el servicio de transporte se basa
 *  en el peso del paquete y la zona a la que va dirigido.
 *  Lo anterior se muestra en la tabla:
 *  ZONA	UBICACIÓN	        COSTO/GRAMO
 *  1	América del Norte	24.00 euros
 *  2	América Central	    20.00 euros
 *  3	América del Sur	    21.00 euros
 *  4	Europa	            10.00 euros
 *  5	Asia	            18.00 euros
 * 
 *  Parte de su política implica que los paquetes 
 *  con un peso superior a 5 kg no son transportados,
 *  esto por cuestiones de logística y de seguridad. 
 *  Determinar el cobro por la entrega de un paquete o,
 *  en su caso, el rechazo de la entrega.
 * @author Álvaro García Fuentes
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
		System.out.print( "Introduzca el número de zona: " );
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
