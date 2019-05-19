/**
 * Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
 * Calcula y muestra la distancia entre ellos.
 * Componentes gráficos:
 *   Etiquetas.
 *    Cajas de texto para base y altura.
 *    Botón para calcular.
 *    Caja de texto resultado.
 * No utilizar asistente
*/
package distancia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class distanciaEuclidea extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel texto;
	private JLabel textoX1;
	private JLabel textoY1;
	private JLabel textoX2;
	private JLabel textoY2;
	private JLabel textoResultado;
	private JTextField cajaX1;
	private JTextField cajaY1;
	private JTextField cajaX2;
	private JTextField cajaY2;
	private JTextField cajaResultado;
	private JButton boton;

	public distanciaEuclidea(){
		super( "Distancia euclídea" ); // constructor de la clase padre JFrame
		configurarVentana();      // configuramos la ventana
		inicializarComponentes(); // inicializamos los atributos o componentes
	    }

	private void configurarVentana(){
		
		// tamanyo de la ventana (ancho, alto)
		this.setSize( 300 , 350 );
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
		textoX1 = new JLabel();
		cajaX1 = new JTextField();
		textoY1 = new JLabel();
		cajaY1 = new JTextField();
		textoX2 = new JLabel();
		cajaX2 = new JTextField();
		textoY2 = new JLabel();
		cajaY2 = new JTextField();
		
		boton = new JButton();
		textoResultado = new JLabel();
		cajaResultado = new JTextField();
		
		texto.setText( "Coordenadas de los puntos." );
		texto.setBounds( 50 , 25 , 250 , 25 ); // (x, y, ancho, alto)
		
		// configuramos los componentes
		textoX1.setText( "x1: " );
		textoX1.setBounds( 75 , 75 , 100 , 25 );
		cajaX1.setBounds( 150 , 75 , 50 , 25 ); // igual que con el texto
		textoY1.setText( "y1: " );
		textoY1.setBounds( 75 , 100 , 100 , 25 );
		cajaY1.setBounds( 150 , 100 , 50 , 25 );
		
		textoX2.setText( "x2: " );
		textoX2.setBounds( 75 , 150 , 100 , 25 );
		cajaX2.setBounds( 150 , 150 , 50 , 25 );
		textoY2.setText( "y2: " );
		textoY2.setBounds( 75 , 175 , 100 , 25 );
		cajaY2.setBounds( 150 , 175 , 50 , 25 );
		
		boton.setText( "Calcular" ); // dar texto al boton
		boton.setBounds( 50 , 225 , 200 , 30 ); // posicion y tamanio del boton (x, y, ancho, alto)
		boton.addActionListener( this ); // hacemos que el boton tenga una accion, que estara en esta clase

		textoResultado.setText( "Resultado: " );
		textoResultado.setBounds( 25 , 275 , 100 , 25 );
		cajaResultado.setBounds( 125 , 275 , 150 , 25 );
		
		// anyadimos los componentes a la ventana
		this.add( texto );
		this.add( textoX1 );
		this.add( cajaX1 );
		this.add( textoY1 );
		this.add( cajaY1 );
		this.add( textoX2 );
		this.add( cajaX2 );
		this.add( textoY2 );
		this.add( cajaY2 );
		this.add( boton );
		this.add( textoResultado );
		this.add( cajaResultado );
	    }

	@Override
    public void actionPerformed( ActionEvent e ){
		
		double x1 = Double.parseDouble( cajaX1.getText() );
		double y1 = Double.parseDouble( cajaY1.getText() );
		double x2 = Double.parseDouble( cajaX2.getText() );
		double y2 = Double.parseDouble( cajaY2.getText() );
		
		cajaResultado.setText(  String.valueOf( Puntos.distancia( x1 , x2 , y1 , y2 ) )  );
	    }

	public static void main( String[] args ){
		distanciaEuclidea miDistancia = new distanciaEuclidea();
	    miDistancia.setVisible( true );
		}
	
	} // Fin del programa
