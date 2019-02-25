/**
* capicua.java
* Muestra los números capicúa que hay entre 1 y 99999.
* Se hace uso de la biblioteca matemática creada
* @author Alvaro Garcia Fuentes
*/

package funciones;
import bibliotecaMatematica.Matematica;

public class capicua{
	
	public static void main( String[] args ) {
		
		for( int i = 1 ; i <= 99999 ; i++ )
			if( Matematica.esCapicua(i) )
				System.out.print(i + " ");
		System.out.println();
		}
	} // Fin del programa
