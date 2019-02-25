/**
 * ejercicio16.java
// La pol�tica de cobro de una compa��a telef�nica es:
// cuando se realiza una llamada,
// el cobro es por el tiempo que �sta dura,
// de tal forma que los primeros cinco minutos cuestan 1 euro,
// los siguientes tres, 80 c�ntimos,
// los siguientes dos minutos, 70 c�ntimos,
// y a partir del d�cimo minuto, 50 c�ntimos. 
// Adem�s, se carga un impuesto de 3 % cuando es domingo,
// y si es otro d�a, en turno de ma�ana, 15 %,
// y en turno de tarde, 10 %.
// Determinar cu�nto debe paga por cada concepto
// una persona que realiza una llamada.
// @author �lvaro Garc�a Fuentes
 */
package basico;

import java.util.Scanner;

public class ejercicio16{

	public static void main( String[] args ){
    
		float tiempoLlamada;
		double precio = 1;
		double impuestos = 0;
		String dia;
		String hora;
		boolean correcto = true;
		Scanner teclado = new Scanner( System.in );
	
		System.out.print( "Introduzca el tiempo de llamada: " );
		tiempoLlamada = teclado.nextFloat();
		System.out.print( "Introduzca el dia (Domingo u otro): " );
		dia = teclado.next();
		System.out.print( "Introduzca la hora(Manana o Tarde): " );
		hora = teclado.next();

		// Calcular tarifa por tiempo de llamada
		if( tiempoLlamada > 5 )
			precio = precio + 0.8;
		if( tiempoLlamada > 8 )
			precio = precio + 0.7;
		if( tiempoLlamada > 10 )
			precio = precio + 0.5;
	
		// Calcular impuestos por el d�a y hora de la llamada
		if( dia == "Domingo" )
			impuestos = precio * 0.03;	
		else if( hora == "Manana" )
			impuestos = precio * 0.15;
		else if( hora == "Tarde" )
			impuestos = precio * 0.1; 
		else{
			correcto = false;
			System.out.println( "ERROR: hora incorrecta" );
			}
	
		if( correcto ){
			System.out.println( "Precio por tiempo de llamada " + precio );
			System.out.println( "Impuestos por d�a y hora: " + impuestos );
			System.out.println( "Total: " + (precio+impuestos) )
			}
		}
	} // Fin del programa
