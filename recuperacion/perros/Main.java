package U7_collections.corregir.perros;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    Concurso concurso = new Concurso("Concurso1", "Huelva");

    Propietario propietario1 = new Propietario("Carlos", "Perez", 1, "Espana");
    Propietario propietario2 = new Propietario("Alfredo", "Mengui", 2, "Espana");
    Propietario propietario3 = new Propietario("Boom", "Hanke", 3, "Espana");

    Perros perros1 = new Perros("Juan", 20, 5, true, propietario1, "Husky");
    Perros perros2 = new Perros("Pepe", 30, 1, true, propietario2, "Pastor Alemán");
    Perros perros3 = new Perros("Jose", 10, 4, true, propietario1, "Husky");

    concurso.addDog("Husky", perros1);
    concurso.addDog("Pastor Alemán", perros2);
    concurso.addDog("Husky", perros3);

    System.out.println("----------------------------------------");
    imprimirMapa(concurso.getMapaPerros());
    System.out.println("------------------------------------------");
    // Borramos un perro
    //    concurso.disqualifyDog(perros3);
    imprimirMapa(concurso.getMapaPerros());
    System.out.println("------------------------------------------");

    concurso.ownerDogs(1);

    System.out.println("------------------------------------------");
    //
    concurso.perrosporPeso("Husky");
    //
    System.out.println("------------------------------------------");
    //
    //    concurso.perrosporEdad("Husky");
    //
    //    System.out.println("------------------------------------------");
    //
    //    concurso.guardarPerros();
    //
    //    System.out.println("------------------------------------------");
    //
    //    concurso.cargarPerros();

  }

  public static void imprimirMapa(HashMap<String, Set<Perros>> mapaPerros) {
    for (Map.Entry<String, Set<Perros>> entradaMapa : mapaPerros.entrySet()) {
      String raza = entradaMapa.getKey();
      Set<Perros> listaPerros = entradaMapa.getValue();
      System.out.println("Para la raza de perros: " + raza);
      for (Perros p : listaPerros) {
        System.out.println(p);
      }
    }
  }
}
