/**
 * 
 * @author Alvaro Garcia Fuentes
 */
package exJunio2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea; // Para cajas de texto con saltos de linea

public class FicherosInterfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private static String nombreEntrada;
    private static String nombreSalida;
    
    private static int numeroParametros;
    
    private JLabel texto;
    private JLabel textoEntrada;
    private JLabel textoSalida;

    private JTextArea cajaEntrada;
    private JTextArea cajaSalida;
    private JButton boton;

	private JFileChooser fc1;
    private JFileChooser fc2;

    /**
     * Constructor
     */
    FicherosInterfaz( String autor ) {

        super( autor );
        configurarVentana();
        inicializarComponentes();
    }

    /**
     * configurar las medidas de la ventana
     */
    private void configurarVentana(){
        this.setSize( 800 , 600 );
        this.setLocationRelativeTo( null );
        this.setLayout( null );
        this.setResizable( false );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Inicializa los componentes de la ventana
     */
    private void inicializarComponentes() {

        // creamos los componentes
        texto = new JLabel();
        textoEntrada = new JLabel();
        textoSalida = new JLabel();
        boton = new JButton();
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        fc1 = new JFileChooser();
        fc2 = new JFileChooser();
        ArrayList<String> datosEntrada;
        String cadenaEntrada = "";
        int seleccionado;
        
        // configuramos los componentes
        texto.setText( "Limpiar los comentarios de un archivo fuente" );
        texto.setBounds( 240 , 25 , 350 , 25 );

        boton.setText( "Limpiar Comentarios" ); // texto del boton
        boton.setBounds( 300 , 75 , 200 , 30 ); // ( x , y , ancho , alto )
        boton.addActionListener( this ); // accion para el boton, que estara en esta clase

        textoEntrada.setText( "Archivo original:" );
        textoEntrada.setBounds( 25 , 125 , 200 , 25 );        
        cajaEntrada.setBounds( 25 , 150, 350 , 400 );
        
        if( numeroParametros < 1 ) {
            seleccionado = fc1.showOpenDialog( this.getContentPane() );
            if( seleccionado == JFileChooser.APPROVE_OPTION ) {
                nombreEntrada = fc1.getSelectedFile().getAbsolutePath();
            }
        }
        
        try {
            datosEntrada = Ficheros.leer( nombreEntrada );
            for( String i : datosEntrada ) {
                cadenaEntrada += i + "\n";
            }
        }catch( Exception o ) {
            cadenaEntrada = o.toString();
        }
        cajaEntrada.setText( cadenaEntrada );

        textoSalida.setText( "Archivo modificado:" );
        textoSalida.setBounds( 425 , 125 , 200 , 25 );
        cajaSalida.setBounds( 425 , 150, 350 , 400 );
        
        // anyadimos los componentes a la ventana
        this.add( texto );
        this.add( textoEntrada );
        this.add( textoSalida );
        this.add( boton );
        this.add( cajaEntrada );
        this.add( cajaSalida );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

    	String resultado = "";
    	ArrayList<String> datos;
    	ArrayList<String> datosSalida;
        int seleccionado2;
        
        if( numeroParametros < 2 ) {
            seleccionado2 = fc2.showOpenDialog( this.getContentPane() );
            if( seleccionado2 == JFileChooser.APPROVE_OPTION ) {
                nombreSalida = fc2.getSelectedFile().getAbsolutePath();
            }
        }
    	
    	try {
    		datos = Ficheros.leer( nombreEntrada ) ;
    		Ficheros.escribir( nombreSalida,  Ficheros.eliminarComentarios( datos ) );
            datosSalida = Ficheros.leer( nombreSalida );
            
            for( String i : datosSalida ) {
                resultado += i + "\n";
            }
    	}catch( Exception i ) {
    		resultado = i.toString();
    	}
    	
    	cajaSalida.setText( resultado );
    }

    public static void main( String[] args ) {

        String autor;
    
        if(  ( numeroParametros = args.length ) >= 2  ) {
            nombreEntrada = args[0];
            nombreSalida = args[1];	
        }
    
        else if( args.length == 1 ) {
            nombreEntrada = args[0];
        }
    
        try {
            autor = Ficheros.leer( "autor.txt" ).get(0);
        }catch( Exception i ) {
            autor = "autor no encontrado";
        }

        FicherosInterfaz miVentana = new FicherosInterfaz( autor );
        miVentana.setVisible( true );
    }

} // fin de la clase Interfaz