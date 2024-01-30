package U5_herencia_interfaces.teoria.ejemplo_persona;

public class Principal {
  public static void main(String[] args) {
    //
    Perro p =
        new Perro() {
          public void voz() {
            System.out.println("jejeje");
          }
        };

    p =
        new Perro() {
          public void voz() {
            System.out.println("jijiji");
          }
        };

    p.voz();
  }
}
