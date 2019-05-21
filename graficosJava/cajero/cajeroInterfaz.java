/**
 * cajeroInterfaz.java
 * Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal";
 * es decir, con el menor número de billetes y monedas posibles.
 * Componentes gráficos:
 *    Etiquetas.
 *    Caja de texto para introducir dinero a cambiar.
 *    Cajas de texto para billetes y monedas.
 *    Botón para calcular.
 * Opcional: sustituir la etiqueta de cada billete y moneda por su imagen.
*/
package cajero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cajeroInterfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel texto;
	private JLabel texto500;
	private JLabel texto200;
	private JLabel texto100;
	private JLabel texto50;
	private JLabel texto20;
	private JLabel texto10;
	private JLabel texto5;
	private JLabel texto2;
	private JLabel texto1;
	private JLabel texto050;
	private JLabel texto020;
	private JLabel texto010;
	private JLabel texto005;
	private JLabel texto002;
	private JLabel texto001;
	private JTextField caja;
	private JTextField caja500;
	private JTextField caja200;
	private JTextField caja100;
	private JTextField caja50;
	private JTextField caja20;
	private JTextField caja10;
	private JTextField caja5;
	private JTextField caja2;
	private JTextField caja1;
	private JTextField caja050;
	private JTextField caja020;
	private JTextField caja010;
	private JTextField caja005;
	private JTextField caja002;
	private JTextField caja001;
	private JButton boton;

	public cajeroInterfaz(){
		super( "Validacion de DNI" ); // constructor de la clase padre JFrame
		configurarVentana();      // configuramos la ventana
		inicializarComponentes(); // inicializamos los atributos o componentes
	    }

	private void configurarVentana(){
		
		// tamanyo de la ventana (ancho, alto)
		this.setSize( 400 , 575 );
		// ventana centrada en la pantalla
		this.setLocationRelativeTo( null );
		// no usamos ningun layout, asi podremos dar posiciones a los componentes
		this.setLayout( null );
		// ventana no redimensionable
		this.setResizable( false );
		// al cerrar la ventana termina todo proceso
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		}

	private void inicializarComponentes(){
		
        // creamos los componentes
		texto = new JLabel();
		texto500 = new JLabel();
		texto200 = new JLabel();
		texto100 = new JLabel();
		texto50 = new JLabel();
		texto20 = new JLabel();
		texto10 = new JLabel();
		texto5 = new JLabel();
		texto2 = new JLabel();
		texto1 = new JLabel();
		texto050 = new JLabel();
		texto020 = new JLabel();
		texto010 = new JLabel();
		texto005 = new JLabel();
		texto002 = new JLabel();
		texto001 = new JLabel();
		caja = new JTextField();
		boton = new JButton();
		caja500 = new JTextField();
		caja200 = new JTextField();
		caja100 = new JTextField();
		caja50 = new JTextField();
		caja20 = new JTextField();
		caja10 = new JTextField();
		caja5 = new JTextField();
		caja2 = new JTextField();
		caja1 = new JTextField();
		caja050 = new JTextField();
		caja020 = new JTextField();
		caja010 = new JTextField();
		caja005 = new JTextField();
		caja002 = new JTextField();
		caja001 = new JTextField();
		
		texto.setText( "Introduzca la cantidad:" );
		texto.setBounds( 75 , 25 , 200 , 25 ); // (x, y, ancho, alto)
		caja.setBounds( 250 , 25 , 85 , 25 ); // igual que con el texto
		
		boton.setText( "Comprobrar cambio" ); // dar texto al boton
		boton.setBounds( 100 , 100 , 200 , 30 ); // posicion y tamanyo del boton (x, y, ancho, alto)
		boton.addActionListener( this ); // hacemos que el boton tenga una accion, que estara en esta clase

		texto500.setText( "Billetes de 500:" );
		texto500.setBounds( 20 , 150 , 200 , 25 );
		caja500.setBounds( 125 , 150 , 50 , 25 );
		texto200.setText( "Billetes de 200:" );
		texto200.setBounds( 20 , 200 , 200 , 25 );
		caja200.setBounds( 125 , 200 , 50 , 25 );
		texto100.setText( "Billetes de 100:" );
		texto100.setBounds( 20 , 250 , 200 , 25 );
		caja100.setBounds( 125 , 250 , 50 , 25 );
		texto50.setText( "Billetes de 50:" );
		texto50.setBounds( 20 , 300 , 200 , 25 );
		caja50.setBounds( 125 , 300 , 50 , 25 );
		texto20.setText( "Billetes de 20:" );
		texto20.setBounds( 20 , 350 , 200 , 25 );
		caja20.setBounds( 125 , 350 , 50 , 25 );
		texto10.setText( "Billetes de 10:" );
		texto10.setBounds( 20 , 400 , 200 , 25 );
		caja10.setBounds( 125 , 400 , 50 , 25 );
		texto5.setText( "Billetes de 5:" );
		texto5.setBounds( 20 , 450 , 200 , 25 );
		caja5.setBounds( 125 , 450 , 50 , 25 );
		texto2.setText( "Monedas de 2:" );
		texto2.setBounds( 200 , 150 , 200 , 25 );
		caja2.setBounds( 300 , 150 , 50 , 25 );
		texto1.setText( "Monedas de 1:" );
		texto1.setBounds( 200 , 200 , 200 , 25 );
		caja1.setBounds( 300 , 200 , 50 , 25 );
		texto050.setText( "Monedas de 0,5:" );
		texto050.setBounds( 190 , 250 , 200 , 25 );
		caja050.setBounds( 300 , 250 , 50 , 25 );
		texto020.setText( "Monedas de 0,2:" );
		texto020.setBounds( 190 , 300 , 200 , 25 );
		caja020.setBounds( 300 , 300 , 50 , 25 );
		texto010.setText( "Monedas de 0,1:" );
		texto010.setBounds( 190 , 350 , 200 , 25 );
		caja010.setBounds( 300 , 350 , 50 , 25 );
		texto005.setText( "Monedas de 0,05:" );
		texto005.setBounds( 180 , 400 , 200 , 25 );
		caja005.setBounds( 300 , 400 , 50 , 25 );
		texto002.setText( "Monedas de 0,02:" );
		texto002.setBounds( 180 , 450 , 200 , 25 );
		caja002.setBounds( 300 , 450 , 50 , 25 );
		texto001.setText( "Monedas de 0,01:" );
		texto001.setBounds( 180 , 500 , 200 , 25 );
		caja001.setBounds( 300 , 500 , 50 , 25 );
		
		// anyadimos los componentes a la ventana
		this.add( texto );
		this.add( caja );
		this.add( boton );
		this.add( texto500 );
		this.add( caja500 );
		this.add( texto200 );
		this.add( caja200 );
		this.add( texto100 );
		this.add( caja100 );
		this.add( texto50 );
		this.add( caja50 );
		this.add( texto20 );
		this.add( caja20 );
		this.add( texto10 );
		this.add( caja10 );
		this.add( texto5 );
		this.add( caja5 );
		this.add( texto2 );
		this.add( caja2 );
		this.add( texto1 );
		this.add( caja1 );
		this.add( texto050 );
		this.add( caja050 );
		this.add( texto020 );
		this.add( caja020 );
		this.add( texto010 );
		this.add( caja010 );
		this.add( texto005 );
		this.add( caja005 );
		this.add( texto002 );
		this.add( caja002 );
		this.add( texto001 );
		this.add( caja001 );
		}

	@Override
    public void actionPerformed( ActionEvent e ){
		
		double dni = Double.parseDouble( caja.getText() );	
		int[] resultado = Monedas.devuelveCambio( dni );
		
		caja500.setText( String.valueOf( resultado[0] ) );
		caja200.setText( String.valueOf( resultado[1] ) );
		caja100.setText( String.valueOf( resultado[2] ) );
		caja50.setText( String.valueOf( resultado[3] ) );
		caja20.setText( String.valueOf( resultado[4] ) );
		caja10.setText( String.valueOf( resultado[5] ) );
		caja5.setText( String.valueOf( resultado[6] ) );
		caja2.setText( String.valueOf( resultado[7] ) );
		caja1.setText( String.valueOf( resultado[8] ) );
		caja050.setText( String.valueOf( resultado[9] ) );
		caja020.setText( String.valueOf( resultado[10] ) );
		caja010.setText( String.valueOf( resultado[11] ) );
		caja005.setText( String.valueOf( resultado[12] ) );
		caja002.setText( String.valueOf( resultado[13] ) );
		caja001.setText( String.valueOf( resultado[14] ) );
	    }

	public static void main( String[] args ){
		cajeroInterfaz miCajero = new cajeroInterfaz();
	    miCajero.setVisible( true );
		}
	
	} // Fin del programa
