/**
 * Ocurrencias.java 
 * Clase con métodos para manejar ficheros
 * y sustituir caracteres.
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ocurrencias{

    private static final char[][] CADENAS = {{'A','B','E','I','O','S','T'},{'4','8','3','1','0','5','7'}};

    /**
     * convierte un caracter en otro según el array de caracteres de la clase
     * @param c
     * @return
     */
    private static char convertir( char c ) {

        char salida = c;

        for( int i = 0 ; i < 7 ; i++ ){
            if( Character.toUpperCase( c ) == CADENAS[0][i] ) {
                salida = CADENAS[1][i];
                i = 7; // termina el bucle
            }
        }

        return salida;
    }
	
    /**
     * funcion auxiliar para sustituir caracteres de una cadena
     * @param cadena
     * @return
     */
    private static String cambio( String cadena ) {
		
        String salida = "";
    	
        for( char i : cadena.toCharArray() ){
            salida += convertir(i);
        }
    		
        return salida;
    }
    
    /**
     * función para sustituir caracteres de un ArrayList de cadenas pasado como parámetro
     * @param entrada
     * @return
     * @throws Exception
     */
    public static ArrayList<String> sustituir( ArrayList<String> entrada ) throws Exception {

        ArrayList<String> salida = new ArrayList<String>();

        for( String i : entrada  ) {
            salida.add( cambio(i) );
        }

        return salida;
    }

    /**
     * escribe datos en un archivo
     * @param ficheroSalida
     * @param lineas
     * @throws IOException
     */
	public static void escribirArchivo( String ficheroSalida , ArrayList<String> lineas ) throws IOException {

		FileWriter fichero = new FileWriter( ficheroSalida );
        PrintWriter pw = new PrintWriter( fichero );

        while( ! lineas.isEmpty() ) {
            pw.println( lineas.get(0) );
            lineas.remove(0);
        }

        fichero.close();
    }

	/**
	 * lee los datos de un archivo
	 * @param entrada
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
    public static ArrayList<String> leerArchivo( String entrada ) throws FileNotFoundException, IOException {

        ArrayList<String> resultado = new ArrayList<String>();
        String linea;
        File f = new File( entrada );
        FileReader fr = new FileReader( f );
        BufferedReader br = new BufferedReader( fr );

        while(  ( linea = br.readLine() ) != null  ) {
            resultado.add( linea );
        }

        fr.close();

        return resultado;
	}

} // Fin del programa
