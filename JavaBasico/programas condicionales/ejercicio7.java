/**
 * ejercicio7.java
 * Algoritmo que calcula la potencia,
 * para ello se pide por teclado la base y el exponente.
 * Pueden ocurrir tres cosas:
 * - El exponente sea positivo, s�lo tienes que imprimir la potencia.
 * - El exponente sea 0, el resultado es 1.
 * - El exponente sea negativo, el resultado es 1/potencia
 *   con el exponente positivo.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio7{

	public static void main( String[] args ){

		float base;
		float exponente;
		double potencia;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca la base: " );
		base = teclado.nextFloat();
		System.out.print( "Introduzca el exponente: " );
		exponente = teclado.nextFloat();

		/* En PseInt hab�a que poner condicionales seg�n el exponente,
		pero el m�todo Math.pow de Java puede manejar todos los casos correctamente
		de modo que no son necesarios los condicionales */
		potencia = Math.pow( base, exponente );

		System.out.println( base + "^" + exponente + " = " + potencia );	
		}
	} // fin del programa
