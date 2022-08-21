package com.example.tareaextraclase1;

import javafx.beans.property.SimpleFloatProperty;

public class EstudianteB extends Estudiante{
    public EstudianteB(String Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3){
        //Se le pasan todos los parametros de la clase estudiante que van a estar relacionados, demuestra la herencia.
        super(Carne, NombreyApellido, Correo, Telefono, Nickname, TipoEstudiante,
                NotaPExamenes, NotaPQuices, NotaPTareas, NotaProyecto1, NotaPRoyecto2,
                NotaProyecto3);
        //Se le indica que ya estan inicializados.
        this.NotaPProyectos = new SimpleFloatProperty(Notapproyectos());//Nota pproyectos sirve como ejemplo de instancia ya que se deriva de otros objetos por medio de una operacion.
    }
    public float Notapproyectos() {//Calcula la nota promedio de proyectos.
        float notacalculada = (getNotaProyecto1() + getNotaProyecto2() + getNotaProyecto3()) / 3;
        return notacalculada;
    }
}
