/**
 * pruebaProducto.java
 * Programa para gestionar un almacén
 * usando la clase Producto definida en el fichero Producto.java
 * @author Alvaro García Fuentes
 * @author Rafael Jesús Nieto Cardador
 */
package GESTIMALMejorado;

import java.util.Scanner;

public class PruebaProducto {
	
	/**
	 * Funcion para leer un double por teclado
	 * @return double
	 * @see tecladoInt, tecladoString
	 */
	public static double tecladoDouble(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextDouble();
		}
  
	/**
	 * Funcion para leer un entero por teclado
	 * @return int
	 * @see tecladoDouble, tecladoString
	 */
	public static int tecladoInt(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextInt();
		}
  
	/**
	 * Funcion para leer una cadena por teclado
	 * @return String
	 * @see tecladoDouble, tecladoInt
	 */
	public static String tecladoString(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextLine();
		}
  
	/**
	 * Programa principal
	 * @param args
	 */
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
			System.out.println( "======ALMAC�N======" );
			System.out.println( "1. Mostrar almac�n" );
			System.out.println( "2. Mostrar producto" );
			System.out.println( "3. Alta" );
			System.out.println( "4. Baja" );
			System.out.println( "5. Modificaci�n" );
			System.out.println( "6. Entrada de mercanc�a" );
			System.out.println( "7. Salida de mercanc�a" );
			System.out.println( "8. Salir" );
			
			do {
				try {
					System.out.println( "Introduzca una opción" );
					opcion = tecladoInt();
				} catch (Exception e) {
					error = true;
					System.out.println( "ERROR: entrada incorrecta." );
					}
				}while( error );

					//Estructura switch para manejar el men�
				switch( opcion ){
				case 1:
					// Listado
					System.out.println(almacen);
					break;
				case 2:
					//Mostrar producto
					System.out.println( "\n======MOSTRAR PRODUCTO======" );
					
					try {
						System.out.println( "Introduzca el c�digo del producto." );
						codigo = tecladoInt();
						if(almacen.devolverArticulo(codigo ) == null) {
						  System.out.println( "Producto no encontrado." );
						}else {
						  System.out.println( almacen.devolverArticulo( codigo ) );
						}
					} catch ( NumberFormatException e ) {
						System.out.println( "Error en la entrada de datos." );
					} catch (ArrayIndexOutOfBoundsException  i) {
						System.out.println( "ERROR: codigo incorrecto" );
						}
					break;
				case 3:
					// Alta
					System.out.println( "\n======DAR DE ALTA PRODUCTO======" );

					try {
						System.out.println( "Introduzca la descripci�n del producto." );
						d = tecladoString();
					} catch (Exception e) {
						System.out.println( "ERROR: Entrada incorrecta." );
						}
				  				  
					try {
						System.out.println( "Introduzca el precio de compra del producto." );
						pC = tecladoDouble();
					} catch ( Exception e ) {
						System.out.println( "ERROR: Entrada incorrecta." );
						}
				  				  
					try {
						System.out.println( "Introduzca el precio de venta del producto." );
						pV = tecladoDouble();
					} catch (Exception e) {
						System.out.println( "ERROR: Entrada incorrecta." );
						}	  
				  
					try{
						System.out.println( "Introduzca el stock del producto." );
						s = tecladoInt();
					} catch (Exception e ){
						System.out.println( "ERROR: Entrada incorrecta." );
						}
				  
					Producto producto = new Producto( d , pC , pV , s );
					almacen.anadirArticulo(producto);
					System.out.println( "Producto añadido con éxito." );
					break;	
				
				case 4:
					// Baja
					System.out.println( "\n======DAR DE BAJA PRODUCTO======" );
			
					try {
						System.out.println( "Introduzca el c�digo del producto a eliminar." );
						almacen.retirarArticulo(tecladoInt());        
					} catch (Exception e) {
						System.out.println( "ERROR: Entrada incorrecta." );
						}
					break;
				case 5:
					// Modificar
					System.out.println( "\n======MODIFICAR EL PRODUCTO======" );
					
					try {
						System.out.println( "Introduzca el c�digo del producto a modificar" );
						indice = almacen.devolverIndice(tecladoInt());					
 
						System.out.println( "Descripci�n: " + almacen.almacen.get(indice).getDescripcion() );
						System.out.println( "Nueva descripci�n: " );
						almacen.almacen.get(indice).setDescripcion( tecladoString() );
						System.out.println( "Precio de compra: " + almacen.almacen.get(indice).getPrecioCompra() );
						System.out.println( "Nuevo precio de compra: ");
						almacen.almacen.get(indice).setPrecioCompra( tecladoDouble() );
						System.out.println( "Precio de venta: " + almacen.almacen.get(indice).getPrecioVenta() );
						System.out.println( "Nuevo precio de venta: " );
						almacen.almacen.get(indice).setPrecioVenta( tecladoDouble() );
						System.out.println( "Stock: "+almacen.almacen.get(indice).getStock() );
						System.out.println( "Nuevo stock: " );
						almacen.almacen.get(indice).setStock( tecladoInt() );
					}catch (Exception e) {
						System.out.println( "ERROR: entrada incorrecta." );
						}
					break;
					
				case 6:
					// Entrada de mercancia
					System.out.println( "\n======ENTRADA DE MERCANC�A======" );
				  
					try {
						System.out.println( "Introduzca el c�digo del producto" );
						indice = almacen.devolverIndice(tecladoInt());
			  
						System.out.println( "Introduzca la cantidad que desea sumar al stock" );
						almacen.almacen.get(indice).incrementarExistencias(tecladoInt());
						System.out.println( "Stock actualizado" );
					} catch (Exception e) {
						System.out.println( "ERROR: entrada incorrecta." );
						}
					break;
				case 7:
					// Salida de mercancia
					System.out.println( "\n======SALIDA DE MERCANC�A======" );
					
					try {
						System.out.println( "Introduzca el c�digo del producto" );
						indice = almacen.devolverIndice(tecladoInt());
						System.out.println( "Introduzca la cantidad que desea restar al stock" );
						almacen.almacen.get(indice).reducirExistencias(tecladoInt());
						System.out.println( "Stock actualizado" );
					}catch(Exception e) {
						System.out.println( "ERROR: entrada incorrecta." );
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