package U4_poo.ejercicios.T1.A9.maquinaria;

import U4_poo.ejercicios.T1.A9.personal.Maquinista;

public class Tren {
  // Atributos
  final int MAX_VAGONES = 5;
  static int MAX_VAGONES_STATIC = 7;

  private int num_vagones = 0;
  Maquinista maquinista;
  Locomotora locomotora;
  Vagon[] vagones;

  public void setMaquinista(Maquinista maquinista) {
    this.maquinista = maquinista;
  }

  public void setLocomotora(Locomotora locomotora) {
    this.locomotora = locomotora;
  }

  public Tren(Locomotora l, Maquinista m) {
    setLocomotora(l);
    setMaquinista(m);
    vagones = new Vagon[MAX_VAGONES];
  }

  public void add_vagon(long max_cap, long current_cap, TipoCarga carga) {
    if (num_vagones < MAX_VAGONES) {
      Vagon v = new Vagon(max_cap, current_cap, carga);
      vagones[num_vagones++] = v;
    }
  }

  public void mostrar_informacion() {
    locomotora.mostrar_informacion();
    maquinista.mostrar_informacion();
    for (int i = 0; i < num_vagones; i++) {
      vagones[i].mostrar_informacion();
    }
  }
}
