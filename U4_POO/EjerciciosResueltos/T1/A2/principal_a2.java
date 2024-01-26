package U4_poo.ejercicios.T1.A2;

public class principal_a2 {
  public static void main(String[] args) {

    CuentaCorriente c1 = new CuentaCorriente("Chema", "123456789");
    CuentaCorriente c2 = new CuentaCorriente(100);
    CuentaCorriente c3 = new CuentaCorriente(100, 600, "987654");

    c1.mostrar_informacion();
    System.out.println("");
    c2.mostrar_informacion();
    System.out.println("");
    c3.mostrar_informacion();
    System.out.println("");
  }
}
