/**
 * ejercicio1.java
 * Se piden dos n�meros e indica
 * si el primero es mayor que el segundo.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio1{

	public static void main( String[] args ){

		float numero1;
		float numero2;
		String resultado;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca el primer n�mero: " );
		numero1 = teclado.nextFloat();
		System.out.print( "Introduzca el segundo n�mero: " );
		numero2 = teclado.nextFloat();
	
		if( numero1 > numero2 )
			resultado = "";
		else
			resultado = "no ";
	
		System.out.println( "El primer n�mero " + resultado + "es mayor que el segundo. " );
		}
	} // Fin del programa
