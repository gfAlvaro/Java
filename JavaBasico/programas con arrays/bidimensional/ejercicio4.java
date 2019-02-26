/**
 * ejercicio4.java
 * Modificacion del programa anterior de forma que las sumas parciales y la suma
 * total aparecen en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda pensando antes de mostrar los números.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio4{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );
		int[][] numeros = new int[4][5];
		int suma = 0;
		int sumaFila[] = new int[4];
		int sumaColumna[] = new int[5];

		// Se piden los numeros del array por teclado
		for( int i = 0 ; i < numeros.length ; i++ )
			for( int j = 0 ; j < numeros[i].length ; j++ ){
				System.out.printf( "Introduzca el %2der numero: " , j+1 + 5*i );
				numeros[i][j] = teclado.nextInt();
				}

		// Se muestra el array con las sumas parciales y la total
		for( int i = 0 ; i < numeros.length ; i++ ){
			for( int j = 0 ; j < numeros[i].length ; j++ ){
				System.out.printf( " %2d", numeros[i][j] );
				sumaFila[i] = sumaFila[i] + numeros[i][j];
				sumaColumna[j] = sumaColumna[j] + numeros[i][j];
				}			
			try{
				Thread.sleep(500);
				}catch ( Exception ignored ){}
			System.out.println( " " + sumaFila[i] );
			suma = suma + sumaFila[i];
			}
		for( int i = 0 ; i < sumaColumna.length ; i++ ){
			try{
				Thread.sleep(500);
				}catch ( Exception ignored ){}
			System.out.print( " " + sumaColumna[i] );
			}
		try{
			Thread.sleep(500);
			}catch ( Exception ignored ){}
		System.out.println( " " + suma );
		}
	} // Fin del programa
