/**
 * ejercicio9.java
 * Una tienda ofrece un descuento del 15% sobre el total de la compra
 * y un cliente desea saber cuanto deberá pagar finalmente por su compra.
 * @author Álvaro García Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio9{

	public static void main( String[] args ){

		double compra;
		double pagar;
		Scanner teclado = new Scanner( System.in );
    
		System.out.print( "Introduzca el valor de la compra: " );
		compra = teclado.nextDouble();

		pagar = compra - ( compra * 15 / 100 );

		System.out.println( "Debe pagar " + pagar );
		}
	} // Fin del programa


