/**
 * ejercicio2.java
 * Programa que pide 20 números enteros. Estos números se
 * introducen en un array de 4 filas por 5 columnas. El programa muestra las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total aparece en la esquina inferior derecha.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio2{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		int[][] numeros = new int[4][5];
		int suma = 0;
		int sumaFila[] = new int[4];
		int sumaColumna[] = new int[5];

		// Se piden los numeros del array por teclado
		for( int i = 0 ; i < numeros.length ; i++ )
			for( int j = 0 ; j < numeros[i].length ; j++ ){
				System.out.printf(  "Introduzca el %2der numero: ", j+1 + 5*i  );
				numeros[i][j] = teclado.nextInt();
				}

		// Se muestra el array con las sumas parciales y la total
		for( int i = 0 ; i < numeros.length ; i++ ){
			for( int j = 0 ; j < numeros[i].length ; j++ ){
				System.out.printf( " %2d", numeros[i][j] );
				sumaFila[i] = sumaFila[i] + numeros[i][j];
				sumaColumna[j] = sumaColumna[j] + numeros[i][j];
				}
			System.out.println( " " + sumaFila[i] );
			suma = suma + sumaFila[i];
			}
		for( int i = 0 ; i < sumaColumna.length ; i++ )
			System.out.print( " " + sumaColumna[i] );
		System.out.println( " " + suma );
		}
	} // Fin del programa
