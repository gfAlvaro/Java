/**
* Programa de prueba de la clase Fraccion
* @author Alvaro Garcia Fuentes
*/
package fraccion;

public class pruebaFraccion{

	public static void main( String[] args ){
		
		Fraccion miFraccion = new Fraccion( 2 , 4 );
		Fraccion miFraccion2 = new Fraccion( 16 , 98 );
		
		System.out.println( miFraccion + " = " + miFraccion.resultado() );
		miFraccion.set_numerador(10);
		miFraccion.set_denominador(0);
		System.out.println( miFraccion + " = " + miFraccion.resultado() );
		
		System.out.print( "7 * " + miFraccion + " = " );
		miFraccion.producto( 7 );
		System.out.print( miFraccion + " = " );
		miFraccion.simplificar();
		System.out.println( miFraccion );
		
		System.out.print( miFraccion + " * " + miFraccion2 + " = " );
		miFraccion.multiplicar( miFraccion2 );
		System.out.print( miFraccion + " = " );
		miFraccion.simplificar();
		System.out.println( miFraccion );
		
		System.out.print( miFraccion + " + " + miFraccion2 + " = " );
		miFraccion.suma( miFraccion2 );
		System.out.print( miFraccion + " = " );		
		miFraccion.simplificar();
		System.out.println( miFraccion );

		System.out.print( miFraccion + " - " + miFraccion2 + " = " );
		miFraccion.resta( miFraccion2 );
		System.out.print( miFraccion + " = " );		
		miFraccion.simplificar();
		System.out.println( miFraccion );
		}
	} // Fin del programa
