/**
 * ejercicio10.java
 * Se piden los puntos centrales x1,y1,x2,y2
 * y los radios r1,r2 de dos circunferencias
 * y se clasifican en uno de estos estados:	
 * - exteriores
 * - tangentes exteriores
 * - secantes
 * - tangentes interiores
 * - interiores
 * - concéntricas
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio10{

	public static void main( String[] args ){
	
		float x1;
		float y1;
		float x2;
		float y2;
		float r1;
		float r2;
		double distanciaCentros;
		double sumaRadios;
		double diferenciaRadios;
		String circunferencias;
		Scanner teclado = new Scanner( System.in );

		System.out.println( "Introduzca el primer punto central: " );
		System.out.print( " x1: " );
		x1 = teclado.nextFloat();
		System.out.print( " y1: " );
		y1 = teclado.nextFloat();
		System.out.print( " r1: " );
		r1 = teclado.nextFloat();

		System.out.println( "Introduzca el segundo punto central: " );
		System.out.print( " x2: " );
		x2 = teclado.nextFloat();
		System.out.print( " y2: " );
		y2 = teclado.nextFloat();
		System.out.print( " r2: " );
		r2 = teclado.nextFloat();

		distanciaCentros = Math.sqrt( Math.pow( x2-x1, 2 ) + Math.pow( y2-y1 ,2 ) );

		if( distanciaCentros == 0 )
			circunferencias = "concéntricas";

		else{
			sumaRadios = Math.abs( r1 + r2 );
			if( distanciaCentros > sumaRadios )
				circunferencias = "exteriores";

			else if( distanciaCentros == sumaRadios )
				circunferencias = "tangentes exteriores";

			else{
				diferenciaRadios = Math.abs( r1 - r2 );
				if( distanciaCentros > diferenciaRadios )
					circunferencias = "secantes";
				else if( distanciaCentros == diferenciaRadios )
					circunferencias = "tangentes interiores";
				else
					circunferencias = "interiores";
				}
			}

		System.out.println( "Las circunferencias son " + circunferencias + "." );
		}
	} // Fin del programa
