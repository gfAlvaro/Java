/**
 * ejercicio16.java
 * Programa que resuelve el siguiente problema:
 *	Dos veh�culos viajan a diferentes velocidades (v1 y v2)
 * y est�n distanciados por una distancia d. El que est� detr�s viaja a una velocidad mayor.
 *	Se pide hacer un algoritmo para ingresar la distancia entre los dos veh�culos (km)
 * y sus respectivas velocidades (km/h) y con esto determinar
 * y mostrar en que tiempo (minutos) alcanzar� el veh�culo m�s r�pido al otro.
 * @author �lvaro Garc�a Fuentes
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

		System.out.println( "El coche m�s r�pido adelantar� al primero en " + minutos + " minutos" );
		}
	} // Fin del programa
