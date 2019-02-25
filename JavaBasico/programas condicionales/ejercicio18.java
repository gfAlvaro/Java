/**
 * ejercicio18.java
 * Se pide el día de la semana (del 1 al 7)
 * y escribe el día correspondiente.
 * Si introducimos otro número nos da un error.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio18{

	public static void main( String[] args ){	

		int numeroDia;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca el número del día: " );
		numeroDia = teclado.nextInt();
	
		switch( numeroDia ){
			case 1:
				System.out.println( "Lunes." );
				break;
			case 2:
				System.out.println( "Martes." );
				break;
			case 3:
				System.out.println( "Miércoles." );
				break;
			case 4:
				System.out.println( "Jueves." );
				break;
			case 5:
				System.out.println( "Viernes." );
				break;
			case 6:
				System.out.println( "Sábado." );
				break;
			case 7:
				System.out.println( "Domingo." );
				break;
			default:
				System.out.println( "ERROR: día incorrecto" );
			}
		}
	} // Fin del programa
