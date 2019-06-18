/**
 * sustituirInterfaz.java 
 * Programa que cambia los caracteres de un fichero y los almacena en otro
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class OcurrenciasInterfaz extends JFrame implements ActionListener {

    private static final long  serialVersionUID = 1L;

    private String  archivoEntrada;    
    private String  archivoSalida;
    private boolean  leerEntrada = true;
    private boolean  leerSalida = true;
    private boolean sustituir = true;

    private JLabel  textoEncabezado;
    private JLabel  textoEntrada;
    private JLabel  textoSalida;
    private JTextField  campoEntrada;
    private JTextField  campoSalida;
    private JTextArea  cajaEntrada;
    private JTextArea  cajaSalida;
    private JButton  botonSustituir;
    private JButton  botonEntrada;
    private JButton  botonSalida;
    private JScrollPane  scrollEntrada;
    private JScrollPane  scrollSalida;
    private JFileChooser  elegirArchivoEntrada;
    private JFileChooser  elegirArchivoSalida;

    /**
     * Constructor
     */
    OcurrenciasInterfaz() {
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
        getContentPane().setLayout( null );
        this.setResizable( false );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Inicializa los componentes de la ventana
     */
    private void inicializarComponentes() {

        // creamos los componentes
        textoEncabezado = new JLabel( "Sustitucion de caracteres de un archivo."  );
        botonSustituir = new JButton( "Ok" );
        textoEntrada = new JLabel( "Archivo original:" );
        textoSalida = new JLabel( "Archivo modificado:" );
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        botonEntrada = new JButton( "Fichero Entrada" );
        botonSalida = new JButton( "Fichero de salida" );
        campoEntrada = new JTextField();
        campoSalida = new JTextField();
        scrollEntrada = new JScrollPane( cajaEntrada );
        scrollSalida = new JScrollPane( cajaSalida );  

        // configuramos los componentes
        textoEncabezado.setBounds( 244 , 12 , 400 , 25 );
        botonSustituir.setBounds( 332 , 144 , 150 , 30 );
        botonSustituir.addActionListener( this );
        textoEntrada.setBounds( 35 , 186 , 150 , 25 );
        scrollEntrada.setBounds( 35 , 223 , 350 , 302 );
        textoSalida.setBounds( 424 , 186 , 150 , 25 );
        scrollSalida.setBounds( 414 , 223 , 350 , 302 );
        botonEntrada.setBounds(587, 49, 150, 30);
        botonEntrada.addActionListener( this );
        botonSalida.setBounds(587, 94, 150, 30);
        botonSalida.addActionListener( this );   
        campoEntrada.setBounds(113, 52, 446, 25);
        campoEntrada.setColumns(10);
        campoSalida.setBounds(113, 100, 446, 25);
        campoSalida.setColumns(10);

        // añadimos componentes a la ventana
        getContentPane().add( textoEncabezado );
        getContentPane().add( botonSustituir );
        getContentPane().add( textoEntrada );
        getContentPane().add( scrollEntrada );
        getContentPane().add( textoSalida );
        getContentPane().add( scrollSalida );
        getContentPane().add( botonEntrada );    
        getContentPane().add( botonSalida );        
        getContentPane().add( campoEntrada );
        getContentPane().add( campoSalida );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

        elegirArchivoEntrada = new JFileChooser();
        elegirArchivoSalida = new JFileChooser();
        
        String resultado = "";
        int seleccionado;
        int seleccionado2;

        if(  ( e.getSource() == botonEntrada ) && leerEntrada  ) {
            seleccionado = elegirArchivoEntrada.showOpenDialog( this.getContentPane() );
            if( seleccionado == JFileChooser.APPROVE_OPTION ) {
                archivoEntrada = elegirArchivoEntrada.getSelectedFile().getAbsolutePath();
                campoEntrada.setText(archivoEntrada);

                try {
                    File archivoEntrada = new File( campoEntrada.getText() );
                    FileReader fr = new FileReader( archivoEntrada );
                    BufferedReader br = new BufferedReader(fr);
                    String i="";

                    while( ( i = br.readLine() ) != null ) {
                        resultado = i + "\n";
                        cajaEntrada.append( resultado );
                    }

                    br.close();
                }catch(Exception i ){
                    JOptionPane.showMessageDialog(null, "El archivo no existe.");
                }
            }
            leerEntrada = false; 
        }

        else if(  ( e.getSource() == botonSalida ) && leerSalida ){

            seleccionado2 = elegirArchivoSalida.showOpenDialog( this.getContentPane() );
            if( seleccionado2 == JFileChooser.APPROVE_OPTION ) {
                archivoSalida = elegirArchivoSalida.getSelectedFile().getAbsolutePath();
                campoSalida.setText( archivoSalida );

                try {

                File archivo = new File( campoSalida.getText() );

                if(!archivo.isFile() ) {
                    FileWriter ficheroSalida = new FileWriter(campoSalida.getText() );
                    BufferedWriter bw = new BufferedWriter(ficheroSalida);
                    bw.close();
                }
                }catch( Exception q ){
                    JOptionPane.showMessageDialog( null , "No se pudo crear el archivo de salida" );	
                }
            }
            leerSalida = false;
        }

        else if(  sustituir && ( e.getSource() == botonSustituir )  ) {

            // leer archivo de entrada, sustituir caracteres y escribir en archivo de salida
            try {

                File archivo = new File( campoSalida.getText() );
                FileReader fr = new FileReader( archivo );
                BufferedReader br = new BufferedReader( fr );
                String salida = "";
                String i;

                Ocurrencias.sustituir( campoEntrada.getText() , campoSalida.getText() );

                while( ( i = br.readLine() ) != null ) {
                    salida = i + "\n";
                    cajaSalida.append( salida );
                }

                br.close();

            }catch( Exception g ){
                JOptionPane.showMessageDialog( null , "Seleccione primero los archivos" );
            }
        }

    }

    public static void main( String[] args ) {
        OcurrenciasInterfaz miVentana = new OcurrenciasInterfaz();
        miVentana.setVisible( true );
    }
} // Fin del programa
