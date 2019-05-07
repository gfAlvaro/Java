/**
 * menuVehiculos.java
 * @author Álvaro Garía Fuentes
 */
package vehiculos;

import java.util.Scanner;

public class menuVehiculos{
	
	/**
	 * Función para mostrar un menú en pantalla.
	 */
	public static void mostrarMenu(){
		System.out.println( "VEHÍCULOS" );
		System.out.println( "=========" );
		System.out.println( "1. Anda con la bicicleta" );
		System.out.println( "2. Haz el caballito con la bicicleta" );
		System.out.println( "3. Anda con el coche" );
		System.out.println( "4. Quema rueda con el coche" );
		System.out.println( "5. Ver kilometraje de la bicicleta" );
		System.out.println( "6. Ver kilometraje del coche" );
		System.out.println( "7. Ver kilometraje total" );
		System.out.println( "8. Salir" );
		System.out.print( "Elige una opción (1-8): " );
		}
	
	/**
	 * Funcion para recoger la entrada por teclado
	 */
	public static int pedirOpcion(){
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );
		
		return teclado.nextInt();
		}
	
	/**
	 * Programa principal de menuVehiculos
	 * @param args
	 */
	public static void main( String[] args ){
		
		int opcion;
		boolean salir = false;
		Bicicleta bici = new Bicicleta();
		Coche cochazo = new Coche();
		
		do{
			mostrarMenu();
			opcion = pedirOpcion();
			switch( opcion ){
				case 1:
					bici.andar();
					break;
				case 2:
					bici.caballito();
					break;
				case 3:
					cochazo.andar();
					break;
				case 4:
					cochazo.quemaRueda();
					break;
				case 5:
					System.out.println( bici.kilometrosRecorridos() );
					break;
				case 6:
					System.out.println( cochazo.kilometrosRecorridos() );
					break;
				case 7:
					System.out.println( Vehiculo.kilometrosTotales() );
					break;
				case 8:
					salir = true;
					System.out.println( "Saliendo..." );
					break;
				default:
					System.out.println( "Opción Incorrecta." );
				}
			System.out.println();
			}while( !salir );
		
		}
	
	} // Fin del programa

