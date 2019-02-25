/**
 * ejercicio19.java
 * Se pide un n�mero entero entre uno y doce
 * e imprime el n�mero de d�as que tiene el mes correspondiente.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio19{
	
	public static void main( String[] args ){

		int numeroMes;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el n�mero del mes: " );
		numeroMes = teclado.nextInt();
	
		switch( numeroMes ){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println( "Tiene 31 d�as" );
				break;
			case 4: case 6: case 9: case 11:
				System.out.println( "Tiene 30 d�as" );
				break;
			case 2:
				System.out.println( "Tiene 28 d�as o 29 si es a�o bisiesto" );
				break;
			default:
				System.out.println( "ERROR: N�mero incorrecto." );
			}
		}
	} // Fin del programa
