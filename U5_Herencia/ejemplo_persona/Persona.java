package U5_herencia_interfaces.teoria.ejemplo_persona;

import java.util.Objects;

public class Persona {
  protected int dni;
  String nombre;
  int edad;
  double estatura;

  public Persona(String nombre, int edad, double estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
  }

  public String getNombre() {
    return this.nombre;
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
    if (o == null || getClass() != o.getClass()) return false;
    Persona persona = (Persona) o;
    return dni == persona.dni && Objects.equals(nombre, persona.nombre);
  }
}
