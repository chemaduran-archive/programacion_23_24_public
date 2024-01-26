package U4_poo.ejercicios.T1.A4;

// Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco. Añadir un
// atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un
// método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)

public class CuentaCorriente {
  // Atributos
  private double saldo;
  private int limite_descubierto;
  public String nombre;
  String dni;

  private static String banco = "Cajasol";

  // Métodos
  public CuentaCorriente(String nombre, String dni) {
    saldo = 0;
    this.nombre = nombre;
    this.dni = dni;
    limite_descubierto = -50;
  }

  public static String cambiar_banco(String nuevo_banco) {
    banco = nuevo_banco;
    return "se cambió el nombre de banco a " + banco;
  }

  public boolean sacar_dinero(double peticion) {
    boolean resultado = false;

    if ((saldo - peticion) >= limite_descubierto) {
      saldo -= peticion;
      resultado = true;
      System.out.println("Se han sacado " + peticion + " euros");
    } else {
      System.out.println("No se ha podido sacar dinero");
    }

    return resultado;
  }

  public void ingresar_dinero(double ingreso) {
    saldo += ingreso;
  }

  public void mostrar_informacion() {
    System.out.println("La cuenta corriente pertenece a: " + nombre + " con DNI " + dni);
    System.out.println("Tiene un saldo de: " + saldo + " euros");
    System.out.println("Tiene un límite de descubierto de: " + limite_descubierto + " euros");
    System.out.println("Y su banco es " + banco);
  }
}
