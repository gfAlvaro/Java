/**
 * ocurrenciasInterfaz.java
 * Programa que dice cuántas ocurrencias de una palabra hay en un fichero.
 * Componentes gráficos:
 *  Etiquetas.
 *  Fichero a comprobar.
 *  Caja de texto con resultado.
 *  Botón calcular.
 *  @author Alvaro Garcia Fuentes
 */
package ocurrencias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea; // Para cajas de texto con saltos de linea

public class ocurrenciasInterfaz extends JFrame implements ActionListener {

		private static final long serialVersionUID = 1L;
		
		private JLabel texto1;
		private JLabel texto2;
		private JLabel textoResultado;
		private JTextField caja1;
		private JTextField caja2;
		private JTextArea cajaResultado;
		private JButton boton;
		
		ocurrenciasInterfaz(){
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
			texto1.setText( "Archivo:" );
			texto1.setBounds( 25 , 25 , 150 , 25 );
			caja1.setBounds( 200 , 25 , 150 , 25 ); // ( x , y , ancho , alto )
			texto2.setText( "Palabra a contar:" );
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
			
			String archivo = caja1.getText();
			String palabra = caja2.getText();
			try{
			int salida = Contar.ContarOcurrencias( archivo , palabra );	
			cajaResultado.setText( Integer.toString( salida )  );
			}catch( Exception i ){
				cajaResultado.setText( "ERROR: no se pudieron contar las ocurrencias." ); }
			
			}

		public static void main( String[] args ){
			ocurrenciasInterfaz miVentana = new ocurrenciasInterfaz();
		    miVentana.setVisible( true );
			}

	} // Fin del programa