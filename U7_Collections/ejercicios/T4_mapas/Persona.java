package U7_collections.en_clase.t4;

import java.io.Serializable;

public class Persona implements Serializable {
  private String nombre;
  private String dni;
  private int edad;
  private double estatura;

  public Persona(String nombre, String dni, int edad, double estatura) {
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "nombre='"
        + nombre
        + '\''
        + ", dni='"
        + dni
        + '\''
        + ", edad="
        + edad
        + ", estatura="
        + estatura;
  }
}
