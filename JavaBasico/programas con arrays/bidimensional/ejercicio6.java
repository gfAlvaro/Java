/**
 * ejercicio6.java
 * Modificacion del programa del ejercicio 5
 * de tal forma que no se repita ningún número en el array.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio6{

	public static void main( String[] args ){

		int[][] tabla = new int[6][10];
		int[] minimo = new int[2];
		int[] maximo = new int[2];
		int aleatorio;
		boolean repetido;

		// Se inicializa el array con numeros aleatorios entre 0 y 1000
		// Despues de sacar un nuevo numero se lee la tabla para comprobar que no este repetido
		// y si lo esta se vuelve a sacar un numero aleatorio para la posicion actual de la tabla
		for( int i = 0 ; i < tabla.length ; i++ )
			for( int j = 0 ; j < tabla[i].length ; j++ )
				do{
					repetido = false;
					aleatorio = (int) ( Math.random() * 1000 );
					for( int k = 0 ; k < i ; k++ )
						for( int l = 0 ; l < j ; l++ )
							if( tabla[k][l] == aleatorio )
								repetido = true;
					if( ! repetido ){
						tabla[i][j] = aleatorio;
						break;
						}
					}while( true );

		// Se muestra la tabla por pantalla
		for( int i = 0 ; i < tabla.length ; i++ ){
			for( int j = 0 ; j < tabla[i].length ; j++ )
				System.out.printf( " %4d", tabla[i][j] );
			System.out.printf( "\n" );
			}
				
		// Se buscan en la tabla los elementos maximos y minimos
		for( int i = 0 ; i < tabla.length ; i++ )
			for( int j = 0 ; j < tabla[i].length ; j++ )
				if( tabla[i][j] < tabla[ minimo[0] ][ minimo[1] ] ){
					minimo[0] = i;
					minimo[1] = j;
					}
				else if( tabla[i][j] > tabla[ maximo[0] ][ maximo[1] ] ){
					maximo[0] = i;
					maximo[1] = j;
					}

		// Se muestran los elementos maximo y minimo de la tabla
		System.out.println( "Minimo en " + tabla[ minimo[0] ][ minimo[1] ] );
		System.out.println( "Maximo en " + tabla[ maximo[0] ][ maximo[1] ] );		
		}
	} // Fin del programa
