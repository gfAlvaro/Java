/**
 * ejercicio11.java
 * Se leen 3 datos de entrada A, B y C.
 * Estos corresponden a las dimensiones de los lados de un triángulo.
 * El programa determina que tipo de triangulo es,
 * teniendo en cuenta los siguiente:
 * - Si se cumple Pitágoras entonces es triángulo rectángulo
 * - Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * - Si los 3 lados son iguales entonces es equilátero.
 * - Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio11{

	public static void main( String[] args ){

		float A;
		float B;
		float C;
		String triangulo;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el lado A: " );
		A = teclado.nextFloat();
		System.out.print( "Introduzca el lado B: " );
		B = teclado.nextFloat();
		System.out.print( "Introduzca el lado C: " );
		C = teclado.nextFloat();

		// Pitagoras
		if(  ( A == Math.sqrt( B*B + C*C ) )
		  || ( B == Math.sqrt( A*A + C*C ) )
		  || ( C == Math.sqrt( A*A + B*B ) )  )
			triangulo = "rectángulo";

		// Dos lados iguales pero no los tres
		else if(  ( ( A==B ) && ( A!=C ) )
			   || ( ( A==C ) && ( A!=B ) )
			   || ( ( B==C ) && ( A!=C ) )  )
			triangulo = "isósceles";

		// Tres lados iguales 
		else if(  ( A==B ) && ( A==C ) && ( B==C )  )
			triangulo = "equilátero";

		// No se cumple ninguna de las otras condiciones
		else
			triangulo = "escaleno";
    
		System.out.print( "Es un triángulo " + triangulo + "." );
		}
	} // Fin del programa
