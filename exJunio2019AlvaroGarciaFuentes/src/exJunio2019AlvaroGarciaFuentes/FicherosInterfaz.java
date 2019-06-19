/**
 * FicherosInterfaz.java
 * Interfaz para manejar ficheros
 * @author Alvaro Garcia Fuentes
 */
package exJunio2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FicherosInterfaz extends JFrame implements ActionListener {

    private static final long  serialVersionUID = 1L;

    private static String  nombreArchivoEntrada;
    private static String  nombreArchivoSalida;
    private static int  numeroParametros;
    
    private JLabel  textoEncabezado;
    private JLabel  textoEntrada;
    private JLabel  textoSalida;
    private JTextField  txtEntrada;
    private JTextField  txtSalida;
    private JTextArea  cajaEntrada;
    private JTextArea  cajaSalida;
    private JScrollPane  scrollEntrada;
    private JScrollPane  scrollSalida;
    private static JButton  botonEntrada;
    private static JButton  botonSalida;
    private static JButton  botonLimpiar;
    private JButton  terminar;
    private JFileChooser  elegirArchivoEntrada;
    private JFileChooser  elegirArchivoSalida;

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
        textoEncabezado = new JLabel( "Limpiar los comentarios de un archivo fuente" );
        textoEntrada = new JLabel( "Archivo original: " );
        textoSalida = new JLabel( "Archivo modificado: " );
        botonLimpiar = new JButton( "Limpiar Comentarios" );
        terminar = new JButton( "Salir" );
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        botonEntrada = new JButton( "Fichero de entrada" );
        botonSalida = new JButton( "Fichero de salida" );
        scrollEntrada = new JScrollPane( cajaEntrada );  
        scrollSalida = new JScrollPane( cajaSalida ); 
        txtEntrada = new JTextField();

        // configuramos los componentes
        textoEncabezado.setBounds( 239 , 12 , 375 , 25 );

        botonLimpiar.setBounds( 300 , 131 , 200 , 30 ); // ( x , y , ancho , alto )
        botonLimpiar.addActionListener( this );

        textoEntrada.setBounds( 25 , 173 , 200 , 25 );        
        scrollEntrada.setBounds( 25 , 210, 350 , 353 );

        textoSalida.setBounds( 426 , 173 , 200 , 25 );
        scrollSalida.setBounds( 425 , 210 , 350 , 353 );
        
        terminar.setBounds( 300 , 575 , 200 , 30 ); // ( x , y , ancho , alto )
        terminar.addActionListener( this );

        txtEntrada.setBounds( 100 , 47 , 400 , 30 );
        txtEntrada.setColumns(10);
        
        if( numeroParametros >= 1 ) {
        	txtEntrada.setText( nombreArchivoEntrada );
            
            try {
                File archivo = new File( txtEntrada.getText() );
                FileReader fr = new FileReader( archivo );
                BufferedReader br = new BufferedReader(fr );
                
                String resultado = "";
                String i;
                
                while(  ( i = br.readLine() ) != null  ) {
                	resultado = i + "\n";
                    cajaEntrada.append( resultado );
                }

                br.close();
            }
            catch( Exception k ) {
            	JOptionPane.showMessageDialog( null , "El archivo de entrada no existe" );
            	System.exit(0);
            }
        }
        
        txtSalida = new JTextField();
        txtSalida.setBounds( 100 , 89 , 400 , 30 );
        txtSalida.setColumns(10);
 
        if( numeroParametros == 2 ) {
        	txtSalida.setText( nombreArchivoSalida );
        }
                
        botonEntrada.addActionListener( this );
        botonEntrada.setBounds( 530 , 47 , 171 , 25 );
        
        botonSalida.addActionListener( this );
        botonSalida.setBounds( 530 , 91 , 171 , 25 );
        
        // anyadimos los componentes a la ventana
        getContentPane().add( textoEncabezado );
        getContentPane().add( textoEntrada );
        getContentPane().add( textoSalida );
        getContentPane().add( botonLimpiar );
        getContentPane().add( scrollEntrada );
        getContentPane().add( scrollSalida );
        getContentPane().add( terminar );
        getContentPane().add( txtEntrada );
        getContentPane().add( txtSalida );
        getContentPane().add( botonEntrada );
        getContentPane().add( botonSalida );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar cada botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

        elegirArchivoEntrada = new JFileChooser();
        elegirArchivoSalida = new JFileChooser();
        
    	String resultado = "";
    	int seleccionado1;
        int seleccionado2;
        
        if( e.getSource() == terminar ) {
            System.exit(0);
        }
        
        else if( e.getSource() == botonEntrada ){
        	
            seleccionado1 = elegirArchivoEntrada.showOpenDialog( this.getContentPane() );
            if( seleccionado1 == JFileChooser.APPROVE_OPTION ) {
                nombreArchivoEntrada = elegirArchivoEntrada.getSelectedFile().getAbsolutePath();
                txtEntrada.setText( nombreArchivoEntrada );
            }
            
    	    try {
    	    	File entrada = new File( txtEntrada.getText() );
                FileReader fr = new FileReader(entrada);
                BufferedReader br = new BufferedReader(fr);
    	    	String i = "";
    	    	
                while(  ( i = br.readLine() ) != null  ) {
                    resultado = i + "\n";
            	    cajaEntrada.append( resultado );
                }
                
                br.close();
                botonEntrada.setEnabled(false);
            }catch( Exception i ) {
    		    JOptionPane.showMessageDialog( null , "No existe el archivo" );
    	    }

        }
        
        else if( e.getSource() == botonSalida ) {

            seleccionado2 = elegirArchivoSalida.showOpenDialog( this.getContentPane() );
            if( seleccionado2 == JFileChooser.APPROVE_OPTION ) {
                nombreArchivoSalida = elegirArchivoSalida.getSelectedFile().getAbsolutePath();
                txtSalida.setText( nombreArchivoSalida );
            }

            File archivo = new File( txtSalida.getText() );
            
            if( archivo.exists() ) {
                try {
                    FileReader fr = new FileReader(archivo);
                    BufferedReader br = new BufferedReader( fr );
                
                    br.close();
                    botonSalida.setEnabled(false);
                }catch( Exception i ) {
    		        JOptionPane.showMessageDialog( null , "No se pudo abrir el archivo" );
    	        }
    	    }
            
        }
        
        else if( e.getSource() == botonLimpiar ) {
    	
    	    try {
                Ficheros.eliminarComentarios( txtEntrada.getText(), txtSalida.getText() );
            
                File archivo = new File( txtSalida.getText() );
                FileReader fr = new FileReader( archivo );
                BufferedReader br = new BufferedReader( fr );
                String i;
                
                while(  ( i = br.readLine() ) != null  ) {
                    resultado = i + "\n";
            	    cajaSalida.append( resultado );
                }
                
                br.close();
                botonLimpiar.setEnabled(false);
            }catch( Exception i ) {
    		    JOptionPane.showMessageDialog( null , "Seleccione primero los archivos" );
            }
    	}
        
    }

    public static void main( String[] args ) {

        String autor = "";
        
        numeroParametros = args.length;
        
        if(  numeroParametros == 2  ) {
            nombreArchivoEntrada = args[0];
            nombreArchivoSalida = args[1];
            botonEntrada.setEnabled(false);
            botonSalida.setEnabled(false);
        }
    
        else if( numeroParametros == 1 ) {
            nombreArchivoEntrada = args[0];
            botonSalida.setEnabled(false);
        }
        else if( numeroParametros != 0 ){
        	JOptionPane.showMessageDialog(null, "Numero de parametros incorrecto");
        	System.exit(0);
        }
    
        try {
            File fichero = new File("autor.txt");
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            autor = br.readLine();

            br.close();
        }catch( Exception i ) {
            System.exit(0);
        }

        FicherosInterfaz miVentana = new FicherosInterfaz( autor );
        miVentana.setVisible( true );
    }
    
} // fin de la clase Interfaz
