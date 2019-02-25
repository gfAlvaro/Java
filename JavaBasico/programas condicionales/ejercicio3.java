/**
 * ejercicio3.java
 * Lee un número e indica si es par o impar.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio3{

	public static void main( String[] args ){
	
		int num;
		String resultado;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el número: " );
		num = teclado.nextInt();
	
		if(  ( num % 2 ) == 0  )
			resultado = "par";
		else
			resultado = "impar";

		System.out.println( "El número es " + resultado + "." );
		}
	} // Fin del programa
