package U8_xml_json.JSON.teoria.venta;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
  private Date fecha;
  private String cliente;
  private ArrayList<DetalleVenta> detalle;

  public Venta(Date fecha, String cliente) {
    this.fecha = fecha;
    this.cliente = cliente;
  }

  public ArrayList<DetalleVenta> getDetalle() {
    return detalle;
  }

  public void setDetalle(ArrayList<DetalleVenta> detalle) {
    this.detalle = detalle;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  @Override
  public String toString() {
    return "Venta{"
        + "fecha="
        + fecha
        + ", cliente='"
        + cliente
        + '\''
        + ", detalle="
        + detalle
        + '}';
  }
}
