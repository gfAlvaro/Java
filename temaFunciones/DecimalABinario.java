/**
 * decimalABinario.java
 * ejercicio 18 pg. 114 del libro
 * Escribe un programa que pase de decimal a binario.
 * @author Álvaro García Fuentes
 */

package funciones;
import java.util.Scanner;

public class DecimalABinario{
	
	public static int decimalBinario(int numero){

		int cociente = numero;
		int resto;
		String cadenaBinaria = "";

		while( cociente != 1 ){
			resto = cociente % 2;
			cociente = cociente / 2;
			cadenaBinaria = resto + cadenaBinaria;
			}
		cadenaBinaria = cociente + cadenaBinaria;

		return Integer.parseInt( cadenaBinaria, 10 );		
		}
	
	public static void main( String[] args ){
		
		int numero;
		int binario;		
		Scanner teclado = new Scanner(System.in );
		
		System.out.print( "Introduzca un numero: " );
		numero = teclado.nextInt();
		teclado.close();

		binario = decimalBinario(numero);
		
		System.out.println( binario );
		}
	}