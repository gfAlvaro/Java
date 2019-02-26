/**
 * ejercicio4.java
 * Programa que define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se almacenan los cuadrados de los valores que hay en el
 * array numero. En el array cubo se almacenan los cubos de los valores que
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio4{
	
	public static void main( String[] args ){

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		// Se inicializan los arrays
		for( int i = 0 ; i < 20 ; i++ ){
			numero[i] = (int) (  1 + ( Math.random() * 100 )  );
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
			}

		// Se muestran los arrays en pantalla mediante columnas
		for( int i = 0 ; i < 20 ; i++ )
			System.out.printf( "%5d %5d %5d\n" , numero[i] , cuadrado[i] , cubo[i] );
		}
	} // Fin del programa
