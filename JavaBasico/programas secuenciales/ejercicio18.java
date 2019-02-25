/**
 * ejercicio18.java
 * Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 * autor: Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio18{

	public static void main( String[] args ){

		String nombre;
		String apellido1;
		String apellido2;

		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el nombre: " );
		nombre = teclado.next();
		System.out.print( "Introduzca el primer apellido: " );
		apellido1 = teclado.next();
		System.out.print( "Introduzca el segundo apellido: " );
		apellido2 = teclado.next();

		System.out.println( "Las iniciales son " + nombre.charAt(0)
							+ "." + apellido1.charAt(0)
							+ "." + apellido2.charAt(0) + "." );
		}
	} // Fin del programa
