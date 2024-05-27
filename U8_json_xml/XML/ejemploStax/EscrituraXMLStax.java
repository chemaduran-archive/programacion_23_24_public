package U8_xml_json.XML.ejercicios.ejemploStax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class EscrituraXMLStax {
  public static void main(String[] args) {

    ArrayList<Pedido> pedidos = new ArrayList<>();

    // Creo los objeto necesarios para
    Pedido p1 = new Pedido(1, "Café", "01/04/2020", 100.0, 2);
    Pedido p2 = new Pedido(2, "Leche", "01/04/2020", 10.0, 5);
    Pedido p3 = new Pedido(3, "Lentejas", "01/04/2020", 120.0, 10);
    Pedido p4 = new Pedido(4, "Garbanzos", "01/04/2020", 12.0, 7);
    Pedido p5 = new Pedido(5, "Agua", "01/04/2020", 1.0, 1);
    Pedido p6 = new Pedido(6, "Vino", "01/04/2020", 25.0, 9);
    Pedido p7 = new Pedido(7, "Galletas", "01/04/2020", 250.0, 6);
    Pedido p8 = new Pedido(8, "Zumo", "01/04/2020", 26.0, 3);
    Pedido p9 = new Pedido(9, "Macarrones", "01/04/2020", 10.0, 4);
    Pedido p10 = new Pedido(10, "Arroz", "01/04/2020", 12.0, 1);

    // Los añado a la lista
    pedidos.add(p1);
    pedidos.add(p2);
    pedidos.add(p3);
    pedidos.add(p4);
    pedidos.add(p5);
    pedidos.add(p6);
    pedidos.add(p7);
    pedidos.add(p8);
    pedidos.add(p9);
    pedidos.add(p10);

    try {

      // Creo el objeto que me va a servir para escribir
      XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
      XMLEventWriter xmlWriter =
          xmlOutputFactory.createXMLEventWriter(
              new FileOutputStream(
                  "src/main/java/U8_xml_json/XML/ejercicios/ejemploStax/pedidos_nuevos.xml"));

      // Creo el objeto que me va a servir para crear los eventos
      XMLEventFactory eventFactory = XMLEventFactory.newInstance();

      // Creo el evento de principio de documento y lo escribo con el objeto escritor
      StartDocument startDocument = eventFactory.createStartDocument();
      xmlWriter.add(startDocument);

      // Creo el evento para introducir el salto de línea y el de salto de línea con tabulador
      // Los usaré para maquetar el fichero correctamente (aunque no son estrictamente necesarios)
      Characters saltoDeLinea = eventFactory.createCharacters("\n");
      Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
      Characters tabulador = eventFactory.createCharacters("\t");
      xmlWriter.add(saltoDeLinea);

      // Creo el evento necesario para crear la etiqueta raíz pedidos
      StartElement pedidosStartElement = eventFactory.createStartElement("", "", "pedidos");
      xmlWriter.add(pedidosStartElement);
      xmlWriter.add(saltoDeLineaTab);

      // Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

      // Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente
      // salida
      int longitud = 0;

      for (Pedido p : pedidos) {

        // Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
        StartElement pedidoStart = eventFactory.createStartElement("", "", "pedido");
        StartElement nombreStart = eventFactory.createStartElement("", "", "nombrePedido");
        StartElement fechaStart = eventFactory.createStartElement("", "", "fecha");
        StartElement precioStart = eventFactory.createStartElement("", "", "precio");
        StartElement cantidadStart = eventFactory.createStartElement("", "", "cantidad");

        // Creo el atribudo id
        Attribute id = eventFactory.createAttribute("id", Integer.toString(p.getId()));

        // Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
        EndElement pedidoEnd = eventFactory.createEndElement("", "", "pedido");
        EndElement nombreEnd = eventFactory.createEndElement("", "", "nombrePedido");
        EndElement fechaEnd = eventFactory.createEndElement("", "", "fecha");
        EndElement precioEnd = eventFactory.createEndElement("", "", "precio");
        EndElement cantidadEnd = eventFactory.createEndElement("", "", "cantidad");

        // Creo los contenidos
        Characters nombre = eventFactory.createCharacters(p.getNombreProducto());
        Characters fecha = eventFactory.createCharacters(p.getFecha());
        Characters precio = eventFactory.createCharacters(Double.toString(p.getPrecio()));
        Characters cantidad = eventFactory.createCharacters(Integer.toString(p.getCantidad()));

        // Añado todos los elementos correspondientes a un pedido en el orden que es necesario
        xmlWriter.add(pedidoStart);

        // Añado el atributo
        xmlWriter.add(id);

        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);

        // Lo hijos de cada pedido
        xmlWriter.add(nombreStart);
        xmlWriter.add(nombre);
        xmlWriter.add(nombreEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(fechaStart);
        xmlWriter.add(fecha);
        xmlWriter.add(fechaEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(precioStart);
        xmlWriter.add(precio);
        xmlWriter.add(precioEnd);
        xmlWriter.add(saltoDeLineaTab);
        xmlWriter.add(tabulador);
        xmlWriter.add(cantidadStart);
        xmlWriter.add(cantidad);
        xmlWriter.add(cantidadEnd);
        xmlWriter.add(saltoDeLineaTab);

        // Cierro el pedido que estoy escribiendo
        xmlWriter.add(pedidoEnd);

        // En el último quiero un tratamiendo diferente
        if (longitud == pedidos.size() - 1) {
          xmlWriter.add(saltoDeLinea);
        } else {
          xmlWriter.add(saltoDeLineaTab);
        }
        longitud++;
      }

      // Creo el evento necesario para cerrar la etiqueta raíz pedidos
      EndElement pedidosEndElement = eventFactory.createEndElement("", "", "pedidos");
      xmlWriter.add(pedidosEndElement);
      xmlWriter.add(saltoDeLinea);

      // Creo el evento de finalización del documento y lo escribo con el objeto escritor
      EndDocument endDocument = eventFactory.createEndDocument();
      xmlWriter.add(endDocument);

      xmlWriter.close();

    } catch (XMLStreamException | FileNotFoundException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
