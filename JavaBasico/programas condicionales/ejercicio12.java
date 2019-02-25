/**
 * ejercicio12.java
 * Programa que lee un a�o e indica si es bisiesto.
 * Nota: un a�o es bisiesto si es un n�mero divisible por 4,
 * pero no si es divisible por 100, excepto que tambi�n sea divisible por 400.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio12{

	public static void main( String[] args ){

		int year;
		boolean bisiesto;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el a�o: " );
		year = teclado.nextInt();
	
		bisiesto = ( ( year%4 ) == 0 )
				&& ( ( ( year%100 ) != 0 ) || ( ( year%400 ) == 0 ) );
	
		if( bisiesto )
			System.out.println( "El a�o " + year + " es bisiesto." );
		else
			System.out.println( "El a�o " + year + " no es bisiesto." );
		}
	} // Fin del programa
