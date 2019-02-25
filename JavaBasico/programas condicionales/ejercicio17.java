/**
 * ejercicio17.java
 * Programa que pide por teclado el resultado (dato entero)
 * obtenido al lanzar un dado de seis caras
 * y muestra por pantalla el número en letras (dato cadena)
 *  de la cara opuesta al resultado obtenido.
 *  Nota 1: En las caras opuestas de un dado de seis caras
 *          están los números: 1-6, 2-5 y 3-4.
 *  Nota 2: Si el número del dado introducido es menor que 1
 *          o mayor que 6, se mostrará el mensaje:
 *          “ERROR: número incorrecto.”.
 *  Ejemplo:					
 * 	Introduzca número del dado: 5
 * 		En la cara opuesta está el "dos".
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio17{

	public static void main( String[] args ){

		int resultado;
		String numeroLetras = "";
		boolean numeroCorrecto = true;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca número del dado: " );
		resultado = teclado.nextInt();
	
		switch( 7 - resultado ){
			case 1:
				numeroLetras = "uno";
				break;
			case 2:
				numeroLetras = "dos";
				break;
			case 3:
				numeroLetras = "tres";
				break;
			case 4:
				numeroLetras = "cuatro";
				break;
			case 5:
				numeroLetras = "cinco";
				break;
			case 6:
				numeroLetras = "seis";
				break;
			default:	
				numeroCorrecto = false;
			}

		if( numeroCorrecto )
			System.out.println( "En la cara opuesta está el " + numeroLetras );
		else
			System.out.println( "ERROR: número incorrecto." );
		}
	} // Fin del programa
