/**
 * javaXML.java
 * Este programa genera un documento XML llamado lista.xml
 * que contiene una lista de personas con nombre, edad y dni
 * 
 * @author Álvaro García Fuentes
 */
package javaXML;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys ;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class javaXML{

	/**
         * función para generar un documento XML
         * a partir de los datos de entrada
         * @param nombreArchivo
         * @param nombre
         * @param edad
         * @param dni
         * @throws Exception
         */
	public static void generarXML( String nombreArchivo ,
		ArrayList<String> nombre , ArrayList<String> edad , ArrayList<String> dni ) throws Exception{

		if(  nombre.isEmpty() || edad.isEmpty() || dni.isEmpty()
		|| ( nombre.size() != edad.size() ) || ( nombre.size() != dni.size() )  )
			System.out.println( "ERROR: lista no válida" );
        
		else{
			DOMImplementation implementation
				= DocumentBuilderFactory.newInstance().newDocumentBuilder().getDOMImplementation();
			Document documento = implementation.createDocument( null , nombreArchivo , null );
			documento.setXmlVersion( "1.0" );

			// crear nodo principal
			Element nodoRaiz = documento.getDocumentElement();
            
			// por cada nombre creamos una persona que contendrá el nombre, la edad y el dni
			for( int i = 0 ; i < nombre.size() ; i++ ){
            	
				// crear nodo persona
				Element nodoPersona = documento.createElement( "persona" );
                
				// crear nodo nombre
				Element nodoNombre = documento.createElement( "nombre" ); 
				Text nodoTextoNombre = documento.createTextNode( nombre.get(i) );
				nodoNombre.appendChild( nodoTextoNombre );
                
				// crear nodo edad
				Element nodoEdad = documento.createElement( "edad" ); 
				Text nodoTextoEdad = documento.createTextNode( edad.get(i) );                
				nodoEdad.appendChild( nodoTextoEdad );
                
				// crear nodo dni
				Element nodoDni = documento.createElement( "dni" ); 
				Text nodoTextoDni = documento.createTextNode( dni.get(i) );                
				nodoDni.appendChild( nodoTextoDni );
                
				// incluir nodo nombre, nodo edad y nodo dni en nodo persona
				nodoPersona.appendChild( nodoNombre );
				nodoPersona.appendChild( nodoEdad );
				nodoPersona.appendChild( nodoDni );
                
				// incluir nodoPersona en nodoRaiz
				nodoRaiz.appendChild( nodoPersona ); // pegamos el elemento a la raiz "Documento"
				}
            
			// generar documento
			Source fuente = new DOMSource( documento );
            
			// indicamos donde lo queremos almacenar
			Result resultado = new StreamResult(  new java.io.File( nombreArchivo + ".xml" )  );
			Transformer trans = TransformerFactory.newInstance().newTransformer();

			// Indentamos adecuadamente la lista
			trans.setOutputProperty( OutputKeys.INDENT , "yes" );
			trans.setOutputProperty( "{http://xml.apache.org/xslt}indent-amount" , "2" );
            
			// Escribimos la lista en el documento
			trans.transform( fuente , resultado );
			}
		}

	/**
	 * Programa principal
	 * @param args
	 */
	public static void main( String[] args ){
    	
		String nombreArchivo = "lista";
		ArrayList<String> nombre = new ArrayList<String>();
		ArrayList<String> edad = new ArrayList<String>();
		ArrayList<String> dni = new ArrayList<String>();

		// datos para incluir en el archivo xml
		nombre.add( "Pepe" );
		edad.add( "32" );
		dni.add( "00000000A" );
		nombre.add( "María" );
		edad.add( "21" );
		dni.add( "11111111B" );
		nombre.add( "Sara" );
		edad.add( "40" );
		dni.add( "22222222C" );
		nombre.add( "Francisco" );
		edad.add( "17" );
		dni.add( "33333333D" );

		try{
			generarXML( nombreArchivo , nombre , edad , dni );
			System.out.println( "Documento creado." );			
			}catch( Exception e ){}
		}

	} // Fin del programa

