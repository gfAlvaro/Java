/**
 * Clase Tiempo con los métodos suma y resta.
 * Los objetos de la clase Tiempo son intervalos de tiempo
 * y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
 * donde los parámetros que se le pasan al constructor
 * son las horas, los minutos y los segundos respectivamente.
 * Contiene el método toString para ver los intervalos de tiempo
 * de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s.
 * @author Álvaro García Fuentes
 */
package tiempo;

public class Tiempo{
	
	// atributos privados
	private int _horas;
	private int _minutos;
	private int _segundos;
	
	// getters
	public int h(){
		return this._horas;
		}
	public int m(){
		return this._minutos;
		}
	public int s(){
		return this._segundos;
		}

	// setters
	private void h( int horas ){
		this._horas = horas;
		}
	private void m( int minutos ){
		this._minutos = minutos;
		}
	private void s( int segundos ){
		this._segundos = segundos;
		}
	
	// constructor paramétrico 
	Tiempo( int horas , int minutos , int segundos ){
		
		this.s( segundos );	
		this.m( minutos );
		this.h( horas );
		
		if( this.s() < 0 )
			this.s(0);
		if( this.m() < 0 )
			this.m(0);
		if( this.h() < 0 )
			this.h(0);

		if( segundos >= 60 ){
			this.m(  this.m() + (int) ( segundos / 60 )  );
			this.s( segundos % 60 );
			}

		if( minutos >= 60 ){
			this.h(  this.h() + (int) ( minutos / 60 )  );
			this.m( minutos % 60 );
			}
		
		if( horas >= 24 )
			this.h(  this.h() + ( horas  % 24 )  );
		}
	
	// método toString
	@Override
	public String toString(){
		return this.h() + "h " + this.m() + "m " + this.s() + "s";
		}
	
	// métodos de la clase
	public void suma( Tiempo tiempo ){
		
		this.s( this.s() + tiempo.s() );
		this.m( this.m() + tiempo.m() );
		this.h( this.h() + tiempo.h() );

		if( this.s() >= 60 ){
			this.s( this.s() - 60 );
			this.m( this.m() + 1 );
			}
		
		if( this.m() >= 60 ) {
			this.m( this.m() - 60 );
			this.h( this.h() + 1 );
			}
		
		if( this.h() >= 24 )
			this.h( this.h() + tiempo.h() - 24 );
		}
	
	public void resta( Tiempo tiempo ){
		
		this.h( this.h() - tiempo.h() );
		this.m( this.m() - tiempo.m() );
		this.s( this.s() - tiempo.s() );
		
		if( this.s() < 0 ){
			this.s( 60 + this.s() );
			this.m( this.m() - 1 );		
			}
		
		if( this.m() < 0 ){
			this.m( 60 + this.m() );
			this.h( this.h() - 1 );
			}

		if( this.h() < 0 ){
			this.h( 24 + this.h() );
			}
		}
	
	} // Fin de la clase Tiempo

