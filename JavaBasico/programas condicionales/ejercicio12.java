/**
 * ejercicio12.java
 * Programa que lee un año e indica si es bisiesto.
 * Nota: un año es bisiesto si es un número divisible por 4,
 * pero no si es divisible por 100, excepto que también sea divisible por 400.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio12{

	public static void main( String[] args ){

		int year;
		boolean bisiesto;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el año: " );
		year = teclado.nextInt();
	
		bisiesto = ( ( year%4 ) == 0 )
				&& ( ( ( year%100 ) != 0 ) || ( ( year%400 ) == 0 ) );
	
		if( bisiesto )
			System.out.println( "El año " + year + " es bisiesto." );
		else
			System.out.println( "El año " + year + " no es bisiesto." );
		}
	} // Fin del programa
