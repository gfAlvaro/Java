/**
 * ejercicio1.java
 * Programa que pregunta al usuario su nombre y luego le saluda.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio1{

	public static void main( String[] args ){

		String nombre;

		Scanner teclado = new Scanner( System.in );
		System.out.print( "�Cu�l es su nombre? " );
		nombre = teclado.nextLine();
		System.out.print( "Hola " + nombre + "\n" );
		}
	} // Fin del programa
