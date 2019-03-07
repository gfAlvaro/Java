/**
 * pruebaProducto.java
 * Programa para gestionar un almacén
 * usando la clase Producto definida en el fichero Producto.java
 * @author Álvaro García Fuentes
 * @author Rafael Jesús Nieto Cardador
 */
package gestimal;

import java.util.Scanner;

public class pruebaProducto {

	//N determina la longitud del array
	static int N = 100;
  
	//Funci�n para leer una cadena por teclado
	public static double tecladoDouble(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextDouble();
		}
  
	//Funci�n para leer un entero por teclado
	public static int tecladoInt(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextInt();
		}
  
	//Funci�n para leer una cadena por teclado
	public static String tecladoString(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextLine();
		}
  
	//Funci�n que devuelve false si se encuentra una instancia de la cadena "codigo" en el resto de c�digos del almac�n
	public static boolean verificaCodigo( String codigo , Producto[] almacen ){
		//Bucle for para recorrer el array
		for( int i = 0 ; i < almacen.length ; i++ )
			//Estructura if para retornar "false" si se encuentra un c�digo igual al de "codigo"
			if(( almacen[i].getCodigo() ).equals( codigo )  )
				return false;
		//Retorna true si no se encuentra nada
		return true;
		}
   
	public static void main( String[] args ) {
     
		//Crea el array de productos
		Producto[] almacen = new Producto[N];
     
		// Crea todos los productos que van en cada una de las celdas del array
		for( int i = 0 ; i < N ; i++ )
			almacen[i] = new Producto();
   
		int opcion;
		boolean error = false;
		int primeraLibre;
		String recogeDatosCadena;
		int recogeDatosInt;
		int elem;
		int k;

		//Men�
		//Bucle do while para que se muestre el men� continuamente hasta que se escoja la opci�n "salir"
		do {
			System.out.println("======ALMAC�N======");
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificaci�n");
			System.out.println("5. Entrada de mercanc�a");
			System.out.println("6. Salida de mercanc�a");
			System.out.println("7. Salir");
			System.out.println("Introduzca una opci�n");
			opcion = tecladoInt();
       
			//Estructura switch para manejar el men�
			switch( opcion ){
				case 1:
					// Listado
					//Bucle for para recorrer el array
					for( int i = 0 ; i < almacen.length ; i++ )
						//Estructura if para mostrar los productos introducidos por el usuario
						if( almacen[i].getCodigo() != "LIBRE" )
							System.out.println(almacen[i]);
					break;
           
				case 2:
					// Alta
					error = false;
					primeraLibre = -1;
					//Bucle do while para buscar la primera posici�n libre del array
					do{
						primeraLibre++;
						// Si se sobrepasa el m�ximo de productos, se impide crear m�s.
						if( error = primeraLibre >= N ){
							System.out.println("Almac�n lleno. De de baja alg�n producto para dar de alta a otro.");
							break;
							}
						}while(  !almacen[primeraLibre].getCodigo().equals( "LIBRE" )  );
           
					if( !error ){
						System.out.println( "\n======NUEVO PRODUCTO======" );             
						System.out.println( "Por favor, introduzca los datos del producto." );  
             
						error = false;
						//Bucle do while para evitar que se introduczca un codigo ya existente
						do{
							if(error)
								System.out.println( "ERROR: C�digo ya existente." );
							System.out.print( "C�digo: " );
							recogeDatosCadena = tecladoString();
							}while(  error = !verificaCodigo( recogeDatosCadena , almacen )  );
             
						almacen[primeraLibre].setCodigo( recogeDatosCadena );
             
						System.out.print( "Descripci�n: " );
						recogeDatosCadena = tecladoString();
						almacen[primeraLibre].setDescripcion( recogeDatosCadena );
             
						System.out.print( "Precio de compra: " );
						recogeDatosInt = tecladoInt();
						almacen[primeraLibre].setPrecioCompra( recogeDatosInt );
             
						System.out.print( "Precio de venta: " );
						recogeDatosInt = tecladoInt();
						almacen[primeraLibre].setPrecioVenta( recogeDatosInt );
             
						System.out.print( "Stock: " );
						recogeDatosInt = tecladoInt();
						almacen[primeraLibre].setStock( recogeDatosInt );
						}
					break;

				case 3:
					// Baja
					error = true;
					System.out.println( "\n======DAR DE BAJA PRODUCTO======" );
					System.out.print( "Por favor, introduzca el c�digo del producto que desea eliminar: " );
					recogeDatosCadena = tecladoString();
					//Bucle for para recorrer el array
					for(int i = 0 ; i < N ; i++ )
						if(  ( almacen[i].getCodigo() ).equals( recogeDatosCadena )  ){
							error = false;
							almacen[i].setCodigo( "LIBRE" );
							System.out.println( "Producto eliminado." );
							break;
							}
					
					if( error )
						System.out.println( "No existe ning�n producto con ese c�digo." ); 
					break;

				case 4:
					// Modificar
					System.out.println( "Introduzca el código del elemento a modificar" );
					recogeDatosCadena = tecladoString();

					for( k = 0 ; almacen[k].getCodigo() == recogeDatosCadena ; k++ ){}
 
					do {
						System.out.println( "Elija qué elemento desea modificar:" );
						System.out.println( " 1 para la descripcion." );
						System.out.println( " 2 para el precio de compra." );
						System.out.println( " 3 para el precio de venta." );
						System.out.println( " 4 para el stock" );
						System.out.println( " 5 para salir." );
						elem = tecladoInt();
        	 
						switch( elem ){
							case 1:
								System.out.print( "Introduzca nueva descripcion: " );
								almacen[k].setDescripcion( tecladoString() );
								System.out.println();
								break;
							case 2:
								System.out.print( "Introduzca nuevo precio de compra: " );
								almacen[k].setPrecioCompra( tecladoDouble() );
								System.out.println();
								break;
							case 3:
								System.out.print( "Introduzca nuevo precio de venta: " );
								almacen[k].setPrecioVenta( tecladoDouble() );
								System.out.println();
								break;
							case 4:
								System.out.print( "Introduzca nuevo stock: " );
								almacen[k].setStock( tecladoInt() );
								System.out.println();
								break;
							case 5:
								System.out.println( "Saliendo..." );
								break;
							default:
								System.out.println( "Opción incorrecta" );
							}
						}while( elem != 5 );
					break;

				case 5:
					// Entrada de mercancia
					error = true;
					System.out.println( "\n======ENTRADA DE MERCANC�A======" );
					System.out.print( "Por favor, introduzca el c�digo del producto del que desea aumentar el stock: " );
					recogeDatosCadena = tecladoString();
					//Bucle for para recorrer el array
					for( int i = 0 ; i < N ; i++ )
						if(  ( almacen[i].getCodigo() ).equals( recogeDatosCadena )  ){
							error = false;
							do{
								if( error )
									System.out.println( "ERROR: Valor de stock no v�lido, debe ser mayor al anterior." );
								System.out.println( "�Cu�l ser� el nuevo stock?" );
								System.out.println( "Stock actual - "+almacen[i].getStock() );
								recogeDatosInt = tecladoInt();
								}while( recogeDatosInt < almacen[i].getStock() );
							error = false;
							almacen[i].setStock( recogeDatosInt );
							System.out.println( "Stock actualizado." );
							break;
							}

					if( error )
						System.out.println( "No existe ning�n producto con ese c�digo." );
           
					break;
           
				case 6:
					error = true;
					System.out.println( "\n======Salida DE MERCANC�A======" );
					System.out.print( "Por favor, introduzca el c�digo del producto del que desea reducir el stock: " );
					recogeDatosCadena = tecladoString();
					//Bucle for para recorrer el array
					for( int i = 0 ; i < N ; i++ )
						if(  ( almacen[i].getCodigo() ).equals( recogeDatosCadena )  ){
							error = false;
							do{
								if( error )
									System.out.println( "ERROR: Valor de stock no v�lido, debe ser menor al anterior." );
								System.out.println( "�Cu�l ser� el nuevo stock?" );
								System.out.println( "Stock actual - " + almacen[i].getStock() );
								recogeDatosInt = tecladoInt();
								}while( recogeDatosInt > almacen[i].getStock() );
               
							error = false;
							almacen[i].setStock( recogeDatosInt );
							System.out.println( "Stock actualizado." );
							break;
							}
           
					if( error )
						System.out.println( "No existe ning�n producto con ese c�digo." );

					break;

				case 7:
					// Salir
					System.out.println( "Saliendo..." );
					break;
				default:
					System.out.println( "Opción incorrecta" );
				}
			}while( opcion != 7 );
		}
	
	} // Fin del programa
