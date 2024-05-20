package U8_xml_json.XML.ejercicios.modificandoDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ModificandoArbol {
  public static void main(String[] args) {

    try {

      // Obtenemos la referencia al objeto Document
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();

      // Parseamos el documento XML para tenerlo en memoria cargado
      Document doc =
          db.parse(new File("src/main/java/U8_xml_json/XML/ejercicios/ejemploDOM/personasXML.xml"));

      // Obtenemos el nodo raíz
      Node root = doc.getDocumentElement();

      // Nodo texto de salto de línea que voy a utilizar posteriormente
      Text saltoLinea = doc.createTextNode("\n");

      // 1 - Uso de insertBefore()
      // Voy a insertar un nodo comentario antes de la primera persona
      Comment comentario = doc.createComment("Empieza la lista de personas");

      // Obtengo una referencia a la primera ocurrencia de persona
      Element primeraPersona = (Element) doc.getElementsByTagName("persona").item(0);

      root.insertBefore(comentario, primeraPersona);

      // 2 - Uso de appendChild()
      // Vamos a insertar un nuevo nodo Element persona

      // Creo la etiqueta padre persona, le doy nombre
      Element persona = doc.createElement("persona");
      persona.setAttribute("id", "4");

      // Creo la etiqueta hija nombre y le doy valor
      Element nombre = doc.createElement("nombre");
      nombre.setTextContent("Chema Durán");

      // Creo la etiqueta hija edad y le doy valor
      Element edad = doc.createElement("edad");
      edad.setTextContent("50");

      // Construyo toda la estructura general de la etiqueta
      // persona.appendChild(saltoLinea);
      persona.appendChild(nombre);
      // persona.appendChild(saltoLinea);
      persona.appendChild(edad);
      // persona.appendChild(saltoLinea);

      // Añadimos ese nuevo nodo al root
      root.appendChild(persona);

      // 3- Uso de cloneNode
      // Clonamos el último nodo pero posteriormente modificamos el atributo
      NodeList nl = doc.getElementsByTagName("persona");
      Node node = nl.item(nl.getLength() - 1);
      Element personaClonada = (Element) node.cloneNode(true);

      // Cambio el atributo
      personaClonada.setAttribute("id", "5");

      // Añadimos ese nuevo no al root
      root.appendChild(personaClonada);

      // 4- uso de removeChild()
      // Borramos el segundo nodo
      Element segundaPersona = (Element) doc.getElementsByTagName("persona").item(1);
      root.removeChild(segundaPersona);

      // 5- Uso de replaceChild()
      // Voy a reemplazar la primera persona por la última
      // Podría ser otro elemento que he creado pero aprovecho uno que está en el árbol
      // y puedo ver como me quedo con 3 nodos.
      root.replaceChild(personaClonada, primeraPersona);

      // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

      // Obtenemos el objeto transformer
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      // Configuración del transformer
      // Podéis ver toda la lista de propiedes aquí
      // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      // Creación del origen DOMSource
      DOMSource origenDOM = new DOMSource(root);

      // Creación del fichero que va a ser mi destino
      File nuevoPersonas =
          new File("src/main/java/U8_xml_json/XML/ejercicios/modificandoDOM/nuevoPersonasXML.xml");
      StreamResult destino = new StreamResult(nuevoPersonas);

      // Hacemos la transformación que en nuestro caso es la escritura
      transformer.transform(origenDOM, destino);

    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
