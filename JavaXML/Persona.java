/**
 * Definición de la clase Persona
 * que será usada en javaXMLv2.java
 * @author Álvaro García Fuentes
 */
package javaXML;

public class Persona{
	
	// Atributos privados
	private String __nombre;
	private String __edad;
	private String __dni;
	
	// Constructor paramétrico
	Persona( String nombre , String edad , String dni ){
		this.setNombre( nombre );
		this.setEdad( edad );
		this.setDni( dni );		
		}
	
	// setters privados
	private void setNombre( String nombre ){ this.__nombre = nombre; }
	private void setEdad( String edad ){ this.__edad = edad; }
	private void setDni( String dni ){ this.__dni = dni; }

	// getters
	public String getNombre(){ return this.__nombre; }
	public String getEdad(){ return this.__edad; }
	public String getDni(){ return this.__dni; }
	
	} // Fin de la clase Persona
