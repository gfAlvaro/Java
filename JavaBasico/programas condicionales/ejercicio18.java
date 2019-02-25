/**
 * ejercicio18.java
 * Se pide el d�a de la semana (del 1 al 7)
 * y escribe el d�a correspondiente.
 * Si introducimos otro n�mero nos da un error.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio18{

	public static void main( String[] args ){	

		int numeroDia;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca el n�mero del d�a: " );
		numeroDia = teclado.nextInt();
	
		switch( numeroDia ){
			case 1:
				System.out.println( "Lunes." );
				break;
			case 2:
				System.out.println( "Martes." );
				break;
			case 3:
				System.out.println( "Mi�rcoles." );
				break;
			case 4:
				System.out.println( "Jueves." );
				break;
			case 5:
				System.out.println( "Viernes." );
				break;
			case 6:
				System.out.println( "S�bado." );
				break;
			case 7:
				System.out.println( "Domingo." );
				break;
			default:
				System.out.println( "ERROR: d�a incorrecto" );
			}
		}
	} // Fin del programa
