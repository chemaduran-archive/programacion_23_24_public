package U8_xml_json.JSON.teoria.venta;

import U8_xml_json.JSON.teoria.retrofit_ventas.DetalleVenta;
import U8_xml_json.JSON.teoria.retrofit_ventas.Venta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class principal {
  public static void main(String[] args) {
    // Creamos el objeto Venta que vamos a transformar en una cadena
    // en formato Json
    Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
    Venta venta = new Venta(fecha, "Pelko");

    // Crear el objeto Gson que se encargara de las conversiones
    Gson gson = new Gson();

    // Convertimos un objeto sencillo a Json;
    System.out.println(gson.toJson(venta));

    // Creamos los modelos de datos con los objetos. Es decir, creamos los detalles
    DetalleVenta detalle1 = new DetalleVenta("Micro", 800.0, 800.0, 1);
    DetalleVenta detalle2 = new DetalleVenta("Placa insonorizable", 600.0, 2.0, 2);

    // Crear la lista de detalles para incluirla posteriormente en una Venta
    ArrayList<DetalleVenta> detalles = new ArrayList<>();
    detalles.add(detalle1);
    detalles.add(detalle2);

    venta.setDetalle(detalles);

    // Convertimos un objeto compuesto con ArrayList a Json;
    System.out.println(gson.toJson(venta));

    String json_completo = gson.toJson(venta);

    Venta nueva_venta = gson.fromJson(json_completo, Venta.class);
    System.out.println(nueva_venta);

    String json_array = gson.toJson(detalles);

    Type listType = new TypeToken<ArrayList<DetalleVenta>>() {}.getType();
    ArrayList<DetalleVenta> array_de_json = gson.fromJson(json_array, listType);

    System.out.println(array_de_json);
  }
}
