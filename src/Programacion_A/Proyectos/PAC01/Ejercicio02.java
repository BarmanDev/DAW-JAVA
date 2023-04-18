package Programacion_A.Proyectos.PAC01;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
/*2. Ejercicio02.java: escribe un programa que pida al usuario 5 valores decimales del 0 al 100.
     Se deben almacenar en un array y mostrarlos por consola.
     Si el usuario introduce un valor incorrecto, se ha de volver a pedir.
     Mediante un SWITCH, el programa debe mostrar el siguiente mensaje al usuario:
     Introduzca la operación a realizar del siguiente menú de opciones:
        1-	Modificar el valor almacenado en una posición.
        2-	Mostrar el resultado de sumar todos los números
        3-	Mostrar el número más alto y más bajo.
        4-	Ordena el array situando primero todos los números pares y luego los impares
        0-Finalizar
     Cada vez que se realice la operación 1, 2, 3 y 4 se ha de mostrar por pantalla los valores almacenados en el array.
     Controla mediante un DO WHILE que una vez realizada la operación seleccionada se vuelva a mostrar el menú de operaciones
     excepto si el usuario ha introducido un 0. Si se introduce un valor menor a 0,
     indica que se ha introducido un valor incorrecto y vuelve a mostrar el menú.
     Si el usuario selecciona la opción 1 el programa debe pedir al usuario una posición de array válida
     y un valor numérico entre 0 y 100 para situarlo en la posición indicada.
     Si el usuario selecciona la opción 2 el programa debe sumar todos los números almacenados en el array y mostrar el resultado.
     Si el usuario selecciona la opción 3 el programa debe mostrar el número más alto y el más bajo almacenados en el array.
     Si el usuario selecciona la opción 4 el programa debe ordenar el array teniendo en cuenta solo si son pares o impares
     (primero los pares y luego los impares) , no importa que un valor sea mayor o menor.
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean salir = false;
        int miArray[] = {9, 8, 7, 6, 5};


        do {
            System.out.println("*****************************************************************");
            System.out.println("*********   Bienvenido, selecciona una opcion       *************");
            System.out.println("*****************************************************************");
            System.out.println("*        0. Finalizar                                           *");
            System.out.println("*****************************************************************");
            System.out.println("*        1. Modifica el valor del array                         *");
            System.out.println("*****************************************************************");
            System.out.println("*        2. Resultado de sumar todos los número                 *");
            System.out.println("*****************************************************************");
            System.out.println("*        3. ¿Cual es el menor y el mayor del array?             *");
            System.out.println("*****************************************************************");
            System.out.println("*        4. Ordenar el array pares impares                      *");
            System.out.println("*****************************************************************");

            entrada = sc.next();

            switch (entrada) {
                case "0":
                    salir = true;
                    break;
                case "1":
                    try {

                        int numAux = 0;
                        boolean repetir = true;

                        do{
                            System.out.println("Introduce la posición del array por favor");
                            numAux = sc.nextInt();

                            if (numAux >=0 && numAux <= 100){
                                System.out.println("Introduce el valor que quiera para la posición:");
                                miArray[numAux] = sc.nextInt();
                                repetir=false;
                            }else{
                                System.out.println("El valor debe de ser entre 0 y 100, repita de nuevo por favor");
                                repetir= true;
                            }
                        }while(repetir == false);
                    }catch (Exception e){
                        System.out.println("El valor introducido no es correcto, por favor repita,");
                        sc.next();
                    }

                    System.out.println("Los valores del array son: ");
                    for (int i = 0; i <miArray.length ; i++) {
                        System.out.println(miArray[i]);
                    }
                    break;

                case "2":
                    int sumar = 0;
                    for (int i = 0; i <miArray.length ; i++) {
                        sumar += miArray[1];
                    }
                    System.out.println("La suma de los arrays es: " +sumar);
                    break;

                case "3":
                    Arrays.sort(miArray);
                    System.out.println("El mayor numero del array es: " +
                            miArray[4] +
                            "\ny el menor numero del array es: " +
                            miArray[0]);
                    break;

                case "4":
                    int pares[] = new int[5];
                    int impares[] = new int[5];
                    int a = 0, b = 0;

                    for (int i = 0; i < miArray.length; i++) {
                        if ((miArray[i] % 2) == 0) {
                            pares[a] = miArray[i];
                            a++;
                        } else {
                            impares[b] = miArray[i];
                            b++;
                        }
                    }

                    System.out.print("El array de pares es: \n");
                    for (int j = 0; j < pares.length; j++) {
                        if (pares[j] != 0) {
                            System.out.println(pares[j]);
                        }
                    }

                    System.out.print("El array de impares es: \n");
                    for (int k = 0; k < impares.length; k++) {
                        if (impares[k] != 0) {
                            System.out.println(impares[k]);
                        }
                    }

                default:
                    System.out.println("Opción incorrecta, intentelo de nuevo por favor");
                    break;
            }


            }while (!salir) ;
    }

}

