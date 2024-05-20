package U8_xml_json.XML.ejercicios.ejemploSax_CreandoPersonas;

public class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    setNombre(nombre);
    setEdad(edad);
  }

  public Persona() {
    setNombre(null);
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}
