/**
 * pruebaProducto.java
 * Programa para gestionar un almacén
 * usando la clase Producto definida en el fichero Producto.java
 * @author Alvaro García Fuentes
 */
package almacen;

import java.util.InputMismatchException;

public class PruebaAlmacen{

    public static Almacen almacen = new Almacen();

    public static void mostrarArticulo() throws Exception {
    
        int codigo;
    	
        System.out.println( "Introduzca el codigo del articulo." );
        codigo = Teclado.entero();
        
        if(  almacen.devolverArticulo( codigo ) == null  ){
            System.out.println( "Articulo no encontrado." );
        }
        else{
            System.out.println(  almacen.devolverArticulo( codigo )  );
        }
    }
    
    public static void alta() throws Exception {
    	
        String d = "";
        double pC = 0;
        double pV = 0;
        int s = 0;
        String iva;
        
        System.out.println( "Introduzca la descripcion del articulo." );
        d = Teclado.cadena();
        System.out.println( "Introduzca el precio de compra del articulo." );
        pC = Teclado.doble();
        System.out.println( "Introduzca el precio de venta del articulo." );
        pV = Teclado.doble();
        System.out.println( "Introduzca el stock del articulo." );
        s = Teclado.entero();		  
        iva = menuIva.menu();
        almacen.anadirArticulo( d, pC, pV, s, iva );
    }
    
    public static void baja() throws Exception {
    	
        System.out.println( "Introduzca el codigo del articulo a eliminar." );
        almacen.retirarArticulo( Teclado.entero() );
    }
    
    public static void modificarArticulo() throws Exception {
    	
    	int indice;
    	String iva;
    	
        System.out.println( "Introduzca el codigo del articulo a modificar" );
        indice = almacen.devolverIndice( Teclado.entero() );
        
        System.out.println( "Descripcion: " + almacen.devolverArticulo( indice ).getDescripcion() );
        System.out.println( "Nueva descripcion: " );
        almacen.devolverArticulo( indice ).setDescripcion( Teclado.cadena() );
        
        System.out.println( "Precio de compra: " + almacen.devolverArticulo( indice ).getPrecioCompra() );
        System.out.println( "Nuevo precio de compra: ");
        almacen.devolverArticulo( indice ).setPrecioCompra( Teclado.doble() );
        
        System.out.println( "Precio de venta: " + almacen.devolverArticulo( indice ).getPrecioVenta() );
        System.out.println( "Nuevo precio de venta: " );
        almacen.devolverArticulo( indice ).setPrecioVenta( Teclado.doble() );
        
        System.out.println( "Stock: " + almacen.devolverArticulo( indice ).getStock() );
        System.out.println( "Nuevo stock: " );
        almacen.devolverArticulo( indice ).setStock( Teclado.entero() );
        
        iva = menuIva.menu();
        almacen.devolverArticulo( indice ).setIva( iva );
    }
    
    public static void entradaMercancia() throws Exception {
    	
        int indice;
    	
        System.out.println( "Introduzca el codigo del articulo" );
        indice = almacen.devolverIndice( Teclado.entero() );
        System.out.println( "Introduzca la cantidad que desea sumar al stock" );
        almacen.devolverArticulo(indice).incrementarExistencias( Teclado.entero() );
        System.out.println( "Stock actualizado" );
    }
    
    public static void salidaMercancia() throws Exception {
    	
        int indice;
    	
        System.out.println( "Introduzca el codigo del articulo" );
        indice = almacen.devolverIndice( Teclado.entero() );							
        System.out.println( "Introduzca la cantidad que desea restar al stock" );
        almacen.devolverArticulo(indice).reducirExistencias( Teclado.entero() );
        System.out.println( "Stock actualizado" );
    }
    
    public static void main( String[] args ){

        int opcion = 0;
        boolean error;
        
        //Menu
        //Bucle do while para que se muestre el menu continuamente hasta que se escoja la opcion "salir"
        do{
            System.out.println( "======ALMACEN======" );
            System.out.println( "1. Mostrar almacen" );
            System.out.println( "2. Mostrar articulo" );
            System.out.println( "3. Alta" );
            System.out.println( "4. Baja" );
            System.out.println( "5. Modificacion" );
            System.out.println( "6. Entrada de mercancia" );
            System.out.println( "7. Salida de mercancia" );
            System.out.println( "8. Salir" );	
            
            do{
                try{
                	error = false;
                    System.out.println( "Introduzca una opción" );
                    opcion = Teclado.entero();
                }
                catch( InputMismatchException ie ){
                    error = true;
                    System.out.println( "ERROR: entrada incorrecta." );
                }
                
            }while( error );
            
            //Estructura switch para manejar el men�
            switch( opcion ){
            case 1:
                // Listado
                System.out.println( almacen );
                break;
            case 2:
                //Mostrar articulo
            	System.out.println( "\n======MOSTRAR ARTICULO======" );

                try{
                    mostrarArticulo();
                }
                catch( InputMismatchException ei ){
                    System.out.println( "ERROR: entrada de datos no válida." );
                }
                catch( ArrayIndexOutOfBoundsException i ){
                    System.out.println( "ERROR: codigo incorrecto." );
                }
                catch( Exception e ){
                    System.out.println( "ERROR: codigo incorrecto." );
                }
                
                break;
                
            case 3:
                // Alta
                System.out.println( "\n======DAR DE ALTA ARTICULO======" );
                
                try{
                    alta();
                    System.out.println( "Articulo añadido con éxito." );
                }
                catch( InputMismatchException ie ){
                    System.out.println( "ERROR: entrada incorrecta." );
                }
                catch( IvaInvalidoException ie ){
                    System.out.println( "ERROR: IVA incorrecto." );
                }
                catch( Exception e ){
                    System.out.println( "ERROR: no se pudo crear el artículo." );
                }
                
                break;	

            case 4:
                // Baja
                System.out.println( "\n======DAR DE BAJA ARTICULO======" );

                try{
                    baja();       
                }
                catch( InputMismatchException ei ){
                    System.out.println( "ERROR: Entrada incorrecta." );
                }
                catch( Exception e ){
                    System.out.println( "ERROR: no se pudo eliminar el artículo." );
                }
                
                break;
                
            case 5:
                // Modificar
                System.out.println( "\n======MODIFICAR EL ARTICULO======" );
                
                try{
                    modificarArticulo();
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

                break;
                
            case 6:
                // Entrada de mercancia
                System.out.println( "\n======ENTRADA DE MERCANCIA======" );

                try{
                    entradaMercancia();
                }
                catch( InputMismatchException ei ){
                    System.out.println( "ERROR: entrada incorrecta." );					
                }
                catch( Exception e ){
                    System.out.println( "ERROR: no se pudo incrementar el stock" );
                }
                
                break;
                
            case 7:
                // Salida de mercancia
                System.out.println( "\n======SALIDA DE MERCANCIA======" );
                
                try{
                    salidaMercancia();						
                }
                catch( InputMismatchException ei ){
                    System.out.println( "ERROR: entrada incorrecta." );
                }
                catch( Exception e ){
                    System.out.println( "ERROR: articulo no econtrado." );
                }
                
                break;
            case 8:
                // Salir del menu
                System.out.println( "Saliendo..." );
                break;
            default:
                // Opcion incorrecta
                System.out.println( "Opción incorrecta" );
            }
            
        }while( opcion != 8 );
    }
    
} // Fin del programa
