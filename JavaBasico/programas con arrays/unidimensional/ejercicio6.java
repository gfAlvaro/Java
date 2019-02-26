/**
 * ejercicio6.java
 * Programa que lee 15 números por teclado y los almacena en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * pasa a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición pasa a la posición 0. Finalmente, muestra el contenido
 * del array.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio6{
	
	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		float[] numeros = new float[15];
		float aux;

		// Se piden por pantalla cada uno de los numeros del array
		for( int i = 0 ; i < 15 ; i++ ){
			System.out.print( "Introduzca el " + (i+1) + " numero: " );
			numeros[i] = teclado.nextFloat();
			}

		// Se rotan los elementos del array una posicion a la derecha
		aux = numeros[14];
		for( int i = 14 ; i > 0 ; i-- )
			numeros[i] = numeros[i-1];
		numeros[0] = aux;

		// Se muestra por pantalla el resultado
		for( int i = 0 ; i < 14 ; i++ )
			System.out.print( " " + numeros[i] );
		System.out.println( " " + numeros[14] );
		}
	} // Fin del programa
