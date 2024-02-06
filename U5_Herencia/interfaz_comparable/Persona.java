package U5_herencia_interfaces.teoria.interfaces.comparable;

public class Persona implements Comparable {
  private String nombre;
  private int edad;
  private double estatura;
  private int dni;

  public Persona(String nombre, int edad, double estatura) {
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;
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

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public double getEstatura() {
    return estatura;
  }

  public int getDni() {
    return dni;
  }

  // Este método es el que nos obliga a implementar la interfaz
  // Comparable, y sería el comparador por defecto de la clase Persona
  @Override
  public int compareTo(Object o) {
    // Si estoy comparando consigo mismo, o bien el que objeto con el
    // que me comparan es nulo, voy a devolver 0, es decir, considero
    // que son iguales. Es un criterio que he tomado.
    if (this == o || o == null) return 0;
    Persona p = (Persona) o;
    // Aquí estoy comparando por el nombre, que es un String y por tanto
    // puedo llamar a compareTo del String.
    return this.nombre.compareTo(p.nombre);
  }

  // El mismo ejemplo, pero tomando como criterio la comparación por
  // la edad

  //  @Override
  //  public int compareTo(Object o) {
  //    if (this == o || o == null) return 0;
  //    Persona otra = (Persona) o;
  //    if (this.getEdad() > otra.getEdad()) {
  //      return 1;
  //    } else if (this.getEdad() < otra.getEdad()) {
  //      return -1;
  //    }
  //    return 0;
  //  }
}
