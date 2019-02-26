/**
 * ejercicio15.java
 * Se pide una cadena de caracteres e indica si es un palíndromo.
 * Una palabra palíndroma es aquella que se lee igual adelante que atrás.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio15{
	
	public static void main( String[] args ){
		
		String frase, sinEspacios = "" , invertida = "";
		boolean palindromo;	
		Scanner teclado = new Scanner( System.in );
		
		// Pedir frase por teclado.
		System.out.print( "Introduzca una frase: " );
		frase = teclado.nextLine();
		
		// Quitar espacios a la frase
		for( int i = 0 ; i < frase.length() ; i++ )			
			if( frase.charAt(i) != ' ' )
				sinEspacios = sinEspacios + frase.charAt(i);
		
		// Invertir la frase sin espacios
		for( int i = sinEspacios.length() - 1 ; i >= 0 ; i-- )		
			invertida = invertida + sinEspacios.charAt(i);
			
		// Comparar la frase sin espacios con la frase invertida
		palindromo = invertida.equals( sinEspacios );
		
		// Mostrar el resultado
		if( palindromo )
			System.out.println( "La frase es un palindromo." );
		else
			System.out.println( "La frase no es un palindromo." );
		}
	} // Fin del programa
