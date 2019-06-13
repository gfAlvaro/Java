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
package exMayo2019AlvaroGarciaFuentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea; // Para cajas de texto con saltos de linea

public class FechaInterfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JLabel texto;
    private JLabel textoResultado;
    private JTextField caja;
    private JTextArea cajaResultado;
    private JButton validarFecha;
    private JButton diaAnterior;
    private JButton diaPosterior;
    private JButton diasHastaHoy;
    private JButton salir;

    /**
     * Constructor
     */
    FechaInterfaz() {
        super( "Sustituir ocurrencias" );
        configurarVentana();
        inicializarComponentes();
    }

    /**
     * configurar las medidas de la ventana
     */
    private void configurarVentana(){
        this.setSize( 400 , 500 );
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
        validarFecha = new JButton();
        diaAnterior = new JButton();
        diaPosterior = new JButton();
        diasHastaHoy = new JButton();
        salir = new JButton();
        textoResultado = new JLabel();
        cajaResultado = new JTextArea();

        // configuramos los componentes
        texto.setText( "Introduzca fecha:" );
        texto.setBounds( 25 , 25 , 150 , 25 );
        caja.setBounds( 200 , 25 , 150 , 25 ); // ( x , y , ancho , alto )

        validarFecha.setText( "Validar Fecha" );
        validarFecha.setBounds( 100 , 100 , 200 , 30 );
        validarFecha.addActionListener( this );

        diaAnterior.setText( "Dia anterior" );
        diaAnterior.setBounds( 100 , 150 , 200 , 30 ); // ( x , y , ancho , alto )
        diaAnterior.addActionListener( this );
        
        diaPosterior.setText( "Dia posterior" );
        diaPosterior.setBounds( 100 , 200 , 200 , 30 );
        diaPosterior.addActionListener( this );
        
        diasHastaHoy.setText( "Dias hasta hoy" );
        diasHastaHoy.setBounds( 100 , 250 , 200 , 30 ); // ( x , y , ancho , alto )
        diasHastaHoy.addActionListener( this );
        
        salir.setText( "Salir" );
        salir.setBounds( 100 , 300 , 200 , 30 );
        salir.addActionListener( this );
        
        textoResultado.setText( "Resultado: " );
        textoResultado.setBounds( 100 , 350 , 100 , 25 );
        cajaResultado.setBounds( 25 , 400 , 350 , 25 );

        // anyadimos los componentes a la ventana
        this.add( texto );
        this.add( caja );
        this.add( validarFecha );
        this.add( diaAnterior );
        this.add( diaPosterior );
        this.add( diasHastaHoy );
        this.add( salir );
        this.add( textoResultado );
        this.add( cajaResultado );
    }

    /**
     * establece la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){

        String fecha = caja.getText();
        String resultado = "";
        Object opcion = e.getSource();
        
        if( ! Fechas.esValida( fecha ) ) {
    	    resultado = "La fecha no es valida";
    	    }
        
        else {
            if( opcion == validarFecha ) {
        	    resultado = "La fecha es valida";
            }
        
            else if ( opcion == diaAnterior  ) {
        	    resultado = Fechas.resta1Dia( fecha );
            }
        
            else if( opcion == diaPosterior  ) {
        	    resultado = Fechas.suma1Dia( fecha );
            }
        
            else if( opcion == diasHastaHoy  ) {
            	
                Calendar c = new GregorianCalendar();
                String fechaHoy = Fechas.fecha(  c.get( Calendar.DATE ),
                		                         c.get( Calendar.MONTH ),
                		                         c.get( Calendar.YEAR )  );
                
                resultado = Integer.toString(  Fechas.comparar( fecha , fechaHoy )  );
                c = null;
            }
        
            else if( opcion == salir ) {
        	    System.exit(0);
            }
        }
        
      	cajaResultado.setText( resultado );
    }

    public static void main( String[] args ) {
        FechaInterfaz miVentana = new FechaInterfaz();
        miVentana.setVisible( true );
    }

} // Fin del programa
