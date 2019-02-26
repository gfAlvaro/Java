/**
 * ejercicio14.java
 * Programa que comprueba si una cadena contiene una subcadena.
 *  Las dos cadenas se introducen por teclado.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio14{
	
	public static void main( String[] args ){
		
		String cadena , subcadena;
		boolean encontrado;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca una cadena: " );
		cadena = teclado.nextLine();
		System.out.print( "Introduzca una subcadena a buscar: " );
		subcadena = teclado.nextLine();
		
		// Comprobar si la cadena contiene la subcadena dada
		encontrado = cadena.contains( subcadena );
		
		// Mostrar resultado
		if( encontrado )
			System.out.print( "Subcadena encontrada." );
		else
			System.out.print( "Subcadena no encontrada." );			
		}
	} // Fin del programa
