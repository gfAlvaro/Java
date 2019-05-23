package funciones1;

import java.util.Scanner;

public class funciones1{
	
	/**
	 * Funcion para mostrar por pantalla las opciones
	 * disponibles en el menu
	 */
	public static void mostrarMenu() {
		
		System.out.println( "******Menú******" );
		System.out.println( "****************" );
		System.out.println( "1 para introducir una fecha." );
		System.out.println( "2 para sumar días a la fecha." );
		System.out.println( "3 para restar días a la fecha." );
		System.out.println( "4 para comparar la fecha introducida con otra." );
		System.out.println( "5 para mostrar fecha." );
		System.out.println( "0 para terminar." );
		System.out.println( "****************" );
		}
	
	public static int tecladoEntero(){
		
		@SuppressWarnings( "resource" )
		Scanner teclado = new Scanner( System.in );
		
		return teclado.nextInt();
		}
	
	public static boolean validarFecha( int[] fecha ){
		
		boolean noValida;
		
		// comprobar que la fecha sea positiva
		noValida = (  ( fecha[0] < 1 ) || ( fecha[1] < 1 ) || ( fecha[2] < 1 )  );

		// Comprobar Febrero en año bisiesto
		if (noValida == false )
			noValida = (  ( fecha[1] == 2 )
				&& ( fecha[0] > 29 ) && ( ( fecha[2] % 4 ) == 0 ) && ( ( fecha[2] % 100 ) != 0 )  );
		
		// Comprobar Febrero en año no bisiesto
		if( noValida == false )
			noValida = ( fecha[1] == 2 ) && ( fecha[0] > 28 );
			
		// Comprobar meses de 30 días
		if( noValida == false )
			noValida = ( fecha[0] > 30 )
				&& (( fecha[1] == 4 ) || ( fecha[1] == 6 )
				 || ( fecha[1] == 9 ) || ( fecha[1] == 11 ));
		
		// Comprobar meses de 31 días
		if( noValida == false )
			noValida = ( fecha[0] > 31 )
				&& (( fecha[1] == 1 ) || ( fecha[1] == 3 )
				 || ( fecha[1] == 5 ) || ( fecha[1] == 7 )
				 || ( fecha[1] == 8 ) || ( fecha[1] == 10 )
				 || ( fecha[1] == 12 ));
		
		return ( noValida == false );
		}
	
	public static int[] fechaTeclado(){
		
		int[] fecha = new int[3];
		boolean noValida = false;
		
		do{
			System.out.print( "Introduzca dia: " );
			fecha[0] = tecladoEntero();		
			System.out.print( "Introduzca mes: " );
			fecha[1] = tecladoEntero();
			System.out.print( "Introduzca año: " );
			fecha[2] = tecladoEntero();
			
			noValida = !validarFecha( fecha );
			
			}while( noValida );
		
		return fecha;
	}
	
	/**
	 * Funcion que suma o resta un dia a las fechas
	 * @param fecha
	 * @param nDias
	 * @return int[]
	 */
	public static int[] sumaDias( int[] fecha, int nDias ) {
			
		// Comprobar Febrero en año bisiesto
		if(  ( fecha[1] == 2 )
				&& ( fecha[0] + nDias > 29 )
				&& ( ( fecha[2] % 4 ) == 0 ) && ( ( fecha[2] % 100 ) != 0 )  ){
				fecha[0] = fecha[0] + nDias - 29;
				fecha[1] = fecha[1] + 1;
				}
			
		// Comprobar Febrero en año no bisiesto
		else if(  ( fecha[1] == 2 ) && ( fecha[0] > 28 )  ) {
			fecha[0] = fecha[0] + nDias - 28;
			fecha[1] = fecha[1] + 1;
			}
		// Comprobar meses de 30 días
		else if( ( fecha[0] > 30 )
				&& (( fecha[1] == 4 ) || ( fecha[1] == 6 )
				 || ( fecha[1] == 9 ) || ( fecha[1] == 11 ))  ) {
			fecha[0]=fecha[0] + nDias-30;
			fecha[1]=fecha[1] + 1;
			}
		
		// Comprobar meses de 31 días
		else if(  ( fecha[0]>31 )
				&& ( ( fecha[1] == 1 ) || ( fecha[1] == 3 )
				  || ( fecha[1] == 5 ) || ( fecha[1] == 7 )
				  || ( fecha[1] == 8 ) || ( fecha[1] == 10 )
				  || ( fecha[1] == 12 ) )  ){		
			fecha[0] = fecha[0] + nDias - 29;
			fecha[1] = fecha[1] + 1;
			}
		
		return fecha;
		}
	
	/**
	 * funcion para comparar dos fechas dadas
	 * @param fecha
	 * @param fechaN
	 */
	public static void comparaFecha( int[] fecha, int[] fechaN ) {
		
		if( fechaN[2] < fecha[2] )
			System.out.println( "La nueva fecha es anterior" );
		else if( fechaN[2] > fecha[2] )
			System.out.println( "La nueva fecha es posterior" );
		else if( fechaN[1] < fecha[1] )
			System.out.println( "La nueva fecha es anterior" );
		else if( fechaN[1] > fecha[1] )
			System.out.println( "La nueva fecha es posterior" );
		else if( fechaN[0] < fecha[0] )
			System.out.println( "La nueva fecha es anterior" );
		else if( fechaN[0] > fecha[0] )
			System.out.println( "La nueva fecha es posterior" );
		else
			System.out.println( "Las fechas son iguales");
		}
	
	public static void mostrarFecha( int[] fecha ) {
		
		System.out.println( fecha[0] + "/" + fecha[1] + "/" + fecha[2] );
		}
	}

