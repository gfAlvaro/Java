/**
 * Dni.java
 * Definición del método para comprobar la validez de un dni.
 * @author Alvaro Garcia Fuentes
 */
package dni;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dni{
	
	private static final String CADENADNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	/**
	 * comprobamos si el dni es valido
	 * mediante expresión regular
	 * y calculando la relacion entre el número y la letra
	 * @param entrada
	 * @return boolean
	 */
	public static boolean esValido( String entrada ){
				
	    Pattern pat = Pattern.compile( "^[0-9]{8}[A-Z,a-z]$" );
	    Matcher mat = pat.matcher( entrada );
		
	    if( mat.matches() ){
	    	int dni = Integer.parseInt(  entrada.substring( 0 , 8 )  );
	    	return(  Character.toUpperCase( entrada.charAt(8) ) == CADENADNI.charAt( dni % 23 )  );	    		
	    	}
	    else
	    	return false;
		}
	
	} // Fin de la clase Dni
