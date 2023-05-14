package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class App {

    public static final String DELIMITADOR = "::";

    public static void main(String[] args) {

        Liga liga = new Liga();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("../resources/ut5-tarea13-partidos.txt"));

            String linea = reader.readLine();

            while (linea != null) {
                String[] datos = linea.split(DELIMITADOR);
                Partido partido = new Partido(
                        new Equipo(datos[0].trim()),
                        new Equipo(datos[1].trim()),
                        Integer.parseInt(datos[2]),
                        Integer.parseInt(datos[3])
                );
                linea = reader.readLine();


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
