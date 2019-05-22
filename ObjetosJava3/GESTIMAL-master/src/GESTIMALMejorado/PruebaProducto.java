/**
 * pruebaProducto.java
 * Programa para gestionar un almacén
 * usando la clase Producto definida en el fichero Producto.java
 * @author Alvaro García Fuentes
 * @author Rafael Jesús Nieto Cardador
 */
package almacen;

import java.util.InputMismatchException;

import teclado.Teclado;

public class PruebaProducto {

	public static void main( String[] args ){
   
	  Almacen almacen = new Almacen();
	  
		int opcion = 0;
		int indice;
		String d = "";
		double pC = 0;
		double pV = 0;
		int s = 0;
		boolean error = false;
		int codigo;
		//boolean salir = false;
		
		//Menu
		//Bucle do while para que se muestre el menu continuamente hasta que se escoja la opcion "salir"
		do {
			System.out.println( "======ALMACEN======" );
			System.out.println( "1. Mostrar almacen" );
			System.out.println( "2. Mostrar producto" );
			System.out.println( "3. Alta" );
			System.out.println( "4. Baja" );
			System.out.println( "5. Modificacion" );
			System.out.println( "6. Entrada de mercancia" );
			System.out.println( "7. Salida de mercancia" );
			System.out.println( "8. Salir" );
			
			do{
				try{
					System.out.println( "Introduzca una opcion" );
					opcion = Teclado.entero();
				}catch( InputMismatchException e ){
					error = true;
					System.out.println( "ERROR: tipo de dato de entrada incorrecto." );
					}
				}while( error );

					// Estructura switch para manejar el menu
				switch( opcion ){
				case 1:
					// Listado
					System.out.println( almacen );
					break;
				case 2:
					// Mostrar producto
					System.out.println( "\n======MOSTRAR PRODUCTO======" );
					
					try{
						System.out.println( "Introduzca el codigo del producto." );
						codigo = Teclado.entero();
						if( almacen.devolverArticulo( codigo ) == null )
							System.out.println( "Producto no encontrado." );
						else
							System.out.println( almacen.devolverArticulo( codigo ) );
							
					}catch( NumberFormatException e ){
						System.out.println( "Error en la entrada de datos." );
					}catch( ArrayIndexOutOfBoundsException  i ){
						System.out.println( "ERROR: codigo incorrecto" );
						}
					break;
				case 3:
					// Alta
					System.out.println( "\n======DAR DE ALTA PRODUCTO======" );

					try{
						System.out.println( "Introduzca la descripcion del producto." );
						d = Teclado.cadena();
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}
				  				  
					try{
						System.out.println( "Introduzca el precio de compra del producto." );
						pC = Teclado.doble();
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}
				  				  
					try{
						System.out.println( "Introduzca el precio de venta del producto." );
						pV = Teclado.doble();
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}	  
				  
					try{
						System.out.println( "Introduzca el stock del producto." );
						s = Teclado.entero();
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}
					
					try{
						Articulo producto = new Articulo( d , pC , pV , s );
						almacen.anadirArticulo( producto );
						System.out.println( "Producto añadido con exito." );
					}catch( Exception g){
						System.out.println( "ERROR: no se pudo añadir el producto." );
						}
					break;	
				
				case 4:
					// Baja
					System.out.println( "\n======DAR DE BAJA PRODUCTO======" );
			
					try{
						System.out.println( "Introduzca el codigo del producto a eliminar." );
						almacen.retirarArticulo( Teclado.entero() );        
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}
					break;
				case 5:
					// Modificar
					System.out.println( "\n======MODIFICAR EL PRODUCTO======" );
					try{
						System.out.println( "Introduzca el codigo del producto a modificar" );
						indice = almacen.devolverIndice( Teclado.entero() );					
					
						try{
							System.out.println( "Descripcion: " + almacen.almacen.get( indice ).getDescripcion() );
							System.out.println( "Nueva descripcion: " );
							almacen.almacen.get( indice ).setDescripcion( Teclado.cadena() );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
							}
					
						try{	
							System.out.println( "Precio de compra: " + almacen.almacen.get( indice ).getPrecioCompra() );
							System.out.println( "Nuevo precio de compra: " );
							almacen.almacen.get( indice ).setPrecioCompra( Teclado.doble() );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
						}catch( Exception g ){
							System.out.println("ERROR: no se pudo cambiar el precio de compra." );
							}
					
						try{
							System.out.println( "Precio de venta: " + almacen.almacen.get( indice ).getPrecioVenta() );
							System.out.println( "Nuevo precio de venta: " );
							almacen.almacen.get( indice ).setPrecioVenta( Teclado.doble() );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
						}catch( Exception g ){
							System.out.println( "ERROR: no se pudo cambiar el precio de venta." );
							}
						
						try{
							System.out.println( "Stock: " + almacen.almacen.get( indice ).getStock() );
							System.out.println( "Nuevo stock: " );
							almacen.almacen.get( indice ).setStock( Teclado.entero() );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
							
						}catch( Exception g ){
							System.out.println( "ERROR: no se pudo cambiar el stock." );
							}
						
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: entrada incorrecta." );
						}
					break;
					
				case 6:
					// Entrada de mercancia
					System.out.println( "\n======ENTRADA DE MERCANCIA======" );
				  
					try{
						System.out.println( "Introduzca el codigo del producto" );
						indice = almacen.devolverIndice( Teclado.entero() );
						
						try{
							System.out.println( "Introduzca la cantidad que desea sumar al stock" );
							almacen.almacen.get( indice ).incrementarExistencias( Teclado.entero() );
							System.out.println( "Stock actualizado" );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
						}catch( Exception g ){
							System.out.println( "ERROR: no se pudo incrementar el stock." );
							}
						
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: entrada incorrecta." );
						}
					break;
				case 7:
					// Salida de mercancia
					System.out.println( "\n======SALIDA DE MERCANC�A======" );
					
					try{
						System.out.println( "Introduzca el codigo del articulo" );
						indice = almacen.devolverIndice( Teclado.entero() );
						
						try{
							System.out.println( "Introduzca la cantidad que desea restar al stock" );
							almacen.almacen.get( indice ).reducirExistencias( Teclado.entero() );
							System.out.println( "Stock actualizado" );
						}catch( InputMismatchException e ){
							System.out.println( "ERROR: entrada incorrecta." );
						}catch( Exception g ){
							System.out.println( "ERROR: articulo no encontrado." );
							}
						
					}catch( InputMismatchException e ){
						System.out.println( "ERROR: entrada incorrecta." );
					}catch( Exception g ){
						System.out.println( "ERROR: articulo no encontrado." );
						}
					break;

				case 8:
					// Salir del menu
					System.out.println( "Saliendo..." );
					break;
				default:
					// Opcion incorrecta
					System.out.println( "Opcion incorrecta." );
				}
			
			}while( opcion != 8 );			
		}
} // Fin del programa