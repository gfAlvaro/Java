/**
 * testAlmacen.java
 * Programa para probar el Almacen
 * usando la clase Articulo definida en el fichero Articulo.java
 * @author Alvaro García Fuentes
 */
package almacen;

import java.util.ArrayList;

import utiles.Menu;
import utiles.Teclado;

public class TestAlmacen{

    public static Almacen almacen = new Almacen();

    public static void mostrarArticulo() {
    
        int codigo;
    	
    	System.out.println( "\n======MOSTRAR ARTICULO======" );
        try{
            codigo = Teclado.leerEntero( "Introduzca el codigo del articulo: " );
        
            if(  almacen.devolver( codigo ) == null  ){
                System.out.println( "Articulo no encontrado." );
            }
            else{
                System.out.println(  almacen.devolver( codigo )  );
            }
        }
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void alta() {
    	
        String titulo = "Seleccione el tipo de IVA deseado:";
        ArrayList<String> iva = new ArrayList<String>();
        iva.add( "general" );
        iva.add( "reducido" );
        iva.add( "super reducido" );
        Menu menuIva = new Menu( titulo , iva );

    	System.out.println( "\n======DAR DE ALTA ARTICULO======" );
        try{
            System.out.println( "Introduzca el articulo." );
            almacen.anadir( Teclado.leerCadena( "Descripcion: " ), Teclado.leerDoble( "Precio de compra: " ),
            		        Teclado.leerDoble( "Precio de venta: " ), Teclado.leerEntero( "Stock: " ),
            		        menuIva.gestionar() );
            System.out.println( "Articulo añadido con éxito." );
        }
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void baja() {
   
        System.out.println( "\n======DAR DE BAJA ARTICULO======" );

        try{            
            if( almacen.retirar( Teclado.leerEntero( "Introduzca el codigo del articulo a eliminar: " ) )  ) {
            	System.out.println( "Borrado con éxito." );
            }
            else {
            	System.out.println( "El artículo no existe." );
            }
        }
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void modificarArticulo() {
    	
    	Articulo indice;
    	ArrayList<String> iva = new ArrayList<String>();
        iva.add( "general" );
        iva.add( "reducido" );
        iva.add( "super reducido" );
        String titulo = "Seleccione el tipo de IVA deseado: ";
        Menu menuIva = new Menu( titulo , iva  );
        
        System.out.println( "\n======MODIFICAR EL ARTICULO======" );
        try{
            indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo a modificar: " ) );
            
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
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void entradaMercancia() {
    	
        Articulo indice;
    	        
        System.out.println( "\n======ENTRADA DE MERCANCIA======" );
        try{
            indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo: " ) );
            almacen.devolver( indice.getCodigo() )
                    .incrementar( Teclado.leerEntero( "Introduzca la cantidad que desea sumar al stock: " ) );
            System.out.println( "Stock actualizado" );				
        }
        catch( Exception e ){
            System.out.println( e );
        }
    }
    
    public static void salidaMercancia() {
    	
        Articulo indice;

        System.out.println( "\n======SALIDA DE MERCANCIA======" );
        try{
            indice = almacen.devolver( Teclado.leerEntero( "Introduzca el codigo del articulo:" ) );
            almacen.devolver(indice.getCodigo() )
                    .reducir( Teclado.leerEntero( "Introduzca la cantidad que desea restar al stock: " ) );
            System.out.println( "Stock actualizado" );
        }
        catch( Exception e ){
            System.out.println( e );
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
