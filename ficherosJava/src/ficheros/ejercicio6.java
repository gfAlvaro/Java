/**
* ejercicio6.java
* Programa que dice cuántas ocurrencias de una palabra hay en un
* fichero. Tanto el nombre del fichero como la palabra se deben pasar como
* argumentos en la línea de comandos.
* @author Alvaro Garcia Fuentes
*/
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ejercicio6{
	
	public static void main( String[] args ){
		
		int ocurrencias = 0;
		String palabra;
		File fichero = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero
			fichero = new File( args[0] );
			fr = new FileReader( fichero );
			br = new BufferedReader( fr );

			// Lectura del fichero
			// y comparación de palabras
			while(  ( palabra = br.readLine() ) != null  )
				if(  palabra.equals( args[1] )  )
					ocurrencias += 1;
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
		
		if( ocurrencias > 0 )
			System.out.print( "La palabra " + args[1] + " tiene " + ocurrencias +" ocurrencias." );
		else
			System.out.print( "La palabra " + args[1] + " no tiene ninguna ocurrencia." );
		}

	} // Fin del programa
