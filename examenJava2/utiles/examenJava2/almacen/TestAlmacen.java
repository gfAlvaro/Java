/**
 * testAlmacen.java
 * Programa para probar el Almacen
 * usando la clase Articulo definida en el fichero Articulo.java
 * @author Alvaro García Fuentes
 */
package almacen;

import java.util.InputMismatchException;
import java.util.ArrayList;

import excepciones.IvaInvalidoException;
import excepciones.PrecioCompraNegativoException;
import excepciones.PrecioVentaNegativoException;
import excepciones.StockNegativoException;
import excepciones.CantidadNegativaException;
import utiles.Menu;
import utiles.Teclado;
import utiles.MenuIva;

public class TestAlmacen{

    public static Almacen almacen = new Almacen();

    public static void mostrarArticulo() {
    
        int codigo;
    	
    	System.out.println( "\n======MOSTRAR ARTICULO======" );

        try{
            System.out.print( "Introduzca el codigo del articulo: " );
            codigo = Teclado.leerEntero();
        
            if(  almacen.devolver( codigo ) == null  ){
                System.out.println( "Articulo no encontrado." );
            }
            else{
                System.out.println(  almacen.devolver( codigo )  );
            }
        }
        catch( InputMismatchException ei ){
            System.out.println( "ERROR: entrada de datos no válida." );
        }
        catch( ArrayIndexOutOfBoundsException i ){
            System.out.println( "El articulo no existe." );
        }
        catch( IndexOutOfBoundsException e ){
            System.out.println( "ERROR: no se encontró el articulo." );
        }
    }
    
    public static void alta() {
    	        
        System.out.println( "\n======DAR DE ALTA ARTICULO======" );
        
        try{
            System.out.println( "Introduzca el articulo." );
            almacen.anadir( Teclado.leerCadena( "Descripcion: " ), Teclado.leerDoble( "Precio de compra: " ),
            		        Teclado.leerDoble( "Precio de venta: " ), Teclado.leerEntero( "Stock: " ),
            		        MenuIva.menu() );
            System.out.println( "Articulo añadido con éxito." );
        }
        catch( InputMismatchException i ){
            System.out.println( i );
        }
        catch( PrecioCompraNegativoException b ){
            System.out.println( b );
        }
        catch( PrecioVentaNegativoException c ){
            System.out.println( c );
        }
        catch( StockNegativoException d ){
            System.out.println( d );
        }
        catch( IvaInvalidoException ie ){
            System.out.println( ie );
        }
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void baja() {
   
        System.out.println( "\n======DAR DE BAJA ARTICULO======" );

        try{
            System.out.print( "Introduzca el codigo del articulo a eliminar: " );
            
            if( almacen.retirar( Teclado.leerEntero() )  ) {
            	System.out.println( "Borrado con éxito." );
            }
            else {
            	System.out.println( "El artículo no existe." );
            }
        }
        catch( InputMismatchException ei ){
            System.out.println( "ERROR: Entrada incorrecta." );
        }
    }
    
    public static void modificarArticulo() {
    	
    	Articulo indice;
    	String iva;
        
        System.out.println( "\n======MODIFICAR EL ARTICULO======" );
        
        try{
            System.out.print( "Introduzca el codigo del articulo a modificar: " );
            indice = almacen.devolver( Teclado.leerEntero() );
            
            System.out.println( "Descripcion: " + almacen.devolver( indice.getCodigo() ).getDescripcion() );
            System.out.print( "Nueva descripcion: " );
            almacen.devolver( indice.getCodigo() ).setDescripcion( Teclado.leerCadena() );
            
            System.out.println( "Precio de compra: " + almacen.devolver( indice.getCodigo() ).getPrecioCompra() );
            System.out.print( "Nuevo precio de compra: ");
            almacen.devolver( indice.getCodigo() ).setPrecioCompra( Teclado.leerDoble() );
            
            System.out.println( "Precio de venta: " + almacen.devolver( indice.getCodigo() ).getPrecioVenta() );
            System.out.print( "Nuevo precio de venta: " );
            almacen.devolver( indice.getCodigo() ).setPrecioVenta( Teclado.leerDoble() );
            
            System.out.println( "Stock: " + almacen.devolver( indice.getCodigo() ).getStock() );
            System.out.print( "Nuevo stock: " );
            almacen.devolver( indice.getCodigo() ).setStock( Teclado.leerEntero() );
            
            iva = MenuIva.menu();
            almacen.devolver( indice.getCodigo() ).setIva( iva );
        }
        catch( IvaInvalidoException ie ){
            System.out.println( "ERROR: IVA incorrecto." );				
        }
        catch( InputMismatchException ei ){
            System.out.println( "ERROR: entrada incorrecta." );
        }
        catch( Exception e ){
            System.out.println( "ERROR: no se pudo modificar el articulo." );
        }
    }
    
    public static void entradaMercancia() {
    	
        Articulo indice;
    	        
        System.out.println( "\n======ENTRADA DE MERCANCIA======" );
        try{
            System.out.println( "Introduzca el codigo del articulo" );
            indice = almacen.devolver( Teclado.leerEntero() );
            System.out.print( "Introduzca la cantidad que desea sumar al stock: " );
            almacen.devolver( indice.getCodigo() ).incrementar( Teclado.leerEntero() );
            System.out.println( "Stock actualizado" );        }
        catch( InputMismatchException ei ){
            System.out.println( "ERROR: entrada incorrecta." );					
        }
        catch( Exception e ){
            System.out.println( "ERROR: no se pudo incrementar el stock" );
        }
    }
    
    public static void salidaMercancia() {
    	
        Articulo indice;

        System.out.println( "\n======SALIDA DE MERCANCIA======" );
        try{
            System.out.println( "Introduzca el codigo del articulo" );
            indice = almacen.devolver( Teclado.leerEntero() );
            System.out.print( "Introduzca la cantidad que desea restar al stock: " );
            almacen.devolver(indice.getCodigo() ).reducir( Teclado.leerEntero() );
            System.out.println( "Stock actualizado" );
            }
        catch( InputMismatchException ei ){
            System.out.println( "ERROR: entrada incorrecta." );
        }
        catch( IndexOutOfBoundsException e ){
            System.out.println( "ERROR: articulo no econtrado." );
        }
        catch( StockNegativoException a ){
            System.out.println( "El stock no puede ser negativo." );
        }
        catch( CantidadNegativaException o ){
            System.out.println( "ERROR: articulo no econtrado." );
        }
    }

    public static void main( String[] args ){

    	int opcion;
    	String titulo = "======ALMACEN======";
    	ArrayList<String> opciones = new ArrayList<String>();
    	opciones.add( "Mostrar almacen" );
        opciones.add( "Mostrar articulo" );
        opciones.add( "Alta" );
        opciones.add( "Baja" );
        opciones.add( "Modificacion" );
        opciones.add( "Entrada de mercancia" );
        opciones.add( "Salida de mercancia" );
        opciones.add( "Salir" );
    	Menu menu = new Menu( titulo, opciones );
    	
    	do {
            switch( opcion = menu.gestionar() ) {
            case 1:
                System.out.println( almacen );
                break;
                
            case 2:
                mostrarArticulo();        
                break;
                
            case 3:
                alta();
                break;	

            case 4:
                baja();
                break;
                
            case 5:
                modificarArticulo();
                break;
                
            case 6:
                entradaMercancia();
                break;
                
            case 7:
                salidaMercancia();
                break;
                
            case 8:
                System.out.println( "Programa terminado" );
                break;
                
            default:
                System.out.println( "Opción incorrecta" );
            }
            
        }while( opcion != 8 );
    }
    
} // Fin del programa
