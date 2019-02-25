/**
 * ejercicio16.java
 * Programa que resuelve el siguiente problema:
 *	Dos vehículos viajan a diferentes velocidades (v1 y v2)
 * y están distanciados por una distancia d. El que está detrás viaja a una velocidad mayor.
 *	Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km)
 * y sus respectivas velocidades (km/h) y con esto determinar
 * y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio16{

	public static void main( String[] args ){

		double v1;
		double v2;
		double distancia;
		double minutos;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca v1: " );
		v1 = teclado.nextInt();
		System.out.print( "Introduzca v2: " );
		v2 = teclado.nextInt();
		System.out.print( "Introduzca la distancia: " );
		distancia = teclado.nextInt();

		minutos = (  distancia / Math.abs( v2 - v1 )  ) * 60;

		System.out.println( "El coche más rápido adelantará al primero en " + minutos + " minutos" );
		}
	} // Fin del programa
