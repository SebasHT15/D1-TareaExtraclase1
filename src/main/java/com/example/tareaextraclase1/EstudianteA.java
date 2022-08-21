package com.example.tareaextraclase1;

import javafx.beans.property.SimpleFloatProperty;

public class EstudianteA extends Estudiante{//
    public EstudianteA(String Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3) {
        //Se le pasan todos los parametros de la clase estudiante que van a estar relacionados, demuestra la herencia.
        super(Carne, NombreyApellido, Correo, Telefono, Nickname, TipoEstudiante,
                NotaPExamenes, NotaPQuices, NotaPTareas, NotaProyecto1, NotaPRoyecto2,
                NotaProyecto3);
        //Se le indica que ya estan inicializados.
        this.NotaPromedioEQT = new SimpleFloatProperty(Notapromedioeqt());//En el caso de sobreescritura, la clase estudianteAy estudianteB hacen sobreescritura de notapromedioEQT y notapromedioproyectos, le dan una implementacion especifica.
    }
    public float Notapromedioeqt() {//Calcula la nota promedio de examenes,quices y tareas.
        float notacalculada = (getNotaPExamenes() + getNotaPQuices() + getNotaPTareas())/3;
            return notacalculada;
    }
}
