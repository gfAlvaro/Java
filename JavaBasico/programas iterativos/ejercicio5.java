/**
 * ejercicio5.java
 * Programa que pide el limite inferior y superior de un intervalo.
 * Si el límite inferior es mayor que el superior lo vuelve a pedir.
 * A continuación se van introduciendo números hasta que introduzcamos el 0.
 * Al terminar el programa dará las siguientes informaciones:
 *    La suma de los números que están dentro del intervalo (intervalo abierto).
 *    Cuantos números están fuera del intervalo.
 *    Informa si hemos introducido algún número igual a los límites del intervalo.
 * @author Alvaro Garcia Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio5{

	public static void main( String[] args ){

		int inferior , superior , numero , suma = 0 , fuera = 0;
		Scanner teclado = new Scanner( System.in );

		// Pedir límites del intervalo y validarlos
		do{
			System.out.print( "Introduzca el limite inferior del intervalo: " );
			inferior = teclado.nextInt();
			System.out.print( "Introduzca el limite superior del intervalo: " );
			superior = teclado.nextInt();			
			}while( inferior > superior );
		
		// Se van pidiendo números
		do{
			System.out.print( "Introduzca un numero (0 para salir): " );
			numero = teclado.nextInt();

			if( numero == 0 )
				break;
			else if(  ( numero > inferior ) && ( numero < superior )  )
				suma = suma + numero;
			else if(  ( numero <= inferior ) || ( numero >= superior )  )
				fuera = fuera + 1;
			
			if( inferior == numero )
				System.out.println( "Numero introducido igual al limite inferior del intervalo." );
			else if( superior == numero )
				System.out.println( "Numero introducido igual al limite superior del intervalo." );

			}while( true );
		
		System.out.println( "Suma de numeros que estan dentro del intervalo: " + suma + "." );
		System.out.println( "Cantidad de numeros que estan fuera del intervalo: " + fuera + "." );
		}
	} // Fin del programa
