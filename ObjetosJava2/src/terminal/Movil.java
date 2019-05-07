/**
 * Movil.java
 * Definición de la clase Movil
 * que hereda de la clase Terminal
 * @author Álvaro García Fuentes
 */
package terminal;

public class Movil extends Terminal{
	
	private String __tipoTarifa;
	private float __precio;
	
	/**
	 * Constructor paramétrico
	 * @param IP
	 * @param tipoTarifa
	 */
	Movil( String IP , String tipoTarifa ){
		super( IP );
		this.__tipoTarifa = tipoTarifa;
		if( tipoTarifa == "rata" )
			this.__precio = (float) 0.06;
		else if( tipoTarifa == "mono" )
			this.__precio = (float) 0.12;
		else if( tipoTarifa == "bisonte" )
			this.__precio = (float) 0.30;
		else
			this.__precio = 0;
		}
	
	/**
	 * getter
	 * @return String
	 */
	public String tipoTarifa(){
		return this.__tipoTarifa;
		}

	/**
	 * getter
	 * @return String
	 */
	public float precio(){
		return this.__precio;
		}
	
	/**
	 * Método toString de la clase
	 * @return String
	 */
	public String toString(){
		return super.toString() + " - tarificados "
				+ this.precio()*this.tiempo()/60 + " euros";
		}
	
	} // Fin de la clase Movil

