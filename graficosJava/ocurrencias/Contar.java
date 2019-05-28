/**
 * Contar.java 
 * Clase con el método para contar ocurrencias de una palabra en un fichero.
 * Nota: el método main y el paquete java.util.Scanner no son necesarios
 * si se usa la interfaz gráfica.
 * @author Alvaro Garcia Fuentes
 */
package ocurrencias;

import java.util.Scanner;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Contar{
	
	public static int ContarOcurrencias( String fichero , String palabra ) throws Exception {
		
		int salida = 0;
		File archivo1;
		FileReader fr;
		BufferedReader br;
		String linea;
		ArrayList<String> lineas = new ArrayList<String>();

		// Abrimos, leemos y cerramos el fichero
		archivo1 = new File ( fichero );
		fr = new FileReader ( archivo1 );
		br = new BufferedReader( fr );

		while(  ( linea = br.readLine() ) != null  ){
			lineas.add( linea ); }
		
		fr.close();
		
		// Contamos las palabras dentro de las líneas
		for( String i : lineas ){
			if(  i.contains( palabra )  ){
				salida += 1; }}
		
		return salida;
		}
	
	public static void main( String[] args ){
		
		Scanner teclado = new Scanner( System.in );
		String fichero;
		String palabra;
		int ocurrencias;
		
		System.out.print( "Nombre del fichero: " );
		fichero = teclado.nextLine();
		System.out.print( "palabra a buscar: " );
		palabra = teclado.nextLine();
		teclado.close();
		
		try{
			ocurrencias = ContarOcurrencias( fichero, palabra );
			System.out.println( "Hay " + ocurrencias + " ocurrencias." );
		}catch(Exception e ){
			System.out.println( e.getMessage() );
			}
		}

	} // Fin del programa
