/**
 * ejercicio14.java
 * Dado un número de dos cifras, el programa obtiene el número invertido.
 * @author Álvaro García Fuentes
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

		System.out.print( "Introduzca el número: " );
		num = teclado.nextInt();

		decenas = num % 10;
		unidades = (int) Math.floor( num / 10 );
	
		System.out.println( "El número invertido es " + ( unidades + decenas*10 ) );
		}
	} // Fin del programa
