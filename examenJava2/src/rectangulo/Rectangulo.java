/**
 * Rectangulo.java
 * Definicion de la clase Rectangulo
 * @author Álvaro García Fuentes
 */
package rectangulo;

public class Rectangulo{

    //Atributos privados de instancia

    private int  ancho;
    private int  alto;
    
    /**
     * Constructor paramétrico
     * @param ancho
     * @param alto
     */
    Rectangulo( int ancho , int alto ){
        this.setAncho( ancho );
        this.setAlto( alto );
        }

    /**
     * muestra el atributo ancho
     * @return int
     * @see setAncho, getAlto, setAlto
     */
    public int getAncho(){ return this.ancho; }

    /**
     * muestra el atributo alto
     * @return int
     */
    public int getAlto(){ return this.alto; }

    /**
     * modifica el atributo ancho.
     * Lanza una excepcion si el parámetro de entrada
     * está fuera del rango de (0-10]
     * @param ancho
     * @throws ArithmeticException
     * @see getAncho, getAlto, setAlto
     */
    protected void setAncho( int ancho ) throws ArithmeticException {

    	if(  ( ancho <= 0 ) || ( ancho > 10 )  ){
            throw new ArithmeticException();
            }
        else{
            this.ancho = ancho;
            }
        }
    
    /**
     * modifica el atributo alto.
     * Lanza una excepcion si el parámetro de entrada
     * está fuera del rango (0-10]
     * @param alto
     * @throws ArithmeticException
     */
    protected void setAlto( int alto ) throws ArithmeticException {
    	
        if(  ( alto <= 0 ) || ( alto > 10 )  ){
            throw new ArithmeticException();
            }
        else{
            this.alto = alto;
            }
        }

    /**
     * Dibuja el rectángulo por pantalla
     */
    @Override
    public String toString(){

        String resultado = "";

        for( int i = 0 ; i < this.alto ; i++ ){
        	
            for( int j = 0 ; j < this.ancho ; j++ ){
            	
            	if(  ( i == 0 || j == 0 ) || ( i == this.alto - 1 || j == this.ancho-1 )  ){
                    resultado += "[]";
                    }
            	else{
                    resultado += "  ";
                    }
                }

            resultado += "\n";
            }
        return resultado;
        }
    
    } // Fin de la clase Rectangulo
