/**
 * Circulo.java
 * Definicion de la clase “Circulo” en Java que responde al siguiente comportamiento:
 *
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar. Decrementa su radio.
 * Un círculo me devuelve su área si se la pido.
 * Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros.
 *  Ocupo un área de 0.7853981633974483 metros cuadrados” (método toString())
 * @author Alvaro Garcia Fuentes
 */
package circulo;

import javax.swing.JOptionPane;

public class Circulo{
	
	/**
	 * Atributo privado de la clase
	 * AVISO: debe ser siempre igual o mayor que 0
	 */
	private double __radio;

	/**
	 * Constructor por defecto de la clase Circulo
	 */
	public Circulo(){
		this.__radio = 1;
		}
	
	/**
	 * Constructor paramétrico de la clase Circulo
	 * @param radio
	 */
	public Circulo( double radio ){
		this.__radio = radio;
		}
	
	/**
	 * Método para consultar el radio del círculo
	 * @return double
	 */
	public double getRadio(){
		return this.__radio;
		}

	/**
	 * Método para modificar el radio del círculo
	 * @param radio
	 */
	public void setRadio( double radio ){
		
		if( radio < 0 )
			this.__radio = 0;
		else
			this.__radio = radio;
		
		if( this.__radio == 0 )
			JOptionPane.showMessageDialog( null , "Soy un mísero punto sin área" );
		}
	
	/**
	 * Método que calcula el área del círculo
	 * en función de su radio
	 * @return
	 */
	public double area(){
		return Math.PI * this.__radio * this.__radio;
		}

	@Override
	public String toString(){
		return "Soy un círculo de radio " + this.__radio + " metros.\nOcupo un área de " + this.area() + " metros cuadrados.";
		}
		
	} // Fin de la clase Circulo

