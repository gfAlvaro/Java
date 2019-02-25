/**
 * ejercicio8.java
 * Se piden dos números, ‘nota’ y ‘edad’, y un carácter ‘sexo’
 * y muestra el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco,
 * la edad es mayor o igual a dieciocho y el sexo es ‘F’.
 * En caso de que se cumpla lo mismo, pero el sexo sea ‘M’,
 * imprime ‘POSIBLE’. Si no se cumplen dichas condiciones
 * se muestra ‘NO ACEPTADA’.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio8{

	public static void main( String[] args ){

		float nota;
		int edad;
		char sexo;
		String disposicion;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca la nota: " );
		nota = teclado.nextFloat();
		System.out.print( "Introduzca la edad: " );
		edad = teclado.nextInt();
		System.out.print( "Introduzca el sexo (M o F): " );
		sexo = teclado.next().charAt(0);
	
		if(  ( sexo != 'F' ) && ( sexo != 'M' )  )
			System.out.println( "ERROR: caracter sexo no válido" );

		else{
			if(  ( ( nota >= 5 ) && ( edad >= 18 ) ) && ( sexo == 'F' )  )
				disposicion = "ACEPTADA";

			else if(  ( ( nota >= 5 ) && ( edad >= 18 ) ) && ( sexo == 'M' )  )
				disposicion = "POSIBLE";

			else
				disposicion = "NO ACEPTADA";
		
			System.out.println( disposicion );   
			}
		}
	} // Fin del programa


