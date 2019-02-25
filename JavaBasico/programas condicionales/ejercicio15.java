/**
 * ejercicio15.java
 * El director de una escuela est� organizando un viaje de estudios,
 * y requiere determinar cu�nto debe cobrar a cada alumno
 * y cu�nto debe pagar a la compa��a de viajes por el servicio.
 * La forma de cobrar es la siguiente:
 * - Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
 * - Si son de 50 a 99 alumnos, el costo es de 70 euros.
 * - Si son de 30 a 49, de 95 euros.
 * - Si son menos de 30, el costo de la renta del autob�s es de 4000 euros,
 *   sin importar el n�mero de alumnos. 
 * Determinar el pago a la compa��a de autobuses
 * y lo que debe pagar cada alumno por el viaje.
 * @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio15{

	public static void main( String[] args )

		int numeroAlumnos;
		int precio;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el n�mero de alumnos: " );
		numeroAlumnos = teclado.nextInt();

		if( numeroAlumnos <= 0 )
			System.out.println( "ERROR: n�mero de alumnos incorrecto" );	

		else{
			if( numeroAlumnos >= 100 ) 
				precio = numeroAlumnos * 65;
			else if(  ( numeroAlumnos >= 50 ) && ( numeroAlumnos <= 99 )  )
				precio = numeroAlumnos * 70;
			else if(  ( numeroAlumnos >= 30 ) && ( numeroAlumnos <= 49 )  )
				precio = numeroAlumnos * 95;
			else
				precio = 4000;
	
			System.out.println( "El coste de la renta de autob�s es de " + precio );
			System.out.println( "El precio que debe pagar cada alumno es de " + precio/numeroAlumnos );
			}
		}
	} // Fin del programa

