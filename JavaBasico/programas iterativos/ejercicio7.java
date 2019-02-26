/**
 * ejercicio7.java
 * Una persona adquirió un producto para pagar en 20 meses.
 * El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente.
 * Programa para determinar cuánto debe pagar mensualmente
 * y el total de lo que pagará después de los 20 meses.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio7{
	
	public static void main( String[] args ){
		
		double precio = 0 , cuota;
		
		for( int i = 1 ; i <= 20 ; i++ ){		
			cuota = 5 * Math.pow( 2, i );
			System.out.println( "Cuota " + i + ": " + cuota );
			precio = precio + cuota;
			}

		System.out.println( "El total a pagar por 20 meses es: " + precio );
		}
	} // Fin del programa
