/**
 * testAlmacen.java
 * Programa para probar el Almacen
 * usando la clase Articulo definida en el fichero Articulo.java
 * @author Alvaro García Fuentes
 */
package presentacion;

import negocio.*;

public class TestAlmacen{

    public static Almacen  almacen = new Almacen();
    public static Menu  menu = new Menu( "======ALMACEN======", new String[]{ "1. Mostrar almacen", "2. Mostrar articulo", "3. Alta", "4. Baja", "5. Modificacion", "6. Entrada de mercancia", "7. Salida de mercancia", "8. Salir"} );
    public static Menu  menuIva = new Menu( "Seleccione el tipo de iva deseado",  new String[]{ "1. general", "2. reducido", "3. super reducido"} );

    
    public static void mostrarArticulo() {
        	        
        try {
        	System.out.println( "\n======MOSTRAR ARTICULO======" );

            int codigo = Teclado.leerEntero( "Introduzca el codigo del articulo: " );

            System.out.println(  almacen.devolver( codigo )  );
        }
        catch( ArticuloNoEncontradoException e ){
            System.out.println(  e.getMessage() );
        }

    }
    
    public static void alta() {

        try{
        	System.out.println( "\n======DAR DE ALTA ARTICULO======" );

            System.out.println( "Introduzca el articulo." );
            almacen.anadir( Teclado.leerCadena( "Descripcion: " ), Teclado.leerDoble( "Precio de compra: " ),
            		        Teclado.leerDoble( "Precio de venta: " ), Teclado.leerEntero( "Stock: " ),
            		        menuIva.gestionar() );
            System.out.println( "Articulo añadido con éxito." );
        }
        catch( negocio.PrecioCompraNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( negocio.PrecioVentaNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( negocio.StockNegativoException e ){
            System.out.println( e.getMessage() );
        } 
        catch( negocio.IvaInvalidoException e ){
            System.out.println( e.getMessage() );
        }
    }
    
    public static void baja() {
   
        System.out.println( "\n======DAR DE BAJA ARTICULO======" );
           
        if( almacen.remove( Teclado.leerEntero( "Introduzca el codigo del articulo a eliminar: " ) )  ) {
            System.out.println( "Borrado con éxito." );
        }
        else {
            System.out.println( "El artículo no existe." );
        }
    }
    
    public static void modificarArticulo() {
    	        
        try{
            System.out.println( "\n======MODIFICAR EL ARTICULO======" );

            Articulo indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo a modificar: " ) );
            
            System.out.println( "Descripcion: " + almacen.devolver( indice.getCodigo() ).getDescripcion() );
            almacen.devolver( indice.getCodigo() ).setDescripcion( Teclado.leerCadena( "Nueva descripcion: " ) );
            
            System.out.println( "Precio de compra: " + almacen.devolver( indice.getCodigo() ).getPrecioCompra() );
            almacen.devolver( indice.getCodigo() ).setPrecioCompra( Teclado.leerDoble( "Nuevo precio de compra: " ) );
            
            System.out.println( "Precio de venta: " + almacen.devolver( indice.getCodigo() ).getPrecioVenta() );
            almacen.devolver( indice.getCodigo() ).setPrecioVenta( Teclado.leerDoble( "Nuevo precio de venta: " ) );
            
            System.out.println( "Stock: " + almacen.devolver( indice.getCodigo() ).getStock() );
            almacen.devolver( indice.getCodigo() ).setStock( Teclado.leerEntero( "Nuevo stock: " ) );
            
            System.out.println( "Tipo de Iva: " + almacen.devolver( indice.getCodigo() ).getIva() );
            almacen.devolver( indice.getCodigo() ).setIva( menuIva.gestionar() );
        }
        catch( PrecioCompraNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( PrecioVentaNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( StockNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( IvaInvalidoException e ){
            System.out.println( e.getMessage() );
        }
        catch( ArticuloNoEncontradoException e ){
            System.out.println( e.getMessage() );
        }
    }
    
    public static void entradaMercancia() {
    	    	        
        try{
            System.out.println( "\n======ENTRADA DE MERCANCIA======" );
            
            Articulo indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo: " ) );

            almacen.devolver( indice.getCodigo() )
                    .incrementar( Teclado.leerEntero( "Introduzca la cantidad que desea sumar al stock: " ) );
            System.out.println( "Stock actualizado" );				
        }
        catch( StockNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( CantidadNegativaException e ){
            System.out.println( e.getMessage() );
        }
        catch( ArticuloNoEncontradoException e ){
            System.out.println( e.getMessage() );
        }
    }
    
    public static void salidaMercancia() {
    	
        try{
            System.out.println( "\n======SALIDA DE MERCANCIA======" );
            Articulo indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo:" ) );
            almacen.devolver(indice.getCodigo() )
                    .reducir( Teclado.leerEntero( "Introduzca la cantidad que desea restar al stock: " ) );
            System.out.println( "Stock actualizado" );
        }
        catch( StockNegativoException e ){
            System.out.println( e.getMessage() );
        }
        catch( CantidadNegativaException e ){
            System.out.println( e.getMessage() );
        }
        catch( ArticuloNoEncontradoException e ){
            System.out.println( e.getMessage() );
        }
    }

    public static void main( String[] args ){

        int opcion;

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
