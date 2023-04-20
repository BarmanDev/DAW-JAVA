package Programacion_A.Ejercicios.POO_Clases;

public class CabezaWorld {
        public static void main(String[] args) {
            Cabecin cabecin1 = new Cabecin("Cabecin 1", "verde");
            Cabecin cabecin2 = new Cabecin("Cabecin 2", "amarillo");
            Cabezon cabezon1 = new Cabezon("Cabezon 1", "naranja");
            Cabezon cabezon2 = new Cabezon("Cabezon 2", "rojo");
            cabezon1.setTercerOjo("azul"); // Seteo de tercer ojo incorrecto

            cabecin1.estresar();
            cabezon2.estresar();

            System.out.println(cabecin1.toString());
            System.out.println(cabecin2.toString());
            System.out.println(cabezon1.toString());
            System.out.println(cabezon2.toString());
        }
    }
