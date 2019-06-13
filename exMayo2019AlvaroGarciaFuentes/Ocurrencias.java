/**
 * mezclarFicheros.java 
 * Clase con el método para mezclar el texto de dos ficheros en uno solo.
 * Nota: el método main y el paquete java.util.Scanner no son necesarios
 * si se usa la interfaz gráfica.
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.util.Scanner;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ocurrencias{
	
	private static final char[][] CADENAS = {{'A','B','E','I','O','S','T'},{'4','8','3','1','0','5','7'}};
	
    private static char convertir( char c ) {
    
        char salida = c;
        
        for( int i = 0 ; i < 7 ; i++ ){
            if( Character.toUpperCase( c ) == CADENAS[0][i] ) {
            	salida = CADENAS[1][i];
            	i = 7;
            }
        }
        
        return salida;
    }
	
    private static String cambio( String cadena ) {
		
        String salida = "";
    	
        for( char i : cadena.toCharArray() ){
            salida += convertir(i);
        }
    		
        return salida;
    }

    public static String sustituir( String fichero1 ){

        File archivo1;
        FileReader fr1;
        BufferedReader br1;
        String linea;
        ArrayList<String> lineas = new ArrayList<String>();
        String ficheroSalida = "salida.txt";

        FileWriter fichero = null;
        PrintWriter pw = null;

        try{
        // Abrimos, leemos y cerramos el primer fichero
            archivo1 = new File ( fichero1 );
            fr1 = new FileReader ( archivo1 );
            br1 = new BufferedReader( fr1 );

            while(  ( linea = br1.readLine() ) != null  )
                lineas.add( cambio(linea) );

            try{
                fr1.close();
            }catch( Exception i ){
                System.exit(2);
            }

            // Abrimos, escribimos Y cerramos en el fichero de salida
            fichero = new FileWriter( ficheroSalida );
            pw = new PrintWriter( fichero );
			
            while( ! lineas.isEmpty() ) {
                pw.println( lineas.get(0) );
                lineas.remove(0);
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
        String fichero;
        String ficheroSalida;
        String linea;
        File archivo;
        FileReader fr;
        BufferedReader br;

        System.out.print( "Nombre del fichero: " );
        fichero = teclado.nextLine();
        teclado.close();

        ficheroSalida = sustituir( fichero );

        try{
            // Abrimos el archivo, lo leemos y lo cerramos
            archivo = new File ( ficheroSalida );
            fr = new FileReader ( archivo );
            br = new BufferedReader( fr );

            while(  ( linea = br.readLine() ) != null  ) {
                System.out.println( linea );
            }
            
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
