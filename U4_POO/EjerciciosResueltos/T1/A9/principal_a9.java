package U4_poo.ejercicios.T1.A9;

// Implementar las clases con sus atributos y constructores para gestionar una empresa ferroviaria,
// en la que se distingues dos grandes grupos: personal y maquinaria. En el primero se ubican todos
// los empleados de la empresa, que se clasifican en 3 grupos: maquinistas, mecánicos y jefes de
// estación. De cada uno de ellos hay que guardar:
//
// Maquinistas: nombre completo, dni, sueldo mensual, rango
//
// Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)
//
// Jefes estación: nombre completo, dni.
//
// En cuestión de maquinaria podemos encontrar trenes, locomotoras, y vagones. De cada uno hay que
// considerar:
//
// Vagones: tienen una capacidad máxima de carga (en kilos), una capacidad actual (carga en un
// momento dado), y el tipo de mercancía con el que están cargados.
//
// Locomotoras:disponen de una matrícula, potencia de su motor y un año de fabricación. Cada
// locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
//
// Trenes:están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un
// maquinista que es responsable de él.
//
// Todas las clases correspondientes al personal serán de uso público. Entre las clases relativas a
// la maquinaria solo será posible construir, desde clases externas, objetos tipo Tren y de tipo
// Locomotora. La clase Vagon será solo visible por sus clases vecinas.

import U4_poo.ejercicios.T1.A9.maquinaria.Locomotora;
import U4_poo.ejercicios.T1.A9.maquinaria.TipoCarga;
import U4_poo.ejercicios.T1.A9.maquinaria.Tren;
import U4_poo.ejercicios.T1.A9.personal.Especialidad;
import U4_poo.ejercicios.T1.A9.personal.Maquinista;
import U4_poo.ejercicios.T1.A9.personal.Mecanico;

public class principal_a9 {
  public static void main(String[] args) {
    //

    Mecanico m = new Mecanico("Manolito", "666999888", Especialidad.FRENOS);
    Locomotora l = new Locomotora("1234C", 6000, 2007, m);
    Maquinista maq = new Maquinista("Juanola", "111444777", 40000, 1);
    Tren t = new Tren(l, maq);

    t.add_vagon(6000, 5000, TipoCarga.XBOX);
    t.mostrar_informacion();
  }
}
