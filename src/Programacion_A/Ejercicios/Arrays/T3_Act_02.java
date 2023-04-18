package Programacion_A.Ejercicios.Arrays;

public class T3_Act_02 {
    /*
      Seguimos investigando, ahora sabemos los nombres y apellidos de los sospechosos.
      Guarda los habitantes de la ciudad en un array de dos dimensiones en la que cada
      posición contenga el nombre y el apellido del habitante, y crea dos variables que
      contenga cada una un array de 2 posiciones con el nombre y el apellido: Phil Garcia
      y Kim Gimena. Los nombres y apellidos de los habitantes son: Kim Garcia, Phil
      Menendez, Kim Basinger, Phil Garcia, Perry Ornitorrinco.
 */
    public static void main(String[] args) {
        String[][] habitantesCiudad = {{"Kim", "Garcia"}, {"Phil", "Menendez"},
                {"Kim", "Basinger"}, {"Phil", "Garcia"}, {"Perry", "Ornitorrinco"}};
        String[] nombre = {"Phil", "Garcia"};
        boolean resultado;
        System.out.print("Phil Garcia es el ladrón? ");
        resultado = buscaSospechosoApellido(nombre, habitantesCiudad);
        System.out.println(resultado);
        String[] nombre2 = {"Kim", "Gimena"};
        System.out.print("Kim Gimena es el ladrón? ");
        resultado = buscaSospechosoApellido(nombre2, habitantesCiudad);
        System.out.println(resultado);
    }
    public static boolean buscaSospechosoApellido(String[] sospechoso, String[][]
            sospechosos) {
        int longitudArray = sospechosos.length;
        for (int k = 0; k < longitudArray; k++) {
            if (sospechosos[k][0].compareTo(sospechoso[0]) == 0) {
                if (sospechosos[k][1].compareTo(sospechoso[1]) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
