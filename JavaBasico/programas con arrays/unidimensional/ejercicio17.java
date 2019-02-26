/**
 * ejercicio17.java
 * Programa que muestra por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100.
 * A continuación, se pide un número al usuario.
 * Se comprueba que el número introducido por teclado se encuentra dentro del array,
 * en caso contrario se muestra un mensaje por pantalla y se volverá a pedir un número;
 * así hasta que el usuario introduzca uno correctamente.
 * A continuación, el programa rota el array hacia la derecha las veces que haga falta
 * hasta que el número introducido quede situado en la posición 0 del array.
 * Por último, se muestra el array rotado por pantalla.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio17{

	public static void main ( String[] args ){
	
		Scanner teclado = new Scanner( System.in );
		int[] aleatorios = new int[10];
		int numero , indice = 0 , aux;
		boolean pertenece = false;

		// Se inicializa el array con numeros aleatorios entre 0 y 100		
		for( int i = 0 ; i < 10 ; i++ )
			aleatorios[i] = (int) ( Math.random() * 100 );

		// Se muestra por pantalla el array
		for( int i = 0 ; i < 10 ; i++ )
			System.out.print( " " + aleatorios[i] );
		System.out.printf( "\n" );

		// Se pide por teclado un numero a buscar en el array con validacion
		do{
			System.out.print( "Introduzca un numero: " );
			numero = teclado.nextInt();

			for( int i = 0 ; i < 10 ; i++ )
				if( numero == aleatorios[i] ){
					pertenece = true;
					indice = i;
					break;
					}

			if( !pertenece )
				System.out.println( "ERROR: el numero no pertenece al array" );
				
			}while( !pertenece );

		// Se ordena el array rotando hasta el principio el elemento introducido por teclado
		for( int i = indice ; i > 0 ; i-- ){
			aux = aleatorios[i];
			aleatorios[i] = aleatorios[i-1];
			aleatorios[i-1] = aux;
			}

		// Se muestra por pantalla el array ordenado
		for( int i = 0 ; i < 10 ; i++ )
			System.out.print( " " + aleatorios[i] );
		System.out.printf( "\n" );
		}
	} // Fin del programa
