/**
 * ejercicio2.java
 * Programa para calcular el área y perimetro de un rectángulo dadas su base y su altura.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio2{

	public static void main( String[] args ){
	
		float base;
		float altura;
		float area;
		float perimetro;

		Scanner teclado = new Scanner( System.in );
    
		System.out.print( "Introduzca la base: " );
		base = teclado.nextFloat();
		System.out.print( "Introduzca la altura: " );
		altura = teclado.nextFloat();
	
		area = base * altura;
		perimetro = 2 * ( base + altura );
	
		System.out.println( "El area del rectangulo es: " + area );
		System.out.println( "El perimetro del rectangulo es: " + perimetro );
		}
	} // Fin del programa

