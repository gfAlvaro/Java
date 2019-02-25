/**
 * ejercicio8.java
 * Programa que resuelve el siguiente problema:
 * Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
 * el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones
 * por las tres ventas que realiza en el mes y el total que recibirá en el mes
 * tomando en cuenta su sueldo base y comisiones.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio8{

	public static void main( String[] args ){

		double base;
		double comision;
		double dinero;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el sueldo base: " );
		base = teclado.nextDouble();

		comision = ( base / 10 );
		dinero = base + comision * 3;

		System.out.println( " El trabajador gana " + comision*3 + " en comisiones" );
		System.out.println( " El trabajador gana " + dinero + " en total" );
		}
	} // Fin del programa
