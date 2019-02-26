/**
 * ejercicio7.java
 * Programa que genera 100 números aleatorios del 0 al 20 y los
 * muestra por pantalla separados por espacios. El programa pide entonces
 * por teclado dos valores y a continuación cambia todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado aparecen entrecomillados.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio7{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		int[] aleatorios = new int[100];
		int valor1 , valor2;
		int[] indicesCambiados = new int[100];
		boolean cambiado = false;

		// Se inicializa el array con numeros aleatorios
		for( int i = 0 ; i < 100  ; i++ )
			aleatorios[i] = (int) ( Math.random() * 20 );

		// Se muestra el array por pantalla
		for( int i = 0 ; i < 100  ; i++ )
			System.out.print( " " + aleatorios[i] );
		System.out. printf( "\n" );

		// Se piden dos numeros por pantalla
		System.out.print( "Introduzca el valor a reemplazar: " );
		valor1 = teclado.nextInt();
		System.out.print( "Introduzca el valor de reemplazo: " );
		valor2 = teclado.nextInt();

		// Se reemplazan los elementos del array
		// y se guardan los indices de los elementos que se cambian
		for( int i = 0 , j = 0 ; i < 100 ; i++ )
			if( aleatorios[i] == valor1 ){
				aleatorios[i] = valor2;
				indicesCambiados[j] = i;
				j++;
				}

		// Se muestra el nuevo array entrecomillando los elementos cambiados
		for( int i = 0 ; i < 100 ; i++ ){
			cambiado = false;
			for( int j = 0 ; j < indicesCambiados.length ; j++ )
				if( i == indicesCambiados[j] ){
					cambiado = true;
					System.out.print( " \"" + aleatorios[i] + "\"" );
					break;
					}
			if( !cambiado )
				System.out.print( " " + aleatorios[i] );
			}
		System.out.printf( "\n" );
		}
	} // Fin del programa
