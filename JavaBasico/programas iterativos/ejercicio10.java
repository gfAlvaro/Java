/**
 * ejercicio10.java
 * Programa que pide una cadena y un carácter por teclado
 * y muestra cuantas veces aparece el carácter en la cadena.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio10{
	
	public static void main( String[] args ){
		
		char caracter;
		String cadena;
		int suma = 0;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca una cadena: " );
		cadena = teclado.nextLine();
		System.out.print( "Introduzca un caracter a buscar en la cadena: " );
		caracter = teclado.next().charAt(0);
		
		// Contar el numero de apariciones del caracter dado
		for( int i = 0 ; i < cadena.length() ; i++ )			
			if( caracter == cadena.charAt(i) )
				suma = suma + 1;
			
		// Mostrar el resultado por pantalla
		System.out.println( "El caracter '" + caracter + "' aparece " + suma + " veces." );
		}
	} // Fin del programa
