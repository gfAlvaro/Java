/**
 * ejercicio13.java
 * Programa que rellena un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa muestra el array y pregunta si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se vuelve a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio13{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		int[] numeros = new int[100];
		int entrada , indice = 0;
		
		// Se inicializa el array con numeros aleatorios entre 0 y 500
		for( int i = 0 ; i < 100 ; i++ )
			numeros[i] = (int) ( Math.random() * 500 );

		// Se muestra el array por pantalla
		for( int i = 0 ; i < 100 ; i++ )
			System.out.print( " " + numeros[i] );
		System.out.printf( "\n" );

		// Se pide seleccionar el elemento a destacar, minimo o maximo
		do{
			System.out.print( "Que quiere destacar? (1 - minimo, 2 - maximo): " );
			entrada = teclado.nextInt();
			}while(  ( entrada != 1 ) && ( entrada != 2 )  );

		// Se busca el elemento pedido, minimo o maximo
		for( int i = 0 ; i < 100 ; i++ ){
			if( entrada == 1 )
				if( numeros[i] < numeros[indice] )
					indice = i;
			if( entrada == 2 )
				if( numeros[i] > numeros[indice] )
					indice = i;
			}

		// Se muestra el array por pantalla, señalando el elemento pedido
		for( int i = 0 ; i < 100 ; i++ )
			if( i == indice )
				System.out.print( " **" + numeros[i] + "**" );
			else
				System.out.print( " " + numeros[i] );
		System.out.printf( "\n" );
		}
	} // Fin del programa
