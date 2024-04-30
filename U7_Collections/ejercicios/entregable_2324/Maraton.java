package U7_collections.en_clase.entregable_2324;

import U7_collections.corregir.entre2324.Beltran_Franco_Natalia.atleta;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maraton {
  private Map<Integer, Atleta> mapaAtleta;

  public Maraton() {
    this.mapaAtleta = new HashMap<>();
  }

  // Quisiera declararle mi amor pero solo se declarar variables

  public void menu() {
    int opcion = 0;
    while (opcion != 9) {
      System.out.println();
      System.out.println();
      System.out.println("1. Cargar Atleta");
      System.out.println("2. Guardar Atleta");
      System.out.println("3. Inscribir Atleta");
      System.out.println("4. Guardar tiempo");
      System.out.println("5. Borrar Atleta");
      System.out.println("6. Mostrar lista finishers");
      System.out.println("7. Mostrar lista por categorias");
      System.out.println("8. Participantes por pais");
      System.out.println("9. Salir");
      Scanner sc = new Scanner(System.in);
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          cargarAtleta();
          break;
        case 2:
          guardarAtleta();
          break;
        case 3:
          System.out.println("Nombre del atleta: ");
          String n = sc.nextLine();
          System.out.println("Pais del atleta: ");
          String p = sc.nextLine();
          System.out.println("Categoria del atleta (en mayúsculas): ");
          Categoria c = Categoria.valueOf(sc.nextLine());

          inscribirAtleta(n, p, c);
          break;
        case 4:
          System.out.println("Dorsal del atleta: ");
          int d = sc.nextInt();
          sc.nextLine();
          System.out.println("Tiempo del atleta: ");
          double t = sc.nextDouble();
          sc.nextLine();
          guardarTiempo(d, t);
          break;
        case 5:
          System.out.println("Dorsal del atleta: ");
          d = sc.nextInt();
          sc.nextLine();
          borrarAtleta(d);
          break;
        case 6:
          MostrarListaFinishers();
          break;
        case 7:
          System.out.println("Categoria del atleta (en mayúsculas): ");
          c = Categoria.valueOf(sc.nextLine());
          MostrarListaCategoria(c);
          break;
        case 8:
          System.out.println("Pais del atleta: ");
          p = sc.nextLine();
          System.out.println(ParticipantesPorPais(p));
          break;
        case 9:
          System.out.println("Adios");
          break;
        default:
          System.out.println("Opción seleccionada inválida");
          break;
      }
    }
  }

  public void cargarAtleta() {
    String f =
        "C:\\Users\\jgdur\\repos\\velazquez\\programacion_23_24\\java\\src\\main\\java\\U7_collections\\en_clase\\entregable_2324\\maraton.dat";

    try {
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);
      mapaAtleta = (Map<Integer, Atleta>) ois.readObject();
      ois.close();
      fis.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public void guardarAtleta() {
    String f =
        "C:\\Users\\jgdur\\repos\\velazquez\\programacion_23_24\\java\\src\\main\\java\\U7_collections\\en_clase\\entregable_2324\\maraton.dat";
    try {
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(mapaAtleta);
      oos.close();
      fos.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void inscribirAtleta(String nombre, String pais, Categoria cat) {
    Atleta at = new Atleta(nombre, pais, cat);
    mapaAtleta.put(at.getDorsal(), at);
  }

  public void guardarTiempo(int dorsal, double tiempo) {
    if (mapaAtleta.containsKey(dorsal)) {
      mapaAtleta.get(dorsal).setTiempo(tiempo);
      mapaAtleta.get(dorsal).setFinisher(true);
    }
  }

  public void borrarAtleta(int dorsal) {
    mapaAtleta.remove(dorsal);
  }

  public void MostrarListaFinishers() {
    mapaAtleta.values().stream()
        .filter((Atleta::isFinisher))
        .sorted(Comparator.comparing(Atleta::getTiempo))
        .forEach(Atleta -> System.out.println(Atleta.getNombre()));
  }

  public void MostrarListaCategoria(Categoria c) {
    mapaAtleta.values().stream()
        .filter((Atleta -> Atleta.getCat().equals(c)))
        .sorted(Comparator.comparing(Atleta::getTiempo))
        .forEach(Atleta -> System.out.println(Atleta.getNombre()));
  }

  public long ParticipantesPorPais(String p) {
    long numAtletas =
        mapaAtleta.values().stream().filter((Atleta -> Atleta.getPais().equals(p))).count();
    return numAtletas;
  }
}
