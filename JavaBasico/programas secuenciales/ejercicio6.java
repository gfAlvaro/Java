/**
 * ejercicio6.java
 * Programa para calcular la media de tres números pedidos por teclado.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio6{

	public static void main( String[] args ){	

		Scanner teclado = new Scanner(System.in);
		double numero1;
		double numero2;
		double numero3;
		double media;

		System.out.print( "Introduzca el primer número: " );
		numero1 = teclado.nextDouble();
		System.out.print( "Introduzca el segundo número: " );
		numero2 = teclado.nextDouble();
		System.out.print( "Introduzca el tercer número: " );
		numero3 = teclado.nextDouble();
	
		media = ( numero1 + numero2 + numero3 ) / 3;
	
		System.out.println( "La media es: " + media);
		}
	} // Fin del programa
