package Programacion_A.Ejercicios.Funciones;

public class T4_Act_01 {
    /*
    Escribe un programa de nombre Recursividad que imprima valores del 0 al 20 utilizando una función recursiva
    * */
    public static void main(String[] args) {
            imprimeHastaEl20(0);
        }
        public static void imprimeHastaEl20(int num){
            System.out.println(num);
            if(num<20){
                num++;
                imprimeHastaEl20(num);
            }
        }


    }


