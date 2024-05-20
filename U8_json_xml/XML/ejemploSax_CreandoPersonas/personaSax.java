package U8_xml_json.XML.ejercicios.ejemploSax_CreandoPersonas;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

// Hereda de la clase que tiene ya implementaciones por defecto de todos los interfaces
public class personaSax extends DefaultHandler {
  private ArrayList<Persona> lista_personas = new ArrayList<>();
  private Persona persona_actual;
  private String contenido_nodo_texto = "";

  public ArrayList<Persona> getPersonas() {
    return lista_personas;
  }

  // Handler para el evento comienzo de documento
  @Override
  public void startDocument() throws SAXException {
    super.startDocument();
    System.out.println("Comienzo del parseado del documento personasXML.xml");
  }

  // Handler para el evento fin de documento
  @Override
  public void endDocument() throws SAXException {
    super.endDocument();
    System.out.println("\nFin del parseado del documento personasXML.xml");
  }

  // Handler para el evento etiqueta de apertura
  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    super.startElement(uri, localName, qName, attributes);

    if (qName.equals("persona")) {
      persona_actual = new Persona();
    }
  }

  // Handler para el evento etiqueta de cierre
  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    super.endElement(uri, localName, qName);

    if (qName.equals("persona")) {
      lista_personas.add(persona_actual);
    } else if (qName.equals("nombre")) {
      persona_actual.setNombre(contenido_nodo_texto);
    } else if (qName.equals("edad")) {
      persona_actual.setEdad(Integer.parseInt(contenido_nodo_texto));
    }
  }

  // Handler para el evento Nodo de Texto encontrado
  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    super.characters(ch, start, length);
    contenido_nodo_texto = new String(ch, start, length);
  }
}
