/**
 * Ejercicio 1
 * Menú para trabajar con fechas
 * @author Alvaro Garcia Fuentes
 */

import funciones1.funciones1;

public class ejercicio1{
	
	public static void main( String[] args ){
		
		int opcion;
		int[] fecha = new int[3];
		int[] fechaN = new int[3];
		int nDias;
		
		do {
			funciones1.mostrarMenu();

			System.out.print( "Introduzca la opción deseada: " );
			opcion = funciones1.tecladoEntero();
			
			if(  opcion != 0  )
				switch( opcion ) {
					case 1:
						fecha = funciones1.fechaTeclado();
						break;
					case 2:
						do {
							System.out.print( "Introduzca el numero de dias a sumar(positivo): " );
							nDias = funciones1.tecladoEntero();
							}while( nDias < 0 );
						fecha = funciones1.sumaDias( fecha, nDias );
						break;
					case 3:
						do {
							System.out.print( "Introduzca el numero de dias a sumar(negativo): " );
							nDias = funciones1.tecladoEntero();
							}while( nDias > 0 );
						fecha = funciones1.sumaDias( fecha, nDias );
						break;
					case 4:
						System.out.println( "Introduzca una nueva fecha para comparar:" );
						fechaN = funciones1.fechaTeclado();
						funciones1.comparaFecha( fecha, fechaN );
						break;
					case 5:
						funciones1.mostrarFecha( fecha );
						break;
					default:
						System.out.println( "Opcion incorrecta" );
					}	
				
			}while( opcion != 0 );
		}
	}