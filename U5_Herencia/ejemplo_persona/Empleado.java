package U5_herencia_interfaces.teoria.ejemplo_persona;

public class Empleado extends Persona {
  double salario;
  String estatura = "";

  public Empleado(String nombre, int edad, double estatura, double salario) {
    super(nombre, edad, estatura);
    this.salario = salario;
  }

  // Este es un método normal de la clase empleado
  public double getSalario() {
    return this.salario;
  }

  // Estoy sobreescribiendo el método de la clase base
  @Override
  public String getNombre() {
    return "El nombre es: " + this.nombre;
  }

  @Override
  public String toString() {
    return "Empleado{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", estatura="
        + super.dni
        + ", salario="
        + salario
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Empleado)) return false;
    Empleado empleado = (Empleado) o;
    return this.dni == empleado.dni && this.nombre.equals(empleado.nombre);
  }
}
