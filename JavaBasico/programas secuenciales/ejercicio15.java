/**
 * ejercicio15.java
 * Dadas dos variables numéricas A y B, que el usuario debe teclear,
 * el programa intercambia los valores de ambas variables
 * y muestra cuanto valen al final las dos variables.
 * @author Álvaro García Fuentes
 */
package basico;
 
import java.util.Scanner;

public class ejercicio15{

	public static void main( String[] args ){

		int A;
		int B;
		int aux;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca la variable A: " );
		A = teclado.nextInt();
		System.out.print( "Introduzca la variable B: " );
		B = teclado.nextInt();
	
		aux = A;
		A = B;
		B = aux;

		System.out.println( "A = " + A );
		System.out.println( "B = " + B );
		}
	} // Fin del programa
