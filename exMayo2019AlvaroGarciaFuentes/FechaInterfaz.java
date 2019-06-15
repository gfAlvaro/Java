/**
 * FechaInterfaz.java 
 * Programa que pide una fecha y permite hacer distintas operaciones con ella:
 *  Validar fecha
 *  Sumar 1 día
 *  Restar 1 día
 *  Mostrar el número de días entre la fecha dada y la fecha actual
 *  Terminar el programa
 *  
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
import javax.swing.JOptionPane;

public class FechaInterfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JLabel texto;
    private JTextField caja;
    private JButton validarFecha;
    private JButton diaAnterior;
    private JButton diaPosterior;
    private JButton diasHastaHoy;
    private JButton salir;

    /**
     * Constructor
     */
    FechaInterfaz() {
        super( "Fechas" );
        configurarVentana();
        inicializarComponentes();
    }

    /**
     * configurar las medidas de la ventana
     */
    private void configurarVentana(){
        this.setSize( 400 , 400 );
        this.setLocationRelativeTo( null );
        this.setLayout( null );
        this.setResizable( false );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    /**
     * Inicializar los componentes de la ventana
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

        // anyadimos los componentes a la ventana
        this.add( texto );
        this.add( caja );
        this.add( validarFecha );
        this.add( diaAnterior );
        this.add( diaPosterior );
        this.add( diasHastaHoy );
        this.add( salir );
    }

    /**
     * selecciona la acción que se lleva a cabo
     * al pulsar el botón
     */
    @Override
    public void actionPerformed( ActionEvent e ){
    	
        String fecha = caja.getText();
        String resultado = "";
        Object opcion = e.getSource();
        boolean activarPanel = false;
 
        
        if( opcion == salir ) {
            System.exit(0);
        }
        
        if( ! Fechas.esValida( fecha ) ) {
    	    resultado = "La fecha no es valida";
    	    activarPanel = true;
    	    }
        
        else {
            if( opcion == validarFecha ) {
        	    resultado = "La fecha es valida";
        	    activarPanel = true;
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
                		                         c.get( Calendar.MONTH  ) + 1,
                		                         c.get( Calendar.YEAR )  );
                try {
                resultado = "Numero de días: " + Integer.toString(  Fechas.numeroDias( fecha , fechaHoy )  );
                c = null;
            	} catch ( Exception pe ) {
            		resultado = "ERROR al calcular numero dias";
                }
            	activarPanel = true;
            }
        }
        
        if( activarPanel ) {
            JOptionPane.showMessageDialog(null, resultado );
        }
        else {
      	    caja.setText( resultado );
      	}
    }

    public static void main( String[] args ) {
        FechaInterfaz miVentana = new FechaInterfaz();
        miVentana.setVisible( true );
    }

} // Fin del programa
