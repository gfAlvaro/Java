/**
 * Ocurrencias.java 
 * Clase con métodos para manejar ficheros
 * y sustituir caracteres.
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ocurrencias{

    private static final char[][]  CADENAS = {{'A','B','E','I','O','S','T'},{'4','8','3','1','0','5','7'}};

    /**
     * convierte un caracter en otro según el array de caracteres de la clase
     * @param c
     * @return char
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
     * metodo auxiliar para sustituir caracteres de una cadena
     * @param cadena
     * @return String
     */
    private static String cambio( String cadena ) {

        String salida = "";

        for( char i : cadena.toCharArray() ){
            salida += convertir(i);
        }

        return salida;
    }

    /**
     * metodo para sustituir caracteres de un ArrayList de cadenas pasado como parámetro
     * @param entrada
     * @throws Exception
     */
    public static void sustituir( String entrada , String salida ) throws Exception {

        File archivo = new File( entrada );
        FileReader fr = new FileReader( archivo );
        BufferedReader br = new BufferedReader( fr );

        FileWriter archivoSalida = new FileWriter( salida );
        PrintWriter pw = new PrintWriter( archivoSalida );

        String cadena = "";

        while(  ( cadena = br.readLine() ) != null  ) {
            pw.println(  cambio( cadena )  );
        }

        fr.close();
        archivoSalida.close();
    }

} // Fin del programa
