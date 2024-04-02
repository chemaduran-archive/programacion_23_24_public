package U7_collections.teoria;

import java.util.*;

public class _04_maps {
  public static void main(String[] args) {
    //
    Map<String, Double> m = new HashMap<>();

    // Insertar entradas (pares clave/valor) en el map
    m.put("Ana", 1.65);
    m.put("Marta", 1.60);
    m.put("Luis", 1.73);
    m.put("Pedro", 1.69);
    System.out.print("Mapa original: ");
    System.out.println(m); // Los Maps implementan el toString()

    // Si queremos cambiar el valor de una clave, lo "insertamos" de nuevo
    m.put("Pedro", 1.71);

    // Eliminar un registro, par o nodo
    m.remove("Pedro");

    // Eliminar todos los registros
    // m.clear();

    // Obtener el valor de una clave en concreto
    m.get("Pedro");

    // Para saber si una clave está almacenada en un mapa
    boolean tiene_pedro = m.containsKey("Pedro");
    System.out.println("¿Contiene la clave 'Pedro'?: " + tiene_pedro);

    // Para saber si hay alguna entrada con un valor determinada
    m.containsValue(1.71);

    // Dos mapas pueden compararse entres sí (equals), que devuelve true si ambos tienen exactamente
    // las mismas entradas (clave y valor coinciden)
    Map<String, Double> otro_map = new HashMap<>();
    m.equals(otro_map); // true or false

    // Los mapas están muy relacionados con las Collections, aunque no sean una de ellas.

    // Podemos obtener un conjunto de las claves de un mapa
    Set<String> claves = m.keySet(); // Devuelve un Set<TipoClave>

    // Podemos obtener un conjunto de los valores de un mapa. Si alguno aparece más de una vez en el
    // mapa, también se repite (por eso es una colección y no un set).
    m.values(); // Devuelve un Collection<TipoValue>

    // Devuelve una vista conjunto de las entradas, objetos de tipo Map.Entry, de las que se obtiene
    // la clave con getKey o el valor con getValue
    Set<Map.Entry<String, Double>> e1 = m.entrySet();
    System.out.print("Conjunto de entradas: ");
    System.out.println(e1);
    for (Map.Entry<String, Double> entrada : e1) {
      entrada.getKey();
      entrada.getValue();
      // entrada.setValue(1.89);
    }

    Iterator<String> it0 = m.keySet().iterator();
    while (it0.hasNext()) {
      String clave = it0.next();
      if (clave.equals("Pedro")) {
        it0.remove();
        // m.remove(clave); // Esto descuajaringa el iterador
      }
    }

    // Los mapas no son iterables. No podemos usar iteradores con ellos ni recorrerlos.
    // Los cambios que hagamos en las vistas de antes, se reflejan en el mapa.

    // Eliminar una clave concreta
    claves.remove("Marta");
    System.out.print("Quitamos la clave 'Marta': ");
    System.out.println(m);

    // La única forma segura de eliminar entradas durante una iteración sobre cualquiera de las
    // vistas es con método remove de Iterator
    Set<Map.Entry<String, Double>> e2 = m.entrySet();
    System.out.print("Conjunto de partida: ");
    System.out.println(e2);
    Iterator<Map.Entry<String, Double>> it = e2.iterator();
    while (it.hasNext()) {
      Map.Entry<String, Double> entrada = it.next();
      if (entrada.getValue() > 1.71) {
        it.remove();
      }
    }

    System.out.print("Conjunto resultado: ");
    System.out.println(m);

    // Y en vez de iterar sobre las claves, también se podría iterar sobre los valores
    Collection<Double> valores2 = m.values();
    Iterator<Double> it2 = valores2.iterator();
    while (it2.hasNext()) {
      Double v = it2.next();
      if (v > 1.61) {
        it2.remove();
      }
    }

    System.out.print("Conjunto final: ");
    System.out.println(m);

    // En cualquier caso, para añadir entradas, no se puede en la vista de la colección ni en el
    // set, añadir con put. Tiene que ser siempre mediante los métodos de los mapas

  }
}