package com.example.tareaextraclase1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.example.tareaextraclase1.Estudiante.*;
import javafx.util.converter.FloatStringConverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class CsvReader {//Esta clase lee y opera el csv. Ademas todos los objetos que se encuentran en private representan el encapsulamiento ya que solo pueden ser editados por esta clase.
    private BufferedReader Lector;// Lee el archivo
    private String Linea;// recibe la linea de cada fila
    private String partes[] = null;// almacena cada linea leide
    private List<Estudiante> listaestudiantes = new LinkedList<>();
    public void leerArchivo(String nombreArchivo) {//Lee y opera el csv, "partes" es como las posiciones de los objetos en el csv, funciona parecido a una lista.
        try {
            Lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((Linea = Lector.readLine()) != null) {
                partes = Linea.split(";");
                System.out.println(partes);
                crearEstudiante(partes);

            }
            Lector.close();
            Linea = null;
            partes = null;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    private void crearEstudiante(String[] datos){//Esta funcion hace la comparacion del estudiante a y b, si en el csv en datos[5] sale a, toma el estudiante a y asi con el b.
        if (datos[5] == "A"){
            listaestudiantes.add(new EstudianteB(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5],
                    Float.parseFloat(datos[6]), Float.parseFloat(datos[7]), Float.parseFloat(datos[8]), Float.parseFloat(datos[9]), Float.parseFloat(datos[10]),
                    Float.parseFloat(datos[11])));
        }
        else {
            listaestudiantes.add(new EstudianteA(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5],
                    Float.parseFloat(datos[6]), Float.parseFloat(datos[7]), Float.parseFloat(datos[8]), Float.parseFloat(datos[9]), Float.parseFloat(datos[10]),
                    Float.parseFloat(datos[11])));
        }
    }
    public ObservableList<Estudiante> getlistaestudiantes(){
        return FXCollections.observableList(listaestudiantes);
    }//retorna la lista observable y editable.
}

