/**
 * ejercicio8.java
 * Programa que muestra un cronometro, indicando las horas, minutos y segundos.
 * ATENCION: ESTE PROGRAMA SÓLO SE PUEDE PARAR MEDIANTE Control + C, pues ejecuta un bucle infinito.
 * @author Alvaro Garcia Fuentes
 */
package basico;

public class ejercicio8{
	
	public static void main( String[] args ){

		int horas = 0 , minutos = 0 , segundos = 0;
		
		while( true ){

			System.out.println( horas + ":" + minutos + ":" + segundos );

			// Con este bloque de código hacemos que el programa
			// tarde un segundo en aumentar el cronómetro.
			try {
				Thread.sleep(1000);
				} catch ( Exception ignored ){}

			segundos = segundos + 1;
			
			if( segundos >= 60 ){
				segundos = 0;
				minutos = minutos + 1;
				}
				
			if( minutos >= 60 ){
				minutos = 0;
				horas = horas + 1;
				}
			}
		}
	} // Fin del programa
