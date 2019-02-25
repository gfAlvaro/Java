/**
 * ejercicio4.java
 * Programa que pide al usuario dos n�meros
 * y muestra su divisi�n si el segundo no es cero,
 * o un mensaje de aviso en caso contrario.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio4{

	public static void main( String[] args ){
	
		int numero1;
		int numero2;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el primer n�mero: " );
		numero1 = teclado.nextInt();
	
		System.out.print( "Introduzca el segundo n�mero: " );
		numero2 = teclado.nextInt();
	
		if( numero2 == 0 )
			System.out.println( "ERROR: divisi�n por cero." );
		else
			System.out.println( numero1 + "/" + numero2 + "=" + numero1/numero2 );
		}
	} // Fin del programa
