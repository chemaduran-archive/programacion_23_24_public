package U5_herencia_interfaces.teoria.abstracta;

public abstract class Bailarin {
  public String nombre;

  // Aunque las clases abstractas no pueden ser instanciadas
  // (no se puede hacer un new Bailarin("pepe")), sí que tienen constructor
  // porque las clases hijas podrán aprovechar este constructor con `super`
  public Bailarin(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Bailarin{" + "nombre='" + nombre + '\'' + '}';
  }

  // Este método es abstract, y lo que quiere decir es que aquí
  // no lo definimos, pero todas las clases hijas están obligadas
  // a implementar este método.
  public abstract void bailar();
}
