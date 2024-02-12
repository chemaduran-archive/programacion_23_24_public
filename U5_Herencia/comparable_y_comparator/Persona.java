package U5_herencia_interfaces.teoria.interfaces.comparable_y_comparator;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
  private String nombre;
  private Integer edad;
  private Double estatura;
  private Integer dni;

  public Persona(String nombre, Integer edad, Double estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public String getNombre() {
    return nombre;
  }

  public double getEstatura() {
    return estatura;
  }

  @Override
  public String toString() {
    return "Persona{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", estatura="
        + estatura
        + ", dni="
        + dni
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Persona)) return false;
    Persona persona = (Persona) o;
    return Objects.equals(nombre, persona.nombre);
  }

  @Override
  public int compareTo(Persona otra) {
    int resultado_edad = this.edad - otra.edad;
    if (resultado_edad != 0) {
      return resultado_edad;
    } else {
      return this.nombre.compareTo(otra.nombre);
    }
  }
}
