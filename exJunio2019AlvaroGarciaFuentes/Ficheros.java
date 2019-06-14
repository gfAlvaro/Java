package exJunio2019AlvaroGarciaFuentes;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ficheros{
		
	
	public static ArrayList<String> leer( String nombre ) throws Exception {
		
        File archivo1;
        FileReader fr1;
        BufferedReader br1;
        ArrayList<String> salida = new ArrayList<String>();
        String linea;

        archivo1 = new File ( nombre );
        fr1 = new FileReader ( archivo1 );
        br1 = new BufferedReader( fr1 );
            
        while(  ( linea = br1.readLine() ) != null  ) {
        	salida.add( linea );
        }
        
        fr1.close();

		return salida;
	}
	
    public static void escribir( String nombre, ArrayList<String> lineas ) throws Exception {
    
        FileWriter fichero;
        PrintWriter pw; 
    
        fichero = new FileWriter( nombre );
        pw = new PrintWriter( fichero );
        
        while( ! lineas.isEmpty() ) {
            pw.println( lineas.get(0) );
            lineas.remove(0);
        }
        
        fichero.close();
    }

    public static ArrayList<String> eliminarComentarios( ArrayList<String> entrada ){
    	
        ArrayList<String> salida = new ArrayList<String>();
    	
        for( String i : entrada ) {
        	
        	boolean leer = true;
        	
        	if( leer && i.matches("*/**") ) {
                salida.add( i.substring( 0 , i.indexOf( "/*" ) )  );
        		leer=false;
        	}
        	else if( !leer && i.matches("**/*")) {
        		leer=true;
                salida.add( i.substring( i.indexOf("*/") , i.length() - 1 )  );
        	}
        	else
            if( leer && i.matches("*//*") ) {
                salida.add( i.substring( 0 , i.indexOf( "//" ) )  );
            }
        }
    	
        return salida;
    }
} // fin de la clase Ficheros
