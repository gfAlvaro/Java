/**
 * ejercicio19.java
 * Escribir un algoritmo para calcular la nota final de un estudiante,
 * considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1
 * y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio19{

	public static void main( String[] args ){

		int correctas;
		int incorrectas;
		int enBlanco;
		int nota;
		int preguntas;

		Scanner teclado = new Scanner( System.in );

		System.out.print( "Número de respuestas correctas: " );
		correctas = teclado.nextInt();
		System.out.print( "Número de respuestas incorrectas: " );
		incorrectas = teclado.nextInt();
		System.out.print( "Número de respuestas en blanco: " );
		enBlanco = teclado.nextInt();

		nota = 5*correctas - incorrectas + 0*enBlanco;
		preguntas = correctas + incorrectas + enBlanco;

		System.out.println(  "El resultado obtenido es " + nota + "/" + ( 5*preguntas )  );
		}
	} // Fin del programa
