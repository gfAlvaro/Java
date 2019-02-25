/** Clase TestCirculo que crea una instancia de “Circulo”,
 *  muestra su estado, lo hace crecer 27 veces, averigua su área,
 *  lo hace decrecer 10 veces y muestra su estado final.
 *  @author Alvaro Garcia Fuentes
 */
package circulo;

public class pruebaCirculo{
	
	public static void main( String[] args ){
		
		Circulo miCirculo = new Circulo();
		
		System.out.println( miCirculo );
		
		miCirculo.setRadio( miCirculo.getRadio() * 27 );
		
		System.out.println( "Area: " + miCirculo.area() );
		
		miCirculo.setRadio( miCirculo.getRadio() / 10 );

		System.out.println( miCirculo );
		
		miCirculo.setRadio( -1 );
		
		System.out.println( miCirculo.getRadio() );
		}
	
	} // Fin del programa
