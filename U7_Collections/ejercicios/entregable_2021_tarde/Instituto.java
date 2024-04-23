package U7_collections.en_clase.entregable_2021_tarde;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Instituto {
  private String nombreInstituto;
  private Map<String, ArrayList<Alumno>> mapaUnidadListaAlumno = new HashMap<>();
  private Map<Integer, String> mapaIdNombreUnidad = new HashMap<>();
  private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

  public Instituto(String nombreInstituto) {
    this.nombreInstituto = nombreInstituto;
  }

  public void mostrarAlumnosOrdenados() {
    listaAlumnos.sort(new OrdenarAlumnoPorApellido());
    for (Alumno a : listaAlumnos) {
      System.out.println(a);
    }
  }

  public String obtenerUnidadAlumno(Integer id) {
    String nombreUnidad = "";
    if (mapaIdNombreUnidad.containsKey(id)) {
      nombreUnidad = mapaIdNombreUnidad.get(id);
    } else {
      System.out.println("No se ha encontrado ningun alumno con id: " + id);
    }
    return nombreUnidad;
  }

  public void mostrarAlumnosUnidad(String nombreUnidad) {
    ArrayList<Alumno> lista = new ArrayList<>();
    if (mapaUnidadListaAlumno.containsKey(nombreUnidad)) {
      lista = mapaUnidadListaAlumno.get(nombreUnidad);
    } else {
      System.out.println("No se ha encontrado esa unidad");
    }
    lista.sort(new OrdenarAlumnoPorDni());
    System.out.println(lista.toString());
  }

  public void addAlumnoUnidad(Alumno alumno, String nombreUnidad) {
    rellenarMapas(alumno, nombreUnidad);
    anadirListaAlumno(alumno);
  }

  public void rellenarMapas(Alumno alumno, String nombreUnidad) {
    ArrayList<Alumno> lista = new ArrayList<>();
    if (mapaUnidadListaAlumno.containsKey(nombreUnidad)) {
      lista = mapaUnidadListaAlumno.get(nombreUnidad);
      lista.add(alumno);
    } else {
      lista.add(alumno);
    }
    mapaUnidadListaAlumno.put(nombreUnidad, lista);
    mapaIdNombreUnidad.put(alumno.getIdentificador(), nombreUnidad);
  }

  public void anadirListaAlumno(Alumno alumno) {
    listaAlumnos.add(alumno);
  }

  public void cargarAlumnos() {
    try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("alumnos.dat"))) {
      listaAlumnos = (ArrayList<Alumno>) oos.readObject();
      for (Alumno a : listaAlumnos) {
        rellenarMapas(a, a.getUnidad().getNombreUnidad());
      }
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public void guardarAlumnos() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
      oos.writeObject(listaAlumnos);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
