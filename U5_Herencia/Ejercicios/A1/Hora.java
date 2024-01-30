package U5_herencia_interfaces.ejercicios.T1_en_clase.A1;

public class Hora {
  private int hora;
  private int minutos;

  public Hora(int hora, int minutos) {
    setHora(hora);
    setMinutos(minutos);
  }

  public void setHora(int hora) {
    if (hora >= 0 && hora <= 23) {
      this.hora = hora;
    }
  }

  public void setMinutos(int minutos) {
    if (minutos >= 0 && minutos <= 59) {
      this.minutos = minutos;
    }
  }

  public void inc() {
    if (minutos + 1 < 60) {
      minutos++;
    } else {
      minutos = 0;

      if (hora + 1 < 24) {
        hora++;
      } else {
        hora = 0;
      }
    }
  }

  @Override
  public String toString() {
    return hora + ":" + minutos;
  }
}
