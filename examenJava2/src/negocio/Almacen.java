/**
 * Almacen.java
 * Definicion de la clase envoltorio Almacen
 * @author Alvaro Garcia Fuentes
 */
package negocio;

import java.util.ArrayList;

public class Almacen {

    //Atributos
    private ArrayList<Articulo>  almacen = new ArrayList<Articulo>();

    //Metodos
    /**
     * Anade un producto al arraylist
     * @param p Objeto producto
     * @see retirarArticulo
     */
    public void anadir( String descripcion, double precioCompra,
                        double precioVenta, int cantidad, int iva ) throws PrecioCompraNegativoException,
                                                                           PrecioVentaNegativoException,
                                                                           StockNegativoException, 
                                                                           IvaInvalidoException {
        
        almacen.add(  new Articulo( descripcion , precioCompra , precioVenta , cantidad , iva )  );
    }

    /**
     * Retira un producto del arraylist
     * @param codigo Codigo del producto
     * @see anadirArticulo
     */
    public boolean remove( int codigo ) {
        return almacen.remove(  new Articulo( codigo )  );
    }
  
    /**
     * Devuelve un producto del arraylist
     * @param codigo Codigo del producto
     * @return Articulo
     * @see devolverIndice
     */
    public Articulo devolver( int codigo ) throws ArticuloNoEncontradoException {    	

    	int indice;
    	
        if( ( indice = almacen.indexOf( new Articulo( codigo ) ) ) == -1 ) {
        	throw new ArticuloNoEncontradoException("No se pudo encontrar el articulo");
        	}
    	
    	return almacen.get( indice );
    }

    /**
     * método toString de la clase
     * @return String
     */
    public String toString(){
        return almacen.toString();
    }

} // Fin de la clase Almacen
