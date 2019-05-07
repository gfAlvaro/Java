/**
 * pruebaTiempo.java
 * Programa para trabajar con horas
 * usando la clase predefinida LocalTime
 * @author Álvaro García Fuentes
 */
package tiempo2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class pruebaTiempo2{
	
	public static void main( String[] args ){
		
		LocalTime tiempo = LocalTime.parse( "01:20:30", DateTimeFormatter.ISO_LOCAL_TIME );
		LocalTime tiempo2 = LocalTime.parse( "10:45:05", DateTimeFormatter.ISO_LOCAL_TIME );
		
		System.out.println( "tiempo: " + tiempo );
		System.out.println( "tiempo2: " + tiempo2 );
		tiempo = tiempo.plusHours( tiempo2.getHour() );
		tiempo = tiempo.plusMinutes( tiempo2.getMinute() );
		tiempo = tiempo.plusSeconds( tiempo2.getSecond() );		
		System.out.println( "tiempo + tiempo2: " + tiempo );
		tiempo2 = tiempo2.minusHours( tiempo.getHour() );
		tiempo2 = tiempo2.minusMinutes( tiempo.getMinute() );
		tiempo2 = tiempo2.minusSeconds( tiempo.getSecond() );
		System.out.println( "tiempo2 - tiempo: " + tiempo2 );
		}
	} // Fin del programa

