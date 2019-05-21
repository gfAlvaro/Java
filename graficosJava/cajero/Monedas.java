/**
 * Monedas.java
 * Clase con el método para devolver el cambio
 * de una cantidad dada, dando prioridad a billetes y monedas más grandes.
 * @author Alvaro Garcia Fuentes
 */
package cajero;

import java.util.Scanner;

public class Monedas{
	
	// Los billetes de 500, 200, 100, 50, 20, 10 y 5 euros,
	// y las monedas de 2€, 1€, 50c, 20c, 10c, 5c, 2c y 1c.
	public static final double[] MONEDASBILLETES = { 500, 200, 100, 50, 20, 10, 5,
							2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };
	
	public static int[] devuelveCambio( double entrada ){
		
		double dinero = entrada * 100;
		
		int[] salida = new int[15];
		
		for( int i = 0 ; i < 15 ; i++ ){
			double tipo = MONEDASBILLETES[i] * 100;

			if( (int) (dinero / tipo ) != 0 )
				salida[i] =  (int)( dinero / tipo );

			dinero = dinero % tipo;

			if(dinero == 0)
				break;
			}
		
		return salida;
		}

	public static void main( String[] args ){
		
		Scanner teclado = new Scanner( System.in );
		double cantidad;
		int[] lista;
		String s;
		System.out.print("Introduzca cantidad: ");
		cantidad = teclado.nextDouble();
		teclado.close();
		
		lista = devuelveCambio( cantidad );

		for( int i = 0 ; i < 15 ; i++ ){
			if( i < 7 )
				s = "billetes";
			else
				s = "monedas";
			
			double tipo = MONEDASBILLETES[i];
			if( lista[i] != 0  )
				System.out.println( lista[i] + " " + s + " de " + tipo + " euros." );
			}
		}
	
	} // fin de la clase Monedas
