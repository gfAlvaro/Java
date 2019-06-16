/**
 * definicion de la excepción personalizada CantidadNegativaException,
 * que hereda de Exception
 * @author Álvaro García Fuentes
 */
package excepciones;

public class CantidadNegativaException extends Exception {

    private static final long  serialVersionUID = 1L;

    public CantidadNegativaException( String mensaje ){
    	
        super( mensaje );
    }

} // Fin de la excepcion
