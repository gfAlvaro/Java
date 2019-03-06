/**
 * Producto.java
 * Definicion de la clase Producto
 * @author Álvaro García Fuentes
 * @author Rafael Jesús Nieto Cardador
 */
package gestimal;

public class Producto{

	// Atributos
	private String codigo = "LIBRE";
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
  
	// Getters
	public String getCodigo(){ return this.codigo; }
	public String getDescripcion(){ return this.descripcion; }
	public double getPrecioCompra(){ return this.precioCompra; }
	public double getPrecioVenta(){ return this.precioVenta; }
	public int getStock(){ return this.stock; }

	// Setters
	public void setCodigo( String c ){ this.codigo = c; }
	public void setDescripcion( String d ){ this.descripcion = d; }
	public void setPrecioCompra( double pc ){ this.precioCompra = pc; }
	public void setPrecioVenta( double pv ){ this.precioVenta = pv; }
	public void setStock(int s){ this.stock = s; }

	// Metodo toString
	public String toString(){
		return "\nC�digo - " + this.codigo
				+ "\nDescripci�n - " + this.descripcion
				+ "\nPrecio de compra - " + this.precioCompra
				+ "\nPrecio de venta - " + this.precioVenta
				+ "\nStock - " + this.stock;
    	}

	} // Fin de la clase Producto
