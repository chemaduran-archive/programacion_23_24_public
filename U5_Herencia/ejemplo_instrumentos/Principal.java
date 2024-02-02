package U5_herencia_interfaces.teoria.ejemplo_instrumentos;

public class Principal {
  public static void main(String[] args) {
    Trompeta trompeta = new Trompeta();
    Piano piano = new Piano();

    Instrumento instrumento;

    instrumento = trompeta; // asigno la trompeta al instrumento
    instrumento.interpretar(); // "llama al sout de trompeta
    instrumento = piano; // asigno el piano al instrumento
    instrumento.interpretar(); // "llama al sout de piano

    // Este comportamiento que acabamos de ver, es lo que se llama
    // POLIMORFISMO: `Polys`, que significa varios, y `Morfo`, que
    // significa `forma`. Es decir, tiene varias formas de comportamiento
    // según el tipo original que sea, se ejecutará un método u otro.
  }
}
