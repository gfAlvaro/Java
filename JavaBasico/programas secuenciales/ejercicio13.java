/**
 * ejercicio13.java
 * Programa que lee un número y muestra sus raíces cuadrada y cúbica.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio13{

	public static void main( String[] args ){

		double num;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el número: " );
		num = teclado.nextDouble();

		System.out.println(  "Raíz cuadrada: " + Math.sqrt( num )  );
		System.out.println(  "Raíz cúbica: " + Math.pow( num, 1/3 )  );
		}
	} // Fin del programa
