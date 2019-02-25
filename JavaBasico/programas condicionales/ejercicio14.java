/**
 * ejercicio14.java
 * La asociación de vinicultores tiene como política
 * fijar un precio inicial al kilo de uva,
 * la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
 * Cuando se realiza la venta del producto,
 * ésta es de un solo tipo y tamaño, se requiere determinar
 * cuánto recibirá un productor por la uva que entrega
 * en un embarque, considerando lo siguiente:
 * - Si es de tipo A,
 *    se le cargan 20 céntimos al precio inicial cuando es de tamaño 1;
 *    y 30 céntimos si es de tamaño 2.
 * - Si es de tipo B,
 *    se rebajan 30 céntimos cuando es de tamaño 1,
 *    y 50 céntimos cuando es de tamaño 2.
 * Algoritmo para determinar la ganancia obtenida.
 * @author ÁLvaro García Fuentes
*/
package basico;

import java.util.Scanner;

public class ejercicio14{

	public static void main( String[] args ){

		char tipo;
		int tamano;
		double precioInicial;
		boolean correcto = true;
		Scanner teclado = new Scanner( System.in );

		System.out.print( "Introduzca el precio inicial: " );
		precioInicial = teclado.nextDouble();

		System.out.print( "Introduzca el tipo de la uva: " );
		tipo = teclado.next().charAt(0);

		System.out.print( "Introduzca el tamaño de la uva: " );
		tamano = teclado.nextInt();

		switch( tamano ){
			case 1:
				if( tipo == 'A' ) 
					precioInicial = precioInicial + 0.20;
				else if( tipo == 'B' )
					precioInicial = precioInicial - 0.30;
				else{
					correcto = false;
					System.out.println( "ERROR: tipo incorrecto." );
					}
				break;

			case 2:
				if( tipo == 'A' )
					precioInicial = precioInicial + 0.30;
				else if( tipo == 'B' )
					precioInicial = precioInicial - 0.50;
				else{
					correcto = false;
					System.out.println( "ERROR: tipo incorrecto." );
					}
				break;
		
			default:
				correcto = false;
			System.out.println( "ERROR: tamaño incorrecto." );
			}
	
		if( correcto )
			System.out.println( "La ganancia obtenida es de " + precioInicial );
		}
	} // Fin del programa
