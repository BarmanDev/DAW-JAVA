package Programacion_A.EjerciciosLibro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1_Act_01 {
    public static void main(String[] args) throws IOException {
        /*
            • Crea un programa de nombre Ejemplo3Numeros que pida 3 valores decimales y que:
            • Muestre el resultado de multiplicar los 3
            • Muestre el resultado de sumar los 3
            • Muestre por consola si el 1er número es mayor que el 2o
            • Muestre por consola si los 3 números son iguales
            • Muestre por consola si el 1er número es múltiple de 2
        */

        float num1, num2, num3;
        String valor;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce el primer número por favor");
        valor = br.readLine();
        num1 = Float.parseFloat(valor);

        System.out.println("Introduce el segundo número por favor");
        valor = br.readLine();
        num2 = Float.parseFloat(valor);

        System.out.println("Introduce el tercer número por favor");
        valor = br.readLine();
        num3 = Float.parseFloat(valor);

        float resulMulti = num1 * num2 * num3;
        System.out.println("El resultado de multiplicar " + num1+ " " + num2+ " " + num3 + " es: " + resulMulti);

        float resulSuma = num1 + num2 + num3;
        System.out.println("El resultado de sumar " + num1+ " " + num2+ " " + num3 + " es: " + resulSuma);

        boolean comparaMayor = (num1>num2);
        System.out.println("El primer número " + " es mayor que el segundo número" + num2 + "? " +comparaMayor);

        boolean compararIguales = (num1==num2)&& (num2==num3);
        System.out.println("El primer número " + num1 + " es igual que el segundo número " + num2 +
                " y es igual que el tercer número : "+num3+" ? "+compararIguales );
        boolean multiple = (num1%2==0);
        System.out.println("El primer nçumero:"+num1 +" es multiple de 2? "+ multiple);
    }



}
