package U8_xml_json.JSON.teoria.venta;

public class DetalleVenta {
  private String producto;
  private Double importe;
  private Double precioUnitario;
  private Integer cantidad;

  public DetalleVenta(String producto, Double importe, Double precioUnitario, Integer cantidad) {
    this.producto = producto;
    this.importe = importe;
    this.precioUnitario = precioUnitario;
    this.cantidad = cantidad;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public Double getImporte() {
    return importe;
  }

  public void setImporte(Double importe) {
    this.importe = importe;
  }

  public Double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(Double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return "DetalleVenta{"
        + "producto='"
        + producto
        + '\''
        + ", importe="
        + importe
        + ", precioUnitario="
        + precioUnitario
        + ", cantidad="
        + cantidad
        + '}';
  }
}
