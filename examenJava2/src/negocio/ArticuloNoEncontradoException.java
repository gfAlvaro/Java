/**
 * ARticuloNoEncontradoException.java
 * excepcion personalizada para indicar un error
 * cuando no se pueda encontrar un articulo
 * @author Alvaro Garcia Fuentes
 */
package negocio;

public class ArticuloNoEncontradoException extends Exception {

    private static final long  serialVersionUID = 1L;

    public ArticuloNoEncontradoException( String mensaje ) {
        super( mensaje );
	}
	
} // Fin de la excepc