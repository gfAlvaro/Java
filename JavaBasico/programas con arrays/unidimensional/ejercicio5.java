/**
 * ejercicio5.java
 * Programa que pide 10 números por teclado
 * y luego muestra los números introducidos
 * junto con las palabras maximo y minimo al lado
 * del máximo y del mínimo respectivamente.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio5{

	public static void main( String[] args ){

		int[] numeros = new int[10];
		int maximo = 0 , minimo = 0;
		Scanner teclado = new Scanner( System.in );

		// Se piden numeros por pantalla
		for( int i = 0 ; i < 10 ; i++ ){
			System.out.print( "Introduzca el " + (i+1) + "er numero: " );
			numeros[i] = teclado.nextInt();
			}

		// Se buscan los elementos maximo y minimo
		for( int i = 0 ; i < 10 ; i++ ){
			if( numeros[i] > numeros[maximo] )
				maximo = i;
			if( numeros[i] < numeros[minimo] )
				minimo = i;
			}

		// Se muestra el array por pantalla señalando el maximo y el minimo
		for( int i = 0 ; i < 10 ; i++ )
			if( numeros[i] == numeros[maximo] )
				System.out.print( " maximo:" + numeros[i] );
			else if( numeros[i] == numeros[minimo] )
				System.out.print( " minimo:" + numeros[i] );
			else
				System.out.print( " " + numeros[i] );
		System.out.printf( "\n" );
		}
	} // Fin del programa
