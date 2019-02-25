/**
* Funciones de la biblioteca matemática
* @author Alvaro Garcia Fuentes
* @version 1.0
*/

package bibliotecaMatematica;

public class Matematica{
	
	/**
	 * funcion que comprueba si un numero es primo
	 * @param numero
	 * @return boolean
	 */
	public static boolean esPrimo( int numero ){
		
		boolean resultado = true;
		
		for( int i = 2 ; i < numero ; i++ )
			if( numero % i == 0 ){
				resultado = false;
				break;
				}
		
		return resultado;
		}
	
	/**
	 * funcion que devuelve el siguiente numero primo al entero dado
	 * @param numero
	 * @return int
	 */
	public static int siguientePrimo( int numero ) {
		
		int resultado;

		for( resultado = numero + 1 ; !esPrimo(resultado) ; resultado++ ){}
					
		return resultado;
		}
	
	/**
	 * funcion que devuelve la potencia de un numero real dados su base
	 * y exponente
	 * @param base
	 * @param exponente
	 * @return float
	 * @see potencia(int, int)
	 */
	public static float potencia( float base , float exponente ) {
		
		float resultado = 1;

		for( int i = 1 ; i <= exponente ; i++ )
			resultado = resultado * base;
			
		return resultado;
		}

	/**
	 * funcion que devuelve la potencia de un numero entero dados su base
	 * y exponente
	 * @param base
	 * @param exponente
	 * @return float
	 * @see potencia(float, float)
	 */
	public static int potencia( int base , int exponente ) {
		
		int resultado = 1;

		for( int i = 1 ; i <= exponente ; i++ )
			resultado = resultado * base;
			
		return resultado;
		}
	
	/**
	 * funcion que cuenta cuántos dígitos tiene un numero entero
	 * @param numero
	 * @return int
	 */
	public static int digitos( int numero ) {
		
		return Integer.toString(numero).length();
		}
	
	/**
	 * funcion que voltea las cifras de un número, quedando estas invertidas
	 * @param numero
	 * @return int
	 * @see digitos(int), potencia(int, int)
	 */
	public static int voltea( int numero ) {
		
		int resultado = 0;
		int num = numero, n;
		int digit = digitos(numero);
		
		for( int i = 0 ; i <= digit; i++ ) {
			n = num % 10;
			resultado = resultado + n*potencia(10, digit-i-1);
			num = num / 10;
			}
		
		return resultado;
		}

	/**
	 * funcion que comprueba si un numero es capicua
	 * @param numero
	 * @return boolean
	 * @see voltea(int)
	 */
	public static boolean esCapicua(int numero) {
		
		return numero == voltea(numero);
		}
	
	/**
	 * funcion que devuelve el digito que esta
	 *  en la posicion N de un numero entero
	 * AVISO: Si N no es menor o igual a la cantidad de digitos del numero
	 *        devuelve -1
	 * @param numero
	 * @return int
	 */
	public static int digitoN( int numero, int N ){

		if( N <= digitos(numero) )
			return Character.getNumericValue(Integer.toString(numero).charAt(N));

		else
			// Si N es mayor a la cantidad de dígitos,
			// se devuelve -1 como valor de error
			return -1;
		}
	
	/**
	* funcion que da la posición de la primera ocurrencia de un dígito
	* dentro de un número entero. Si no se encuentra, devuelve -1.
	* @param numero
	* @param digito
	* @return int
	*/
	public static int posicionDeDigito( int numero, int digito ){
		
		int resultado = -1;
		int digi = digitos(numero);
		
		if(  ( digito >= 0 ) && ( digito <= digi )  )
			for( int i = 0 ; i < digi ; i++ )
				if(  digito == digitoN( numero, i )  )
					resultado = i;
		
		return resultado;
		}

	/**
	 * funcion que le quita a un número n dígitos por detrás (por laderecha).
	 * @param numero
	 * @param n
	 * @see potencia(int, int), quitaPorDelante(int, int)
	 * @return int
	 */
	public static int quitaPorDetras( int numero , int n ){

		return numero / potencia( 10 , n );
		}
	
	/**
	 * funcion que le quita a un número n dígitos por delane (por la izquierda).
	 * @param numero
	 * @param n
	 * @return int
	 * @see potencia(int, int), quitaPorDetras(int, int)
	 */
	public static int quitaPorDelante( int numero , int n ){

		return numero % potencia( 10 , n );
		}

	/**
	 * Añade un digito a un numero por detras
	 * AVISO: el parametro digito debe estar entre 0 y 9, ambos inclusives
	 * @param numero
	 * @param digito
	 * @return int
	 * @see pegaPorDelante(int, int)
	 */
	public static int pegaPorDetras( int numero , int digito ) {
	
		return numero*10 + digito;
		}
	
	/**
	 * Funcion que añade un digito a un numero por delante
	 * @param numero
	 * @param digito
	 * @return int
	 * @see pegaPorDetras(int, int)
	 * @see potencia(int, int)
	 */
	public static int pegaPorDelante( int numero , int digito ) {
		
		return numero + digito * potencia( 10 , digitos(numero) );
		}

	/**
	 * pega dos numeros para formar uno
	 * @param numero1
	 * @param numero2
	 * @return int
	 */
	public static int juntaNumeros( int numero1 , int numero2 ) {
		
		return numero1 * potencia( 10 , digitos(numero2) ) + numero2;
		}
	
	/**
	 * funcion que toma como parámetros las posiciones inicial y final dentro de un numero
	 * y devuelve el trozo correspondiente
	 * @param numero
	 * @return
	 * @see juntaNumeros(int, int)
	 */
	public static int trozoDeNumero( int numero ) {

		return juntaNumeros( numero/potencia( 10 , digitos(numero)-1 ) , numero % 10 );
		}
	
	} // Fin de la biblioteca matematica

