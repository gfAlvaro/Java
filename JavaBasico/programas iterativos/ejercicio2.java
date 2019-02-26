/**
 * ejercicio2.java
 * Algoritmo que pide numeros (se pide por teclado la cantidad de números a introducir).
 * El programa informa de cuantos numeros introducidos son mayores que 0, menores que 0 e iguales a 0.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio2{
	
	public static void main( String[] args ){
		
		int cantidad , numero , mayor = 0 , menor = 0 , cero = 0;
		
		Scanner teclado = new Scanner( System.in );
		
		// Introducir cantidad de numeros
		System.out.print( "Introduzca la cantidad de numeros a introducir" );
		cantidad = teclado.nextInt();
		
		// Introducir numeros y comprobar si son mayores, menores o iguales a 0
		for( int i = 0 ; i < cantidad ; i++ ){
			System.out.print( "Introduzca un numero: " );
			numero = teclado.nextInt();

			if( numero > 0 )
				mayor = mayor + 1;
			else if( numero < 0 )
				menor = menor + 1;
			else
				cero = cero + 1;
			}
			
		// Mostrar cuantos numeros son mayores, menores o iguales a 0
		System.out.println( "Cantidad de numeros mayores que 0: " + mayor );
		System.out.println( "Cantidad de numeros menores que 0: " + menor );
		System.out.println( "Cantidad de numeros iguales a 0: " + cero );
		}
	} // Fin del programa
