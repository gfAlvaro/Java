/**
 * ejercicio13.java
 * Programa que lee una cadena por teclado
 * y convierte las mayúsculas a minúsculas y viceversa.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio13{
	
	public static void main( String[] args ){
		
		String cadena , salida = "";
		char caracter1 , caracter2;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca una cadena: " );
		cadena = teclado.nextLine();
		
		// convertir mayúsculas a minúsculas y viceversa
		for( int i = 0 ; i < cadena.length() ; i++ )			
			if(  Character.isUpperCase( cadena.charAt(i) )  )
				salida = salida + Character.toLowerCase( cadena.charAt(i) );
			else if(  Character.isLowerCase( cadena.charAt(i) )  )
				salida = salida + Character.toUpperCase( cadena.charAt(i) );
			else
				salida = salida + cadena.charAt(i);
		
		// Mostrar el resultado
		System.out.println( "Nueva cadena: " + salida );
		}
	} // Fin del programa
