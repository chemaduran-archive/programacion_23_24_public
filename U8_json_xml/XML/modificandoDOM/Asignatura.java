package U8_xml_json.XML.ejercicios.modificandoDOM;

public class Asignatura {
  private String nombre;
  private int horasSemanales;
  private String profesor;

  public Asignatura(String nombre, int horasSemanales, String profesor) {
    this.nombre = nombre;
    this.horasSemanales = horasSemanales;
    this.profesor = profesor;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getHorasSemanales() {
    return horasSemanales;
  }

  public void setHorasSemanales(int horasSemanales) {
    this.horasSemanales = horasSemanales;
  }

  public String getProfesor() {
    return profesor;
  }

  public void setProfesor(String profesor) {
    this.profesor = profesor;
  }
}
