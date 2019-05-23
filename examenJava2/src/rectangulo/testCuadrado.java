/**
 * testCuadrado.java
 * programa de prueba para la clase Cuadrado
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class testCuadrado{

    public static void main( String[] args ){

        Cuadrado cuadrado1;
        Cuadrado cuadrado2;
        Cuadrado cuadrado3;

        // Creamos dos cuadrados y los comparamos
        try{
            cuadrado1 = new Cuadrado( 3 );
            System.out.println( "Creado cuadrado1 con lado=" + cuadrado1.getLado() );
            cuadrado2 = new Cuadrado( 3 );
            System.out.println( "Creado cuadrado2 con lado=" + cuadrado2.getLado() );
            System.out.println( cuadrado1 );
            System.out.println( cuadrado2 );

            if(  cuadrado1.esIgual( cuadrado2 )  )
                System.out.println( "cuadrado1 y cuadrado2 son iguales" );
            else if(  cuadrado1.esMayor( cuadrado2 )  )
                System.out.println( "cuadrado1 es mayor a cuadrado2." );
            else if(  cuadrado1.esMenor( cuadrado2 )  )
                System.out.println( "cuadrado1 es menor a cuadrado2." );
            
            }catch( ArithmeticException e ){
                System.out.println( "ERROR: No se pudieron crear los cuadrados" );
                }

        // Intentamos crear un cuadrado con lado fuera de los límites del rango
        try{
            cuadrado3 = new Cuadrado( -1 );
            System.out.println( "Creado cuadrado3 con lado=" + cuadrado3.getLado() );
        }catch( ArithmeticException e ){
            System.out.println( "ERROR: No se pudo crear cuadrado3, valor fuera de rango." );
            }
        }

    } // Fin del programa
