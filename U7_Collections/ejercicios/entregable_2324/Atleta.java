package U7_collections.en_clase.entregable_2324;

import java.io.Serializable;

public class Atleta implements Serializable {
  private static int dorsalSt = 1;
  private int dorsal;
  private String nombre;
  private String pais;
  private double tiempo;
  private Categoria cat;
  private boolean finisher;

  public Atleta(String nombre, String pais, Categoria cat) {
    dorsal = dorsalSt++;
    this.nombre = nombre;
    this.pais = pais;
    this.cat = cat;
    this.finisher = false;
  }

  public static int getDorsalSt() {
    return dorsalSt;
  }

  public static void setDorsalSt(int dorsalSt) {
    Atleta.dorsalSt = dorsalSt;
  }

  public int getDorsal() {
    return dorsal;
  }

  public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public double getTiempo() {
    return tiempo;
  }

  public void setTiempo(double tiempo) {
    this.tiempo = tiempo;
  }

  public Categoria getCat() {
    return cat;
  }

  public void setCat(Categoria cat) {
    this.cat = cat;
  }

  public boolean isFinisher() {
    return finisher;
  }

  public void setFinisher(boolean finisher) {
    this.finisher = finisher;
  }

  @Override
  public String toString() {
    return "Atleta{"
        + "dorsal="
        + dorsal
        + ", nombre='"
        + nombre
        + '\''
        + ", pais='"
        + pais
        + '\''
        + ", tiempo="
        + tiempo
        + ", cat="
        + cat
        + ", finisher="
        + finisher
        + '}';
  }
}
