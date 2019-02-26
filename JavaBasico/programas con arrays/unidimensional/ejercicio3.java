/**
 * ejercicio3.java
 * Programa que lee 10 números por teclado y que luego los muestra
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio3{
	
	public static void main( String[] args ){
		
		Scanner teclado = new Scanner( System.in );
		float[] numeros;
		numeros = new float[10];
		
		for( int i = 0 ; i < 10 ; i++ ){
			System.out.print( "Introduzca el " + (i+1) + "er numero: " );
			numeros[i] = teclado.nextFloat();
			}
		
		for( int i = 9 ; i >= 0 ; i-- )
			System.out.print( " " + numeros[i] );		
		}
	} // Fin del programa
