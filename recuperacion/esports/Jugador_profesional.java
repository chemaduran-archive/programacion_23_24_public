package URecuperacion.ejercicios_practicar.esports;

public class Jugador_profesional extends Jugadores {
  private int ranking;

  public Jugador_profesional(String nombre_jugador, String alias, int edad, String rol) {
    super(nombre_jugador, alias, edad, rol);
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  @Override
  public String toString() {
    return "Jugador_profesional{" + "ranking='" + ranking + '\'' + '}';
  }
}
