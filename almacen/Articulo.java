/**
 * Producto.java
 * Definicion de la clase Producto
 * @author Alvaro Garcia Fuentes
 */
package almacen;

import excepciones.IvaInvalidoException;
import excepciones.StockNegativoException;
import excepciones.PrecioCompraNegativoException;
import excepciones.PrecioVentaNegativoException;
import excepciones.CantidadNegativaException;

enum Iva {
    GENERAL, REDUCIDO, SUPERREDUCIDO	
}

public class Articulo {

    // Atributos
    private int  codigo;
    private String  descripcion;
    private double  precioCompra;
    private double  precioVenta;
    private int  stock;
    private Iva  iva;

    private static int cantidadArticulos = 0;

    // Metodos
    /**
     * Constructor de la clase
     * @param codigo
     */
    public Articulo( int codigo ) {
        this.codigo = codigo;
    }
    
    /**
     * Constructor parametrico
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     * @param iva
     */
    public Articulo( String descripcion , double precioCompra ,
    	    double precioVenta , int stock , int iva ) throws Exception {
    	
        setDescripcion( descripcion );
        setPrecioCompra( precioCompra );
        setPrecioVenta( precioVenta );
        setStock( stock );
        setIva( iva );
        setCodigo( );
    }

    /**
     * devuelve el valor de iva
     * @return String
     */
    public String getIva(){
    	return String.valueOf( this.iva );
    }
	
    /**
     * modifica el valor de iva
     * si iva vale null lanza IvaInvalidoException
     * @param iva
     * @throws IvaInvalidoException
     */
    public void setIva( int iva ) throws IvaInvalidoException {

        switch( iva ) {
        case 1:
            this.iva = Iva.GENERAL;
            break;
        case 2:
            this.iva = Iva.REDUCIDO;
            break;
        case 3:
            this.iva = Iva.SUPERREDUCIDO;
            break;
        default:
            throw new IvaInvalidoException( "Iva no válido" );
        }
    }

    // Otros getters
    /**
     * getter para codigo
     * @return int
     * @see setCodigo
     */
    public int getCodigo(){
        return this.codigo;
    }

    /**
     * getter para descripcion
     * @return String
     * @see setDescripcion
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * getter para precioCompra
     * @return double
     * @see setPrecioCompra
     */
    public double getPrecioCompra(){
        return this.precioCompra;
    }

    /**
  	 * getter para precioVenta
  	 * @return double
  	 * @see setPrecioVenta
  	 */
    public double getPrecioVenta(){
        return this.precioVenta;
    }

    /**
     * getter para stock
     * @return int
     * @see setStock
     */
    public int getStock(){
        return this.stock;
    }

    // Otros Setters
    /**
     * setter para codigo
     * @param codigo
     * @see getCodigo
     */
    private void setCodigo( ){
        this.codigo = cantidadArticulos++;
    }

    /**
     * setter para descripcion
     * @param descripcion
     * @see getDescripcion
     */
    public void setDescripcion( String descripcion ){
        this.descripcion = descripcion;
        }

    /**
     * setter para PrecioCompra
     * @param pc
     * @see getPrecioCompra
     */
    public void setPrecioCompra( double precioCompra ) throws PrecioCompraNegativoException {
    	
        if( precioCompra < 0 ){
            throw new PrecioCompraNegativoException( "El precio de compra no puede ser negativo" );
        }
        
        this.precioCompra = precioCompra;
    }

    /**
     * setter para precioVenta
     * @param precioVenta
     * @see getPrecioVenta
     */
    public void setPrecioVenta( double precioVenta ) throws PrecioVentaNegativoException {

    	if( precioVenta < 0 ){
            throw new PrecioVentaNegativoException( "El precio de venta no puede ser negativo." );
        }
        
        this.precioVenta = precioVenta;
    }
  
    /**
     * setter para stock
     * @param stock
     * @see getStock
     */
    public void setStock( int stock ) throws StockNegativoException {

        if( stock < 0 ){
            throw new StockNegativoException( "El stock no puede ser negativo" );
        }

        this.stock = stock;
    }
  
    //Metodos  
    /**
     * Incrementa el stock del producto
     * @param cantidad Cantidad que se suma al stock
     * @see reducirExistencias
     */
    public void incrementar( int cantidad ) throws Exception {
    	
    	if( cantidad < 0 ){
            throw new CantidadNegativaException( "La cantidad no puede ser negativa" );
        }

        this.setStock( this.getStock() + cantidad );
    }
    
    /**
     * Decrementa el stock del producto
     * @param cantidad Cantidad que se resta al stock
     * @see incrementarExistencias
     */
    public void reducir( int cantidad ) throws Exception { 
    	
        if( cantidad < 0 ){
            throw new CantidadNegativaException( "La cantidad no puede ser negativa" );
        }

        this.setStock( this.getStock() - cantidad );
    }

    /**
     * Metodo toString de la clase
     * @return String
     */
    @Override
    public String toString() {
        return "Codigo - " + this.codigo
                + "\nDescripcion - " + this.descripcion
                + "\nPrecio de compra - " + this.precioCompra
		        + "\nPrecio de venta - " + this.precioVenta
		        + "\nStock - " + this.stock
		        + "\nTipo de IVA - " + this.iva + "\n\n";
    }
	
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Articulo other = (Articulo) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

} // Fin de la clase Articulo
