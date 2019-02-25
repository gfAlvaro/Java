/**
 * ejercicio10.java
 * Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
 * Dicha calificación se compone de los siguientes porcentajes:
 * - 55% del promedio de sus tres calificaciones parciales.
 * - 30% de la calificación del examen final.
 * - 15% de la calificación de un trabajo final.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio10{

	public static void main( String[] args ){

		double parcial1;
		double parcial2;
		double parcial3;
		double examen;
		double trabajo;
		double notaFinal;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca la nota del primer parcial: " );
		parcial1 = teclado.nextDouble();
		System.out.print( "Introduzca la nota del segundo parcial: " );
		parcial2 = teclado.nextDouble();
		System.out.print( "Introduzca la nota del tercer parcial: " );
		parcial3 = teclado.nextDouble();
		System.out.print( "Introduzca la nota del examen: " );
		examen = teclado.nextDouble();
		System.out.print( "Introduzca la nota del trabajo: " );
		trabajo = teclado.nextDouble();

		notaFinal = 0.55*( parcial1 + parcial2 + parcial3 )/3 + 0.3*examen + 0.15*trabajo;
	
		System.out.println( "La nota final es " + notaFinal );
		}
	} // Fin del programa
