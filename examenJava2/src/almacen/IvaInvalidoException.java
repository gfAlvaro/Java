/**
 * definicion de la excepción personalizada IvaInvalidoException,
 * que hereda de Exception
 * @author Álvaro García Fuentes
 */
package almacen;

public class IvaInvalidoException extends Exception {

    private static final long  serialVersionUID = 1L;

    public IvaInvalidoException( String cadena ){
        super( cadena );
        }

    } // Fin de la clase
