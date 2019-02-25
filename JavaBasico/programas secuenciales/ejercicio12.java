/**
 * ejercicio12.java
 *	Pide al usuario dos pares de números x1,y2 y x2,y2,
 * que representen dos puntos en el plano.
 *	Calcula y muestra la distancia entre ellos.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio12{

	public static void main( String[] args ){

		double x1;
		double y1;
		double x2;
		double y2;
		double distancia;
		Scanner teclado = new Scanner( System.in );

		System.out.println( "Introduzca el primer punto: " );
		System.out.print( " Coordenada x: " );
		x1 = teclado.nextDouble();
		System.out.print( " Coordenada y: " );
		y1 = teclado.nextDouble();

		System.out.println( "Introduzca el segundo punto: " );
		System.out.print( " Coordenada x: " );
		x2 = teclado.nextDouble();
		System.out.print( " Coordenada y: " );
		y2 = teclado.nextDouble();

		distancia = Math.sqrt(  Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 )  );

		System.out.println( "La distancia es: " + distancia );
		}
	} // Fin del programa
