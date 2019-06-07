/**
 * Menu.java
 * menu para elegir una opcion
 * @author Alvaro Garcia Fuentes
 */
package utiles;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.ArrayList;

public class Menu{
	
	// Atributos
    private ArrayList<String>  opciones;
    private String  titulo;
    
    // Métodos
    /**
     * Constructor paramétrico
     * @param titulo
     * @param opciones
     */
    public Menu( String titulo, ArrayList<String> opciones ) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    /**
     * Muestra las opciones disponibles
     */
    private void mostrar(){
    
        int contador = 1;
        Iterator<String> it = opciones.iterator();
        String cadena;
        
        System.out.println( titulo );
        while( it.hasNext() ){
        	cadena = it.next();
    	    System.out.println( contador + ". " + cadena );
    	    contador++;
        }
    }
    
    /**
     * Pide una opcion por teclado
     * @return int
     */
    private int pedirOpcion(){

        int opcion = 0;

        do{
            try{
                System.out.println( "Introduzca una opción" );
                opcion = Teclado.leerEntero();
            }
            catch( InputMismatchException ie ){
                System.out.println( "ERROR: entrada incorrecta." );
            }
        }while(opcion < 1 || opcion > this.opciones.size() );
        
        return opcion;
    }
    
    /**
     * gestiona el menu
     * @return int
     */
    public int gestionar(){
        mostrar();
        return pedirOpcion();
    }
	
} // Fin de la clase Menu
