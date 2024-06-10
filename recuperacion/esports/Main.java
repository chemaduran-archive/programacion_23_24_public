package URecuperacion.ejercicios_practicar.esports;

import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Equipo equipo1 = new Equipo("Italia");
    Equipo equipo2 = new Equipo("Alemania");

    Estadisticas estadistica1 = new Estadisticas(5, 4, 1, 2);
    Estadisticas estadistica2 = new Estadisticas(7, 3, 4, 5);
    Estadisticas estadistica3 = new Estadisticas(8, 2, 6, 9);
    Estadisticas estadistica4 = new Estadisticas(8, 6, 2, 9);

    Jugadores jugador1 = new Jugador_profesional("Manuel", "Manuel", 28, "Carry");
    Jugadores jugador2 = new Jugador_profesional("Pepe", "pe", 18, "Support");
    Jugador_Amateur jugador3 = new Jugador_Amateur("Alfonso", "sewdrwsws", 32, "Support");

    Esports esports = new Esports();

    equipo1.add_estadistica(estadistica1);
    equipo1.add_jugador(jugador1);
    equipo1.add_jugador(jugador2);
    equipo1.add_jugador(jugador3);

    equipo2.add_estadistica(estadistica2);
    equipo2.add_estadistica(estadistica4);
    equipo1.add_estadistica(estadistica3);

    esports.add_equipo(equipo1);
    esports.add_equipo(equipo2);

    //    esports.mostrarEquiposOrdenados();

    //    System.out.println(equipo1.getLista_estadistica());
    System.out.println("---------------------");

    esports.mostrarEquiposConMasVictorias();
    //
    //    esports.guardarEstadisticas();
    //
    //    esports.recuperarEstadisticas();
  }
}
