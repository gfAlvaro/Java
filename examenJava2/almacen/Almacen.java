/**
 * Almacen.java
 * Definicion de la clase envoltorio Almacen
 * @author Alvaro Garcia Fuentes
 */
package almacen;

import java.util.ArrayList;

import excepciones.CantidadNegativaException;
import excepciones.IvaInvalidoException;
import excepciones.PrecioCompraNegativoException;
import excepciones.PrecioVentaNegativoException;
import excepciones.StockNegativoException;

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
                        double precioVenta, int cantidad, String iva ) throws CantidadNegativaException,
                                                                            PrecioCompraNegativoException,
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
    public boolean retirar( int codigo ) {
    	
        return almacen.remove( new Articulo( codigo )  );
    }
  
    /**
     * Devuelve un producto del arraylist
     * @param codigo Codigo del producto
     * @return Articulo
     * @see devolverIndice
     */
    public Articulo devolver( int codigo ) throws IndexOutOfBoundsException {

    	return almacen.get(  almacen.indexOf(  new Articulo( codigo ) )  );
    }

    /**
     * método toString de la clase
     * @return String
     */
    public String toString(){
    	
        return almacen.toString();
    }

} // Fin de la clase Almacen
