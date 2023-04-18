package Programacion_A.Proyectos.PAC01;
import java.util.Scanner;
public class Ejercicio03 {
    /*
3.Ejercicio03.java:escribe un programa que almacene en un array bidimensional cuatro puntuaciones
        de tres películas con los valores mostrados en el esquema mostrado después del enunciado.
        Seguidamente se mostrará por consola todos los valores almacenados en el array
        y los siguientes resultados(calculados según los valores del array):
        •    Todas las notas de la primera película.
        •    La media de la segunda película.
        •    El valor más alto de la tercera película.
        “E.T.”
        “8”
        “5”
        “10”
        “4”
        “Sharknado”
        “3”
        “8”
        “9”
        “7”
        “Godzilla”
        “9”
        “7”
        “6”
        “8”
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String[][] puntosPelicula = new String[3][5];

        puntosPelicula[0][0] = "ET";
        puntosPelicula[0][1] = "8";
        puntosPelicula[0][2] = "5";
        puntosPelicula[0][3] = "10";
        puntosPelicula[0][4] = "4";

        puntosPelicula[1][0] = "Sharknado";
        puntosPelicula[1][1] = "3";
        puntosPelicula[1][2] = "8";
        puntosPelicula[1][3] = "9";
        puntosPelicula[1][4] = "7";

        puntosPelicula[2][0] = "Godzilla";
        puntosPelicula[2][1] = "9";
        puntosPelicula[2][2] = "7";
        puntosPelicula[2][3] = "6";
        puntosPelicula[2][4] = "8";

        /*IMPRESION POR PANTALLA DE TODAS LAS PUNTUACIONES*/

        System.out.println("IMPRESION POR PANTALLA DE TODAS LAS PUNTUACIONES");
        for (int i = 0; i < puntosPelicula.length; i++) {
            for (int j = 0; j < puntosPelicula[i].length; j++) {
                if (j == 0) {
                    System.out.println("Pelicula: " + puntosPelicula[i][j]);
                } else {
                    System.out.println("Puntuacion " + j + ": " + puntosPelicula[i][j]);
                }
            }
        }
        System.out.println();

        //TODAS LAS NOTAS DE LA PRIMERA PELICULA

        System.out.println("TODAS LAS NOTAS DE LA PRIMERA PELICULA");
        for (int j = 0; j < puntosPelicula[0].length; j++) {
            if (j == 0) {
                System.out.println("Pelicula: " + puntosPelicula[0][j]);
            } else {
                System.out.println("Puntuacion " + j + ": " + puntosPelicula[0][j]);
            }
        }
        System.out.println();

        //MEDIA SEGUNDA PELICULA

        System.out.println("MEDIA SEGUNDA PELICULA");
        double total;
        double media;
        int pos = 1;
        total = 0;
        media = 0;
        for (int j = 0; j < puntosPelicula[pos].length; j++) {
            if (j == 0) {
                System.out.println("La puntuacion media de la segunda pelicula " +
                        puntosPelicula[pos][j] +
                        " es: ");
            } else {
                total += Double.parseDouble(puntosPelicula[pos][j]);
            }
        }
        media = total / 4;
        System.out.println(String.format("%.2f", media));
        System.out.println();


        /*VALOR MAS ALTO DE LA TERCERA PELICULA*/

        System.out.println("VALOR MAS ALTO DE LA TERCERA PELICULA");

        int pos2 = 2;
        double notaMax = -1;

        for (int i=1; i<puntosPelicula[pos2].length; i++){
            if (Double.parseDouble(puntosPelicula[pos2][i]) > notaMax){
                notaMax = Double.parseDouble(puntosPelicula[pos2][i]);
            }
        }
        System.out.println("La puntuacion maxima de la tercera pelicula " +
                puntosPelicula[2][0] +
                " es: " +
                notaMax);
    sc.close();
    }
}






