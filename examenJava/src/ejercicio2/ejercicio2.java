package ejercicio2;
/**
 * Ejercicio 2
 * programa para imprimir quiniela de jornada de futbol
 * @author Alvaro Garcia Fuentes
 */

import java.util.Scanner;

public class ejercicio2{
	
	/**
	 * funcion que muestra los resultados de la jornada
	 * @param equipos
	 * @param resultados
	 */
	public static void mostrarJornada( String[][] equipos, int[][] resultados ){
		
		char resultado;
		
		for( int i = 0 ; i < 3 ; i++ ){
			
			if( resultados[i][0] > resultados[i][1] )
				resultado = '1';
			else if( resultados[i][0] < resultados[i][1] )
				resultado = '2';
			else
				resultado = 'x';

			System.out.println( equipos[i][0] + "-" + equipos[i][1]+ ": " + resultado);
			}
		}
	
	/**
	 * funcion principal del programa de la quiniela
	 * @param args
	 */
	public static void main( String[] args ) {

		int nPartidos = 3;
		
		String[][] equipos = new String[nPartidos][2];
		int[][] resultados = new int[nPartidos][2];
	
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );
		
		for( int i = 0 ; i < nPartidos ; i++ ){

				System.out.print( "Equipo local: " );
				equipos[i][0] = teclado.nextLine();				
				System.out.print( "Equipo visitante: " );
				equipos[i][1] = teclado.nextLine();
				
				System.out.print( "puntuacion local: " );
				resultados[i][0] = teclado.nextInt();
				System.out.print( "puntuacion visitante: " );
				resultados[i][1] = teclado.nextInt();
				teclado.nextLine();
				}
		
		mostrarJornada( equipos, resultados );
		}
	}

