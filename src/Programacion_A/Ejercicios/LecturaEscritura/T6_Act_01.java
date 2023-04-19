package Programacion_A.Ejercicios.LecturaEscritura;

import java.io.*;

public class T6_Act_01 {
/*Crea un programa que pida tres frases distintas al usuario, las guarde en un archivo de
nombre “ejemplo.txt”. Finalmente ha de leer y mostrar por consola el contenido de
“ejemplo.txt”.
*/
    public static void main(String[] args) throws IOException {

        String textoIntroducido;
        String sep = File.separator;
        String rutaProyecto = System.getProperty("user.dir");
        String saltoLinea = System.getProperty("line.separator");
        String rutaDocumento = rutaProyecto + sep + "ejemplo.txt";
        File document = new File(rutaDocumento); //información sobre el fichero
        FileWriter fw = new FileWriter(document); //Stream conectado al fichero a escribir.
        BufferedWriter bwFile = new BufferedWriter(fw); //Buffer que almacena datos hacia el stream

        //buffer para conectar con la entrada de datos a través de teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe la 1a línea");
        textoIntroducido = br.readLine(); //leemos valor por teclado
        bwFile.write(textoIntroducido + saltoLinea); //guarda los datos en el buffer con unsalto de linea
        System.out.println("Escribe la 2a línea");
        textoIntroducido = br.readLine();
        bwFile.write(textoIntroducido + saltoLinea);

        System.out.println("Escribe la 3a línea");
        textoIntroducido = br.readLine();
        bwFile.write(textoIntroducido + saltoLinea);
        bwFile.flush(); //envía los datos que queden al buffer
        bwFile.close(); //se liberan los recursos asignados al outputStream


        //leemos el archivo
        FileReader fr = new FileReader(document); //Stream conectado al fichero a leer.
        BufferedReader brFile = new BufferedReader(fr); //Buffer que almacena datos del stream
        for (String linea = brFile.readLine(); linea != null; linea = brFile.readLine()) {
            System.out.println(linea); //mostramos por consola el texto leído
        }
        brFile.close(); //cerramos el buffer

    }
}
