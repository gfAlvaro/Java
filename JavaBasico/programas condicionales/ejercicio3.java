/**
 * ejercicio3.java
 * Lee un n�mero e indica si es par o impar.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio3{

	public static void main( String[] args ){
	
		int num;
		String resultado;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el n�mero: " );
		num = teclado.nextInt();
	
		if(  ( num % 2 ) == 0  )
			resultado = "par";
		else
			resultado = "impar";

		System.out.println( "El n�mero es " + resultado + "." );
		}
	} // Fin del programa
