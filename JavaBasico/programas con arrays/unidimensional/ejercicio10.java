/**
 * ejercicio10.java
 * Programa que genera 20 números enteros aleatorios entre 0 y 100
 * y los almacena en un array. El programa pasa todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio10{
	
	public static void main( String[] args ){
		
		int aux;
		int[][] aleatorios;
		aleatorios = new int[2][20];

		// Se inicializa el array con numeros aleatorios entre 0 y 100
		for( int i = 0 ; i < 20 ; i++ ){
			aleatorios[0][i] = i;
			aleatorios[1][i] = (int) ( Math.random() * 100 );
			}

		// Se muestra el array por pantalla
		System.out.println( "Array sin ordenar" );
		System.out.println( "Array ordenado" );
		for( int i = 0 ; i < 2 ; i++ ){			
			if( i == 0 )
				System.out.print( "posicion" );
			else if( i == 1 )
				System.out.print( "numero  " );

			for( int j = 0 ; j < 19 ; j++ )
				System.out.printf( " %2d" , aleatorios[i][j] );
			System.out.printf( " %2d\n" , aleatorios[i][19] );
			}

		// Se ordena el array mediante el Algoritmo de la Burbuja
		for( int i = 1 ; i < 20 ; i++ )
			for( int j = 1 ; j < 20 ; j++ )
				if(  ( ( aleatorios[1][j] % 2 ) == 0 ) && ( ( aleatorios[1][j-1] % 2 ) != 0 )  ){
					aux = aleatorios[1][j];
					aleatorios[1][j] = aleatorios[1][j-1];
					aleatorios[1][j-1] = aux;
					}

		// Se muestra el array ordenado por pantalla
		System.out.println( "Array ordenado" );
		for( int i = 0 ; i < 2 ; i++ ){			
			if( i == 0 )
				System.out.print( "posicion" );
			else if( i == 1 )
				System.out.print( "numero  " );

			for( int j = 0 ; j < 19 ; j++ )
				System.out.printf( " %2d" , aleatorios[i][j] );
			System.out.printf( " %2d\n" , aleatorios[i][19] );
			}
		}
	} // Fin del programa
