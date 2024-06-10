package URecuperacion.ejercicios_practicar.esports;

public class Estadisticas {
  private int num_partidas_jugadas;
  private int num_partidas_ganadas;
  private int num_partidas_perdidas;
  private int ranking;

  public Estadisticas(
      int num_partidas_jugadas, int num_partidas_ganadas, int num_partidas_perdidas, int ranking) {
    this.num_partidas_jugadas = num_partidas_jugadas;
    this.num_partidas_ganadas = num_partidas_ganadas;
    this.num_partidas_perdidas = num_partidas_perdidas;
    this.ranking = ranking;
  }

  public int getNum_partidas_jugadas() {
    return num_partidas_jugadas;
  }

  public void setNum_partidas_jugadas(int num_partidas_jugadas) {
    this.num_partidas_jugadas = num_partidas_jugadas;
  }

  public int getNum_partidas_ganadas() {
    return num_partidas_ganadas;
  }

  public void setNum_partidas_ganadas(int num_partidas_ganadas) {
    this.num_partidas_ganadas = num_partidas_ganadas;
  }

  public int getNum_partidas_perdidas() {
    return num_partidas_perdidas;
  }

  public void setNum_partidas_perdidas(int num_partidas_perdidas) {
    this.num_partidas_perdidas = num_partidas_perdidas;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  @Override
  public String toString() {
    return "Estadisticas{"
        + "num_partidas_jugadas="
        + num_partidas_jugadas
        + ", num_partidas_ganadas="
        + num_partidas_ganadas
        + ", num_partidas_perdidas="
        + num_partidas_perdidas
        + ", ranking="
        + ranking
        + '}';
  }
}
