/**
 * ejercicio3.java
 * Algoritmo que pide caracteres e imprime ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario,
 * el programa termina cuando se introduce un espacio.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio3{
	
	public static void main( String[] args ){

		char caracter;		
		Scanner teclado = new Scanner( System.in );

		do{
			System.out.print( "Introduzca un caracter: " );
			caracter = teclado.next().charAt(0);

			// Comprobar para salir del bucle
			if( caracter == ' ' )
				break;
			else if(  ( caracter == 'a' ) || ( caracter == 'A' )
				   || ( caracter == 'e' ) || ( caracter == 'E' )
				   || ( caracter == 'i' ) || ( caracter == 'I' )
				   || ( caracter == 'o' ) || ( caracter == 'O' )
				   || ( caracter == 'u' ) || ( caracter == 'U' )  )
				System.out.println( "VOCAL" );
			else
				System.out.println( "NO VOCAL" );

			}while( true );
		}
	} // Fin del programa
