package U7_collections.en_clase.ej1;

import java.util.Comparator;

public class EnterosCrecientes implements Comparator<Integer> {
  @Override
  public int compare(Integer i1, Integer i2) {
    return i1 - i2;
  }
}
