package Programacion_A.Proyectos.PAC01;

import java.util.Scanner;

public class Ejercicio01 {
    /*
    Ejercicio01.java: Crea un programa que permita realizar distintas operaciones matemáticas sobre dos números enteros con unos valores iniciales de 0 y 10 respectivamente.
    Mediante un SWITCH, el programa debe mostrar el siguiente mensaje al usuario:
    Introduzca la operación a realizar del siguiente menú de opciones:
        1- Establece el valor del primer número
        2- Establece el valor del segundo número
        3- Muestra qué número es superior o si son iguales
        4- Divide el primer número por el segundo
        5-Muestra la progresión numérica desde el primer número hasta el segundo
        0-Finalizar
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 10;
        int entrada;
        boolean parar = false;

        do {

            System.out.println("*****************************************************************");
            System.out.println("*********   Bienvenido, selecciona una opcion       *************");
            System.out.println("*****************************************************************");
            System.out.println("*        0. Finalizar                                           *");
            System.out.println("*****************************************************************");
            System.out.println("*        1. Introduce el primer número                          *");
            System.out.println("*****************************************************************");
            System.out.println("*        2. Introduce el segundo número                         *");
            System.out.println("*****************************************************************");
            System.out.println("*        3. Muestra que número es superior o si son iguales     *");
            System.out.println("*****************************************************************");
            System.out.println("*        4. Divide el primer número por el segundo              *");
            System.out.println("*****************************************************************");
            System.out.println("*        5. Muestra la progresión númerica de dos números       *");
            System.out.println("*****************************************************************");

            entrada = sc.nextInt();
            switch (entrada){
                case 0:
                    parar = true;
                    break;
                case 1:
                    System.out.println("Has introducido la opcion 1, por favor ingrese el primer número");
                    num1 = sc.nextInt();
                    System.out.println("El valor introducido para el primer número es " + num1);
                    break;
                case 2:
                    System.out.println("Has introducido la opcio 2, por favor ingrese el segundo número");
                    num2 = sc.nextInt();
                    System.out.println("El valor introducido para el segundo número es " + num2);
                    break;
                case 3:
                    if(num1 > num2){
                        System.out.println("De los números introducidos el mayor es el primero que es: " + num1);
                    }else if(num1 < num2){
                        System.out.println("De los números introducidos el mayor es el segundo que es: " + num2);
                    }else{
                        System.out.println("Los dos números introducidos son iguales");
                    }
                    break;
                case 4:
                    int division = num1 / num2;
                    System.out.println("El cociente del primer número entre el segundo es " + division);
                    break;
                case 5:
                    if (num1 > num2) {
                        for (int i = num1; i < num2; i++) {
                            System.out.println(i);
                        }
                    } else {
                        for (int i = num1; i < num2; i++) {
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida por favor seleccione un número del menú");
                    sc.nextInt();
                    break;
            }

        }while(!parar);

        System.out.println("Hasta la vista! :D");
        sc.close();

    }
}
