/**
 * Fechas.java
 * Clase para manejar fechas con los siguientes métodos:
 * 
 * Validar una fecha.
 * 
 * Sumar 1 día a la fecha.
 *    
 * Restar 1 día a la fecha.
 * 
 * Calcuar numero de días entre dos fechas.
 * 
 * Mostrar fecha con formato a partir de tres enteros
 * 
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {

	// sin bisiestos
    private final static int [] DIAS_MES = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };

    /**
     * Comprueba si una fecha es válida.
     * @param fecha
     * @return <code>true</code> si es válida y <code>false</code> en caso contrario
     */
    public static boolean esValida( String fecha ) {
    	
    	boolean salida;
    	
        // comprobar que es un formato dd/mm/aaaa
        if( fecha.length() != 10 || !Character.isDigit( fecha.charAt(0) ) || !Character.isDigit( fecha.charAt(1) )
        	                     || !Character.isDigit( fecha.charAt(3) ) || !Character.isDigit( fecha.charAt(4) )
                                 || !Character.isDigit( fecha.charAt(6) ) || !Character.isDigit( fecha.charAt(7) )
                                 || !Character.isDigit( fecha.charAt(8) ) || !Character.isDigit( fecha.charAt(9) )
                                 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/' ) {
            salida = false;
        }
        else {
            // comprobar si mes es correcto
            int mes = Integer.parseInt(  fecha.substring( 3 , 5 )  );
        
            if( mes < 1 || mes > 12 ) {
                salida = false;
            }   
            else {
                // comprobar si el día es correcto
                int dia = Integer.parseInt(  fecha.substring( 0 , 2 )  );
                int anyo = Integer.parseInt(  fecha.substring( 6 )  );
                int diasMes = DIAS_MES[ mes - 1 ];  // se resta 1 al mes para que esté entre 0 y 11
        
                // febrero bisisesto
                if(  mes == 2 && anyo%4 == 0 && ( anyo%100 != 0 || anyo%400 == 0 )  ) {
                    diasMes++;
                }
                salida = ( dia > 0 && dia <= diasMes );
            }
        }
        
        return salida;
    }

    /**
     * Calcula el numero de dias entre dos fechas
     * @param fecha1
     * @param fecha2
     * @return numero de días entre las dos fechas.
     * @throws ParseException
     */
    public static int numeroDias( String fecha1 , String fecha2 ) throws ParseException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaInicial = dateFormat.parse( fecha1 );
        Date fechaFinal = dateFormat.parse( fecha2 );

        return (int) (  ( fechaFinal.getTime() - fechaInicial.getTime() ) / 86400000  );		
    }

    /**
     * Suma un día a la fecha
     * @param fecha
     * @return fecha del día siguiente
     */
    public static String suma1Dia( String fecha ) {
    	
        int dia = Integer.parseInt(  fecha.substring( 0 , 2 )  );
        int mes = Integer.parseInt(  fecha.substring( 3 , 5 )  );
        int anyo = Integer.parseInt(  fecha.substring( 6 )  );
        int diasMes = DIAS_MES[ mes - 1 ];
        
        // febrero bisisesto
        if (  mes == 2 && anyo%4 == 0 && ( anyo%100 != 0 || anyo%400 == 0 )  ) {
            diasMes++;
        }
        
        dia++;
        if ( dia > diasMes ) {
            dia = 1;
            mes++;
            if ( mes == 13 ) {
                mes = 1;
                anyo++;
            }
        }
        
        return fecha( dia , mes , anyo );
    }

    /**
     * Resta un día a la fecha
     * @param fecha
     * @return fecha del día siguiente
     */
    public static String resta1Dia( String fecha ) {
    	
        int dia = Integer.parseInt(  fecha.substring( 0 , 2 )  );
        int mes = Integer.parseInt(  fecha.substring( 3 , 5 )  );
        int anyo = Integer.parseInt(  fecha.substring( 6 )  );
    
        dia--;
        if ( dia == 0 ) { // mes anterior
            mes--;
            if ( mes == 0 ) { // año anterior
                mes = 12;
                anyo--;
            } 
            dia = DIAS_MES[ mes - 1 ];
            // febrero bisisesto
            if (  mes == 2 && anyo % 4 == 0 && ( anyo % 100 != 0 || anyo % 400 == 0 )  ) {
                dia++;
            }
        }
        
    return fecha( dia , mes , anyo );
    }

    /**
     * Devuelve una cadena en formato dd/mm/aaaa
     * @param d día del mes
     * @param m día del año
     * @param a año
     * @return
     */
    public static String fecha( int d , int m , int a ) {
    	
        String dia = Integer.toString( d ).trim();
        String mes = Integer.toString( m ).trim();
        String anyo = Integer.toString( a ).trim();

        if( dia.length() < 2 ) {
            dia = "0" + dia;
        }

        if( mes.length() < 2 ) {
            mes = "0" + mes;
        }

        for( int i = anyo.length() ; i < 4 ; i++ ) {
            anyo = "0" + anyo;
        }

        return dia + "/" + mes + "/" + anyo;
    }

} // Fin de la clase Fechas
