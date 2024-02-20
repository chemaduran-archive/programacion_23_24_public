package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Objects;

public class Pais implements Comparable<Pais> {
  private String nombre;
  private int num_participantes;

  public Pais(String nombre, int num_participantes) {
    this.nombre = nombre;
    this.num_participantes = num_participantes;
  }

  public int getNum_participantes() {
    return num_participantes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pais pais = (Pais) o;
    return num_participantes == pais.num_participantes && Objects.equals(nombre, pais.nombre);
  }

  @Override
  public String toString() {
    return "Pais{" + "nombre='" + nombre + '\'' + ", num_participantes=" + num_participantes + '}';
  }

  @Override
  public int compareTo(Pais o) {
    return this.nombre.compareTo(o.nombre);
  }
}
