package exJunio2019AlvaroGarciaFuentes;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ficheros{
		
	/**
	 * metodo para leer un archivo
	 * @param nombre
	 * @return
	 * @throws Exception
	 */
	public static ArrayList<String> leer( String nombre ) throws Exception {
		
        ArrayList<String> salida = new ArrayList<String>();
        String linea;

        File archivo = new File ( nombre );
        FileReader fr = new FileReader ( archivo );
        BufferedReader br = new BufferedReader( fr );
            
        while(  ( linea = br.readLine() ) != null  ) {
        	salida.add( linea );
        }
        
        fr.close();

        return salida;
	}
	
	/**
	 * metodo para escribir en un archivo
	 * @param nombre
	 * @param lineas
	 * @throws Exception
	 */
    public static void escribir( String nombre, ArrayList<String> lineas ) throws Exception {
        
        FileWriter archivo = new FileWriter( nombre );
        PrintWriter pw = new PrintWriter( archivo );
        
        while( ! lineas.isEmpty() ) {
            pw.println( lineas.get(0) );
            lineas.remove(0);
        }
        
        archivo.close();
    }

    /**
     * funcion que elimina comentarios de codigo
     * @param entrada
     * @return
     */
    public static ArrayList<String> eliminarComentarios( ArrayList<String> entrada ){
    	
        ArrayList<String> salida = new ArrayList<String>();
        boolean leer = true;
    	
        for( String i : entrada ) {
                	
            if(  leer && i.contains( "/*" )  ) {
                leer = false;
            }
        	
            if(  leer && !i.contains( "//" )  ) {
                salida.add(  i  );
            }       	
        	
            if(  !leer && i.contains( "*/" )  ) {
                leer = true;
            }
        }
        
        return salida;
    }
} // fin de la clase Ficheros
