package U5_herencia_interfaces.teoria.interfaces.ejemplo_animales;

public class Primate extends Animal implements Respirar {
  @Override
  public void inhalar() {
    System.out.println("Soy un primate e inhalo");
  }

  @Override
  public void exhalar() {
    System.out.println("Soy un primate y exhalo");
  }
}
