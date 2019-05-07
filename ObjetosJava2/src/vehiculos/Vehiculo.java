/**
 * Vehiculo.java
 *
 * @author Álvaro García Fuentes
 */
package vehiculos;

public class Vehiculo{
	
	// atributos privados
	protected static int __vehiculosCreados = 0;
	protected static int __kilometrosTotales = 0;
	protected int __kilometrosRecorridos;
	
	// constructor
	Vehiculo(){
		vehiculosCreados( vehiculosCreados() + 1 );
		this.kilometrosRecorridos(0);
		}
	
	// getters
	public static int vehiculosCreados(){
		return __vehiculosCreados;
		}
	public static int kilometrosTotales(){
		return __kilometrosTotales;
		}
	public int kilometrosRecorridos(){
		return this.__kilometrosRecorridos;
		}
	
	// setters
	protected static void vehiculosCreados( int creados ){
		__vehiculosCreados = creados;
		}
	protected static void kilometrosTotales( int totales ){
		__kilometrosTotales = totales;
		}
	protected void kilometrosRecorridos( int recorridos ){
		this.__kilometrosRecorridos = recorridos;
		}
	
	/**
	 * Funcion que incrementa los kilometros recorridos y totales
	 */
	public void andar(){
		this.kilometrosRecorridos( this.kilometrosRecorridos() + 1 );
		kilometrosTotales( kilometrosTotales() + 1 );
		}
	
	} // Fin de la clase Vehiculo

