/**
 *  primos.java
 *  Programa que muestra los números primos que hay entre 1 y 1000.
 *  Se hace uso de la biblioteca matemática creada.
 *  @author Álvaro García Fuentes
 */

package funciones;
import bibliotecaMatematica.Matematica;

public class primos{
	
	public static void main( String[] args ) {

		for( int i = 1 ; i <= 1000 ; i = Matematica.siguientePrimo(i) )
				System.out.print( i + " " );
		System.out.println();
		}
	} // Fin del programa
