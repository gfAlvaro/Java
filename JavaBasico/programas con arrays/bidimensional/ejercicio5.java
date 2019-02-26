/**
 * ejercicio5.java
 * Programa que rellena un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa da la posición tanto del máximo como del mínimo.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio5{

	public static void main( String[] args ){

		int[][] tabla = new int[6][10];
		int[] minimo = new int[2];
		int[] maximo = new int[2];

		// Se inicializa el array con numeros aleatorios entre 0 y 1000
		for( int i = 0 ; i < tabla.length ; i++ )
			for( int j = 0 ; j < tabla[i].length ; j++ )
				tabla[i][j] = (int) ( Math.random() * 1000 );

		// Se muestra la tabla por pantalla
		for( int i = 0 ; i < tabla.length ; i++ ){
			for( int j = 0 ; j < tabla[i].length ; j++ )
				System.out.printf( " %4d" , tabla[i][j] );
			System.out.printf( "\n" );
			}
				
		// Se buscan en la tabla los elementos maximos y minimos
		for( int i = 0 ; i < tabla.length ; i++ )
			for( int j = 0 ; j < tabla[i].length ; j++ )
				if(  tabla[i][j] < tabla[ minimo[0] ][ minimo[1] ]  ){
					minimo[0] = i;
					minimo[1] = j;
					}
				else if(  tabla[i][j] > tabla[ maximo[0] ][ maximo[1] ]  ){
					maximo[0] = i;
					maximo[1] = j;
					}

		// Se muestran los elementos maximo y minimo de la tabla
		System.out.println( "Minimo en " + tabla[ minimo[0] ][ minimo[1] ] );
		System.out.println( "Maximo en " + tabla[ maximo[0] ][ maximo[1] ] );
		}
	} // Fin del programa
