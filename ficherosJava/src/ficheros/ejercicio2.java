/**
* ejercicio2.java
* Programa que lee el fichero creado en el ejercicio anterior y
* muestra los números por pantalla.
* @author Alvaro Garcia Fuentes
*/
package ficheros;

import java.util.ArrayList;
import java.io.*;

public class ejercicio2{
	
	public static void main( String[] args ){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String linea;
		File fichero = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero
			fichero = new File( "primos.dat" );
			fr = new FileReader( fichero );
			br = new BufferedReader( fr );

			// Lectura del fichero
			while(  ( linea = br.readLine() ) != null  )
				lista.add(  Integer.parseInt( linea )  );
		}catch( Exception e ){
			System.out.println( "ERROR: no se pudo abrir el fichero." );
		}
	
		try{
			// Cierre del fichero
			if( null != fr )
				fr.close();     			
		}catch( Exception e2 ){ 
			System.out.println( "ERROR: no se pudo cerrar el fichero." );
			}
		
		for( int i: lista )
			System.out.print( i + " " );
		}
	
	} // Fin del programa
