package U4_poo.ejercicios.T1.A10;

public class Hora {
  private int hora;
  private int minutos;
  private int segundos;

  @Override
  public String toString() {
    return hora + ":" + minutos + ":" + segundos;
  }

  public Hora(int hora, int minutos, int segundos) {
    this.hora = hora;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public void sumar_segundos(int n) {
    for (int i = 0; i < n; i++) {
      this.segundos++;
      if (this.segundos == 60) {
        this.segundos = 0;
        this.minutos++;
        if (this.minutos == 60) {
          this.minutos = 0;
          this.hora++;
          if (this.hora == 24) {
            this.hora = 0;
          }
        }
      }
    }
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    if (hora < 23 && hora >= 0) {
      this.hora = hora;
    } else {
      this.hora = 0;
    }
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    if (minutos >= 0 && minutos <= 59) {
      this.minutos = minutos;
    } else {
      this.minutos = 0;
    }
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    if (segundos >= 0 && segundos <= 59) {
      this.segundos = segundos;
    } else {
      this.segundos = 0;
    }
  }
}
