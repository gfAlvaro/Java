/**
 * pruebaFechas.java
 * Menú para trabajar con fechas
 * usando la clase predefinida Date del paquete java.util
 * @author Alvaro Garcia Fuentes
 */
package fechas;

import java.util.Date;

public class pruebaFechas{
	
	public static void main( String[] args ){
		
		int opcion;
		Date fecha = new Date(0);
		Date fechaN = new Date(0);
		int nDias;
		
		do {
			fechas.mostrarMenu();

			System.out.print( "Introduzca la opción deseada: " );
			opcion = fechas.tecladoEntero();
			
			if(  opcion != 0  )
				switch( opcion ) {
					case 1:
						fecha = fechas.fechaTeclado();
						break;
					case 2:
						do {
							System.out.print( "Introduzca el numero de dias a sumar(positivo): " );
							nDias = fechas.tecladoEntero();
							}while( nDias < 0 );
						fecha.setTime( fecha.getTime() + nDias*24*3600*1000 );
						break;
					case 3:
						do {
							System.out.print( "Introduzca el numero de dias a restar: " );
							nDias = fechas.tecladoEntero();
							}while( nDias > 0 );
						fecha.setTime( fecha.getTime() - nDias*24*3600*1000 );
						break;
					case 4:
						System.out.println( "Introduzca una nueva fecha para comparar:" );
						fechaN = fechas.fechaTeclado();
						if(  fecha.after( fechaN )  )
							System.out.print( "La nueva fecha es anterior" );
						else if(  fecha.before( fechaN )  )
							System.out.print( "La nueva fecha es posterior" );
						else
							System.out.print( "Las fechas son iguales" );
						
						break;
					case 5:
						System.out.println( fecha );
						break;
					default:
						System.out.println( "Opcion incorrecta" );
					}	
				
			}while( opcion != 0 );
		}
	} // Fin del programa