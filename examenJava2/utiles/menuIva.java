/**
 * menuIVA.java
 * definicion de la clase menuIva,
 * para seleccionar un tipo de IVA
 * para un Artículo
 * @author Álvaro García Fuentes
 */
package utiles;

public class menuIva{
	
    public static String menu(){

        int tipoIva;
        String resultado = "";

        do{
            System.out.println( "Seleccione el tipo de IVA deseado:" );
            System.out.println( "  1 para general." );
            System.out.println( "  2 para reducido." );
            System.out.println( "  3 para super reducido." );
            tipoIva = Teclado.leerEntero();

            switch( tipoIva ){
            case 1:
                resultado = "general";
                break;
            case 2:
                resultado = "reducido";
                break;
            case 3:
                resultado = "super reducido";
                break;
            default:
                System.out.println( "Opción incorrecta." );
            }
            
        }while(  ( tipoIva < 1 ) || ( tipoIva > 3 )  );

        return resultado;
    }

} // Fin de la clase MenuIVA
