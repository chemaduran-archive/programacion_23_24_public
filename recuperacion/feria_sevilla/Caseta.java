package U7_collections.corregir.feria;

import java.util.Objects;

public class Caseta {
  private static int contador = 1;
  private String nombre;
  private String ubicacion;
  private String tamanyo;
  private int id;

  public Caseta(String nombre, String ubicacion, String tamanyo) {
    this.nombre = nombre;
    this.ubicacion = ubicacion;
    this.tamanyo = tamanyo;
    this.id = contador++;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Caseta caseta = (Caseta) o;
    return Objects.equals(nombre, caseta.nombre);
  }

  @Override
  public String toString() {
    return "Caseta{" + "nombre='" + nombre + '\'' + '}';
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nombre);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public String getTamanyo() {
    return tamanyo;
  }

  public void setTamanyo(String tamanyo) {
    this.tamanyo = tamanyo;
  }
}
