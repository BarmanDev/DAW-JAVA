package Programacion_A.Ejercicios.UsoLibrerias.T5_EjemploLibrerias.PedirValores;

import java.util.Scanner;

public class PideValores {
    public static int getEnteroSuperior0() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero <= 0) {
            System.out.print("Introduce un número entero superior a 0: ");
            numero = sc.nextInt();
        }
        sc.close();
        return numero;
    }
}




