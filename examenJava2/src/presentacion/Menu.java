/**
 * Menu.java
 * menu para elegir una opcion
 * @author Alvaro Garcia Fuentes
 */
package presentacion;

public class Menu{

    private String  cadenaMenu;
    private int  numeroOpciones;
    
    /**
     * Constructor paramétrico
     * @param titulo
     * @param opciones
     */
    public Menu( String titulo, String[] opciones ) {
        
    	numeroOpciones = opciones.length;
    	
        cadenaMenu = titulo + '\n';
        
        for( String i : opciones ) {
            cadenaMenu += i + '\n';
        }
    }
    
    /**
     * Muestra las opciones disponibles
     */
    private void mostrar(){
        System.out.println( cadenaMenu );
    }
    
    /**
     * Pide una opcion por teclado
     * @return int
     */
    private int pedirOpcion(){

        int opcion = 0;

        do{
            try{
                opcion = Teclado.leerEntero( "Introduzca una opción: " );
            }
            catch( Exception e ){
                System.out.println( e );
            }
        }while(opcion < 1 || opcion > this.numeroOpciones );
        
        return opcion;
    }
    
    /**
     * gestiona el menu
     * @return int
     */
    public int gestionar(){
        mostrar();
        return pedirOpcion();
    }

} // Fin de la clase Menu
