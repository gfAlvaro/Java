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
    private JTextField txtTextoentrada;
    private JTextField txtTextosalida;
    private JButton botonEntrada;
    private JButton botonSalida;
    private JScrollPane scrollableTextArea1;
    private JScrollPane scrollableTextArea2;  

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
        texto = new JLabel( "Sustitucion de caracteres de un archivo."  );
        caja = new JTextField();
        boton = new JButton("Ok");
        textoEntrada = new JLabel( "Archivo original:" );
        textoSalida = new JLabel( "Archivo modificado:" );
        cajaEntrada = new JTextArea();
        cajaSalida = new JTextArea();
        botonEntrada = new JButton( "Fichero Entrada" );
        botonSalida = new JButton( "Fichero de salida" );
        txtTextoentrada = new JTextField();
        txtTextosalida = new JTextField();
        scrollableTextArea1 = new JScrollPane(cajaEntrada);
        scrollableTextArea2 = new JScrollPane(cajaSalida);  
        
        // configuramos los componentes
        texto.setBounds( 244 , 12 , 400 , 25 );

        boton.setBounds( 332 , 144 , 150 , 30 );
        boton.addActionListener( this );

        textoEntrada.setBounds( 35 , 186 , 150 , 25 );
        scrollableTextArea1.setBounds( 35 , 223 , 350 , 302 );
        
        textoSalida.setBounds( 424 , 186 , 150 , 25 );
        scrollableTextArea2.setBounds( 414 , 223 , 350 , 302 );
        
        botonEntrada.setBounds(587, 49, 150, 30);
        botonEntrada.addActionListener( this );
        
        botonSalida.setBounds(587, 94, 150, 30);
        botonSalida.addActionListener( this );   
        
        txtTextoentrada.setBounds(113, 52, 446, 25);
        txtTextoentrada.setColumns(10);
        
        txtTextosalida.setBounds(113, 100, 446, 25);
        txtTextosalida.setColumns(10);
        
        // añadimos componentes a la ventana
        getContentPane().add( texto );
        getContentPane().add( caja );
        getContentPane().add( boton );
        getContentPane().add( textoEntrada );
        getContentPane().add( scrollableTextArea1 );
        getContentPane().add( textoSalida );
        getContentPane().add( scrollableTextArea2 );
        getContentPane().add( botonEntrada );    
        getContentPane().add( botonSalida );        
        getContentPane().add( txtTextoentrada );
        getContentPane().add( txtTextosalida );
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
        int seleccionado;
        int seleccionado2;
        //boolean leerEntrada = true;
        //boolean leerSalida = false;
        
        if( e.getSource() == botonEntrada ) {
            seleccionado = fc1.showOpenDialog( this.getContentPane() );
            if( seleccionado == JFileChooser.APPROVE_OPTION ) {
                archivoEntrada = fc1.getSelectedFile().getAbsolutePath();
                txtTextoentrada.setText(archivoEntrada);
                
                try {
                
                    File archivoEntrada = new File( txtTextoentrada.getText() );
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
            
        }
        
        else if( e.getSource() == botonSalida ) {
        	
            seleccionado2 = fc2.showOpenDialog( this.getContentPane() );
            if( seleccionado2 == JFileChooser.APPROVE_OPTION ) {
                archivoSalida = fc2.getSelectedFile().getAbsolutePath();
                txtTextosalida.setText( archivoSalida );
                                
                try {
                File archivo = new File( txtTextosalida.getText() );
                if(!archivo.isFile() ) {
                	FileWriter ficheroSalida = new FileWriter(txtTextosalida.getText() );
                	BufferedWriter bw = new BufferedWriter(ficheroSalida);
                	bw.close();
                }
                }catch( Exception q ){
                    JOptionPane.showMessageDialog( null , "No se pudo crear el archivo de salida" );	
                }
            }
        }
        
        else if( e.getSource() == boton ) {
        
            // leer archivo de entrada, sustituir caracteres y escribir en archivo de salida
            try {
            	File archivo = new File( txtTextosalida.getText() );
            	FileReader fr = new FileReader( archivo );
            	BufferedReader br = new BufferedReader( fr );
            	String salida = "";
            	String i;
            	
                Ocurrencias.sustituir( txtTextoentrada.getText() , txtTextosalida.getText() );
            
            
                while( ( i = br.readLine() ) != null ) {
                    salida = i + "\n";
                    cajaSalida.append( salida );
                }
                
                br.close();
                
            }catch( Exception g ){
                JOptionPane.showMessageDialog( null, "Seleccione primero los archivos" );
            }
        }
        
    }

    public static void main( String[] args ) {
        OcurrenciasInterfaz miVentana = new OcurrenciasInterfaz();
        miVentana.setVisible( true );
    }
} // Fin del programa
