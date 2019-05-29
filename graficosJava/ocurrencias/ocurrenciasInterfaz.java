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

public class ocurrenciasInterfaz extends JFrame implements ActionListener {

        private static final long serialVersionUID = 1L;

        private JLabel textoFichero;
        private JLabel textoPalabra;
        private JLabel textoResultado;
        private JTextField cajaFichero;
        private JTextField cajaPalabra;
        private JTextField cajaResultado;
        private JButton boton;

        ocurrenciasInterfaz(){
            super( "Contar ocurrencias" );
            configurarVentana();      // configuramos la ventana
            inicializarComponentes(); } // inicializamos los atributos o componentes
		
        private void configurarVentana(){

            // tamanio de la ventana (ancho, alto)
            this.setSize( 400 , 225 );

            // ventana centrada en la pantalla
            this.setLocationRelativeTo( null );

            // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            this.setLayout( null );

            // la ventana no es redimensionable
            this.setResizable( false );

            // cuando se cierre la ventana termina todo proceso
            this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); }

        private void inicializarComponentes(){

            // creamos los componentes
            textoFichero = new JLabel();
            cajaFichero = new JTextField();
            textoPalabra = new JLabel();
            cajaPalabra = new JTextField();
            boton = new JButton();
            textoResultado = new JLabel();
            cajaResultado = new JTextField();

            // configuramos los componentes
            textoFichero.setText( "Archivo:" );
            textoFichero.setBounds( 50 , 25 , 150 , 25 );
            cajaFichero.setBounds( 200 , 25 , 150 , 25 ); // ( x , y , ancho , alto )
            textoPalabra.setText( "Palabra a contar:" );
            textoPalabra.setBounds( 50 , 50 , 150 , 25 );
            cajaPalabra.setBounds( 200 , 50 , 150 , 25 );

            boton.setText( "Contar" ); // texto del boton
            boton.setBounds( 100 , 100 , 200 , 30 ); // ( x , y , ancho , alto )
            boton.addActionListener( this ); // accion para el boton, que estara en esta clase

            textoResultado.setText( "Numero de ocurrencias: " );
            textoResultado.setBounds( 100 , 150 , 150 , 25 );
            cajaResultado.setBounds( 250 , 150 , 50 , 25 );

            // anyadimos los componentes a la ventana
            this.add( textoFichero );
            this.add( cajaFichero );
            this.add( textoPalabra );
            this.add( cajaPalabra );
            this.add( boton );
            this.add( textoResultado );
            this.add( cajaResultado ); }

        @Override
        public void actionPerformed( ActionEvent e ){

            String archivo = cajaFichero.getText();
            String palabra = cajaPalabra.getText();
            
            try{
                int salida = Contar.ContarOcurrencias( archivo , palabra );
                
                cajaResultado.setText( Integer.toString( salida )  );
            }catch( Exception i ){
                cajaResultado.setText( "ERROR: no se pudieron contar las ocurrencias." ); }}

        public static void main( String[] args ){
            ocurrenciasInterfaz miVentana = new ocurrenciasInterfaz();
            miVentana.setVisible( true ); }

	} // Fin del programa
