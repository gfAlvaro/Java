/**
 * Función que convierte en palabras las cifras de un numero.
 * Se utiliza esta función en un programa principal para comprobar que funciona bien. Desde
 * la función no se muestra nada por pantalla, solo se usa print desde
 * el programa principal. Es de notar que hay una coma detrás de cada palabra salvo
 * al final.
 * @author Álvaro García Fuentes
 */

package convertidor;

public class convertirPalabras{
	
	/**
	 * Función auxiliar para ser usada
	 * dentro de convierteEnPalabras.
	 * La cadena devuelta es la transcripción
	 *  a texto del entero de entrada
	 * @param k
	 * @return
	 */
	public static String sacarCifra( int k ){
		
		String cadena = "";
		
		switch (k) {
			case 1:
				cadena = "uno";
				break;
			case 2:
				cadena = "dos";
				break;
			case 3:
				cadena = "tres";
				break;
			case 4:
				cadena = "cuatro";
				break;
			case 5:
				cadena = "cinco";
				break;
			case 6:
				cadena = "seis";
				break;
			case 7:
				cadena = "siete";
				break;
			case 8:
				cadena = "ocho";
				break;
			case 9:
				cadena = "nueve";
				break;
			default:
				cadena = "cero";
			}		
		return cadena;
		}
	
	/**
	 * Convierte los dígitos de un número en las correspondientes
	 * palabras y lo devuelve todo en una cadena de caracteres.
	 * @param n
	 * @return String
	 */
	public static String convierteEnPalabras( int n ){
		
		String listaCifras = Integer.toString(n);
		String cadena = "";
		
		for( int i = 0 ; i < listaCifras.length() ; i++ ){
			
			cadena += sacarCifra(  Integer.parseInt( "" + listaCifras.charAt(i) )  );
			
			if(  i < ( listaCifras.length() - 1 )  )
				cadena += ", ";
			}
		
		return cadena;
		}
	
	public static void main( String[] args ){
				
		System.out.println(  convierteEnPalabras( 470213 )  );
		}
	} // Fin del programa

