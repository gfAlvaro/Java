/**
 * ejercicio5.java
 * Convierte un valor dado en grados Fahrenheit a grados Celsius.
 * @author Álvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio5{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		double fahrenheit;
		double celsius;

		System.out.print( "Introduzca los grados Fahrenheit: ");
		fahrenheit = teclado.nextDouble();

		celsius = ( fahrenheit - 32 ) / 1.8;
	
		System.out.println( "Grados Celsius: " + celsius );
		}
	} // Fin del programa
