package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class App {

    public static final String DELIMITADOR = "::";
    private static Liga liga = new Liga();

    public static void main(String[] args) {
        leerFichero();
        System.out.println(liga.clasificacion());
    }

    private static void leerFichero(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/miguel/Library/Mobile Documents/com~apple~CloudDocs/1 DAW/Programación/PRACTICAS INTELLIJ/UT5/UT5_TAREA13/src/main/resources/ut5-tarea13-partidos.txt"));

            String linea = reader.readLine();

            while (linea != null) {
                String[] datos = linea.split(DELIMITADOR);
                Partido partido = new Partido(
                        new Equipo(datos[0].trim()),
                        new Equipo(datos[1].trim()),
                        Integer.parseInt(datos[2]),
                        Integer.parseInt(datos[3])
                );
                liga.agregarPartido(partido);
                linea = reader.readLine();
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
