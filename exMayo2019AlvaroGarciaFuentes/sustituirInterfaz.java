/**
 * sustituirInterfaz.java 
 * Programa que cambia los caracteres de un fichero y los almacena en otro
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class sustituirInterfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private String archivoEntrada;    
    private String archivoSalida;    

    private JLabel texto;
    private JLabel textoEntrada;
    private JLabel textoSalida;
    private JTextField caja;
    private JTextArea cajaEntrada;
    private JTextArea cajaSalida;
    private JButton boton;
    private JFileChooser fc1;
    private JFileChooser fc2;

    /**
     * Constructor
     */
    sustituirInterfaz() {
        super( "Sustituir ocurrencias" );
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
        caja = new JTextField();
        boton = new JButton();
        textoEntrada = new JLabel();
        textoSalida = new JLabel();
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        fc1 = new JFileChooser();
        int seleccionado;
        String cadenaEntrada = "";
        ArrayList<String> datosEntrada;
        
        // configuramos los componentes
        texto.setText( "Sustitucion de caracteres de un archivo." );
        texto.setBounds( 260 , 25 , 400 , 25 );

        boton.setText( "Sustituir" );
        boton.setBounds( 325 , 100 , 150 , 30 );
        boton.addActionListener( this );

        textoEntrada.setText( "Archivo original: " );
        textoEntrada.setBounds( 25 , 150 , 150 , 25 );
        cajaEntrada.setBounds( 25 , 175 , 350 , 350 );

        seleccionado = fc1.showOpenDialog( this.getContentPane() );
        if( seleccionado == JFileChooser.APPROVE_OPTION ) {
            archivoEntrada = fc1.getSelectedFile().getAbsolutePath();
        }
        
        try {
            datosEntrada = Ocurrencias.leerArchivo( archivoEntrada );

            for( String i : datosEntrada ){
                cadenaEntrada += i + "\n";
            }
        }catch( Exception e ) {
            cadenaEntrada = e.toString();
        }
        cajaEntrada.setText( cadenaEntrada );
        
        textoSalida.setText( "Archivo modificado: " );
        textoSalida.setBounds( 425 , 150 , 150 , 25 );
        cajaSalida.setBounds( 425 , 175 , 350 , 350 );

        // añadimos componentes a la ventana
        this.add( texto );
        this.add( caja );
        this.add( boton );
        this.add( textoEntrada );
        this.add( cajaEntrada );
        this.add( textoSalida );
        this.add( cajaSalida );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

    	fc2 = new JFileChooser();
        String resultado = "";
        ArrayList<String> datos;
        ArrayList<String> datosSalida;
        int seleccionado;
        
        // ventana para elegir archivo de salida
        seleccionado = fc2.showOpenDialog( this.getContentPane() );
        if( seleccionado == JFileChooser.APPROVE_OPTION ) {
            archivoSalida = fc2.getSelectedFile().getAbsolutePath();
        }
        
        // leer archivo de entrada, sustituir caracteres y escribir en archivo de salida
        try {
            datos = Ocurrencias.leerArchivo( archivoEntrada );
            datos = Ocurrencias.sustituir( datos );
            Ocurrencias.escribirArchivo( archivoSalida , datos );
            
            datosSalida = Ocurrencias.leerArchivo( archivoSalida );
            
            for( String i : datosSalida ) {
                resultado += i + "\n";
            }
            
        }catch( Exception g ){
            resultado = g.toString();
        }

        // mostrar achivo de salida
        cajaSalida.setText( resultado );
        }
	
    public static void main( String[] args ) {
        sustituirInterfaz miVentana = new sustituirInterfaz();
        miVentana.setVisible( true );
    }

} // Fin del programa
