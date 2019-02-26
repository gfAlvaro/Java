/**
 * ejercicio4.java
 * Programa que imprime todos los números pares entre dos números que se le piden al usuario
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio4{
	
	public static void main( String[] args ){
		
		int numero1 , numero2, aux;
		Scanner teclado = new Scanner( System.in );
		
		// Entrada de datos
		System.out.print( "Introduzca el primer numero: " );
		numero1 = teclado.nextInt();
		System.out.print( "Introduzca el segundo numero: " );
		numero2 = teclado.nextInt();
		
		// Para validar el máximo y el mínimo
		if( numero1 > numero2 ){
			aux = numero1;
			numero2 = aux;
			numero1 = numero2;
			}

		// Mostrar pares contenidos en el intervalo
		System.out.println( "Numeros pares entre " + numero1 + " y " + numero2 + ":" );
		for( int i = numero1 ; i <= numero2 ; i++ )
			if(  ( i % 2 ) == 0  )
				System.out.println( i );
		}
	} // Fin del programa
