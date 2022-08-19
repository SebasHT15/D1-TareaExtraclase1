package com.example.tareaextraclase1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.example.tareaextraclase1.Estudiante.*;
import javafx.util.converter.FloatStringConverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CsvReader {
    private BufferedReader Lector;// Lee el archivo
    private String Linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leide
    public void leerArchivo(String nombreArchivo) {
        try {
            Lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((Linea = Lector.readLine()) != null) {
                partes = Linea.split("; ");

            }
            Lector.close();
            Linea = null;
            partes = null;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public List<Estudiante> crearstudent() {
        Estudiante estudiante = new Estudiante(Integer.parseInt(partes[0]), partes[1], partes[2], Integer.parseInt(partes[3]), partes[4], partes[5], Float.parseFloat(partes[6]), Float.parseFloat(partes[7]), Float.parseFloat(partes[8]), Float.parseFloat(partes[9]), Float.parseFloat(partes[10]), Float.parseFloat(partes[11]), Float.parseFloat(partes[12]));
        ObservableList<Estudiante> list = null;
        for (int i = 0; i < partes.length; i++) {
            list = FXCollections.observableArrayList();
            list.add(estudiante);
        }
        return list;
    }
}