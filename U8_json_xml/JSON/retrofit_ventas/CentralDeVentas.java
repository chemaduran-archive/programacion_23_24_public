package U8_xml_json.JSON.teoria.retrofit_ventas;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralDeVentas {

  // https://my-json-server.typicode.com/chemaduran/json_api_demo/ventas
  @GET("json_api_demo/ventas")
  Call<List<Venta>> listVentas();

  // https://my-json-server.typicode.com/chemaduran/json_api_demo/ventas/2
  @GET("json_api_demo/ventas/{venta_id}")
  Call<Venta> getVentaId(@Path("venta_id") Integer venta_id);

  // https://my-json-server.typicode.com/chemaduran/json_api_demo/ventas/2/detalles
  @GET("json_api_demo/ventas/{venta_id}/detalles")
  Call<List<DetalleVenta>> listVentaIdDetalles(@Path("venta_id") Integer venta_id);
}
