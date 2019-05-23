/**
 * Teclado.java
 * Definicion de la clase Teclado,
 * que sirve para leer distintos tipos de datos
 * desde el teclado
 * @author Álvaro García Fuentes
 */
package almacen;

import java.util.Scanner;

public class Teclado{

	/**
	 * Método para leer un double por teclado
	 * @return double
	 * @see entero, cadena
	 */
	public static double doble() throws NumberFormatException {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextDouble();
		}
	
	/**
	 * Método para leer un entero por teclado
	 * @return int
	 * @see doble, cadena
	 */
	public static int entero() throws NumberFormatException {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextInt();
		}
	  
	/**
	 * Método para leer una cadena por teclado
	 * @return String
	 * @see doble, entero
	 */
	public static String cadena() throws NumberFormatException {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextLine();
		}

	} // Fin de la clase Teclado
