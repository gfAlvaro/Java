/**
 * definicion de la excepción personalizada PrecioCompraNegativoException,
 * que hereda de Exception
 * @author Álvaro García Fuentes
 */
package excepciones;

public class PrecioCompraNegativoException extends Exception {

    private static final long  serialVersionUID = 1L;

    public PrecioCompraNegativoException( String mensaje ){
    	
        super( mensaje );
        }

} // Fin de la excepcion
