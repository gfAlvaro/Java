/**
 * ejercicio1.java
 * Definicion de la clase Cuadrado que hereda de la clase Rectangulo
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class Cuadrado extends Rectangulo{
		
	/**
	 * Constructor paramétrico
	 * @param lado
	 */
	Cuadrado( int lado ){	
		super( lado , lado );
		}
	
	/**
	 * función que devuelve el lado del Cuadrado
	 * @return int
	 */
	public int getLado(){ return super.getAlto(); }
	
	/**
	 * Función para comprobar si dos Cuadrados son iguales
	 * @param cuadrado
	 * @return boolean
	 */
	public boolean esIgual( Cuadrado cuadrado ){
		return this.getLado() == cuadrado.getLado();
		}
	
	} // Fin de la clase Cuadrado
