/**
 * ejercicio19.java
 * Se pide un número entero entre uno y doce
 * e imprime el número de días que tiene el mes correspondiente.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio19{
	
	public static void main( String[] args ){

		int numeroMes;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el número del mes: " );
		numeroMes = teclado.nextInt();
	
		switch( numeroMes ){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println( "Tiene 31 días" );
				break;
			case 4: case 6: case 9: case 11:
				System.out.println( "Tiene 30 días" );
				break;
			case 2:
				System.out.println( "Tiene 28 días o 29 si es año bisiesto" );
				break;
			default:
				System.out.println( "ERROR: Número incorrecto." );
			}
		}
	} // Fin del programa
