package U7_collections.en_clase.entregable_2021_tarde;

public class main {
  public static void main(String[] args) {

    Instituto instituto = new Instituto("IES Velazquez");
    Unidad unidad1 = new Unidad("1ºDAW");
    Unidad unidad2 = new Unidad("2ºDAW");
    Unidad unidad3 = new Unidad("2ºBACH");

    Alumno alumno1 = new Alumno("Ruben", "737", unidad1, "Perez");
    Alumno alumno2 = new Alumno("Agustin", "743", unidad1, "Benitez");
    Alumno alumno3 = new Alumno("Pelquito", "947", unidad2, "Baby");
    Alumno alumno4 = new Alumno("David", "832", unidad1, "Guijo");
    Alumno alumno5 = new Alumno("Maria", "123", unidad3, "Garcia");
    Alumno alumno6 = new Alumno("Jose Antonio", "834", unidad3, "Dominguez");
    Alumno alumno7 = new Alumno("Jonathan", "292", unidad2, "Herrero");
    Alumno alumno8 = new Alumno("Luis", "901", unidad1, "Martinez");
    Alumno alumno9 = new Alumno("Adrian", "442", unidad2, "Pacheco");
    Alumno alumno10 = new Alumno("Martin", "199", unidad3, "Pachecho");

    //    instituto.addAlumnoUnidad(alumno1, alumno1.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno2, alumno2.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno3, alumno3.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno4, alumno4.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno5, alumno5.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno6, alumno6.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno7, alumno7.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno8, alumno8.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno9, alumno9.getUnidad().getNombreUnidad());
    //    instituto.addAlumnoUnidad(alumno10, alumno10.getUnidad().getNombreUnidad());
    instituto.cargarAlumnos();

    instituto.mostrarAlumnosUnidad(unidad1.getNombreUnidad());
    System.out.println("---------------------");
    instituto.mostrarAlumnosUnidad(unidad2.getNombreUnidad());
    System.out.println("---------------------");
    instituto.mostrarAlumnosUnidad(unidad3.getNombreUnidad());
    System.out.println("---------------------");
    instituto.mostrarAlumnosOrdenados();
    System.out.println("---------------------");
    instituto.obtenerUnidadAlumno(alumno1.getIdentificador());
    String unidad = instituto.obtenerUnidadAlumno(alumno2.getIdentificador());
    System.out.println(unidad);
    System.out.println("---------------------");

    // instituto.guardarAlumnos();
  }
}
