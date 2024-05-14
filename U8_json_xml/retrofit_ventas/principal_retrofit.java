package U8_xml_json.JSON.teoria.retrofit_ventas;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class principal_retrofit {
  public static void main(String[] args) {

    OkHttpClient okHttpClient =
        new OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build();

    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl("https://my-json-server.typicode.com/chemaduran/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build();

    CentralDeVentas service = retrofit.create(CentralDeVentas.class);
    Venta venta = null;
    final Integer ventaId = 2;

    System.out.println("Obtenemos el listado completo de ventas");
    try {
      Response<List<Venta>> response = service.listVentas().execute();
      if (response.isSuccessful()) {
        List<Venta> ventas = response.body();
        System.out.println(ventas);
      } else {
        System.out.println("Peticion no valida: " + response.message());
      }
    } catch (IOException ex) {
      System.out.println("Error en la peticion: " + ex.getMessage());
    }

    System.out.println();
    System.out.println("Obtenemos una venta concreta, identificada por el id " + ventaId);
    try {
      Response<Venta> response = service.getVentaId(ventaId).execute();
      if (response.isSuccessful()) {
        venta = response.body();
        System.out.println(venta);
      } else {
        System.out.println("Peticion no valida: " + response.message());
      }
    } catch (IOException ex) {
      System.out.println("Error en la peticion: " + ex.getMessage());
    }

    System.out.println();
    System.out.println(
        "Obtenemos el listado del detalle de una venta concreta, identificado por el id "
            + ventaId);
    try {
      Response<List<DetalleVenta>> response = service.listVentaIdDetalles(ventaId).execute();
      if (response.isSuccessful()) {
        List<DetalleVenta> detalle_venta = response.body();
        System.out.println(detalle_venta);
        if (venta != null) {
          venta.setDetalle(new ArrayList<>(detalle_venta));
        }
      } else {
        System.out.println("Peticion no valida: " + response.message());
      }
    } catch (IOException ex) {
      System.out.println("Error en la peticion: " + ex.getMessage());
    }

    okHttpClient.dispatcher().executorService().shutdown();
    okHttpClient.connectionPool().evictAll();

    System.out.println();
    System.out.println("Imprimimos el objeto venta: ");
    System.out.println(venta);
  }
}
