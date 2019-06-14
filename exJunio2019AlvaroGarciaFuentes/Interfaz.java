package exJunio2019AlvaroGarciaFuentes;
    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea; // Para cajas de texto con saltos de linea

public class Interfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private static String nombreEntrada;
    private static String nombreSalida;
    
    private JLabel texto;
    private JLabel textoEntrada;
    private JLabel textoSalida;

    private JTextArea cajaEntrada;
    private JTextArea cajaSalida;
    private JButton boton;

    /**
     * Constructor
     */
    Interfaz() throws Exception {

    //autor = Ficheros.leer( "autor.txt" ).get(0);
        super("Alvaro Garcia Fuentes" );
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

        // configuramos los componentes
        texto.setText( "Limpiar los comentarios de un archivo fuente" );
        texto.setBounds( 275 , 25 , 300 , 25 );

        boton.setText( "Limpiar Comentarios" ); // texto del boton
        boton.setBounds( 300 , 75 , 200 , 30 ); // ( x , y , ancho , alto )
        boton.addActionListener( this ); // accion para el boton, que estara en esta clase

        textoEntrada.setText( "Archivo original:" );
        textoEntrada.setBounds( 25 , 125 , 200 , 25 );
        textoSalida.setText( "Archivo modificado:" );
        textoSalida.setBounds( 425 , 125 , 200 , 25 );
        
        cajaEntrada.setBounds( 25 , 150, 350 , 400 );      
        cajaSalida.setBounds( 425 , 150, 350 , 400 );    
        
        try {
        cajaEntrada.setText( Ficheros.leer( nombreEntrada ).toString() );
        cajaSalida.setText( Ficheros.leer( nombreSalida ).toString() );     
        }catch( Exception o ) {
            cajaEntrada.setText( "ERROR al buscar ficheros ");
            cajaSalida.setText("ERROR al buscar ficheros "); 
        }

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

    	try {
        cajaEntrada.setText( Ficheros.leer( nombreEntrada ).toString() );
        Ficheros.escribir( nombreSalida, Ficheros.eliminarComentarios( Ficheros.leer(nombreSalida ) ) );
        cajaSalida.setText( Ficheros.leer( nombreEntrada ).toString() );
    	}catch( Exception i ) {
    		cajaSalida.setText( "ERROR: no se pudieron eliminar comentarios" );
    	}
    }

    public static void main( String[] args ) {

    	//final JFileChooser ventana;
    	//int returnVal;
        Interfaz miVentana;

    	if( args.length >= 2 ) {
    		nombreEntrada = args[0];
    		nombreSalida = args[1];
    		try {
            miVentana = new Interfaz();
            miVentana.setVisible( true );
            }
    		catch( Exception e ) {
    			System.out.println(e);
    		}

    	/*else if( args.length == 1 ) {
    		
    		nombreEntrada = args[0];
        	ventana = new JFileChooser();
        	returnVal = ventana.showDialog(FileChooserDemo2.this, "Attach");
        	nombreSalida = ventana.toString();
    		try {
            Interfaz miVentana = new Interfaz();
            miVentana.setVisible( true );
            }
    		catch( Exception e ) {
    			System.exit(1);
    		}
    	}*/
        }
    }

} // fin de la clase Interfaz