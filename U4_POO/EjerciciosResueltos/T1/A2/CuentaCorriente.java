package U4_poo.ejercicios.T1.A2;

// En la clase CuentaCorriente, sobrecargar los constructores para que permitan crear objetos:
//
// -solo con el saldo inicial, no serán necesarios los datos del titular. Por defecto el límite de
// descubierto será 0 euros.
//
// -con un saldo inicial, con un límite de descubierto y con el DNI del titular de la cuenta.

public class CuentaCorriente {
  // Atributos
  private double saldo;
  private int limite_descubierto;
  private String nombre;
  private String dni;

  // Métodos
  public CuentaCorriente(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
    this.saldo = 0;
    this.limite_descubierto = -50;
  }

  public CuentaCorriente(double saldo_inicial) {
    this.saldo = saldo_inicial;
    this.limite_descubierto = 0;
  }

  public CuentaCorriente(double saldo_inicial, int limite_descubierto, String dni) {
    this.saldo = saldo_inicial;
    this.limite_descubierto = limite_descubierto;
    this.dni = dni;
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
  }
}
