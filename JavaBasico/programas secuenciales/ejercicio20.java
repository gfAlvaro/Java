/**
 * ejercicio20.java
 * Programa que nos dice el dinero que tenemos (en euros y céntimos)
 * después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos.
 * @author Álvaro García Fuentes
 */
package basico;
 
import java.util.Scanner;

public class ejercicio20{

	public static void main( String[] args ){

		int monedas2;
		int monedas1;
		int monedas050;
		int monedas020;
		int monedas010;
		double dinero;

		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el número de monedas de 2 euros " );
		monedas2 = teclado.nextInt();
		System.out.print( "Introduzca el número de monedas de 1 euro " );
		monedas1 = teclado.nextInt();
		System.out.print( "Introduzca el número de monedas de 0.50 euros " );
		monedas050 = teclado.nextInt();
		System.out.print( "Introduzca el número de monedas de 0.20 euros " );
		monedas020 = teclado.nextInt();
		System.out.print( "Introduzca el número de monedas de 0.10 euros " );
		monedas010 = teclado.nextInt();

		dinero = 2*monedas2 + 1*monedas1 + 0.5*monedas050 + 0.2*monedas020 + 0.10*monedas010;

		System.out.println( "La cantidad de dinero que tenemos es de " + dinero + " euros." );
		}
	} // Fin del programa


