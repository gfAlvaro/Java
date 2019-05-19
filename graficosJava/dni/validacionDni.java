package dni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class validacionDni extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel texto;
	private JLabel textoResultado;
	private JTextField caja;
	private JTextField cajaResultado;
	private JButton boton;

	public validacionDni(){
		super( "Validacion de DNI" ); // constructor de la clase padre JFrame
		configurarVentana();      // configuramos la ventana
		inicializarComponentes(); // inicializamos los atributos o componentes
	    }

	private void configurarVentana(){
		
		// tamanyo de la ventana (ancho, alto)
		this.setSize( 300 , 250 );
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
		caja = new JTextField();
		boton = new JButton();
		textoResultado = new JLabel();
		cajaResultado = new JTextField();
		
		texto.setText( "Introduzca numero de DNI con letra." );
		texto.setBounds( 25 , 25 , 250 , 25 ); // (x, y, ancho, alto)
		caja.setBounds( 100 , 50 , 85 , 25 ); // igual que con el texto
		
		boton.setText( "Comprobar" ); // dar texto al boton
		boton.setBounds( 50 , 100 , 200 , 30 ); // posicion y tamanio del boton (x, y, ancho, alto)
		boton.addActionListener( this ); // hacemos que el boton tenga una accion, que estara en esta clase

		textoResultado.setText( "Resultado: " );
		textoResultado.setBounds( 50 , 150 , 100 , 25 );
		cajaResultado.setBounds( 125 , 150 , 125 , 25 );
		
		// anyadimos los componentes a la ventana
		this.add( texto );
		this.add( caja );
		this.add( boton );
		this.add( textoResultado );
		this.add( cajaResultado );
	    }

	@Override
    public void actionPerformed( ActionEvent e ){
		
		String dni = caja.getText();
		String resultado;
		
		if(  Dni.esValido( dni )  )
			resultado = "";
		else
			resultado = "no ";
		
		cajaResultado.setText( "El DNI " + resultado + "es valido." );
	    }

	public static void main( String[] args ){
		validacionDni miDNI = new validacionDni();
	    miDNI.setVisible( true );
		}
	
	} // Fin del programa
