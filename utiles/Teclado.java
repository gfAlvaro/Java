/**
 * Teclado.java
 * Definicion de la clase Teclado,
 * que sirve para leer distintos tipos de datos
 * desde el teclado
 * @author Álvaro García Fuentes
 */
package utiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado{
	
    static private Scanner  teclado = new Scanner( System.in );

    /**
     * Método para leer un double por teclado
     * @return double
     * @see leerDoble(String)
     */
    public static double leerDoble() throws InputMismatchException {
        return Double.parseDouble( teclado.nextLine() );
    }

    /**
     * Método para leer un entero por teclado
     * @return int
     * @see leerEntero(String)
     */
    public static int leerEntero() throws InputMismatchException {
        return Integer.parseInt( teclado.nextLine() );
    }

    /**
     * Método para leer una cadena por teclado
     * @return String
     * @see leerCadena(String)
     */
    public static String leerCadena() throws InputMismatchException { 
        return teclado.nextLine();
    }

    /**
     * Método para leer un double por teclado
     * con mensaje
     * @return double
     * @see leerDoble()
     */
    public static double leerDoble( String mensaje ) throws InputMismatchException {
        System.out.print( mensaje );
        return leerDoble();
    }

    /**
     * Método para leer un entero por teclado
     * con mensaje
     * @return int
     * @see leerEntero()
     */
    public static int leerEntero( String mensaje ) throws InputMismatchException {
        System.out.print( mensaje );
        return leerEntero();
    }

    /**
     * Método para leer una cadena por teclado
     * con mensaje
     * @return String
     * @see leerCadena()
     */
    public static String leerCadena( String mensaje ) throws InputMismatchException {
        System.out.print( mensaje );
        return leerCadena();
    }
    
} // Fin de la clase Teclado
