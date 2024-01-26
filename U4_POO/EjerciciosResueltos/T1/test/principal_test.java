package U4_poo.ejercicios.T1.test;

import U4_poo.ejercicios.T1.A3.CuentaCorriente;

public class principal_test {
  public static void main(String[] args) {
    //
    CuentaCorriente c1 = new CuentaCorriente("chema", "12345678");

    String a = c1.nombre; // es visible por cualquier clase externa
    // String b = c1.dni;    // solamente es visible por clases vecinas

  }
}
