/**
 * Almacen.java
 * Definicion de la clase envoltorio Almacen
 * @author Alvaro Garcia Fuentes
 */
package almacen;

import java.util.ArrayList;
import java.util.Iterator;

public class Almacen{

    //Atributos
    private ArrayList<Articulo>  almacen = new ArrayList<Articulo>();

    //Metodos
    /**
     * Anade un producto al arraylist
     * @param p Objeto producto
     * @see retirarArticulo
     */
    public void anadirArticulo( String d, double pC, double pV, int c, String iva ) throws Exception {
        
        almacen.add(  new Articulo( d , pC , pV , c , iva )  );
    }

    /**
     * Retira un producto del arraylist
     * @param c Codigo del producto
     * @see anadirArticulo
     */
    public void retirarArticulo( int c ) throws Exception {

    	if( almacen.get(c).getCodigo() != c ){
            throw new Exception();
        }
        
        almacen.remove(c);
    }
  
    /**
     * Devuelve un producto del arraylist
     * @param c Codigo del producto
     * @return Producto
     * @see devolverIndice
     */
    public Articulo devolverArticulo( int c ) throws Exception {
    	    	
        if( almacen.get(c).getCodigo() != c ){
            throw new Exception();
        }
        
        return almacen.get(c);
    }

    /**
     * devuelve el codigo del elemento con indice dado,
     * si no se encuentra devuelve -1
     * @param c
     * @return int
     * @see devolverArticulo
     */
    public int devolverIndice( int c ){
    	
    	int salida;
    	
        try{
            salida = almacen.get(c).getCodigo();
        }
        catch( IndexOutOfBoundsException o ){
            salida = -1;
        }
        
        return salida;
    }

    /**
     * método toString de la clase
     * @return String
     */
    public String toString(){
    	
        String cadena = "";
        Iterator<Articulo> i = almacen.iterator();
        
        while( i.hasNext() ){
            cadena += i.next();
        }
        
        return cadena;
    }

} // Fin de la clase Almacen
