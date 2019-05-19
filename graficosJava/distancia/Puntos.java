/**
 * Puntos.java
 * Clase con la funcion para calcular la distancia euclidea
 * entre dos puntos en el plano.
 * @author Alvaro Garcia Fuentes
 */
package distancia;

public class Puntos{
	
	public static double distancia( double x1 , double y1 , double x2 , double y2 ){
		return Math.sqrt(  Math.pow( x1 - x2 , 2 ) + Math.pow( y1 - y2 , 2 )   );
		}
	
	} // Fin de la clase Puntos
