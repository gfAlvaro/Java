/**
 * Cuadrado.java
 * Definicion de la clase Cuadrado que hereda de la clase Rectangulo
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {
		
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
    public int getLado(){
        return this.getAlto();
    }

    /**
     * función que devuelve el lado del Cuadrado
     * @return int
     */
    public void setLado( int lado ) throws ArithmeticException {
        this.setAlto( lado );
        this.setAncho( lado );
    }

    /**
     * 
     */
    @Override
    public int hashCode(){
        
        final int prime = 31;
        int resultado = 1;

        resultado = prime * resultado + getLado();

        return resultado;
    }

    @Override
    public boolean equals( Object objeto ){

        boolean salida = true;

        if( this == objeto ){
            salida = true;
        }
        
        if( objeto == null ){
            salida = false;
        }
        
        if( getClass() != objeto.getClass() ){
            salida = false;
        }

        Cuadrado otro = ( Cuadrado ) objeto;

        if( getLado() != otro.getLado() ){
            salida = false;
        }
        
        if( getLado() != otro.getLado() ){
            salida = false;
        }
        
        return salida;
    }

    @Override
    public int compareTo( Cuadrado cuadrado ){
    	
    	int salida;
    	
        if( this.getLado() < cuadrado.getLado() ){
            salida = -1;
        }
        else{
            if( this.getLado() > cuadrado.getLado() ){
        	    salida = 1;
        	}
            else{
                salida = 0;
            }
        }
        
        return salida;
    }

    /**
     * Función para comparar Cuadrados
     * @param cuadrado
     * @return boolean
     */
    public boolean esIgual( Cuadrado cuadrado ){
        return this.equals( cuadrado );
    }

    /**
     * Función para comparar Cuadrados
     * @param cuadrado
     * @return boolean
     */
    public boolean esDistinto( Cuadrado cuadrado ){
        return !this.equals( cuadrado );
    }
    
    /**
     * Función para comparar Cuadrados
     * @param cuadrado
     * @return boolean
     */
    public boolean esMayor( Cuadrado cuadrado ){
        return this.compareTo( cuadrado ) > 0;
    }
    
    /**
     * Función para comprobar Cuadrados
     * @param cuadrado
     * @return boolean
     */
     public boolean esMenor( Cuadrado cuadrado ){
        return this.compareTo( cuadrado ) < 0;
    }
     
     /**
      * Función para comparar Cuadrados
      * @param cuadrado
      * @return boolean
      */
     public boolean esMayorIgual( Cuadrado cuadrado ){
         return this.compareTo( cuadrado ) >= 0;
     }
     
     /**
      * Función para comprobar Cuadrados
      * @param cuadrado
      * @return boolean
      */
     public boolean esMenorIgual( Cuadrado cuadrado ){
         return this.compareTo( cuadrado ) <= 0;
     }
     
} // Fin de la clase Cuadrado
