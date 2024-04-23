package U7_collections.en_clase.entregable_2021_tarde;

import java.io.Serializable;

public class Alumno implements Serializable {
  private static int id = 1;
  private int identificador;
  private String nombre;
  private String apellidos;
  private String dni;
  private Unidad unidad;

  public Alumno(String nombre, String dni, Unidad unidad, String apellidos) {
    this.identificador = id++;
    this.nombre = nombre;
    this.dni = dni;
    this.unidad = unidad;
    this.apellidos = apellidos;
  }

  public static int getId() {
    return id;
  }

  public static void setId(int id) {
    Alumno.id = id;
  }

  public Unidad getUnidad() {
    return unidad;
  }

  public void setUnidad(Unidad unidad) {
    this.unidad = unidad;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  @Override
  public String toString() {
    return "Alumno{"
        + "nombre='"
        + nombre
        + '\''
        + ", apellidos='"
        + apellidos
        + '\''
        + ", dni='"
        + dni
        + '\''
        + ", unidad="
        + unidad
        + '}';
  }
}
