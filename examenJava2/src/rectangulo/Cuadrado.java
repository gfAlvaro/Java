/**
 * Cuadrado.java
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
     * función que devuelve el lado del Cuadrado
     * @return int
     */
    public void setLado( int lado ) throws ArithmeticException {
        super.setAlto( lado );
        super.setAncho( lado );
        }
    
    /**
     * Función para comprobar si dos Cuadrados son iguales
     * @param cuadrado
     * @return boolean
     */
    public boolean esIgual( Cuadrado cuadrado ){
        return this.equals( cuadrado );
        }

    public int compareTo(Cuadrado a){
    	 
        int estado=-1;
        if( this.getLado() == a.getLado())
            estado=0;
        else if( this.getLado() > a.getLado() )
            estado=1;
        
        return estado;
        }
    
    /**
     * Función para comprobar si dos Cuadrados son iguales
     * @param cuadrado
     * @return boolean
     */
    public boolean esMayor( Cuadrado cuadrado ){
        return ( this.compareTo( cuadrado ) > 0 );
        }
    /**
     * Función para comprobar si dos Cuadrados son iguales
     * @param cuadrado
     * @return boolean
     */
     public boolean esMenor( Cuadrado cuadrado ){
        return ( this.compareTo( cuadrado ) < 0 );
        }
    
    } // Fin de la clase Cuadrado
