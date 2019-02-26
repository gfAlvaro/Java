/**
 * ejercicio12.java
 * Programa que pide una cadena y dos caracteres por teclado (valida que sea un carácter),
 * sustituye la aparición del primer carácter en la cadena por el segundo carácter.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio12{
	
	public static void main( String[] args ){
		
		String cadena;
		char caracter1 , caracter2;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de la cadena
		System.out.print( "Introduzca una cadena: " );
		cadena = teclado.nextLine();
		
		// Entrada de los caracteres con validacion
		do{		
			System.out.print( "Introduzca el catracter a reemplazar:" );
			caracter1 = teclado.next().charAt(0);
			System.out.print( "Introduzca el catracter de reemplazo:" );
			caracter2 = teclado.next().charAt(0);			
			}while(  ! ( Character.isLetter( caracter1 ) && Character.isLetter( caracter2 ) )  );

		// La funcion replace sustituye cada aparición de un caracter en la cadena por otro
		System.out.println(  "Nueva cadena: " + cadena.replace( caracter1 , caracter2 )  );
		}
	} // Fin del programa
