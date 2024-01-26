package U4_poo.ejercicios.T2.A2;

public class principal_a2 {
  public static void main(String[] args) {
    //
    PilaTabla p = new PilaTabla();
    for (int i = 0; i < 10; i++) {
      p.apilar(i);
    }

    Integer num = p.desapilar();

    while (num != null) {
      System.out.println(num);
      num = p.desapilar();
    }
  }
}
