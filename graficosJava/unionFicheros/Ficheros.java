/**
 * mezclarFicheros.java 
 * Clase con el método para mezclar el texto de dos ficheros en uno solo.
 * Nota: el método main y el paquete java.util.Scanner no son necesarios
 * si se usa la interfaz gráfica.
 * @author Alvaro Garcia Fuentes
 */
package unionFicheros;

import java.util.Scanner;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ficheros{
	
	public static String mezcla( String fichero1 , String fichero2 ){
		
		File archivo1;
		FileReader fr1;
		BufferedReader br1;
		File archivo2;
		FileReader fr2;
		BufferedReader br2;
		String linea;
		ArrayList<String> lineas1 = new ArrayList<String>();
		ArrayList<String> lineas2 = new ArrayList<String>();
		String ficheroSalida = "salida.txt";
		
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try{
			// Abrimos, leemos y cerramos el primer fichero
			archivo1 = new File ( fichero1 );
			fr1 = new FileReader ( archivo1 );
			br1 = new BufferedReader( fr1 );
						
			while(  ( linea = br1.readLine() ) != null  )
				lineas1.add( linea );
			
			try{
				fr1.close();
			}catch( Exception i ){
				System.exit(2);
				}
			
			// Abrimos, leemos y cerramos el segundo fichero
			archivo2 = new File ( fichero2 );
			fr2 = new FileReader ( archivo2 );
			br2 = new BufferedReader( fr2 );
			
			while(  ( linea = br2.readLine() ) != null  )
				lineas2.add( linea );

			try{
				fr2.close();
			}catch( Exception i ){
				System.exit(2);
				}
			
			// Abrimos, escribimos Y cerramos en el fichero de salida
			fichero = new FileWriter( ficheroSalida );
			pw = new PrintWriter( fichero );
			
			for( int i = 1 ; ! ( lineas1.isEmpty() && lineas2.isEmpty() )  ; i++ )
				if(  ( ! lineas1.isEmpty() ) && ( i % 2 != 0 )  ){
					pw.println( lineas1.get(0) );
					lineas1.remove(0);
					}
				else if( ! lineas2.isEmpty() ){
					pw.println( lineas2.get(0) );
					lineas2.remove(0);
					}

			try{
				fichero.close();
			}catch( Exception i ){
				System.exit(2);
				}

		}catch( Exception e ){
			System.exit(1);
			}
		
		return ficheroSalida;
		}
	
	public static void main( String[] args ){
		
		Scanner teclado = new Scanner( System.in );
		String fichero1;
		String fichero2;
		String ficheroSalida;
		String linea;
		File archivo;
		FileReader fr;
		BufferedReader br;
		//ArrayList<String> salida = new ArrayList<String>();
		
		System.out.print( "Nombre del primer fichero: " );
		fichero1 = teclado.nextLine();
		System.out.print( "Nombre del segundo fichero: " );
		fichero2 = teclado.nextLine();
		teclado.close();
		
		ficheroSalida = mezcla( fichero1, fichero2 );

		try{
			// Abrimos el archivo, lo leemos y lo cerramos
			archivo = new File ( ficheroSalida );
			fr = new FileReader ( archivo );
			br = new BufferedReader( fr );

			while(  ( linea = br.readLine() ) != null  )
				System.out.println( linea );

			try {
				fr.close();
			}catch( Exception i ){
				System.out.println( "ERROR: no se pudo cerrar el archivo." );
				System.exit(2);
				}
			
		}catch( Exception e ){
			System.out.println( "ERROR: no se pudo abrir el archivo." );
			System.exit(1);
			}
		
		}

	} // Fin del programa
