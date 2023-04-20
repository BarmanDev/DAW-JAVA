package Programacion_A.Ejercicios.POO;

public class T8_EjemploPOO {
    /*
    Queremos estructurar la información de los habitantes de una ciudad extraterrestre
    formada por dos razas distintas: los Cabecines y los Cabezones. De cada individuo
    guardaremos su nombre y su color de piel (los individuos de ambas razas pueden tener
    nombres y colores distintos al resto). A demás queremos guardar para cada raza su
    nombre y el número de espacios que ocupan teniendo en cuenta que los Cabecines
    ocupan 1 espacio y los Cabezones ocupan 2.
    Ambas razas van a tener una función de nombre toString() que retorne una string con los
    atributos del individuo.
    Ambas razas van a tener una función de nombre estresar() que cuando se ejecute
    cambiaré el color de piel de los Cabezones a azul y el color de piel de los Cabecines a rojo.
    Crea ahora una clase principal de nombre “CabezaWordl” que al ejecutarse cree 2
    Cabecines y 2 Cabezones estableciendo su nombre y color con un constructor, estresa a
    uno de cada y muestra sus valores por consola utilizando la función “toString”. Recuerda
    que la raza y el espacio ha de estar ligado a la raza, no a cada individuo.
    */
    public static void main(String[] args) {
        Cabecin cabecin1 = new Cabecin("Cabecin1", "Verde");
        Cabecin cabecin2 = new Cabecin("Cabecin2", "Azul");
        Cabezón cabezón1 = new Cabezón("Cabezón1", "Amarillo");
        Cabezón cabezón2 = new Cabezón("Cabezón2", "Rojo");

        cabecin1.estresar();
        cabezón1.estresar();

        System.out.println(cabecin1.toString());
        System.out.println(cabecin2.toString());
        System.out.println(cabezón1.toString());
        System.out.println(cabezón2.toString());

        System.out.println("Espacios ocupados por los Cabecines: " + Cabecin.espaciosOcupados());
        System.out.println("Espacios ocupados por los Cabezones: " + Cabezón.espaciosOcupados());
    }
}

abstract class Habitante {
    protected String nombre;
    protected String colorPiel;

    public Habitante(String nombre, String colorPiel) {
        this.nombre = nombre;
        this.colorPiel = colorPiel;
    }

    public abstract String toString();
    public abstract void estresar();
}

class Cabecin extends Habitante {
    private static String raza = "Cabecin";
    private static int espaciosOcupados = 0;

    public Cabecin(String nombre, String colorPiel) {
        super(nombre, colorPiel);
        espaciosOcupados++;
    }

    public static int espaciosOcupados() {
        return espaciosOcupados;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Color de piel: " + colorPiel;
    }

    @Override
    public void estresar() {
        this.colorPiel = "Rojo";
    }
}

class Cabezón extends Habitante {
    private static String raza = "Cabezón";
    private static int espaciosOcupados = 0;

    public Cabezón(String nombre, String colorPiel) {
        super(nombre, colorPiel);
        espaciosOcupados += 2;
    }

    public static int espaciosOcupados() {
        return espaciosOcupados;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Color de piel: " + colorPiel;
    }

    @Override
    public void estresar() {
        this.colorPiel = "Azul";
    }
}


