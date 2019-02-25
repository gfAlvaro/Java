/**
 * ejercicio6.java
 * Programa que lee una cadena por teclado
 * y comprueba si comienza por una letra may�scula.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio6{

	public static void main( String[] args ){
  	
		String cadena1;
		String resultado;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca la cadena: " );
		cadena1 = teclado.next();

		if(  Character.isUpperCase( cadena1.charAt(0) )  )
			resultado = "may�scula";
		else
			resultado = "min�scula";
	
		System.out.println( "La letra es " + resultado + ".");	
		}
	} // Fin del programa
