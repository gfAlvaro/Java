/**
 * Producto.java
 * Definicion de la clase Producto
 * @author Alvaro Garcia Fuentes
 */
package almacen;

public class Articulo{
	
	//Atributos
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	private String iva;

	private static int cantidadArticulos = 0;
	
	/**
	 * Constructor parametrico
	 * @param d
	 * @param pC
	 * @param pV
	 * @param s
	 * @param iva
	 */
	public Articulo( String d , double pC , double pV , int s , String iva ) throws Exception {
		setCodigo( );
		setDescripcion( d );
		setPrecioCompra( pC );
		setPrecioVenta( pV );
		setStock( s );
		setIva( iva );
		}

	/**
	 * devuelve el valor de iva
	 * @return String
	 */
	public String getIva(){ return this.iva; }
	
	/**
	 * modifica el valor de iva
	 * si iva vale null lanza IvaInvalidoException
	 * @param iva
	 * @throws IvaInvalidoException
	 */
	public void setIva( String iva ) throws IvaInvalidoException {
		if( iva == null )
			throw new IvaInvalidoException( "Iva no válido" );
		else
			this.iva = iva;
		}
	
	// Otros getters
	/**
	 * getter para codigo
	 * @return int
	 * @see setCodigo
	 */
	public int getCodigo(){ return this.codigo; }
  
	/**
	 * getter para descripcion
	 * @return String
	 * @see setDescripcion
	 */
	public String getDescripcion(){ return this.descripcion; }

	/**
	 * getter para precioCompra
	 * @return double
	 * @see setPrecioCompra
	 */
	public double getPrecioCompra(){ return this.precioCompra; }
  
	/**
	 * getter para precioVenta
	 * @return double
	 * @see setPrecioVenta
	 */
	public double getPrecioVenta(){ return this.precioVenta; }
  
	/**
	 * getter para stock
	 * @return int
	 * @see setStock
	 */
	public int getStock(){ return this.stock; }
  
	// Otros Setters
	/**
	 * setter para codigo
	 * @param codigo
	 * @see getCodigo
	 */
	private void setCodigo( ){
		this.codigo = cantidadArticulos;
		cantidadArticulos++;
		}

	/**
	 * setter para descripcion
	 * @param d
	 * @see getDescripcion
	 */
	public void setDescripcion( String d ){
		this.descripcion = d;
		}
  
	/**
	 * setter para PrecioCompra
	 * @param pc
	 * @see getPrecioCompra
	 */
	public void setPrecioCompra( double pc ) throws Exception {
		if( pc < 0 )
			throw new Exception();
		else
			this.precioCompra = pc;
		}
  
	/**
	 * setter para precioVenta
	 * @param pv
	 * @see getPrecioVenta
	 */
	public void setPrecioVenta( double pv ) throws  Exception {
		if( pv < 0 )
			throw new Exception();
		else
			this.precioVenta = pv;
		}
  
	/**
	 * setter para stock
	 * @param s
	 * @see getStock
	 */
	public void setStock( int s ) throws Exception {
		if( s < 0 )
			throw new Exception();
		else
			this.stock = s;	
		}
  
	//Metodos  
	/**
	 * Incrementa el stock del producto
	 * @param c Cantidad que se suma al stock
	 * @see reducirExistencias
	 */
	public void incrementarExistencias( int c ) throws Exception {
		if( c < 0 )
			throw new Exception();
			
		this.setStock( this.getStock() + c );
		}
	/**
	 * Decrementa el stock del producto
	 * @param c Cantidad que se resta al stock
	 * @see incrementarExistencias
	 */
	public void reducirExistencias( int c ) throws Exception { 
		if( this.getStock() - c < 0 )
			throw new Exception();
		else
			this.setStock( this.getStock() - c );
		}

	/**
	 * Metodo toString de la clase
	 * @return String
	 */
	public String toString(){
		return "Codigo - " + this.codigo
				+ "\nDescripcion - " + this.descripcion
				+ "\nPrecio de compra - " + this.precioCompra
				+ "\nPrecio de venta - " + this.precioVenta
				+ "\nStock - " + this.stock
				+ "\nTipo de IVA - " + this.iva;
		}
	
	} // Fin de la clase Producto
