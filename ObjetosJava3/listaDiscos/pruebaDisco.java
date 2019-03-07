/**
 * pruebaDisco.java
 * Gestión de una colección de discos.
 * @author Alvaro García Fuentes
 * @author Rafael Jesús Nieto Cardador
 */
package listaDiscos;

import java.util.Scanner;

public class pruebaDisco{

	// N determina la longitud del array
	static int N = 100;
  
	public static int tecladoInt(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );   
		return teclado.nextInt();
		}

	public static String tecladoString(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner( System.in );
		return teclado.nextLine();
		}
  
	public static boolean verificaCodigo( String codigo , Disco[] album ){

		for( int i = 0 ; i < album.length ; i++ )
			if(  ( album[i].getCodigo() ).equals( codigo )  )
				return false;
    
		return true;
		}

	public static void filtrar( Disco[] album ){
    
		int opcion = 0;
		String autor;
		String genero;
		int duracionMaxima;
		int duracionMinima;
		boolean error = false;
    
		do {
			System.out.println( "Seleccione criterio para filtrado:" );
			System.out.println( "1 para listado completo" );
			System.out.println( "2 para listado de un autor" );
			System.out.println( "3 para listado de un género" );
			System.out.println( "4 para listado de una duración" );
			System.out.println( "5 para salir" );

			opcion = tecladoInt();

			System.out.println( "\nLISTADO" );
			System.out.println( "=======" );
        
			switch( opcion ){
				case 1:
					// listado completo
					for( int i = 0 ; i < album.length ; i++ )
						if( album[i].getCodigo() != "LIBRE" )
							System.out.println(album[i]);    
					break;
				case 2:
					error = true;
					// listado por autor
					System.out.print( "Introduzca autor: " );
					autor = tecladoString();

					for( int i = 0; i < album.length ; i++ )
						try{
							if( album[i].getAutor().equals(autor) && album[i].getCodigo() != "LIBRE" ){
								System.out.println(album[i]);   
								error = false;
								}
							}catch( NullPointerException ex ){}

					if( error )
						System.out.println( "ERROR: No existe ese autor" );

					break;
				case 3:
					error = true;
					// listado por genero
					System.out.print( "Introduzca género: " );
					genero = tecladoString();
        
					for( int i = 0 ; i < album.length ; i++ )
						try{
							if(  album[i].getGenero().equals( genero ) && album[i].getCodigo() != "LIBRE"  ){
								System.out.println( album[i] );
								error = false;
								}
							}catch( NullPointerException ex ){}
        
					if( error )
						System.out.println("ERROR: No existe ese genero");

					break;
				case 4:
					error = false;
					// listado por duracion
					do{
						if( error )
							System.out.println("ERROR: La duración mínima es mayor que la máxima.");

						System.out.print( "Introduzca duracion minima: " );
						duracionMinima = tecladoInt();
						System.out.print( "Introduzca duracion máxima: " );
						duracionMaxima = tecladoInt();
						}while( error = duracionMinima > duracionMaxima );
        
					error = true;
					for( int i = 0 ; i < album.length ; i++ )
						if(  ( duracionMinima <= album[i].getDuracion() )
						  && ( duracionMaxima >= album[i].getDuracion() )
						  && ( album[i].getCodigo() != "LIBRE" )  ){
							System.out.println( album[i] );
							error = false;
							}

					if( error )
						System.out.println("ERROR: No existen discos entre ese intervalo de duración");

					break;
				case 5:
					// salir
					System.out.println( "Saliendo..." );
					break;
				default:
					System.out.println( "Opción incorrecta" );
				}
			}while( opcion > 5 );
		}
  
	public static void main( String[] args ) {
        
		//Crea el array de discos
		Disco[] album = new Disco[N];

		// Crea todos los discos que van en cada una de
		// las celdas del array
		for( int i = 0 ; i < N ; i++ )
			album[i] = new Disco();

		int opcion;
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		String duracionIntroducidaString;
		int duracionIntroducida;
		int primeraLibre;
		int i;
    
		boolean error = false;
		boolean errorMismoCodigo = false;
    
    
		do{
			System.out.println( "\n\nCOLECCIÓN DE DISCOS" );
			System.out.println( "===================" );
			System.out.println( "1. Listado" );
			System.out.println( "2. Nuevo disco" );
			System.out.println( "3. Modificar" );
			System.out.println( "4. Borrar" );
			System.out.println( "5. Salir" );
			System.out.print( "Introduzca una opción: " );
			opcion = tecladoInt();
      
			switch( opcion ){
				case 1:
					System.out.println( "Elegir listado" );
					filtrar( album );
					break;
        
				case 2:
					error = false;
					// Busca la primera posición libre del array
					primeraLibre = -1;
					do{
						primeraLibre++;
						// Si se sobrepasa el máximo de discos, se impide crear más.
						if( error = primeraLibre >= N ){
							System.out.println( "Album lleno. Borre algún disco para crear otro nuevo." );
							break;
							}
						}while(  !album[primeraLibre].getCodigo().equals( "LIBRE" )  );
        
					if( !error ){
						System.out.println( "\nNUEVO DISCO" );
						System.out.println( "===========" );
						System.out.println( "Por favor, introduzca los datos del disco." );  
          
						do{
							if( errorMismoCodigo ){
								System.out.println( "ERROR: Código ya existente." );
								System.out.print( "Código: " );
								codigoIntroducido = tecladoString();
								}
							else{
								System.out.print( "Código: " );
								codigoIntroducido = tecladoString();
								}
							}while( errorMismoCodigo = !verificaCodigo( codigoIntroducido , album )  );

						album[primeraLibre].setCodigo( codigoIntroducido );

						System.out.print( "Autor: " );
						autorIntroducido = tecladoString();
						album[primeraLibre].setAutor( autorIntroducido );
          
						System.out.print( "Título: " );
						tituloIntroducido = tecladoString();
						album[primeraLibre].setTitulo( tituloIntroducido );
          
						System.out.print( "Género: " );
						generoIntroducido = tecladoString();
						album[primeraLibre].setGenero( generoIntroducido );
          
						System.out.print( "Duración: " );
						duracionIntroducida = tecladoInt();
						album[primeraLibre].setDuracion( duracionIntroducida );
						}
					break;
        
				case 3:
					System.out.println( "\nMODIFICAR" );
					System.out.println( "===========" );
					System.out.print( "Por favor, introduzca el código del disco cuyos datos desea cambiar: " );
					codigoIntroducido = tecladoString();
  
					for(  i = -1 ; !( ( album[i].getCodigo() ).equals( codigoIntroducido ) ) ; i++  ){}
         
					System.out.println( "Introduzca los nuevos datos del disco o INTRO para dejarlos igual." );
					System.out.println( "Código: " + album[i].getCodigo() );
					do{
						if( errorMismoCodigo )
							System.out.println( "ERROR: Código ya existente." );

						System.out.print( "Nuevo código: " );
						codigoIntroducido = tecladoString();
						}while(  errorMismoCodigo = !verificaCodigo( codigoIntroducido , album )  );
        
					if(  !codigoIntroducido.equals( "" )  )
						album[i].setCodigo( codigoIntroducido );
        
					System.out.println( "Autor: " + album[i].getAutor() );
					System.out.print( "Nuevo autor: " );
					autorIntroducido = tecladoString();

					if(  !autorIntroducido.equals( "" )  )
						album[i].setAutor( autorIntroducido );
        
					System.out.println( "Título: " + album[i].getTitulo() );
					System.out.print( "Nuevo título: " );
					tituloIntroducido = tecladoString();
					
					if(  !tituloIntroducido.equals( "" )  )
						album[i].setTitulo( tituloIntroducido );
        
					System.out.println( "Género: " + album[i].getGenero() );
					System.out.print( "Nuevo género: " );
					generoIntroducido = tecladoString();
					if(  !generoIntroducido.equals( "" )  )
						album[i].setGenero( generoIntroducido );      

					System.out.println( "Duración: " + album[i].getDuracion() );
					System.out.print( "Duración: " );
					duracionIntroducidaString = tecladoString();
					
					if(  !duracionIntroducidaString.equals( "" )  )
						album[i].setDuracion(  Integer.parseInt( duracionIntroducidaString )  );
        
					break;
				case 4:
					error = true;
					System.out.println( "\nBORRAR" );
					System.out.println( "======" );
					System.out.print( "Por favor, introduzca el código del disco que desea borrar: " );
					codigoIntroducido = tecladoString();

					for( i = 0 ; i < N ; i++ )
						if(  ( album[i].getCodigo() ).equals( codigoIntroducido )  ){
							error = false;
							album[i].setCodigo( "LIBRE" );
							System.out.println( "Album borrado." );
							break;
							}

					if( error )
						System.out.println( "No existe ese código." );
        
					break;
				case 5:
					System.out.println( "Saliendo..." );
					break;
				default:
					System.out.println( "Opción incorrecta" );

				} // switch
			}while( opcion != 5 );
		}
	} // Fin del programa
