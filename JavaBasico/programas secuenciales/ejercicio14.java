/**
 * ejercicio14.java
 * Dado un n�mero de dos cifras, el programa obtiene el n�mero invertido.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio14{

	public static void main( String[] args ){

		int num;
		int unidades;
		int decenas;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el n�mero: " );
		num = teclado.nextInt();

		decenas = num % 10;
		unidades = (int) Math.floor( num / 10 );
	
		System.out.println( "El n�mero invertido es " + ( unidades + decenas*10 ) );
		}
	} // Fin del programa
