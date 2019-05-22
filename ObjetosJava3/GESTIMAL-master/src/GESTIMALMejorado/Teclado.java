/**
 * clase auxiliar para manejar la entrada por teclado
 */
package teclado;
 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Teclado{
	
	public static double doble() throws InputMismatchException {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner( System.in );
		return tec.nextDouble();
		}

	public static int entero() throws InputMismatchException {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner( System.in );
		return tec.nextInt();
		}
	
	public static String cadena() throws InputMismatchException {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner( System.in );
		return tec.nextLine();
		}
	
 	} // Fin de la clase