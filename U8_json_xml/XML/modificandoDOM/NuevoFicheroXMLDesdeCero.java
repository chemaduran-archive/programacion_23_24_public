package U8_xml_json.XML.ejercicios.modificandoDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class NuevoFicheroXMLDesdeCero {
  public static void main(String[] args) {

    Asignatura programacion = new Asignatura("Programación", 8, "Dijsktra");

    try {

      // Obtenemos la referencia al objeto Document
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();

      // No parseo ningún fichero XML existente, simplemente lo obtengo
      Document doc = db.newDocument();

      // Creo el elemento raíz ya que está vacío
      Element root = doc.createElement("asignaturas");

      // Añado el elemento raíz
      doc.appendChild(root);

      // Procedo a crear la etiqueta que voy a almacenar el fichero
      // El número de horas será un atributo y el resto de lo atributos del objeto serán
      // etiquetas hijas
      Element progTag = doc.createElement("asignatura");
      progTag.setAttribute("horas", Integer.toString(programacion.getHorasSemanales()));

      // Creo la etiqueta nombre que añadiré luego como hija de asignatura
      Element nombre = doc.createElement("nombre");
      nombre.setTextContent(programacion.getNombre());

      // Creo la etiqueta profesor que añadiré luego como hija de asignatura
      Element profesor = doc.createElement("profesor");
      profesor.setTextContent(programacion.getProfesor());

      // Añado las hijas a asignatura
      progTag.appendChild(nombre);
      progTag.appendChild(profesor);

      // Añado esa nueva etiqueta al nodo raíz
      root.appendChild(progTag);

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
          new File("src/main/java/U8_xml_json/XML/ejercicios/modificandoDOM/asignaturas.xml");
      StreamResult destino = new StreamResult(nuevoPersonas);

      // Hacemos la transformación que en nuestro caso es la escritura
      transformer.transform(origenDOM, destino);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
