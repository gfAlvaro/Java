/**
 * definicion de la excepción personalizada IvaInvalidoException,
 * que hereda de Exception
 * @author Álvaro García Fuentes
 */
package excepciones;

public class IvaInvalidoException extends Exception {

    private static final long  serialVersionUID = 1L;

    public IvaInvalidoException( String mensaje ){
    	
        super( mensaje );
        }

} // Fin de la excepcion
