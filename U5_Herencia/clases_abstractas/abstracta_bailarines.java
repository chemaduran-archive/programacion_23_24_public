package U5_herencia_interfaces.teoria.abstracta;

public class abstracta_bailarines {
  public static void main(String[] args) {
    //
    //            Bailarin = new Bailarin("Pepe"); // no puedo hacer esto. No se puede instanciar
    Breakdancer b1 = new Breakdancer("juanin", "89786351C");
    Breakdancer b2 = new Breakdancer("pepin", "2345252B");

    // Esto puedo hacerlo, porque recordemos que un Breakdancer es un Bailarín
    Bailarin b = b1;

    // y `b` a partir de ahora, se comportará como un Bailarín "nada más",
    // y no como un Breakdancer.
  }
}
