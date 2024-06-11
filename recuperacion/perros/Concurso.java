package U7_collections.corregir.perros;

import java.io.*;
import java.util.*;

public class Concurso {

  private String nombre_concurso;
  private String localidad;

  private HashMap<String, Set<Perros>> mapaPerros;

  public Concurso(String nombre_concurso, String localidad) {
    this.nombre_concurso = nombre_concurso;
    this.localidad = localidad;
    this.mapaPerros = new HashMap<>();
  }

  public String getNombre_concurso() {
    return nombre_concurso;
  }

  public void setNombre_concurso(String nombre_concurso) {
    this.nombre_concurso = nombre_concurso;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  public HashMap<String, Set<Perros>> getMapaPerros() {
    return mapaPerros;
  }

  public void setMapaPerros(HashMap<String, Set<Perros>> mapaPerros) {
    this.mapaPerros = mapaPerros;
  }

  // Un método addDog() que recibe como parámetros la raza y un perro y que añadirá a la estructura
  // de datos ese perro en la raza determinada
  // o mostrará un mensaje de error en caso de que estemos intentando introducir en la raza un perro
  // que no sea de dicha raza.
  public void addDog(String raza, Perros p) {

    if (p.getRaza().equalsIgnoreCase(raza)) {
      if (mapaPerros.containsKey(raza)) {
        Set<Perros> listaPerros = mapaPerros.get(raza);
        listaPerros.add(p);
        mapaPerros.put(raza, listaPerros);
      } else {
        Set<Perros> listaNueva = new HashSet<>();
        listaNueva.add(p);
        mapaPerros.put(raza, listaNueva);
      }
      System.out.println("Anadido correctamente");
    } else {
      System.out.println("El perro que estas intentado introducir no es de esa raza");
    }
  }

  // El método disqualifyDog() que recibe como parámetro un perro y lo elimina del concurso
  // borrándolo de la estructura de datos que contienen
  // los datos de los perros participantes organizados por razas. En caso de ese perro no esté
  // escrito deberá mostrar el siguiente mensaje "Perro no inscrito".

  public void disqualifyDog(Perros p) {

    boolean verificar = false;
    for (Set<Perros> perretes : mapaPerros.values()) {
      for (Perros perro : perretes) {
        if (perro.equals(p)) {
          perretes.remove(p);
          System.out.println("Eliminado correctamente");
          verificar = true;
          break;
        }
      }
    }

    if (!verificar) {
      System.out.println("Perro no inscrito");
    }
  }

  // El método ownerDogs() que mostrará por pantalla todos los perros de un dueño determinado (sea
  // de la raza que sean).
  // Este método recibe como parámetro el número de socio de la Sociedad Canina
  // y mostrará el mensaje "Este socio no tiene perros inscritos" en caso de que el socio no tenga
  // ningún perro en este concurso.

  public void ownerDogs(int numeroSocio) {
    List<Perros> perros_socio = new ArrayList<>();

    for (Set<Perros> perretes : mapaPerros.values()) {
      for (Perros p : perretes) {
        if (p.getPropietario().getNumero_socio() == numeroSocio) {
          perros_socio.add(p);
        }
      }
    }

    if (perros_socio.isEmpty()) {
      System.out.println("Este socio no tiene perros inscritos");
      return;
    }

    for (Perros p : perros_socio) {
      System.out.println(p);
    }
  }

  // El método perrosporPeso() que mostrará la lista de perros de una raza, que se recibe como
  // parámetro, ordenados por peso de manera decreciente.

  public void perrosporPeso(String raza) {
    List<Perros> perros_raza = new ArrayList<>();
    for (Set<Perros> perretes : mapaPerros.values()) {
      for (Perros p : perretes) {
        if (p.getRaza().equalsIgnoreCase(raza)) {
          perros_raza.add(p);
        }
      }
    }
    perros_raza.sort(new OrdenarPerrosPeso());
    for (Perros p : perros_raza) {
      System.out.println(p);
    }
  }

  // El método perrosporEdad() que mostrará la lista de perros de una raza, que se recibe como
  // parámetro, ordenados por edad de manera decreciente.

  public void perrosporEdad(String raza) {
    List<Perros> perros_r = new ArrayList<>();
    for (Set<Perros> perretes : mapaPerros.values()) {
      for (Perros p : perretes) {
        if (p.getRaza().equalsIgnoreCase(raza)) {
          perros_r.add(p);
        }
      }
    }
    perros_r.sort(new OrdenarPerrosEdad());

    for (Perros p : perros_r) {
      System.out.println(p);
    }
  }

  // guardarPerros() que escribirá todos los perros cargados en el fichero "perros.dat". Estos
  // perros serán guardados de manera individual sin tener que estar, en esa estructura, organizados
  // por raza.
  public void guardarPerros() {
    try (ObjectOutputStream oos =
        new ObjectOutputStream(
            new FileOutputStream(
                "C:\\Users\\chico\\Desktop\\programacion_23_24\\ejercicios\\src\\main\\java\\Junio\\U6U7\\Ejercicio1920\\perros.dat"))) {
      oos.writeObject(mapaPerros);
      System.out.println("Guardado correctamente");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  // cargarPerros() que leerá todos los perros desde el fichero binario "perros.dat" y los colocará
  // en el conjunto de perros de su raza.
  public void cargarPerros() {
    try {
      ObjectInputStream ois =
          new ObjectInputStream(
              new FileInputStream(
                  "C:\\Users\\chico\\Desktop\\programacion_23_24\\ejercicios\\src\\main\\java\\Junio\\U6U7\\Ejercicio1920\\perros.dat"));
      System.out.println("DATOS CARGADOS CORRECTAMENTE");

      mapaPerros = (HashMap<String, Set<Perros>>) ois.readObject();
      System.out.println("Mapa perros : " + mapaPerros);

      ois.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
