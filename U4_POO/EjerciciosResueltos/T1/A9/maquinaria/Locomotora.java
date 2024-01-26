package U4_poo.ejercicios.T1.A9.maquinaria;

import U4_poo.ejercicios.T1.A9.personal.Mecanico;

public class Locomotora {
  // Atributos
  private String matricula;
  private int potencia;
  private int anyo_fabricacion;
  private Mecanico mecanico;

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public void setAnyo_fabricacion(int anyo_fabricacion) {
    this.anyo_fabricacion = anyo_fabricacion;
  }

  public void setMecanico(Mecanico mecanico) {
    this.mecanico = mecanico;
  }

  public Locomotora(String matricula, int potencia, int anyo_fabricacion, Mecanico m) {
    setMatricula(matricula);
    setPotencia(potencia);
    setAnyo_fabricacion(anyo_fabricacion);
    setMecanico(mecanico);
  }

  public void mostrar_informacion() {
    System.out.println("LOCOMOTORA matricula = " + matricula);
    System.out.println("LOCOMOTORA potencia = " + potencia);
    System.out.println("LOCOMOTORA año_fabricación = " + anyo_fabricacion);
    mecanico.mostrar_informacion();
  }
}
