/**
 * Fechas.java
 * Clase con los siguientes métodos:
 * 
 * Introducir por teclado una fecha en formato dd/mm/aaaa.
 *      Pide una fecha al usuario, si no se introduce correctamente devuelve un mensaje de error. 
 *      Usa una función booleana para validar la fecha.
 * 
 * Sumar días a la fecha.
 *      Pide un número de días positivo para sumar a la fecha introducida y actualiza su valor. 
 *      Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará un mensaje de error, 
 *      si el número de días introducido no es positivo también. 
 *      Usa una función que recibirá la fecha, el número de días a sumarle y devolverá la nueva fecha.
 *      
 * Restar días a la fecha.
 *      Pide un número de días (negativo) para sumar a la fecha introducida previamente y actualiza su valor. 
 *      Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará un mensaje de error, 
 *      si el número de días introducido no es negativo también. Usa la función del apartado anterior.
 *
 * Comparar la fecha introducida con otra.
 *      Pide una fecha al usuario (válida, si no lo es da error) y la comparará con la que tenemos almacenada, 
 *      posteriormente mostrará si esta fecha es anterior, igual o posterior a la que tenemos almacenada, 
 *      usará una función para ello a la que le pasaremos las dos fechas y devolverá un valor negativo si la 1ª es ANTERIOR a la 2ª, 
 *      0 si son IGUALES y un valor positivo si es POSTERIOR.
 *      La cantidad devuelta es el número de días entre las dos fechas.
 *
 * Mostrar fecha.
 * 
 * @author Alvaro Garcia Fuentes
 */
package exMayo2019AlvaroGarciaFuentes;

public class Fechas {

	// sin bisiestos
    final static int [] DIAS_MES = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };

    /**
     * Comprueba si una fecha es válida.
     * @param fecha
     * @return <code>true</code> si es váida y <code>false</code> en caso contrario
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
     * Compara dos fechas
     * la cantidad devuelta es el numero de días entre las dos fechas
     * @param fecha1
     * @param fecha2
     * @return valor positivo si la primera es posterior a la segunda, negativo si es anterior y 0 si son iguales
     */
    public static int comparar( String fecha1 , String fecha2 ) {
    	
        int dia1 = Integer.parseInt(  fecha1.substring( 0 , 2 )  );
        int dia2 = Integer.parseInt(  fecha2.substring( 0 , 2 )  );
        int mes1 = Integer.parseInt(  fecha1.substring( 3 , 5 )  );
        int mes2 = Integer.parseInt(  fecha2.substring( 3 , 5 )  );
        int anyo1 = Integer.parseInt(  fecha1.substring( 6 )  );
        int anyo2 = Integer.parseInt(  fecha2.substring( 6 )  );
        int resultado = 0;
        
        if( anyo1 != anyo2 ) {
            resultado += 365 * ( anyo1 - anyo2 );
        }
        
        else if( mes1 != mes2 ) {

            int mes1aux = 0;
            int mes2aux = 0;
               	
        	for( int i = 0 ; i < mes1 ; i++ ) {
        	    mes1aux += DIAS_MES[ i ];
            }
            for( int j = 0 ; j < mes2 ; j++ ) {
        	    mes2aux += DIAS_MES[ j ];
            }

        resultado += mes1aux - mes2aux ;
        }
        
        else if( dia1 != dia2 ) {
        	resultado += dia1 - dia2;
        }
        
        return resultado;
    }
  
    /**
     * Suma a la fecha los días indicados y devuelve la nueva fecha.
     * @param fecha
     * @param n   puede ser positivo o negativo
     * @return una nueva fecha
     */
    public static String sumaDias( String fecha , int n ) {

        String fechaSalida = fecha;
        
        if( n >= 0 ) {
            for( int i = 1 ; i <= n ; i++ ) {
                fechaSalida = suma1Dia( fechaSalida );
            }
        }
        else {
            int ndias = Math.abs( n );
            for ( int i = 1 ; i <= ndias ; i++ ) {
                fechaSalida = resta1Dia( fechaSalida );
            }
        }
        
        return fechaSalida;
    }

    /**
     * Suma un día a la fecha
     * @param fecha
     * @return fecha del día siguiente
     */
    public static String suma1Dia( String fecha ) {
        int d = Integer.parseInt(  fecha.substring( 0 , 2 )  );
        int m = Integer.parseInt(  fecha.substring( 3 , 5 )  );
        int a = Integer.parseInt(  fecha.substring( 6 )  );
    
        int diasmes = DIAS_MES[ m - 1 ];
        
        // febrero bisisesto
        if (  m == 2 && a%4 == 0 && ( a%100 != 0 || a%400 == 0 )  ) {
            diasmes++;
        }
        
        d++;
        if ( d > diasmes ) {
            d = 1;
            m++;
            if ( m == 13 ) {
                m = 1;
                a++;
            }
        }
        
        return fecha( d , m , a );
    }

    /**
     * Resta un día a la fecha
     * @param fecha
     * @return fecha del día siguiente
     */
    public static String resta1Dia( String fecha ) {
    	
        int d = Integer.parseInt(  fecha.substring( 0 , 2 )  );
        int m = Integer.parseInt(  fecha.substring( 3 , 5 )  );
        int a = Integer.parseInt(  fecha.substring( 6 )  );
    
        d--;
        if ( d == 0 ) { // mes anterior
            m--;
            if ( m == 0 ) { // año anterior
                m = 12;
                a--;
            } 
            d = DIAS_MES[ m - 1 ];
            // ¿febrero y año bisisesto?
            if (  m == 2 && a%4 == 0 && ( a%100 != 0 || a%400 == 0 )  ) {
                d++;
            }
        }
    
    return fecha( d , m , a );
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

        if ( dia.length() < 2 ) {
            dia = "0" + dia;
        }

        if ( mes.length() < 2 ) {
            mes = "0" + mes;
        }

        for ( int i = anyo.length() ; i < 4 ; i++ ) {
            anyo = "0" + anyo;
        }

        return dia + "/" + mes + "/" + anyo;
    }

} // Fin de la clase Fechas
