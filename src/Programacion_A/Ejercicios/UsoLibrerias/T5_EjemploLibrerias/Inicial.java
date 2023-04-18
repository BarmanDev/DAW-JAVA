package Programacion_A.Ejercicios.UsoLibrerias.T5_EjemploLibrerias;

import Programacion_A.Ejercicios.UsoLibrerias.T5_EjemploLibrerias.PedirValores.PideValores;
import Programacion_A.Ejercicios.UsoLibrerias.T5_EjemploLibrerias.MostrarValores.Mostar;

public class Inicial {

    public static void main(String[] args) {
        int numero = PideValores.getEnteroSuperior0();
        Mostar.mostar Mostrar = null;
        Mostrar.muestraValor(numero);
    }

}
