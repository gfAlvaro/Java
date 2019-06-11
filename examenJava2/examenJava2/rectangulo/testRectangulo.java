/**
 * testRectangulo.java
 * programa de prueba para la clase Rectangulo
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class testRectangulo {
	
    public static void main( String[] args ){

        Rectangulo rectangulo1;
        Rectangulo rectangulo2;

        // Creamos un rectangulo, mostramos sus datos y lo dibujamos
        try{
            rectangulo1 = new Rectangulo( 4 , 2 );
            System.out.println( "Se ha creado el rectangulo1 con alto=" + rectangulo1.getAlto()
											+ " y ancho=" + rectangulo1.getAncho() );
            System.out.println( rectangulo1 );
        }catch( ArithmeticException e ){
            System.out.println( "ERROR: no se pudo crear rectangulo1, valores fuera de rango" );
        }

        // Intentamos crear otro rectángulo con lados fuera del rango
        try{
            rectangulo2 = new Rectangulo( -1 , 11 );
            System.out.println( "Se ha creado el rectangulo1 con alto=" + rectangulo2.getAlto()
                                  + " y ancho=" + rectangulo2.getAncho() );
            System.out.println( rectangulo2 );
        }catch( ArithmeticException e ){
            System.out.println( "ERROR: no se pudo crear rectangulo2, valores fuera de rango" );
        }
    }

} // Fin del programa
