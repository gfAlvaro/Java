/**
 * ejercicio3.java
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 * @author Álvaro García Fuentes
 */
package basico;
 
import java.util.Scanner;
import java.lang.Math;

public class ejercicio3{

	public static void main( String[] args ){

		Scanner teclado = new Scanner( System.in );

		double cateto1;
		double cateto2;
		double hipotenusa;

		System.out.print( "Introduzca el valor del primer cateto: " );
		cateto1 = teclado.nextDouble();
		System.out.print( "Introduzca el valor del segundo cateto: " );
		cateto2 = teclado.nextDouble();

		hipotenusa = Math.sqrt(  Math.pow( cateto1, 2 ) + Math.pow( cateto2, 2 )  );

		System.out.println( "La hipotenusa es: " + hipotenusa );
		}
	} // Fin del programa
