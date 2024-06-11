package U7_collections.corregir.feria;

import java.util.*;

public class FeriaDeSevilla {
  private Map<String, Caseta> mapaNombreCaseta = new TreeMap<>();
  private Map<String, Artista> mapaNombreArtista = new TreeMap<>();
  private Map<Caseta, List<Artista>> mapaCasetaArtista = new TreeMap<>();
  private Map<Artista, List<Caseta>> mapaArtistaCaseta = new TreeMap<>();

  public void addActuacion(Caseta c, Artista a) {

    // Añadimos la caseta
    if (!mapaNombreCaseta.containsKey(c.getNombre())) {
      mapaNombreCaseta.put(c.getNombre(), c);
    }

    // Añadimos el artista
    if (!mapaNombreArtista.containsKey(a.getNombre())) {
      mapaNombreArtista.put(a.getNombre(), a);
    }

    // Relacionamos caseta con artistas
    if (!mapaCasetaArtista.containsKey(c)) {
      List<Artista> casetaNueva = new ArrayList<>();
      casetaNueva.add(a);
      mapaCasetaArtista.put(c, casetaNueva);
    } else {
      List<Artista> listaArtista = mapaCasetaArtista.get(c);
      listaArtista.add(a);
      mapaCasetaArtista.put(c, listaArtista);
    }

    // Relacionamos artista con casetas
    if (!mapaArtistaCaseta.containsKey(a)) {
      List<Caseta> artistaNuevo = new ArrayList<>();
      artistaNuevo.add(c);
      mapaArtistaCaseta.put(a, artistaNuevo);
    } else {
      List<Caseta> listaCaseta = mapaArtistaCaseta.get(a);
      listaCaseta.add(c);
      mapaArtistaCaseta.put(a, listaCaseta);
    }
  }

  public List<Artista> getArtistas(Caseta c) {
    List<Artista> listaArtista = new ArrayList<>();

    listaArtista = mapaCasetaArtista.get(c);

    listaArtista.sort(
        new Comparator<Artista>() {
          @Override
          public int compare(Artista o1, Artista o2) {
            return o1.getNombre().compareTo(o2.getNombre());
          }
        });

    return listaArtista;
  }

  public List<Caseta> getCasetas(Artista a) {
    List<Caseta> listaCaseta = new ArrayList<>();

    listaCaseta = mapaArtistaCaseta.get(a);

    listaCaseta.sort(
        new Comparator<Caseta>() {
          @Override
          public int compare(Caseta o1, Caseta o2) {
            return o1.getNombre().compareTo(o2.getNombre());
          }
        });

    return listaCaseta;
  }

  public Caseta getCaseta(String nombre) {
    Caseta resultado = null;
    if (mapaNombreCaseta.containsKey(nombre)) {
      resultado = mapaNombreCaseta.get(nombre);
    }
    return resultado;
  }

  public void removeCaseta(String nombre) {
    // Lo borramos de la estructura de casetas
    mapaNombreCaseta.remove(nombre);

    // Lo borramos de la estructura de casetas y artistas
    for (Caseta caseta : mapaCasetaArtista.keySet()) {
      if (caseta.getNombre().equalsIgnoreCase(nombre)) {
        mapaCasetaArtista.remove(caseta);
        break;
      }
    }

    // Lo borramos de la estructura de artistas y casetas
    for (List<Caseta> casetas : mapaArtistaCaseta.values()) {
      for (Caseta caseta : casetas) {
        if (caseta.getNombre().equalsIgnoreCase(nombre)) {
          casetas.remove(caseta);
          break;
        }
      }
    }
  }

  public Artista getArtista(String nombreArtistico) {
    Artista resultado = null;
    if (mapaNombreArtista.containsKey(nombreArtistico)) {
      resultado = mapaNombreArtista.get(nombreArtistico);
    }
    return resultado;
  }
}
