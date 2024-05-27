package U8_xml_json.XML.ejercicios.ejemploStax;

public class Pedido {

  private int id;
  private String nombreProducto;
  private String fecha;
  private double precio;
  private int cantidad;

  // Constructor para usar a la hora de escribir en el fichero
  public Pedido(int id, String nombreProducto, String fecha, double precio, int cantidad) {
    this.id = id;
    this.nombreProducto = nombreProducto;
    this.fecha = fecha;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public Pedido() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Pedido{"
        + "id="
        + id
        + ", nombreProducto='"
        + nombreProducto
        + '\''
        + ", fecha='"
        + fecha
        + '\''
        + ", precio="
        + precio
        + ", cantidad="
        + cantidad
        + "}\n";
  }
}
