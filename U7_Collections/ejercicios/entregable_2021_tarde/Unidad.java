package U7_collections.en_clase.entregable_2021_tarde;

import java.io.Serializable;
import java.util.ArrayList;

public class Unidad implements Serializable {
  private String nombreUnidad;
  private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

  public Unidad(String nombreUnidad) {
    this.nombreUnidad = nombreUnidad;
  }

  public String getNombreUnidad() {
    return nombreUnidad;
  }

  public void setNombreUnidad(String nombreUnidad) {
    this.nombreUnidad = nombreUnidad;
  }

  public void addAlumno(Alumno alumno) {
    listaAlumnos.add(alumno);
  }

  @Override
  public String toString() {
    return nombreUnidad;
  }
}
