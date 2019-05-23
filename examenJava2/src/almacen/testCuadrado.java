/**
 * testCuadrado.java
 * programa de prueba para la clase Cuadrado
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class testCuadrado{

    public static void main( String[] args ){

        Cuadrado cuadrado;
        Cuadrado cuadrado1;
        Cuadrado cuadrado2;
        Cuadrado cuadrado3;
        Cuadrado cuadrado4;
        Cuadrado cuadrado5;
        Cuadrado cuadrado6;
        Cuadrado cuadrado7;
        Cuadrado cuadrado8;
        Cuadrado cuadrado9;
        Cuadrado cuadrado10;
        Cuadrado cuadrado11;
        Cuadrado cuadrado12;

        // Intentamos crear un cuadrado con lado fuera de los límites del rango
        try{
            cuadrado = new Cuadrado( -1 );
            System.out.println( "Creado cuadrado3 con lado=" + cuadrado.getLado() );
        }catch( ArithmeticException e ){
            System.out.println( "ERROR: No se pudo crear el cuadrado, valor fuera de rango." );
            }

        // Creamos dos cuadrados y los comparamos
        try{
            cuadrado1 = new Cuadrado( 3 );
            System.out.println( "\nCreado cuadrado1 con lado = " + cuadrado1.getLado() );
            cuadrado2 = new Cuadrado( 3 );
            System.out.println( "Creado cuadrado2 con lado = " + cuadrado2.getLado() );
            System.out.println( cuadrado1 );
            System.out.println( cuadrado2 );

            if(  cuadrado1.esIgual( cuadrado2 )  ){
                System.out.println( "cuadrado1 y cuadrado2 son iguales" );
                }
            
            cuadrado3 = new Cuadrado( 1 );
            System.out.println( "\nCreado cuadrado3 con lado = " + cuadrado3.getLado() );
            cuadrado4 = new Cuadrado( 2 );
            System.out.println( "Creado cuadrado4 con lado = " + cuadrado4.getLado() );
            System.out.println( cuadrado3 );
            System.out.println( cuadrado4 );

            if(  cuadrado3.esDistinto( cuadrado4 )  ){
                System.out.println( "cuadrado3 y cuadrado4 son distintos." );
                }
            
            cuadrado5 = new Cuadrado( 4 );
            System.out.println( "\nCreado cuadrado5 con lado = " + cuadrado5.getLado() );
            cuadrado6 = new Cuadrado( 3 );
            System.out.println( "Creado cuadrado6 con lado = " + cuadrado6.getLado() );
            System.out.println( cuadrado5 );
            System.out.println( cuadrado6 );

            if(  cuadrado5.esMayor( cuadrado6 )  ){
                System.out.println( "cuadrado5 es mayor que cuadrado6." );
                }
            
            cuadrado7 = new Cuadrado( 3 );
            System.out.println( "\nCreado cuadrado7 con lado = " + cuadrado7.getLado() );
            cuadrado8 = new Cuadrado( 4 );
            System.out.println( "Creado cuadrado8 con lado = " + cuadrado8.getLado() );
            System.out.println( cuadrado7 );
            System.out.println( cuadrado8 );

            if(  cuadrado7.esMenor( cuadrado8 )  ){
                System.out.println( "cuadrado7 es menor que cuadrado8." );
                }
            
            cuadrado9 = new Cuadrado( 4 );
            System.out.println( "\nCreado cuadrado9 con lado = " + cuadrado9.getLado() );
            cuadrado10 = new Cuadrado( 3 );
            System.out.println( "Creado cuadrado10 con lado = " + cuadrado10.getLado() );
            System.out.println( cuadrado9 );
            System.out.println( cuadrado10 );

            if(  cuadrado9.esMayorIgual( cuadrado10 )  ){
                System.out.println( "cuadrado9 es mayor o igual que cuadrado10." );
                }
            
            cuadrado11 = new Cuadrado( 3 );
            System.out.println( "\nCreado cuadrado11 con lado = " + cuadrado11.getLado() );
            cuadrado12 = new Cuadrado( 4 );
            System.out.println( "Creado cuadrado12 con lado = " + cuadrado12.getLado() );
            System.out.println( cuadrado11 );
            System.out.println( cuadrado12 );

            if(  cuadrado11.esMenorIgual( cuadrado12 )  ){
                System.out.println( "cuadrado11 es menor o igual que cuadrado12" );
                }
            
            }catch( ArithmeticException e ){
                System.out.println( "ERROR: No se pudieron crear los cuadrados" );
                }
        }

    } // Fin del programa
