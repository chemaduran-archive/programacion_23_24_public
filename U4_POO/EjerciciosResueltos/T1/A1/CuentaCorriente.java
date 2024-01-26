package U4_poo.ejercicios.T1.A1;
// Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo
// son: saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que
// ya está a cero), nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
//
// -Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de
// descubierto será de -50 euros.
//
// -Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto. El método debe indicar,
// por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además,
// deberá devolver un valor booleano que indique lo mismo.
//
// -Ingresar dinero: se incrementa el saldo.
//
// -Mostrar información: muestra la información de la cuenta corriente.

public class CuentaCorriente {
  // Atributos
  private double saldo;
  private int limite_descubierto;
  private String nombre;
  private String dni;

  static int compartido;
  static int otro_compartido;

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
