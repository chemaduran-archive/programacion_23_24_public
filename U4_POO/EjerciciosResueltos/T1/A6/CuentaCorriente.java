package U4_poo.ejercicios.T1.A6;

// Modificar la clase CuentaCorriente para que cada una esté vinculada a un objeto de tipo Banco.
// Escribir los métodos necesarios en la clase CuentaCorriente para gestionar el banco al que
// pertenece (cambiar de banco, mostrar la info de la cuenta, incluídos los datos del banco si lo
// tiene vinculado). Existe la posibilidad de que una cuenta corriente no esté vinculada a ningún
// banco.

public class CuentaCorriente {
  // Atributos
  private double saldo;
  private final int limite_descubierto;
  public String nombre;
  protected String dni;
  private Banco banco;

  // Métodos
  public CuentaCorriente(String nombre, String dni) {
    saldo = 0;
    this.nombre = nombre;
    this.dni = dni;
    limite_descubierto = -50;
  }

  public void cambiar_banco(Banco nuevo_banco) {
    banco = nuevo_banco;
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
    if (banco != null) {
      System.out.println("El banco vinculado es: " + banco.nombre());
    }
  }
}