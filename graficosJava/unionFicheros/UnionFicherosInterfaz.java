/**
 * unionFicherosInterfaz.java 
 * Programa que guarda en un fichero el contenido de otros dos ficheros,
 * de tal forma que en el fichero resultante aparezcan las líneas
 *  de los primeros dos ficheros mezcladas, es decir, la primera línea
 *  será del primer fichero, la segunda será del segundo fichero,
 *  la tercera será la siguiente del primer fichero, etc.
 * Componentes gráficos:
 *  Etiquetas.
 *  Fichero origen y destino.
 *  Botón para ejecutar la acción.
 *  Caja de texto con el contenido del fichero destino no editable.
 * @author Alvaro Garcia Fuentes
 */
package unionFicheros;

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

public class UnionFicherosInterfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel texto1;
	private JLabel texto2;
	private JLabel textoResultado;
	private JTextField caja1;
	private JTextField caja2;
	private JTextArea cajaResultado;
	private JButton boton;
	
	UnionFicherosInterfaz(){
		super( "Mezclar archivos" );
		configurarVentana();      // configuramos la ventana
		inicializarComponentes(); // inicializamos los atributos o componentes
		}
	
	private void configurarVentana(){
		
		// tamanio de la ventana (ancho, alto)
		this.setSize( 400 , 600 );
		
		// ventana centrada en la pantalla
		this.setLocationRelativeTo( null );
		
		// no usamos ningun layout, solo asi podremos dar posiciones a los componentes
		this.setLayout( null );

		// la ventana no es redimensionable
		this.setResizable( false );

		// cuando se cierre la ventana termina todo proceso
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		}

	private void inicializarComponentes(){
		
        // creamos los componentes
		texto1 = new JLabel();
		caja1 = new JTextField();
		texto2 = new JLabel();
		caja2 = new JTextField();
		boton = new JButton();
		textoResultado = new JLabel();
		cajaResultado = new JTextArea();
		
		// configuramos los componentes
		texto1.setText( "Primer archivo:" );
		texto1.setBounds( 25 , 25 , 150 , 25 );
		caja1.setBounds( 200 , 25 , 150 , 25 ); // ( x , y , ancho , alto )
		texto2.setText( "Segundo archivo:" );
		texto2.setBounds( 25 , 50 , 150 , 25 );
		caja2.setBounds( 200 , 50 , 150 , 25 );
		
		boton.setText( "Mezclar" ); // texto del boton
		boton.setBounds( 100 , 100 , 200 , 30 ); // ( x , y , ancho , alto )
		boton.addActionListener( this ); // accion para el boton, que estara en esta clase

		textoResultado.setText( "Resultado: " );
		textoResultado.setBounds( 25 , 150 , 100 , 25 );
		cajaResultado.setBounds( 25 , 175 , 350 , 350 );
		
		// anyadimos los componentes a la ventana
		this.add( texto1 );
		this.add( caja1 );
		this.add( texto2 );
		this.add( caja2 );
		this.add( boton );
		this.add( textoResultado );
		this.add( cajaResultado );
	    }

	@Override
    public void actionPerformed( ActionEvent e ){
		
		String archivo1 = caja1.getText();
		String archivo2 = caja2.getText();
		String archivoSalida = Ficheros.mezcla( archivo1 , archivo2 );	
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
			
			while(  ( linea = br.readLine() ) != null  )
				resultado = resultado + linea + '\n';
			
			try{
				fr.close();
			}catch( Exception i ){
				System.exit(2);
				}
			
		}catch( Exception g ){
			System.exit(1);
			}
		
		cajaResultado.setText( resultado );
		}

	public static void main( String[] args ){
		UnionFicherosInterfaz miVentana = new UnionFicherosInterfaz();
	    miVentana.setVisible( true );
		}

	} // Fin del programa
