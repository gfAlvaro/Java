/**
 * ejercicio6.java
 * Programa que lee una cadena por teclado
 * y comprueba si comienza por una letra mayúscula.
 * @author Álvaro García Fuentes
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
			resultado = "mayúscula";
		else
			resultado = "minúscula";
	
		System.out.println( "La letra es " + resultado + ".");	
		}
	} // Fin del programa
