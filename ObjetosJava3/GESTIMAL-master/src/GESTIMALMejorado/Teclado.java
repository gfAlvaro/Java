/**
 * clase auxiliar para manejar la entrada por teclado
 */
package teclado;
 
import java.util.Scanner;
import java.util.InputMismatchException;

public class Teclado{
	
	public static double doble() throws InputMismatchException {
		Scanner tec = new Scanner( System.in );
		double salida = tec.nextDouble();
		tec.close();
		return salida;
		}

	public static int entero() throws InputMismatchException {
		Scanner tec = new Scanner( System.in );
		int salida = tec.nextInt();
		tec.close();
		return salida;
		}
	
	public static String cadena() throws InputMismatchException {
		Scanner tec = new Scanner( System.in );
		String salida = tec.nextLine();
		tec.close();
		return salida;
		}
 	} // Fin de la clase