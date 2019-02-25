/**
 * ejercicio7.java
 * programa que recibe una cantidad de minutos
 * y muestra por pantalla a cuantas horas y minutos corresponde.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio7{

	public static void main( String[] args ){

		double entrada;
		double horas;
		double minutos;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca los minutos: " );
		entrada = teclado.nextDouble();
	
		horas = Math.floor( entrada / 60 );
		minutos = entrada % 60;

		System.out.println( horas + " horas, " + minutos + " minutos." );
		}
	 } // Fin del programa
