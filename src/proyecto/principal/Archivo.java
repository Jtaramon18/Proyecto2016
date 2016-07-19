package proyecto.principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @authores
 * Jean Chimbo
 * David Salinas
 * Juan Ramón
 */
public class Archivo {

    public static void escribir_fichero(Object[] tareas) throws IOException {

        String ruta = "C:/Users/JuanRamon/Desktop/Archivos/agenda.txt"; //Directorio en el que se guarda el archivo de texto
        File archivo = new File(ruta); //Creación del archivo
        FileWriter fw= new FileWriter(archivo); //Especifica el archivo en el que se va a escribir.
        BufferedWriter bw = new BufferedWriter(fw); //se encarga de escribir en el archivo.
        for (Object tarea : tareas) { //Tipo de dato, identificador: nombre de la lista que contiene los elemnto
            bw.write(String.valueOf(tarea)+"\n"); //Se llena  el archivo linea por linea 
        }

        bw.close(); //Cierra la escritura

    }
//Permite leer el archivo que se trae desde un directorio
    public static List<String> leer_archivo(String archivo) throws FileNotFoundException, IOException {
        String tarea;
        List<String> tareas = new ArrayList<>(); //Se crea una lista para almacenar tareas
        FileReader f = new FileReader(archivo); //Para leer archivos.
        BufferedReader br = new BufferedReader(f); // Lee texto de una entrada de caracteres.
        
        while ((tarea = br.readLine()) != null) {
            tareas.add(tarea); //Se agrega cada linea de texto como un elemento de la lista
        }
        br.close(); //Cierra la lectura del archivo
        return tareas;
    }
}
