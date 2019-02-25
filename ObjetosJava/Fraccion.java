/**
 * Fraccion.java
 *  Definicion de una clase Fraccion con las siguientes operaciones:
 *
 *    Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
 *    Obtener la fracción.
 *    Obtener y modificar numerador y denominador. No se puede dividir por cero.
 *    Obtener resultado de la fracción (número real).
 *    Multiplicar la fracción por un número.
 *    Multiplicar, sumar y restar fracciones.
 *    Simplificar la fracción.
 * @author Alvaro Garcia Fuentes
 */

package fraccion;

public class Fraccion{

	/**
	 * Atributos pridavos de la clase
	 */
	private int __numerador;
	private int __denominador;

	/**
	 * Constructor por defecto de la clase
	 */
	public Fraccion(){
		this.__numerador = 1;
		this.__denominador = 1;
		}

	/**
	 * Constructor paramétrico de la clase
	 * 
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion( int numerador , int denominador ){
		this.__numerador = numerador;
		this.__denominador = denominador;
		}

	/**
	 * Método para obtener la fracción la cadena de salida tiene el formato:
	 * numerador/denominador
	 * 
	 * @return String
	 */
	@Override
	public String toString(){
		return this.get_numerador() + "/" + this.get_denominador();
		}

	/**
	 * Método para consultar el numerador
	 * 
	 * @return int
	 */
	public int get_numerador(){
		return __numerador;
		}

	/**
	 * Método para modificar el numerador
	 * 
	 * @param __numerador
	 */
	public void set_numerador( int numerador ) {
		this.__numerador = numerador;
		}

	/**
	 * Método para consultar el denominador
	 * 
	 * @return int
	 */
	public int get_denominador(){
		return __denominador;
		}

	/**
	 * Método para modificar el denominador
	 * AVISO: El denominador debe ser distinto de cero
	 * @param denominador
	 */
	public void set_denominador( int denominador ){
		if( denominador == 0 )
			denominador = 1;
		this.__denominador = denominador;
		}

	/**
	 * Método que devuelve el resultado de la fracción
	 * 
	 * @return float
	 */
	public float resultado(){
		return ( (float) this.get_numerador() ) / ( (float) this.get_denominador() );
		}

	/**
	 * Método que realiza el producto de la fracción por un número
	 * 
	 * @param numero
	 */
	public void producto( int numero ){
		this.set_numerador( this.__numerador * numero );
		}

	/**
	 * Método que multiplica dos fracciones
	 * 
	 * @param fraccion
	 */
	public void multiplicar( Fraccion fraccion ){
		this.set_numerador( this.__numerador * fraccion.get_numerador() );
		this.set_denominador( this.__denominador * fraccion.get_denominador() );
		}

	/**
	 * Método que suma dos fracciones
	 * 
	 * @param fraccion
	 */
	public void suma( Fraccion fraccion ){
		this.__numerador = this.__numerador * fraccion.get_denominador() + fraccion.get_numerador() * this.__denominador;
		this.__denominador = this.__denominador * fraccion.get_denominador();
		}

	/**
	 * Método que resta dos fracciones
	 * 
	 * @param fraccion
	 */
	public void resta( Fraccion fraccion ) {
		this.__numerador = this.__numerador * fraccion.get_denominador() - fraccion.get_numerador() * this.__denominador;
		this.__denominador = this.__denominador * fraccion.get_denominador();
		}

	/**
	 * Método que realiza la simplificación de la fracción
	 */
	public void simplificar(){

		boolean irreducible;

		do{
			irreducible = true;

			for( int i = 2 ; i < this.__denominador ; i++ )
				if(  ( ( this.__numerador % i) == 0) && ( ( this.__denominador % i ) == 0 )  ) {
					this.__numerador = this.__numerador / i;
					this.__denominador = this.__denominador / i;
					irreducible = false;
					break;
					}
			}while( !irreducible );
		}

	} // Fin de la clase Fraccion
