package Programacion_A.Ejercicios.EstrucControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2_Act_01 {
    public static void main(String[] args) {
/*
* Crea un programa de nombre EjemploControlDeFlujo que muestre por consola un menú pidiendo que se ejecute una de las siguientes opciones y excepto si se selecciona finalizar
el programa se vuelva a pedir la opción:
    • 1- muestra los números del 20 al 40 con un while
    • 2- muestra los número del 50 al 30 con un bucle for
    • 0- Finaliza el programa
*/
        String numEscrito = "0";
        int opcion = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do {
        System.out.println("Indica la opción a realizar");
        System.out.println("1- muestra los números del 20 al 50 con un while");
        System.out.println("2- muestra los números del 50 al 30 con un bucle for");
        System.out.println("0- Fin del programa");

        try {
            numEscrito = br.readLine();
            opcion = Integer.parseInt(numEscrito);
        } catch (IOException ex) {
            System.out.println("Por favor siga los números indicados en el menú principal");
        }
        switch (opcion) {
            case 1:
                int k = 20;
                while (k <= 50) {
                    System.out.println(k);
                    k++;
                }
                break;
            case 2:
                for (int i = 50; i >= 30; i--) {
                    System.out.println(i);
                }
                break;
        }
    }while(opcion != 0);
    }
}

