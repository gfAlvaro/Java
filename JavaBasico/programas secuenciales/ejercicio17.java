/**
 * ejercicio17.java
 * Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
 * El tiempo de viaje hasta llegar a otra ciudad B es de T segundos.
 * Escribir un algoritmo que determine la hora de llegada a la ciudad B.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio17{

	public static void main( String[] args ){
  
		int HH;
		int MM;
		int SS;
		int tiempo;
		int tiempoViaje;

		Scanner teclado = new Scanner( System.in );

		System.out.println( "Introduzca hora de salida: " );
		System.out.print( " horas: " );
		HH = teclado.nextInt();
		System.out.print( " minutos: " );
		MM = teclado.nextInt();
		System.out.print( " segundos: " );
		SS = teclado.nextInt();
		System.out.print( "Introduzca el tiempo de viaje en segundos: " );
		tiempoViaje = teclado.nextInt();

		tiempo = HH * 3600 + MM * 60 + SS + tiempoViaje;

		HH = (int) Math.floor( Math.floor( tiempo / 60 ) / 60 ) % 24;
		MM = (int) Math.floor( tiempo / 60 ) % 60;
		SS = tiempo % 60;

		System.out.println( "El ciclista llegará a las " + HH + " horas, " + MM + " minutos y " + SS + " segundos" );
		}
	} // Fin del programa
