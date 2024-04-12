package U7_collections.en_clase.t4;

import java.io.Serializable;

public class Departamento implements Serializable {
  private String nombre;

  public Departamento(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Departamento{" + "nombre='" + nombre + '\'' + '}';
  }
}
