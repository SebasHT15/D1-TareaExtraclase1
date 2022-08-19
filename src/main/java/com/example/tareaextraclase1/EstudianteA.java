package com.example.tareaextraclase1;

import javafx.beans.property.SimpleFloatProperty;

public class EstudianteA extends Estudiante{
    public EstudianteA(String Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3) {
        //Se le pasan todos los parametros de la clase estudiante que van a estar relacionados, demuestra la herencia.
        super(Carne, NombreyApellido, Correo, Telefono, Nickname, TipoEstudiante,
                NotaPExamenes, NotaPQuices, NotaPTareas, NotaProyecto1, NotaPRoyecto2,
                NotaProyecto3);
        //Se le indica que ya estan inicializados.
        this.NotaPromedioEQT = new SimpleFloatProperty(Notapromedioeqt());
    }
    public float Notapromedioeqt() {
        float notacalculada = (getNotaPExamene() + getNotaPQuices() + getNotaPTareas())/3;
            return notacalculada;
    }
}
