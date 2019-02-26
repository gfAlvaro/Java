/**
 * ejercicio6.java
 * Programa que dados dos números, uno real (base) y un entero positivo (exponente),
 * saca por pantalla el resultado de la potencia. Sin utilizar el operador de potencia.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio6{

	public static void main( String[] args ){
		
		float base , potencia = 1;
		int exponente;		
		Scanner teclado = new Scanner( System.in );
		
		// Pedir base y exponente por teclado
		System.out.print( "Introduzca la base: " );
		base = teclado.nextFloat();
		System.out.print( "Introduzca el exponente: " );
		exponente = teclado.nextInt();		

		// Calcular la potencia
		for( int i = 0 ; i < exponente ; i++ )
			potencia = potencia * base;		
		
		// Mostrar el resultado
		System.out.println( " El valor de " + base + "^" + exponente + " es: " + potencia );
		}
	} // Fin del programa
