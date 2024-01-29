package U4_poo.entregable_2324;

public class main {
  public static void main(String[] args) {
    System.out.println(Concierto.getNombre_oganizador());
    Cancion cancion1 = new Cancion("Me quiero morir", 3, Generos.EMORAP);
    Cancion cancion2 = new Cancion("Chema apruebame porfa", 3, Generos.TRAP);
    Cantante cantante1 = new Cantante("Gustavo Gallardo Polo", "Polo Baby", 19, "Sevilla");
    cantante1.agregar_cancion(cancion1);
    cantante1.agregar_cancion(cancion2);
    cancion1.setAutor(cantante1);
    cancion2.setAutor(cantante1);
    System.out.println(cantante1);

    cantante1.eliminar_cancion(cancion1);
    System.out.println(cantante1);
  }
}
