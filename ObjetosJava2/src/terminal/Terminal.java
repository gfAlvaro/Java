/**
 * Terminal.java
 * Definición de la clase Terminal
 * @author Álvaro García Fuentes
 */
package terminal;

public class Terminal{
	
	protected int __tiempo;
	protected String __IP;
	
	/**
	 * Constructor paramétrico
	 * @param entrada
	 */
	Terminal( String entrada ){
		
		this.__IP = entrada;
		this.__tiempo = 0;
		}

	/**
	 * setter
	 * @param tiempo
	 */
	public void tiempo( int tiempo ){
		this.__tiempo += tiempo;
		}
	
	/**
	 * getter
	 * @return int
	 */
	public int tiempo(){
		return this.__tiempo;
		}
	
	/**
	 * getter
	 * @return String
	 */
	public String IP(){
		return this.__IP;
		}
	
	/**
	 * Método toString de la clase
	 * @return String
	 */
	public String toString(){
		return "Nº " + this.IP() + " - " + this.tiempo() + "s de conversación";
		}
	
	/**
	 * Método para que un terminal llame a otro
	 * @param t
	 * @param numero
	 */
	public void llama( Terminal t , int numero ){
		
		this.tiempo( this.tiempo() + numero );
		t.tiempo( t.tiempo() + numero );
		}
	
	} // Fin de la clase Terminal

