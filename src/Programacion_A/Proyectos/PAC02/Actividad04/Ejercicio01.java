package Programacion_A.Proyectos.PAC02.Actividad04;

import java.util.Scanner;

public class Ejercicio01 {
/*
define una función pideEntero() que no reciba ningún parámetro y retorne un valor entero.
La función ha de pedir un número por consola
(si el usuario no introduce un número se ha de volver a pedirlo repitiendo el proceso hasta que el usuario introduzca un valor numérico válido)
y retornar el número introducido.
*/
    public static Integer pideEntero(String peticion) {
        Scanner sc = new Scanner(System.in);
        Integer entrada = 1;
        boolean salir = false;

        do {
            try {
                System.out.println(peticion);
                entrada = sc.nextInt();
                salir = true;

            } catch (Exception e) {
                System.out.println("¡No has introducido un entero!");
                sc.next();
            }
        } while (salir == false);
        return entrada;
    }

/*
Añade una función pideDouble() que no reciba ningún parámetro y retorne un valor double.
La función ha de pedir un número por consola (si el usuario no introduce un número se ha de volver a pedirlo repitiendo
 el proceso hasta que el usuario introduzca un valor numérico válido) y retornar el número introducido.
*/
public static Double pideDouble(String peticion) {
    Scanner sc = new Scanner(System.in);
    Double entrada = 0.0;
    boolean salir = false;

    do {
        try {
            System.out.println(peticion);
            entrada = sc.nextDouble();
            salir = true;

        } catch (Exception e) {
            System.out.println("No has introducido un double!");
            sc.next();
        }
    } while (salir == false);
    return entrada;
}


}
