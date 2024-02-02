package U5_herencia_interfaces.teoria.abstracta;

public class Breakdancer extends Bailarin {
  private String dni;

  public Breakdancer(String nombre, String dni) {
    // Aquí estoy llamando al constructor de Bailarin para construir
    // esa parte de la clase abstracta de la que heredamos
    super(nombre);
    this.dni = dni;
  }

  // Esta clase tiene la obligación de implementar el método bailar(),
  @Override
  public void bailar() {
    System.out.println("Yiha! mira este tornillo loco!");
  }

  // Por supuesto, esta clase puede tener sus métodos propios
  public void movimientos_nuevos() {
    System.out.println("Este es un movimiento nuevo, propio del Breakdancer");
  }
}
