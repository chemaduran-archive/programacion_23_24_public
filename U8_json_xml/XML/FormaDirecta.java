package U8_xml_json.XML.ejercicios.ejemploDOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FormaDirecta {

  public static void main(String[] args) {

    try {

      // Cargo el Fichero XML en Memoria
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc =
          db.parse(new File("src/main/java/U8_xml_json/XML/ejercicios/ejemploDOM/personasXML.xml"));

      // Cojo el elemento (etiqueta) raíz
      Element root = doc.getDocumentElement();

      // Obtengo todos los nodos hijos del elemento raíz
      NodeList nl = root.getChildNodes();

      for (int i = 0; i < nl.getLength(); i++) {

        // Es un hijo que es etiqueta (element)
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

          // Muestro la información del elemento (etiqueta)
          System.out.println("He encontrado un nodo etiqueta");
          Element e = (Element) nl.item(i);
          System.out.println("Es la etiqueta: " + e.getTagName());
          System.out.println("Y contiene:");
          System.out.println(e.getTextContent());

          // Compruebo si el elemento (etiqueta tiene atributos)
          if (e.hasAttributes()) {

            System.out.println("Y este nodo tiene atributos");

            // Obtengo los atributos y los muestro
            NamedNodeMap nodeMap = e.getAttributes();
            for (int j = 0; j < nodeMap.getLength(); j++) {
              Node node = nodeMap.item(j);
              Attr atributo = e.getAttributeNode(node.getNodeName());
              System.out.println("Atributo: " + atributo.getNodeName());
              System.out.println("Valor: " + atributo.getValue());
            }
          }

          // He encontrado un nodo texto
        } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
          System.out.println("He encontrado un nodo texto");
          System.out.println("Y contiene:");
          Text texto = (Text) nl.item(i);
          System.out.println(texto.getTextContent());

          // He encontado un nodo comentario
        } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {
          System.out.println("He encontrado un nodo comentario");
          System.out.println("Y contiene:");
          Comment comentario = (Comment) nl.item(i);
          System.out.println(comentario.getTextContent());
        }
        System.out.println("----------------------------------------");
      }

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
