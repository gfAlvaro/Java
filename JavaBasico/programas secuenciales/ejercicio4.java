/**
 * ejercicio4.java
 * Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio4{

	public static void main( String[] args ){

		Scanner teclado = new Scanner(System.in);
		double numero1;
		double numero2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
	
		System.out.print( "Introduzca el primer numero: " );
		numero1 = teclado.nextDouble();
		System.out.print( "Introduzca el segundo numero: " );
		numero2 = teclado.nextDouble();

		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2;
	
		System.out.println( "Suma: " + suma );
		System.out.println( "Resta: " + resta );
		System.out.println( "Multiplicacion: " + multiplicacion );
		System.out.println( "Division: " + division );
		}
	} // Fin del programa
