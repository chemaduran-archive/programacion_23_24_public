package U4_poo.ejercicios.T2.A3;

public class principal_a3 {
  public static void main(String[] args) {
    //
    PilaLista p = new PilaLista();
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
