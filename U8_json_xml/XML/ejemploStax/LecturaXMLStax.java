package U8_xml_json.XML.ejercicios.ejemploStax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LecturaXMLStax {

  public static void main(String[] args) {

    // Voy a rellenar esta estructura de datos con los datos del fichero XML
    ArrayList<Pedido> pedidos = new ArrayList<>();
    Pedido pedidoActual = null;
    String tagActual = "";

    try {
      // Obtenemos el lector de XML
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(
              new FileInputStream(
                  "src/main/java/U8_xml_json/XML/ejercicios/ejemploStax/pedidos.xml"));

      // Recorro la lista de eventos. Soy yo el que los va obteniendo PULL con nextEvent()
      while (xmlReader.hasNext()) {

        // Obtengo el evento siguiente que voy a tratar
        XMLEvent xmlEvent = xmlReader.nextEvent();

        // Es un evento de apertura de etiqueta
        if (xmlEvent.isStartElement()) {

          // Si he recibido el evento de comienzo de una etiqueta
          // Obtengo la información de la etiqueta
          StartElement startTag = xmlEvent.asStartElement();

          // Inicio la apertura de la etiqueta pero no lo cierro por si tiene atributos
          System.out.print("<" + startTag.getName().getLocalPart());

          // Dependiendo de el nombre la etiqueta
          // Establezco tagActual al nombre de la etiqueta que he detectado
          String tagName = startTag.getName().getLocalPart();
          switch (tagName) {
            case "pedido":

              // Empieza un pedido tengo que crear el objeto para añadirlo
              // posteriormente al ArrayList
              pedidoActual = new Pedido();
              tagActual = "pedido";

              // Es la única etiqueta que tiene atributos
              // Si tuviera varios
              // Iterator it = startTag.getAttributes();
              // Tendría que recorrerlo como hemos hecho hasta ahora
              Attribute id = startTag.getAttributeByName(new QName("id"));

              pedidoActual.setId(Integer.parseInt(id.getValue()));

              System.out.print(" " + id.getName() + "=\"" + id.getValue() + "\"");
              break;

            case "nombreProducto":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "nombreProducto";
              break;

            case "fecha":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "fecha";
              break;

            case "precio":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "precio";
              break;

            case "cantidad":
              // Establezco cuál es la etiqueta que estoy tratando
              tagActual = "cantidad";
              break;
          }

          // Cierro la etiqueta de apertura
          System.out.print(">");

        } else if (xmlEvent.isEndElement()) {

          // Si he recibido el evento de fin de una etiqueta
          // Muestro la etiqueta de cierre
          EndElement endtag = xmlEvent.asEndElement();
          System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

          // Si estoy cerrando pedido ya tengo el pedido relleno lo añado a la lista
          if (endtag.getName().getLocalPart().equals("pedido")) {
            pedidos.add(pedidoActual);
          }

          // Ya no estoy dentro de ninguna de las etiquetas
          tagActual = "";

        } else if (xmlEvent.isStartDocument()) {
          System.out.println("Comienzo del parseado del documento");

        } else if (xmlEvent.isEndDocument()) {
          System.out.println("Fin del parseado del documento");

        } else if (xmlEvent.isCharacters()) {

          // Estoy en un nodo de texto
          Characters texto = xmlEvent.asCharacters();

          // No es un salto de línea Estoy suponiendo que el texto de las etiquetas nodo no lleva un
          // salto
          // de línea
          if (!texto.getData().contains("\n")) {
            System.out.print(texto.getData());
          }

          // Añado el texto de dentro de las etiquetas al objeto que estoy creando (pedidoActual)
          if (!tagActual.equals("")) {
            switch (tagActual) {
              case "nombreProducto":
                pedidoActual.setNombreProducto(texto.getData());
                break;
              case "fecha":
                pedidoActual.setFecha(texto.getData());
                break;
              case "precio":
                pedidoActual.setPrecio(Double.parseDouble(texto.getData()));
                break;
              case "cantidad":
                pedidoActual.setCantidad(Integer.parseInt(texto.getData()));
                break;
            }
          }
        }
      }
    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }

    // Al salir del bloque ya tengo en la lista todos los pedidos
    // Puedo sacarla por pantalla
    System.out.println(pedidos);
  }
}
