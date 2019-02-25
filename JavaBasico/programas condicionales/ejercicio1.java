/**
 * ejercicio1.java
 * Se piden dos números e indica
 * si el primero es mayor que el segundo.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio1{

	public static void main( String[] args ){

		float numero1;
		float numero2;
		String resultado;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca el primer número: " );
		numero1 = teclado.nextFloat();
		System.out.print( "Introduzca el segundo número: " );
		numero2 = teclado.nextFloat();
	
		if( numero1 > numero2 )
			resultado = "";
		else
			resultado = "no ";
	
		System.out.println( "El primer número " + resultado + "es mayor que el segundo. " );
		}
	} // Fin del programa
