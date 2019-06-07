/**
 * stockNegativoException.java
 * excepcion personalizada para indicar un error
 * cuando el stock sea negativo
 * @author Alvaro Garcia Fuentes
 */
package excepciones;

public class StockNegativoException extends Exception {

	private static final long  serialVersionUID = 1L;
	
	public StockNegativoException( String mensaje ) {
	    super( mensaje );
	}
	
} // Fin de la excepcion