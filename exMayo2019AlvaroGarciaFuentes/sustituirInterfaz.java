/**
 * sustituirInterfaz.java 
 * Programa que cambia los caracteres de un fichero y los almacena en otro
 * Componentes gráficos:
 *  Etiquetas.
 *  Fichero origen y destino.
 *  Botón para ejecutar la acción.
 *  Caja de texto con el contenido del fichero destino no editable.
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea; // Para cajas de texto con saltos de linea

public class sustituirInterfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JLabel texto;
    private JLabel textoResultado;
    private JTextField caja;
    private JTextArea cajaResultado;
    private JButton boton;

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
        this.setSize( 400 , 600 );
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
        textoResultado = new JLabel();
        cajaResultado = new JTextArea();

        // configuramos los componentes
        texto.setText( "Nombre archivo:" );
        texto.setBounds( 25 , 25 , 150 , 25 );
        caja.setBounds( 200 , 25 , 150 , 25 ); // ( x , y , ancho , alto )

        boton.setText( "Sustituir" ); // texto del boton
        boton.setBounds( 100 , 100 , 200 , 30 ); // ( x , y , ancho , alto )
        boton.addActionListener( this ); // accion para el boton, que estara en esta clase

        textoResultado.setText( "Resultado: " );
        textoResultado.setBounds( 25 , 150 , 100 , 25 );
        cajaResultado.setBounds( 25 , 175 , 350 , 350 );

        // anyadimos los componentes a la ventana
        this.add( texto );
        this.add( caja );
        this.add( boton );
        this.add( textoResultado );
        this.add( cajaResultado );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

        String archivo1 = caja.getText();
        String archivoSalida = Ocurrencias.sustituir( archivo1 );	
        String linea;
        String resultado = "";
        File f;
        FileReader fr;
        BufferedReader br;

        try{
            // Abrir, leer y cerrar el archivo
            f = new File( archivoSalida );
            fr = new FileReader( f );
            br = new BufferedReader( fr );

            while(  ( linea = br.readLine() ) != null  ) {
                resultado = resultado + linea + '\n';
            }
            fr.close();

        }catch( Exception g ){
            cajaResultado.setText( "ERROR" );
        }

        cajaResultado.setText( resultado );
        }

    public static void main( String[] args ) {
        sustituirInterfaz miVentana = new sustituirInterfaz();
        miVentana.setVisible( true );
    }

} // Fin del programa
