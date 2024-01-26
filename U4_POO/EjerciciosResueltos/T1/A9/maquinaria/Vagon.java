package U4_poo.ejercicios.T1.A9.maquinaria;

class Vagon {
  // Atributos
  private long max_cap;
  private long current_cap;
  private TipoCarga carga;

  public void setMax_cap(long max_cap) {
    this.max_cap = max_cap;
  }

  public void setCurrent_cap(long current_cap) {
    this.current_cap = current_cap;
  }

  public void setCarga(TipoCarga carga) {
    this.carga = carga;
  }

  public Vagon(long max_cap, long current_cap, TipoCarga carga) {
    setMax_cap(max_cap);
    setCurrent_cap(current_cap);
    setCarga(carga);
  }

  public void mostrar_informacion() {
    System.out.println("VAGON: max_cap = " + max_cap);
    System.out.println("VAGON: current_cap = " + current_cap);
    System.out.println("VAGON: carga = " + carga);
  }
}
