/**
 * fechas.java
 * funciones para usar en en el fichero pruebaFechas.java
 * 
 * @author Álvaro García Fuentes
 */
package fechas;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
public class fechas{
	
	/**
	 * Funcion para mostrar por pantalla las opciones
	 * disponibles en el menu
	 */
	public static void mostrarMenu(){
		System.out.println( "******Menú******" );
		System.out.println( "****************" );
		System.out.println( "1 para introducir una fecha." );
		System.out.println( "2 para sumar días a la fecha." );
		System.out.println( "3 para restar días a la fecha." );
		System.out.println( "4 para comparar la fecha introducida con otra." );
		System.out.println( "5 para mostrar fecha." );
		System.out.println( "0 para terminar." );
		System.out.println( "****************" );
		}
	
	/**
	 * Funcion para leer un entero desde teclado
	 * mediante el uso de la clase Scanner de java.util
	 * @return int
	 */
	public static int tecladoEntero(){		
		@SuppressWarnings( "resource" )
		Scanner teclado = new Scanner( System.in );
		return teclado.nextInt();
		}
	
	/**
	 * Función para validar una fecha
	 * pasada como un array dinámico
	 * @param fecha
	 * @return boolean
	 * @see fechaTeclado()
	 */
	public static boolean validarFecha( ArrayList<Integer> fecha ){

		boolean valida;
		
		if(  ( fecha.get(0) < 1 ) || ( fecha.get(1) < 1 ) || ( fecha.get(2) < 1 )  )
			valida = false;
		else
			switch( fecha.get(1) ){		
				case 2:
					// Comprobar Febrero
					valida = ( ( fecha.get(0) == 29 )
								&& ( ( fecha.get(2) % 4 ) == 0 )
								&& ( ( fecha.get(2) % 100 ) != 0 ) )
							|| ( fecha.get(0) <= 28 );
					break;				
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					// Comprobar meses de 31 días
					valida = fecha.get(0) <= 31;
					break;				
				case 4: case 6: case 9: case 11:
					// Comprobar meses de 30 días
					valida = fecha.get(0) <= 30;
					break;				
				default:
					valida = false;
				}
		
		return valida;
		}
	
	/**
	 * Función para leer una fecha desde teclado
	 * con validación
	 * @return Date
	 * @see validarFecha()
	 */
	public static Date fechaTeclado(){

		ArrayList<Integer> fech = new ArrayList<Integer>();
		boolean noValida = false;
		Date fecha = new Date(0);
		long dias = 0;

		do{
			System.out.print( "Introduzca dia: " );
			fech.add( tecladoEntero() );		
			System.out.print( "Introduzca mes: " );
			fech.add( tecladoEntero() );
			System.out.print( "Introduzca año: " );
			fech.add( tecladoEntero() );

			noValida = !validarFecha( fech );

			}while( noValida );
		
System.out.println( "DEBUG: Fecha antes: " + fech.get(0) + " " + fech.get(1) + " " + fech.get(2) );

		for( int i = 1 ; i < fech.get(1) ; i++ )
			switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					dias = dias + 31;
					break;
				case 4: case 6: case 9: case 11:
					dias = dias + 30;
					break;
				case 2:
					if(  ( fech.get(2) % 4 == 0 ) && ( fech.get(2) % 100 != 0 )  )
						dias = dias + 29;
					else
						dias = dias + 28;
				}
		dias = dias + fech.get(0);
		
long restaAnyos = fech.get(2) - 1970;
long tim = dias*24*3600*1000
			+ restaAnyos*365*24*3600*1000;

System.out.println( "DEBUG: milisegundos: " + tim );

		fecha.setTime( tim );
		
		return fecha;
		}
		
	} // Fin de las funciones

