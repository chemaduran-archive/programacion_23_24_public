package URecuperacion.ejercicios_practicar.esports;

import java.io.*;
import java.util.*;

public class Esports {
  private Map<Equipo, Set<Estadisticas>> mapa_equipo = new HashMap<>();

  public void mostrarEquiposOrdenados() {
    List<Equipo> lista_equipo = new ArrayList<>(mapa_equipo.keySet());
    lista_equipo.sort(new OrdenarNombre());
    for (Equipo e : lista_equipo) {
      System.out.println(e);
    }
  }

  public void add_equipo(Equipo equipo) {
    Set<Estadisticas> conjunto_estadistica = new HashSet<>(equipo.getLista_estadistica());
    mapa_equipo.put(equipo, conjunto_estadistica);
  }

  public Set<Estadisticas> obtenerEstadisticas(String nombreEquipo) {
    Equipo equipo_falso = new Equipo(nombreEquipo);
    Set<Estadisticas> resultado_estadisticas = new HashSet<>();

    if (mapa_equipo.containsKey(equipo_falso)) {
      resultado_estadisticas = mapa_equipo.get(equipo_falso);
    }

    return resultado_estadisticas;
  }

  public void mostrarEquiposConMasVictorias() {
    List<Equipo> equipos_ganadores = new ArrayList<>();
    Set<Map.Entry<Equipo, Set<Estadisticas>>> conjunto_entradas_del_mapa = mapa_equipo.entrySet();
    for (Map.Entry<Equipo, Set<Estadisticas>> entrada_mapa : conjunto_entradas_del_mapa) {
      Equipo equipo = entrada_mapa.getKey();
      Set<Estadisticas> estadisticas = entrada_mapa.getValue();
      for (Estadisticas estadistica : estadisticas) {
        if (estadistica.getNum_partidas_ganadas() > estadistica.getNum_partidas_perdidas()) {
          equipos_ganadores.add(equipo);
          break;
        }
      }
    }

    for (Equipo equipo : equipos_ganadores) {
      System.out.println(equipo);
    }
  }

  //  public void addEstadistica(Estadisticas estadistica) {}

  //  public void guardarEstadisticas() {
  //    try (ObjectOutputStream oo =
  //        new ObjectOutputStream(
  //            new FileOutputStream(
  //
  // "C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicio\\src\\main\\java\\Recuperacion\\Ejercicio2Prueba2\\estadisticas.dat"))) {
  //      oo.writeObject(mapa_equipo);
  //      System.out.println("Guardado correctamente");
  //    } catch (IOException e) {
  //      System.out.println(e.getMessage());
  //    }
  //  }

  //  public void recuperarEstadisticas() {
  //    try (ObjectInputStream ooi =
  //        new ObjectInputStream(
  //            new FileInputStream(
  //
  // "C:\\Users\\DAW_M\\Desktop\\programacion_23_24_\\ejercicio\\src\\main\\java\\Recuperacion\\Ejercicio2Prueba2\\estadisticas.dat"))) {
  //      mapa_equipo = (Map<String, Equipo>) ooi.readObject();
  //      System.out.println("Cargado correctamente");
  //
  //    } catch (IOException e) {
  //      e.printStackTrace();
  //    } catch (ClassNotFoundException e) {
  //      throw new RuntimeException(e);
  //    }
  //  }
}
