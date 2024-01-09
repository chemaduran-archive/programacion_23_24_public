package U4_poo.ejercicios.ej1;

public class CuentaCorriente {
  private long saldo;
  private long limite_descubrimiento;
  private String nombre;
  private String DNI;

  public CuentaCorriente() {}

  public CuentaCorriente(String nombre, String DNI) {
    this.saldo = 0;
    this.limite_descubrimiento = -50;
    this.nombre = nombre;
    this.DNI = DNI;
  }

  @Override
  public String toString() {
    return "CuentaCorriente{"
        + "saldo="
        + saldo
        + ", limite_descubrimiento="
        + limite_descubrimiento
        + ", nombre='"
        + nombre
        + '\''
        + ", DNI='"
        + DNI
        + '\''
        + '}';
  }

  public void ingresar(int cantidad) {
    saldo = +cantidad;
  }

  public boolean sacar(int cantidad) {
    boolean resultado;
    if (cantidad < saldo + limite_descubrimiento) {
      saldo = -cantidad;
      System.out.println("La operación ha sido realizada.");
      resultado = true;
    } else {
      System.out.println("La operación no se puede realizar");
      resultado = false;
    }
    return resultado;
  }

  public long getSaldo() {
    return saldo;
  }

  public void setSaldo(long saldo) {
    this.saldo = saldo;
  }

  public long getLimite_descubrimiento() {
    return limite_descubrimiento;
  }

  public void setLimite_descubrimiento(long limite_descubrimiento) {
    this.limite_descubrimiento = limite_descubrimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }
}
