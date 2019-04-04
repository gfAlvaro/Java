/**
* ejercicio1.java
* Programa que guarda en un fichero con nombre primos.dat los
* números primos que hay entre 1 y 500.
* @author Alvaro Garcia Fuentes
*/
package ficheros;

import java.util.ArrayList;
import java.io.*;

public class ejercicio1{
	
	/**
	 * Funcion para determinar si un número es primo
	 * @param i
	 * @return boolean
	 */
	public static boolean esPrimo( int i ){
				
		for( int k = 3 ; k <= i/2 ; k++ )
			if( i % k == 0 ){
				return false;
				}
			
		return true;
		}
	
	public static void main( String[] args ){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		for( int i = 1 ; i <= 500 ; i++ )			
			if(  esPrimo(i)  )
				lista.add(i);
		
		try{
			fichero = new FileWriter( "primos.dat" );
			pw = new PrintWriter( fichero );

			for( int i: lista )
				pw.println( i );
			
			System.out.println( "Fichero creado con éxito." );
		}catch( Exception e ){
			System.out.println( "ERROR: no se pudo crear el fichero." );
			}
			
		try{
			if( null != fichero )
				fichero.close();
		}catch( Exception e2 ){
			System.out.println( "ERROR: no se pudo cerrar el fichero." );
			}
		}
	
	} // Fin del programa
