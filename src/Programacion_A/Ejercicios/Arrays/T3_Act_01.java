package Programacion_A.Ejercicios.Arrays;

public class T3_Act_01 {
    /*
    Se ha producido un robo, sabemos que puede haber sido o bien “Maria” o bien
    “Phil”. Sabemos también que ha de haber sido uno de los siguientes habitantes de
    la ciudad: "Cam", "Pepe", "Kim", "Phil", "Perry". Ayuda a descubrir quien ha sido
    creando un programa que contenga un array con todos los habitantes y busque
    mediante un bucle si Maria o Phil viven en la ciudad.
    * */
        public static void main(String[] args) {
            String[] habitantesCiudad = {"Cam", "Pepe", "Kim", "Phil", "Perry"};
            boolean resultado;
            System.out.print("Maria es el ladron? ");
            resultado= buscaSospechoso("Maria",habitantesCiudad);
            System.out.println(resultado);
            System.out.print("Phil es el ladron? ");
            resultado= buscaSospechoso("Phil",habitantesCiudad);
            System.out.println(resultado);
        }
        public static boolean buscaSospechoso(String sospechoso, String[] sospechosos) {
            int longitudArray = sospechosos.length;
            for (int k = 0; k < longitudArray; k++) {
                if (sospechosos[k].compareTo(sospechoso) == 0) {
                    return true;
                }
            }
            return false;
    }
}
