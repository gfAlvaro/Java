/**
 * ejercicio11.java
 * Programa que muestra por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa muestra los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio11{

	public static void main( String[] args ){

		int[][] tabla = new int[10][10];
		int[] diagonal = new int[10];
		int maximo;
		int minimo;
		int media = 0;

		// Se inicializa la tabla con numeros aleatorios entre 200 y 300
		for( int i = 0 ; i < tabla.length ; i++ )
			for( int j = 0 ; j < tabla[i].length ; j++ )
				tabla[i][j] = (int) ( 200 + Math.random() * 100 );

		// Se lee la tabla y se recogen los datos de la diagonal
		maximo = tabla[0][0];
		minimo = tabla[0][0];
		for( int i = 0 ; i < tabla.length ; i++ ){
			for( int j = 0 ; j < tabla[i].length ; j++ ){
				if( i == j ){
					diagonal[i] = tabla[i][j];
					media = media + tabla[i][j];
					if( tabla[i][j] < minimo )
						minimo = tabla[i][j];
					if( tabla[i][j] > maximo )
						maximo = tabla[i][j];	
					}
				System.out.print( " " + tabla[i][j] );
				}
			System.out.printf( "\n" );
			}

		// Se muestran los resultados por pantalla
		System.out.print( "Numeros de la diagonal: " );
		for( int i = 0 ; i < diagonal.length ; i++ )
			System.out.print( " " + diagonal[i] );
		System.out.printf( "\n" );
		System.out.println( "Maximo: " + maximo );
		System.out.println( "Minimo: " + minimo );
		System.out.println( "Media: " + media );
		}
	} // Fin del programa
