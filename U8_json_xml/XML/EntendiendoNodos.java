package U8_xml_json.XML.ejercicios.ejemploDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class EntendiendoNodos {

  public static void main(String[] args) {
    try {

      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc =
          db.parse(new File("src/main/java/U8_xml_json/XML/ejercicios/ejemploDOM/personasXML.xml"));

      // Número de Nodos de todo el documento - 1
      System.out.println("Nodos hijos de todo el Documento:" + doc.getChildNodes().getLength());

      // Obtengo el nodo raíz
      Element root = doc.getDocumentElement();

      // Número de nodos hijos del elemento raíz
      System.out.println(
          "Nodos hijos del elemento raíz:" + root.getChildNodes().getLength() + "!!!!!");

      // ¿Cómo puede ser?
      NodeList nl = root.getChildNodes();

      System.out.println("Información de los Nodos");

      for (int i = 0; i < nl.getLength(); i++) {
        System.out.println("Tipo del Nodo:" + nl.item(i).getNodeType());

        System.out.println("Contenido del Nodo:" + nl.item(i).getTextContent());
        System.out.println("-------------------------------------------------");
      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
