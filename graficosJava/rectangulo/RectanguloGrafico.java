/**
 * AreaPerimetroRectangulo.java
 * 
 * Calcular el perí­metro y área de un rectángulo dada su base y su altura.
 * Componentes gráficos:
 *  Etiquetas.
 *  Cajas de texto para base y altura.
 *  Botón para calcular.
 *  Caja de texto resultado.
 * No utilizar asistente.
 * @author Alvaro Garcia Fuentes
 */
package rectangulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RectanguloGrafico extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel texto;
	private JLabel textoBase;
	private JLabel textoAltura;
	private JLabel textoResultado;
	private JTextField cajaBase;
	private JTextField cajaAltura;
	private JTextField cajaResultado;
	private JButton boton;

	public RectanguloGrafico(){
		super( "Area y perimetro de un rectangulo" ); // constructor de la clase padre JFrame
		configurarVentana();      // configuramos la ventana
		inicializarComponentes(); // inicializamos los atributos o componentes
	    }

	private void configurarVentana(){
		
		// tamanio de la ventana (ancho, alto)
		this.setSize( 350 , 300 );
		
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
		texto = new JLabel();
		textoBase = new JLabel();
		cajaBase = new JTextField();
		textoAltura = new JLabel();
		cajaAltura = new JTextField();
		boton = new JButton();
		textoResultado = new JLabel();
		cajaResultado = new JTextField();
		
		texto.setText( "Introduzca los datos del rectangulo." ); // dar texto a la etiqueta
		texto.setBounds( 50 , 25 , 250 , 25 ); // posicion y tamanio del texto (x, y, ancho, alto)
		
		// configuramos los componentes
		textoBase.setText( "Base: " );
		textoBase.setBounds( 100 , 75 , 100 , 25 );
		cajaBase.setBounds( 200 , 75 , 50 , 25 ); // igual que con el texto
		textoAltura.setText( "Altura: " );
		textoAltura.setBounds( 100 , 100 , 100 , 25 );
		cajaAltura.setBounds( 200 , 100 , 50 , 25 );
		
		boton.setText( "Calcular" ); // dar texto al boton
		boton.setBounds( 75 , 150 , 200 , 30 ); // posicion y tamanio del boton (x, y, ancho, alto)
		boton.addActionListener( this ); // hacemos que el boton tenga una accion, que estara en esta clase

		textoResultado.setText( "Resultado: " );
		textoResultado.setBounds( 25 , 200 , 100 , 25 );
		cajaResultado.setBounds( 125 , 200 , 200 , 25 );
		
		// anyadimos los componentes a la ventana
		this.add( texto );
		this.add( textoBase );
		this.add( cajaBase );
		this.add( textoAltura );
		this.add( cajaAltura );
		this.add( boton );
		this.add( textoResultado );
		this.add( cajaResultado );
	    }

	@Override
    public void actionPerformed( ActionEvent e ){
		
		double base = Double.parseDouble( cajaBase.getText() );
		double altura = Double.parseDouble( cajaAltura.getText() );
		
		cajaResultado.setText(  "Area: " + Rectangulo.area( base , altura )
							+ ", perimetro: " + Rectangulo.perimetro( base , altura )  );
	    }

	public static void main( String[] args ){
		RectanguloGrafico miRectangulo = new RectanguloGrafico();
	    miRectangulo.setVisible( true );
		}
	
	} // Fin del programa
