package Programacion_A.POO_Clases;

// Clase Extraterrestre
class Extraterrestre {
    protected String raza;
    protected int espacio;

    public Extraterrestre() {
        this.raza = "extraterrestre";
        this.espacio = 1;
    }

    public int getEspacio() {
        return espacio;
    }

    public String toString() {
        return "Raza: " + raza + ", Espacio: " + espacio;
    }
}

// Clase Cabecin
class Cabecin extends Extraterrestre {
    private String nombre;
    private String color;

    public Cabecin(String nombre, String color) {
        super();
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void estresar() {
        this.color = "rojo";
    }

    public String toString() {
        return "Nombre: " + nombre + ", Color de piel: " + color + ", " + super.toString();
    }
}

// Clase Cabezon
class Cabezon extends Extraterrestre {
    private String nombre;
    private String color;
    private String tercerOjo;

    public Cabezon(String nombre, String color) {
        super();
        this.nombre = nombre;
        this.color = color;
        this.tercerOjo = "rojo";
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setTercerOjo(String color) {
        if (color.equals("marrón") || color.equals("negro") || color.equals("rojo")) {
            this.tercerOjo = color;
        } else {
            this.tercerOjo = "rojo";
        }
    }

    public void estresar() {
        this.color = "azul";
    }

    public String toString() {
        return "Nombre: " + nombre + ", Color de piel: " + color + ", Tercer ojo: " + tercerOjo + ", " + super.toString();
    }
}


