/**
 * ejercicio13.java
 * Programa que lee un n�mero y muestra sus ra�ces cuadrada y c�bica.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio13{

	public static void main( String[] args ){

		double num;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el n�mero: " );
		num = teclado.nextDouble();

		System.out.println(  "Ra�z cuadrada: " + Math.sqrt( num )  );
		System.out.println(  "Ra�z c�bica: " + Math.pow( num, 1/3 )  );
		}
	} // Fin del programa
