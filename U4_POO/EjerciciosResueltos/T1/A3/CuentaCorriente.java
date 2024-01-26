package U4_poo.ejercicios.T1.A3;

// Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas,
// y la visibilidad de sus atributos para que:
//
// -saldo y limite no sean visibles para otras clases
//
// -nombre sea público para cualquier clase
//
// -dni solo sea visible por clases vecinas
//
// (Comprueba la visibilidad desde el programa principal comentando cada acceso o intento de acceso)

public class CuentaCorriente {
  // Atributos
  private double saldo;
  private int limite_descubierto;
  public String nombre;
  String dni;

  // Métodos
  public CuentaCorriente(String nombre, String dni) {
    saldo = 0;
    this.nombre = nombre;
    this.dni = dni;
    limite_descubierto = -50;
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