/** ejercicio 11
 * Pide al usuario dos números y muestra la "distancia" entre ellos
 * (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo)
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio11{

	public static void main( String[] args ){

		double numero1;
		double numero2;
		double distancia;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el primer numero: " );
		numero1 = teclado.nextDouble();
		System.out.print( "Introduzca el segundo numero: " );
		numero2 = teclado.nextDouble();

		distancia = Math.abs( numero1 - numero2 );

		System.out.println( "La distancia es: " + distancia );
		}
	} // Fin del programa
