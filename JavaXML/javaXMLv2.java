/**
 * javaXML.java
 * Este programa genera un documento XML llamado lista.xml
 * que contiene una lista de personas con nombre, edad y dni
 * Se utiliza la clase Persona declarada en el fichero Persona.java
 * @version 2.0
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
import javax.xml.transform.OutputKeys;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class javaXMLv2{

	/**
     * función para generar un documento XML
     * a partir de los datos de entrada
     * @param nombreArchivo
     * @param listaPersonas
     * @throws Exception
     */
	public static void generarXML( String nombreArchivo , ArrayList<Persona> listaPersonas ) throws Exception{
        	
		DOMImplementation implementation
			= DocumentBuilderFactory.newInstance().newDocumentBuilder().getDOMImplementation();
		Document documento = implementation.createDocument( null , nombreArchivo , null );
		documento.setXmlVersion( "1.0" );

		// crear nodo principal
		Element nodoRaiz = documento.getDocumentElement();
            
		// por cada nombre creamos una persona que contendrá el nombre, la edad y el dni
		for( int i = 0 ; i < listaPersonas.size() ; i++ ){
            	
			// crear nodo persona
			Element nodoPersona = documento.createElement( "persona" );
                
			// crear nodo nombre
			Element nodoNombre = documento.createElement( "nombre" ); 
			Text nodoTextoNombre = documento.createTextNode( listaPersonas.get(i).getNombre() );
			nodoNombre.appendChild( nodoTextoNombre );
                
			// crear nodo edad
			Element nodoEdad = documento.createElement( "edad" ); 
			Text nodoTextoEdad = documento.createTextNode( listaPersonas.get(i).getEdad() );                
			nodoEdad.appendChild( nodoTextoEdad );
                
			// crear nodo dni
			Element nodoDni = documento.createElement( "dni" ); 
			Text nodoTextoDni = documento.createTextNode( listaPersonas.get(i).getDni() );                
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

	/**
	 * Programa principal
	 */
	public static void main( String[] args ){
    	
		String nombreArchivo = "lista";
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona Persona1 = new Persona( "Pepe" , "32" , "00000000A" );
		Persona Persona2 = new Persona( "María" , "21" , "11111111B" );
		Persona Persona3 = new Persona( "Sara" , "40" , "22222222C" );
		Persona Persona4 = new Persona("Francisco" , "17" , "33333333D" );
				
		// datos para incluir en el archivo xml
		listaPersonas.add( Persona1 );
		listaPersonas.add( Persona2 );
		listaPersonas.add( Persona3 );
		listaPersonas.add( Persona4 );

		try{
			generarXML( nombreArchivo , listaPersonas );
			System.out.println( "Fichero creado." );
			}catch( Exception e ){}
		}
	} // Fin del programa
