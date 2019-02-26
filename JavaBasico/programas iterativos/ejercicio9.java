/**
 * ejercicio9.java
 * Programa que muestra en pantalla los N primeros números primos.
 * Se pide por teclado la cantidad de números primos que queremos mostrar.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio9{
	
	public static void main( String[] args ){
		
		int N , contador = 0;
		boolean primo;	
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca la cantidad de numeros primos a mostrar: " );
		N = teclado.nextInt();
		
		for( int i = 1 ; contador < N ; i++ ){

			primo = true;
			for( int j = 2 ; j < i ; j++ )		
				if( i%j == 0 ){
					primo = false;
					break;
					}
			
			if( primo ){
				// Contador para salir del bucle.		
				contador = contador + 1;
				System.out.println( i );
				}
			}
		}
	} // Fin del programa
