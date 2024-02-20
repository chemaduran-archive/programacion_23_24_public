package corregir.U4U5_ENTREGABLE.correcion_clase;

public class principal {
  public static void main(String[] args) {
    Pais pais1 = new Pais("España", 3);
    Pais pais2 = new Pais("Italia", 8);
    Pais pais3 = new Pais("Francia", 4);
    Pais pais4 = new Pais("Alemania", 1);

    Juego juego1 = new Juego(2024, "alsj");

    juego1.AniadirPais(pais1);
    juego1.AniadirPais(pais2);
    juego1.AniadirPais(pais3);
    juego1.AniadirPais(pais4);

    juego1.mostrarPaises();
    // juego1.EliminarPais(pais4);
    System.out.println();

    juego1.mostrarPaises();
    System.out.println();

    juego1.mostrarPaisesOrdenados();
    System.out.println();
    juego1.mostrarPaisesParaCeremonia();

    LanzadoresTroncos jugador1 = new LanzadoresTroncos("PEPE", 89, "LSKS");
    PeladoresGambas jugador2 = new PeladoresGambas("Juana", 21, 78);
    Baloncestista jugador3 = new Baloncestista("Juan", 45, 1);

    LanzaTroncosPelaos lanza_troncos = new LanzaTroncosPelaos("Partido1", "sljfl");

    lanza_troncos.AniadirParticipante(jugador1);
    lanza_troncos.AniadirParticipante(jugador2);
    lanza_troncos.AniadirParticipante(jugador3);

    lanza_troncos.mostrarParticipantes();
  }
}
