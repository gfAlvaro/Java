/**
 * ejercicio11.java
 * Suponiendo que hemos introducido una cadena por teclado
 * que representa una frase (palabras separadas por espacios),
 * realiza un programa que cuente cuantas palabras tiene.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio11{
	
	public static void main( String[] args ){
		
		String frase;
		int cuenta = 0;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca la frase: " );
		frase = teclado.nextLine();
		
		// Contar cuántas palabras tiene la frase dada
		for( int i = 0 ; i < frase.length() ; i++ )		
			if( frase.charAt(i) == ' ' )
				cuenta = cuenta + 1;
								
		// Mostrar el resultado por pantalla
		System.out.println( "La frase tiene " + cuenta + " espacios." );
		}
	} // Fin del programa
