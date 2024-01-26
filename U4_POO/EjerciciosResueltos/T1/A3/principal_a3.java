package U4_poo.ejercicios.T1.A3;

public class principal_a3 {
  public static void main(String[] args) {
    CuentaCorriente c = new CuentaCorriente("chema", "123456789");

    String a = c.nombre; // es visible por cualquier clase externa
    String b = c.dni; // solamente es visible por clases vecinas
    // int d = c.limite_descubierto   // no puedo acceder a esto
  }
}
