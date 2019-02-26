/**
 * ejercicio1.java
 * Programa que define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra en el ejercicio1 de arrays del libro de Java.
 * Muestra el contenido de todos los elementos del array.
 * Los elementos no inicializados tienen por defecto el valor 0.
 * @author Alvaro Garcia Fuentes
 */
 package basico;

public class ejercicio1 {
	
	public static void main( String[] args ){

		int[] num;
		num = new int[12];

		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for( int i = 0 ; i < 12 ; i++ )
			System.out.print( " " + num[i] );
		}
	} // Fin del programa
