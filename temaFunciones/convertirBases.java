/**
 * convertirBases.java
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 * @author Álvaro García Fuentes
 */

package funciones;

import bibliotecaMatematica.Matematica;

public class convertirBases{
	
	/**
	 * funcion para pasar de binario a decimal
	 * @param binario
	 * @return int
	 */
	public static int binarioDecimal( int binario ){

		int numero = 0;
		
		for( int i = 0 ; i < Matematica.digitos(binario) ; i++ )
			numero = numero + Matematica.potencia( 2 , Matematica.digitos(binario) - i - 1 )
					 * Matematica.digitoN( binario , i );
		
		return numero;
		}
	
	/**
	 * función para pasar de decimal a binario
	 * @param numero
	 * @return int
	 */
	public static int decimalBinario( int numero ){

		int cociente = numero;
		int resto;
		String cadenaBinaria = "";

		while( cociente != 1 ){
			resto = cociente % 2;
			cociente = cociente / 2;
			cadenaBinaria = resto + cadenaBinaria;
			}
		cadenaBinaria = cociente + cadenaBinaria;

		return Integer.parseInt( cadenaBinaria , 10 );		
		}

	/**
	 * funcion para pasar de octal a decimal
	 * @param binario
	 * @return int
	 */
	public static int octalDecimal( int octal ){
		
		int numero = 0;
		
		for( int i = 0 ; i < Matematica.digitos( octal ) ; i++ )
			numero = numero + Matematica.potencia( 8 , Matematica.digitos( octal ) - i - 1 )
					 * Matematica.digitoN( octal , i );

		return numero;
		}

	/**
	 * funcion para pasar de decimal a octal
	 * @param numero
	 * @return int
	 */
	public static int decimalOctal( int numero ){

		int cociente = numero;
		int resto;
		String cadenaOctal = "";

		while( cociente != 1 ){
			resto = cociente % 8;
			cociente = cociente / 8;
			cadenaOctal = resto + cadenaOctal;
			}
		cadenaOctal = cociente + cadenaOctal;

		return Integer.parseInt( cadenaOctal , 10 );		
		}

	/**
	 * funcion para pasar de hexadecimal a decimal
	 * @param binario
	 * @return int
	 */
	public static int hexadecimalDecimal( String hexadecimal ){
		
		int cifra, numero = 0;
		
		for( int i = 0 ; i < hexadecimal.length() ; i++ ) {
			switch( hexadecimal.charAt(i) ){
				case 'A':
					cifra = 10;
					break;
				case 'B':
					cifra = 11;
					break;
				case 'C':
					cifra = 12;
					break;
				case 'D':
					cifra = 13;
					break;
				case 'E':
					cifra = 14;
					break;
				case 'F':
					cifra = 15;
					break;
				default:
					cifra = Character.getNumericValue(hexadecimal.charAt(i));
				}
			
			numero = numero + Matematica.potencia( 16 , hexadecimal.length( ) - i - 1 )
					 * cifra;
			}
		
		return numero;
		}
	
	/**
	 * funcion para psar de decimal a hexadecimal
	 * @param numero
	 * @return int
	 */
	public static String decimalHexadecimal( int numero ){

		int cociente = numero;
		int resto;
		String cadenaHexadecimal = "";

		while( cociente >= 16 ){
			resto = cociente % 16;
			cociente = cociente / 16;

			switch( resto ){
				case 10:
					cadenaHexadecimal = 'A' + cadenaHexadecimal;
					break;
				case 11:
					cadenaHexadecimal = 'B' + cadenaHexadecimal;
					break;
				case 12:
					cadenaHexadecimal = 'C' + cadenaHexadecimal;
					break;
				case 13:
					cadenaHexadecimal = 'D' + cadenaHexadecimal;
					break;
				case 14:
					cadenaHexadecimal = 'E' + cadenaHexadecimal;
					break;
				case 15:
					cadenaHexadecimal = 'F' + cadenaHexadecimal;
					break;
				default:
					cadenaHexadecimal = resto + cadenaHexadecimal;
				}
			}
		cadenaHexadecimal = cociente + cadenaHexadecimal;

		return cadenaHexadecimal;		
		}	
	
	public static void main( String[] args ){
		
		int numero = 1020;
		String cadenaHexadecimal;
		
		numero = decimalBinario( numero );
		System.out.println( "numero en binario: " + numero );
		numero = binarioDecimal( numero );
		System.out.println( "numero en decimal: " + numero );		
		numero = decimalOctal( numero );
		System.out.println( "numero en octal: " + numero );
		numero = octalDecimal( numero );		
		cadenaHexadecimal = decimalHexadecimal( numero );
		System.out.println( "numero en hexadecimal: " + cadenaHexadecimal );		
		numero = hexadecimalDecimal( cadenaHexadecimal );
		System.out.println( "decimal de nuevo: " + numero );
		}
	} // Fin del programa
