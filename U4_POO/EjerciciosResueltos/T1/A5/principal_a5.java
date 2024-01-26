package U4_poo.ejercicios.T1.A5;

public class principal_a5 {
  public static void main(String[] args) {
    //
    Texto t = new Texto(5);
    t.add_string("HO");
    t.add_string(";");
    t.add_string_final("Lá");
    t.add_char('X');
    t.mostrar();
    System.out.println("El número de vocales del texto es " + t.num_vocales());
  }
}
