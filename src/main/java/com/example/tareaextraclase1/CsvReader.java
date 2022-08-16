package com.example.tareaextraclase1;

import java.io.BufferedReader;
import java.io.FileReader;


public class CsvReader {

    private BufferedReader Lector;// Lee el archivo
    private String Linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leide

    public void leerArchivo(String nombreArchivo) {
        try {
            Lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((Linea = Lector.readLine()) != null) {
                partes = Linea.split("; ");
                imprimirLinea();
                System.out.println();
            }
            Lector.close();
            Linea = null;
            partes = null;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i] + "  @  ");
        }
    }

}