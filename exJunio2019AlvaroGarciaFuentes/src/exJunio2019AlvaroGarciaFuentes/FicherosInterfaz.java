/**
 * FicherosInterfaz.java
 * Interfaz para manejar ficheros
 * @author Alvaro Garcia Fuentes
 */
package exJunio2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    private JScrollPane scrollableTextArea1;
    private JScrollPane scrollableTextArea2;
    private JButton boton;
    private JButton terminar;

    private JFileChooser fc1;
    private JFileChooser fc2;
    private JTextField txtEntrada;
    private JTextField txtSalida;

    private JButton botonEntrada;
    private JButton botonSalida;
    
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
        this.setSize( 800 , 650 );
        this.setLocationRelativeTo( null );
        getContentPane().setLayout( null );
        this.setResizable( false );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Inicializa los componentes de la ventana
     */
    private void inicializarComponentes() {

        // creamos los componentes
        texto = new JLabel( "Limpiar los comentarios de un archivo fuente" );
        textoEntrada = new JLabel( "Archivo original: " );
        textoSalida = new JLabel( "Archivo modificado: " );
        boton = new JButton( "Limpiar Comentarios" );
        terminar = new JButton( "Salir" );
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        botonEntrada = new JButton( "Fichero de entrada" );
        botonSalida = new JButton( "Fichero de salida" );
        scrollableTextArea1 = new JScrollPane( cajaEntrada );  
        scrollableTextArea2 = new JScrollPane( cajaSalida ); 
        
        // configuramos los componentes
        texto.setBounds( 239 , 12 , 375 , 25 );

        boton.setBounds( 300 , 131 , 200 , 30 ); // ( x , y , ancho , alto )
        boton.addActionListener( this );

        textoEntrada.setBounds( 25 , 173 , 200 , 25 );        
        scrollableTextArea1.setBounds( 25 , 210, 350 , 353 );

        textoSalida.setBounds( 426 , 173 , 200 , 25 );
        scrollableTextArea2.setBounds( 425 , 210, 350 , 353 );
        
        terminar.setBounds( 300 , 575 , 200 , 30 ); // ( x , y , ancho , alto )
        terminar.addActionListener( this );

        txtEntrada = new JTextField();
        txtEntrada.setBounds(100, 47, 400, 30);
        txtEntrada.setColumns(10);
        
        txtSalida = new JTextField();
        txtSalida.setBounds(100, 89, 400, 30);
        txtSalida.setColumns(10);
        
        botonEntrada.addActionListener( this );
        botonEntrada.setBounds(530, 47, 171, 25);
        
        botonSalida.addActionListener( this );
        botonSalida.setBounds(530, 91, 171, 25);
        
        // anyadimos los componentes a la ventana
        getContentPane().add( texto );
        getContentPane().add( textoEntrada );
        getContentPane().add( textoSalida );
        getContentPane().add( boton );
        getContentPane().add( scrollableTextArea1 );
        getContentPane().add( scrollableTextArea2 );
        getContentPane().add( terminar );
        getContentPane().add( txtEntrada );
        getContentPane().add( txtSalida );
        getContentPane().add( botonEntrada );
        getContentPane().add( botonSalida );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

        fc1 = new JFileChooser();
        fc2 = new JFileChooser();
        
    	String resultado = "";
    	ArrayList<String> datos;
    	ArrayList<String> datosEntrada;

    	ArrayList<String> datosSalida;
    	int seleccionado1;
        int seleccionado2;
        
        if( e.getSource() == terminar ) {
            System.exit(0);
        }
        
        else if( e.getSource() == botonEntrada ) {
            if( numeroParametros < 1 ) {
                seleccionado1 = fc1.showOpenDialog( this.getContentPane() );
                if( seleccionado1 == JFileChooser.APPROVE_OPTION ) {
                    nombreEntrada = fc1.getSelectedFile().getAbsolutePath();
                }
            }
            txtEntrada.setText( nombreEntrada );

    	    try {
                datosEntrada = Ficheros.leer( txtEntrada.getText() );
            
                for( String i : datosEntrada ) {
                    resultado += i + "\n";
                }
                
        	    cajaEntrada.setText( resultado );
            }catch( Exception i ) {
    		    JOptionPane.showMessageDialog(null, "No existe el archivo");
    	    }
    	
        }
        
        else if( e.getSource() == botonSalida ) {
            if( numeroParametros < 2 ) {
                seleccionado2 = fc2.showOpenDialog( this.getContentPane() );
                if( seleccionado2 == JFileChooser.APPROVE_OPTION ) {
                    nombreSalida = fc2.getSelectedFile().getAbsolutePath();
                }
            }
            
            txtSalida.setText( nombreSalida );

            File archivo = new File( txtSalida.getText() );
            if( archivo.exists() ) {
                try {
                    datosSalida = Ficheros.leer( txtSalida.getText() );
            
                    for( String i : datosSalida ) {
                        resultado += i + "\n";
                    }
                
        	        cajaSalida.setText( resultado );
                }catch( Exception i ) {
    		        JOptionPane.showMessageDialog( null , "No se pudo abrir el archivo" );
    	        }
    	    }
        }
        
        else if( e.getSource() == boton ) {
    	
    	    try {
                datos = Ficheros.leer( txtEntrada.getText() );
                Ficheros.escribir( txtSalida.getText(),  Ficheros.eliminarComentarios( datos ) );
                datosSalida = Ficheros.leer( txtSalida.getText() );
            
                for( String i : datosSalida ) {
                    resultado += i + "\n";
                }
                
        	    cajaSalida.setText( resultado );
            }catch( Exception i ) {
    		    JOptionPane.showMessageDialog( null , "Seleccione los archivos primero" );
    	    }
    	}
        
    }

    public static void main( String[] args ) {

        String autor = "";
    
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
            System.exit(0);
        }

        FicherosInterfaz miVentana = new FicherosInterfaz( autor );
        miVentana.setVisible( true );
    }
} // fin de la clase Interfaz
