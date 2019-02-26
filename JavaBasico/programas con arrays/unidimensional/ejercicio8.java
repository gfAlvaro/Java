/**
 * ejercicio8.java
 * Programa que pide la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestra a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se dibujan a base de asteriscos
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio8{
	
	public static void main( String[] args ){
		
		Scanner teclado = new Scanner( System.in );
		
		float temperatura[];
		temperatura = new float [12];
		
		for( int i = 0 ; i < 12 ; i++ ){
			System.out.print( "Introduzca la temperatura del " + (i+1) + "er mes: " );
			temperatura[i] = teclado.nextFloat();
			}
		
		for( int i = 0 ; i < 12 ; i++ ){
			System.out.printf( "%2der mes: ", (i+1) );
			for( int j = 0 ; j < Math.ceil( temperatura[i]/2 ) ; j++ )
				System.out.print( "*" );
			System.out.println( " " + temperatura[i] );
			}
		}
	} // Fin del programa
