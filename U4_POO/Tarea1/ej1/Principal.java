package U4_poo.ejercicios.ej1;

public class Principal {
  public static void main(String[] args) {
    //    CuentaCorriente cuenta = new CuentaCorriente("Natalia", "2345678E");
    CuentaCorriente cuenta1 = new CuentaCorriente();

    cuenta1.setNombre("Gustavo");
    cuenta1.setDNI("4589724F");
    cuenta1.setSaldo(10);
    cuenta1.setLimite_descubrimiento(-30);

    System.out.println(cuenta1.getNombre());
  }
}
