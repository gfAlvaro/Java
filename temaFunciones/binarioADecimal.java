/**
 * binarioADecimal.java
 * ejercicio 17 pg. 114 del libro
 * Programa que pasa de binario a decimal.
 * Se usa la biblioteca matemática creada.
 * @author Álvaro García Fuentes
 */

package funciones;
import bibliotecaMatematica.Matematica;
import java.util.Scanner;

public class binarioADecimal{

	public static int binarioDecimal( int binario ){
		
		int numero = 0;
		
		for( int i = 0 ; i < Matematica.digitos(binario) ; i++ )
			numero = numero + Matematica.potencia( 2 , Matematica.digitos(binario) - i - 1 )
					 * Matematica.digitoN( binario, i );
		
		return numero;
		}
	
	public static void main( String[] args ){
		
		int binario;
		Scanner teclado = new Scanner(System.in );
		
		System.out.print( "Introduzca un numero binario: " );
		binario = teclado.nextInt();
		teclado.close();
			
		System.out.println( binarioDecimal( binario ) );
		}
	} // Fin del programa

