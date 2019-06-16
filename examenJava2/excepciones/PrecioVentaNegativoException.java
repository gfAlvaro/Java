/**
 * definicion de la excepción personalizada PrecioVentaNegativoException,
 * que hereda de Exception
 * @author Álvaro García Fuentes
 */
package excepciones;

public class PrecioVentaNegativoException extends Exception {

    private static final long  serialVersionUID = 1L;

    public PrecioVentaNegativoException( String mensaje ){
    	
        super( mensaje );
    }

} // Fin de la excepcion
