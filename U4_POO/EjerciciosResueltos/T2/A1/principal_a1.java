package U4_poo.ejercicios.T2.A1;

public class principal_a1 {
  public static void main(String[] args) {
    //
    Lista l = new Lista();

    System.out.println(l.mostrar_lista());
    l.insertar_en_posicion(0, 7);
    l.insertar_en_posicion(11, 8);
    l.insertar_final(3);
    l.insertar_principio(2);
    System.out.println(l.mostrar_lista());
    l.eliminar_elemento(0);
    System.out.println(l.mostrar_lista());
  }
}
