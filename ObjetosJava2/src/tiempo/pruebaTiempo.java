/**
 * pruebaTiempo.java
 * Programa para trabajar con horas
 * usando la clase Tiempo definida en Tiempo.java
 * @author Álvaro García Fuentes
 */
package tiempo;

public class pruebaTiempo{
	
	public static void main( String[] args ){
		
		Tiempo tiempo = new Tiempo( 1 , 20 , 30 );
		Tiempo tiempo2 = new Tiempo( 10, 45, 5);
		
		System.out.println( "tiempo: " + tiempo );
		System.out.println( "tiempo2: " + tiempo2 );
		tiempo.suma( tiempo2 );
		System.out.println( "tiempo + tiempo2: " + tiempo );
		tiempo2.resta( tiempo );
		System.out.println( "tiempo2 - tiempo: " + tiempo2 );
		}
	} // Fin del programa

