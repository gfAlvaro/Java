/**
 * Teclado.java
 * Definicion de la clase Teclado,
 * que sirve para leer distintos tipos de datos
 * desde el teclado
 * @author Álvaro García Fuentes
 */
package presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado{
	
    static private Scanner  scannerTeclado = new Scanner( System.in );

    /**
     * Método para leer un char por teclado
     * @return double
     * @see leerCaracter(String)
     */
    public static char leerCaracter() {
        
        boolean datoInvalido = false;
        char salida = ' ';
        
        do{
        	try {
                salida = scannerTeclado.nextLine().charAt(0);
        	}catch( InputMismatchException e ) {
        		datoInvalido = true;
        	}
        	
        }while( datoInvalido );
        
        return salida;
    }
    
    /**
     * Método para leer un double por teclado
     * @return double
     * @see leerDoble(String)
     */
    public static double leerDoble() throws InputMismatchException {
        
        boolean datoInvalido = false;
        double salida = -1;
        do{
        	try {
                salida = Double.parseDouble( scannerTeclado.nextLine() );
        	}catch(InputMismatchException e ) {
        		datoInvalido = true;
        	}
        	
        }while( datoInvalido );
        
        return salida;
    }

    /**
     * Método para leer un entero por teclado
     * @return int
     * @see leerEntero(String)
     */
    public static int leerEntero() {
        
        boolean datoInvalido = false;
        int salida = -1;

        do{
        	try {
                salida = Integer.parseInt( scannerTeclado.nextLine() );
        	}catch( InputMismatchException e ) {
        		datoInvalido = true;
        	}
        	
        }while( datoInvalido );
        
        return salida;
    }

    /**
     * Método para leer una cadena por teclado
     * @return String
     * @see leerCadena(String)
     */
    public static String leerCadena() { 
        return scannerTeclado.nextLine();
    }

    /**
     * Método para leer un double por teclado
     * con mensaje
     * @return double
     * @see leerDoble()
     */
    public static char leerCaracter( String mensaje ) {
        System.out.print( mensaje );
        return leerCaracter();
    }
    
    /**
     * Método para leer un double por teclado
     * con mensaje
     * @return double
     * @see leerDoble()
     */
    public static double leerDoble( String mensaje ) {
        System.out.print( mensaje );
        return leerDoble();
    }
    
    /**
     * Método para leer un entero por teclado
     * con mensaje
     * @return int
     * @see leerEntero()
     */
    public static int leerEntero( String mensaje ) {
        System.out.print( mensaje );
        return leerEntero();
    }

    /**
     * Método para leer una cadena por teclado
     * con mensaje
     * @return String
     * @see leerCadena()
     */
    public static String leerCadena( String mensaje ) {
        System.out.print( mensaje );
        return leerCadena();
    }
    
} // Fin de la clase Teclado
