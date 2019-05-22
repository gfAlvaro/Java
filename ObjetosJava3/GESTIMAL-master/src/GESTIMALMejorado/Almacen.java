/**
 * Almacen.java
 * Definicion de la clase envoltorio Almacen
 * @author Alvaro Garcia Fuentes
 * @author Rafael Jesus Nieto Cardador
 */
package almacen;

import java.util.ArrayList;

public class Almacen{

	//Atributos
	ArrayList<Articulo> almacen = new ArrayList<Articulo>();
  
	//Metodos
  
	/**
	 * Anade un producto al arraylist
	 * @param p Objeto producto
	 * @see retirarArticulo
	 */
	public void anadirArticulo( Articulo p ){
		almacen.add(p);
		}
  
	/**
	 * Retira un producto del arraylist
	 * @param c Codigo del producto
	 * return boolean
	 * @see anadirArticulo
	 */
	public boolean retirarArticulo( int c ){
		if( almacen.get(c).getCodigo() == c ){
			almacen.remove(c);
			return true;
			}
		return false;
		}
  
	/**
	 * Devuelve un producto del arraylist
	 * @param c Codigo del producto
	 * @return Producto
	 * @see devolverIndice
	 */
	public Articulo devolverArticulo( int c ){
			if( almacen.get(c).getCodigo() == c ) 
				return almacen.get(c);
			
		return null;
		}
  
	/**
	 * devuelve el codigo del elemento con indice dado,
	 * si no se encuentra devuelve -1
	 * @param c
	 * @return int
	 * @see devolverArticulo
	 */
	public int devolverIndice( int c ){
		
			if( almacen.get(c).getCodigo() == c )
				return c;

		return -1;
		}
	
	/**
	 * método toString de la clase
	 * @return String
	 */
	public String toString(){

		String cadena = "";
		
		for( int i = 0 ; i < almacen.size() ; i++ )
			cadena += almacen.get(i);

		return cadena;
		}

	} // Fin de la clase Almacen
