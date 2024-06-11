package U7_collections.corregir.feria;

import java.util.Objects;

public class Artista {
  private static int contador = 1;
  private String nombre;
  private String genero;
  private String nacionalidad;
  private int id;

  public Artista(String nombre, String genero, String nacionalidad) {
    this.nombre = nombre;
    this.genero = genero;
    this.nacionalidad = nacionalidad;
    this.id = contador++;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Artista artista = (Artista) o;
    return Objects.equals(nombre, artista.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nombre);
  }

  @Override
  public String toString() {
    return "Artista{" + "nombre='" + nombre + '\'' + '}';
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
}
