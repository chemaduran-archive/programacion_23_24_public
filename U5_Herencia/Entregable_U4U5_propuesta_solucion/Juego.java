package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Arrays;

public class Juego {
  private int anio_celeb;
  private String sede;
  private Pais[] lista_paises;
  private int indice_pais = 0;
  private Deporte[] lista_deportes;
  private int indice_deportes = 0;

  public Juego(int anio_celeb, String sede) {
    setAnio_celeb(anio_celeb);
    this.sede = sede;
    lista_paises = new Pais[0];
    lista_deportes = new Deporte[0];
  }

  public void setAnio_celeb(int anio_celeb) {
    if (anio_celeb % 4 == 0) {
      this.anio_celeb = anio_celeb;
    } else {
      System.out.println("Ese año no es válido");
    }
  }

  public void AniadirPais(Pais pais) {
    if (indice_pais == lista_paises.length) {
      lista_paises = Arrays.copyOf(lista_paises, lista_paises.length + 1);
    }
    lista_paises[indice_pais] = pais;
    indice_pais++;
  }

  public void EliminarPais(Pais pais) {
    Pais[] copia = new Pais[lista_paises.length - 1];
    int copia_indice = 0;
    for (int i = 0; i < lista_paises.length; i++) {
      if (!lista_paises[i].equals(pais)) {
        copia[copia_indice] = lista_paises[i];
        copia_indice++;
      }
    }
    lista_paises = copia;
  }

  public void AniadirDeporte(Deporte deporte) {
    if (indice_deportes == lista_deportes.length) {
      lista_deportes = Arrays.copyOf(lista_deportes, lista_deportes.length + 1);
    }

    lista_deportes[indice_deportes] = deporte;
    indice_deportes++;
  }

  public void EliminarDeporte(Deporte deporte) {
    Deporte[] copia = new Deporte[lista_deportes.length - 1];
    int copia_indice = 0;
    for (int i = 0; i < lista_deportes.length; i++) {
      if (!lista_deportes[i].equals(deporte)) {
        copia[copia_indice] = lista_deportes[i];
        copia_indice++;
      }
    }
    lista_deportes = copia;
  }

  public void mostrarPaises() {
    for (Pais i : lista_paises) {
      System.out.println(i);
    }
  }

  public void mostrarPaisesOrdenados() {
    Arrays.sort(lista_paises, new OrdenPaisesParticipantes());
    mostrarPaises();
  }

  public void mostrarPaisesParaCeremonia() {
    Arrays.sort(lista_paises);
    mostrarPaises();
  }
}
