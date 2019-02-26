/**
 * ejercicio1.java
 * Aplicacion que permite adivinar un número. La aplicacion genera un numero aleatorio del 1 al 100.
 * A continuacion va pidiendo numeros y va respondiendo si el numero a adivinar es mayor o menor que el introducido,
 * ademas de los intentos que te quedan (tienes 10 intentos para acertarlo).
 * El programa termina cuando se acierta el numero (ademas te dice en cuantos intentos lo has acertado),
 * si se llega al limite de intentos te muestra el numero que habia generado.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio1{
	
	public static void main( String[] args ){

		int numero , aleatorio;
		boolean encontrado = false;
		Scanner teclado = new Scanner( System.in );
		
		// Generar numero aleatorio entre 1 y 100
		aleatorio = (int) (  1 + ( Math.random() * 100 )  );
		
		// Pedir numero un máximo de 10 veces y compararlo.
		for( int i = 0 ; i < 10 ; i++ ){
		
			System.out.print( "Adivine el numero del 1 al 100: " );
			numero = teclado.nextInt();
		
			if( numero == aleatorio ){
				encontrado = true;
				System.out.println( "Numero correcto al intento " + (1+i) + "." );
				break;
				}
			else{
				if( numero > aleatorio )
					System.out.println( "Muy alto." );
				else
					System.out.println( "Muy bajo." );

				System.out.println( "Quedan " + (9-i) + " intentos." );
				}
			}
			
		// Mostrar el numero si no se ha acertado al décimo intento
		if( encontrado == false )
			System.out.print( "El numero era " + aleatorio + "." );
		}
	} // Fin del programa
