/**
* ejercicio4.java
* Programa que ordena alfabéticamente las palabras
* contenidas en un fichero de texto. El nombre del fichero que contiene las
* palabras se debe pasar como argumento en la línea de comandos. El nombre
* del fichero resultado es el mismo que el original añadiendo la coletilla
* sort , por ejemplo palabras_sort.txt . Cada palabra ocupa una línea.
* @author Alvaro Garcia Fuentes
*/
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicio4{
	
	public static void main( String[] args ){

		ArrayList<String> lista = new ArrayList<String>();
		String linea;
		File ficheroEntrada = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter ficheroSalida = null;
		PrintWriter pw = null;
		
		// Se le quita la extensión al fichero para nombrar el fichero de salida
		// nota: el argumento de split es una expresión regular
		String[] argumentos = args[0].split("\\.");
		String salida = argumentos[0];
		
		try {
			// Apertura del fichero de entrada
			ficheroEntrada = new File( args[0] );
			fr = new FileReader( ficheroEntrada );
			br = new BufferedReader( fr );

			// Lectura del fichero de entrada
			while(  ( linea = br.readLine() ) != null  )
				lista.add( linea );
		}catch( Exception e ){
			System.out.println( "ERROR: no se pudo abrir el fichero de entrada." );
			}
	
		try{
			// Cierre del fichero de entrada
			if( null != fr )
				fr.close();     			
		}catch( Exception e2 ){ 
			System.out.println( "ERROR: no se pudo cerrar el fichero de entrada." );
			}
		
		// Se ordena alfabéticamente la lista
		Collections.sort( lista );
		
		// Creación del fichero de salida con la lista ordenada
		try{			
			ficheroSalida = new FileWriter( salida + "_sort.txt" );
			pw = new PrintWriter( ficheroSalida );
			System.out.println( "Fichero de salida creado con éxito." );

			for( String i: lista )
				pw.println(i);			
		}catch( Exception e ){
			System.out.println( "ERROR: no se pudo crear el fichero de salida." );
			}
			
		try{
			// Cierre del fichero de salida
			if( null != ficheroSalida )
				ficheroSalida.close();
		}catch( Exception e2 ){
			System.out.println( "ERROR: no se pudo cerrar el fichero de salida." );
			}
		}
	
	} // Fin del programa
