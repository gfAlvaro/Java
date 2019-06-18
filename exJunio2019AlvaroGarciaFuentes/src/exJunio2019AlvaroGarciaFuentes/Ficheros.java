/**
 * Ficheros.java
 * Clase con el método para eliminar comentarios de un fichero
 * @author Alvaro Garcia Fuentes
 */
package exJunio2019AlvaroGarciaFuentes;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ficheros{

    /**
     * funcion que elimina comentarios de codigo
     * @param entrada
     * @return
     */
    public static void eliminarComentarios( String entrada, String salida ) throws Exception {

    	String i = "";
    	File archivo = new File(entrada);
    	FileReader fr = new FileReader(archivo);
    	BufferedReader br = new BufferedReader(fr);
    	
    	FileWriter fw = new FileWriter(salida);
    	PrintWriter pw  = new PrintWriter(fw);
    	
        boolean leer = true;
    	
        while(  ( i = br.readLine() ) != null  ) {
                	
            if(  leer && i.contains( "/*" )  ) {
                leer = false;
            }
        	
            if(  leer && !i.contains( "//" )  ) {
                pw.println(  i  );
            }       	
        	
            if(  !leer && i.contains( "*/" )  ) {
                leer = true;
            }
        }
        
        fr.close();
        pw.close();
    }
} // fin de la clase Ficheros
