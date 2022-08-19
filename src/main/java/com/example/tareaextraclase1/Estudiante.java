package com.example.tareaextraclase1;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.nio.charset.spi.CharsetProvider;

public class Estudiante {
    protected SimpleStringProperty Carne;
    protected SimpleStringProperty NombreyApellidos;
    protected SimpleStringProperty Correo;
    protected SimpleIntegerProperty Telefono;
    protected SimpleStringProperty Nickname;
    protected SimpleStringProperty TipoEstudiante;
    protected SimpleFloatProperty NotaPExamenes;
    protected SimpleFloatProperty NotaPQuices;
    protected SimpleFloatProperty NotaPTareas;
    protected SimpleFloatProperty NotaProyecto1;
    protected SimpleFloatProperty NotaProyecto2;
    protected SimpleFloatProperty NotaProyecto3;
    protected SimpleFloatProperty NotaFinal;

    protected SimpleFloatProperty NotaPromedioEQT;

    protected SimpleFloatProperty NotaPProyectos;
    //Estan en private porque solo esta clase puede accesarlos, esto demuestra el encapsulamiento.
    public Estudiante (String Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3){
        this.Carne = new SimpleStringProperty(Carne);

        this.NombreyApellidos = new SimpleStringProperty(NombreyApellido);

        this.Correo = new SimpleStringProperty(Correo);

        this.Telefono = new SimpleIntegerProperty(Telefono);

        this.Nickname = new SimpleStringProperty(Nickname);

        this.TipoEstudiante = new SimpleStringProperty(TipoEstudiante);

        this.NotaPExamenes = new SimpleFloatProperty(NotaPExamenes);

        this.NotaPQuices = new SimpleFloatProperty(NotaPQuices);

        this.NotaPTareas = new SimpleFloatProperty(NotaPTareas);

        this.NotaProyecto1 = new SimpleFloatProperty(NotaProyecto1);

        this.NotaProyecto2 = new SimpleFloatProperty(NotaPRoyecto2);

        this.NotaProyecto3 = new SimpleFloatProperty(NotaProyecto3);

        this.NotaFinal = new SimpleFloatProperty(Notafinal());

        this.NotaPromedioEQT = new SimpleFloatProperty(0);

        this.NotaPProyectos = new SimpleFloatProperty(0);
    }
    public String getCarne() {
        return this.Carne.get();
    }

    public String getNombreyApellidos() {
        return this.NombreyApellidos.get();
    }

    public String getCorreo() {
        return this.Correo.get();
    }

    public Integer getTelefono() {
        return this.Telefono.get();
    }

    public String getNickname() {
        return this.Nickname.get();
    }

    public String getTipoEstudiante() {
        return this.TipoEstudiante.get();
    }

    public Float getNotaPExamenes(){
        return this.NotaPExamenes.get();
    }

    public Float getNotaPQuices() {
        return this.NotaPQuices.get();
    }

    public Float getNotaPTareas() {
        return this.NotaPTareas.get();
    }

    public Float getNotaProyecto1() {
        return this.NotaProyecto1.get();
    }

    public Float getNotaProyecto2() {
        return this.NotaProyecto2.get();
    }

    public Float getNotaProyecto3() {
        return this.NotaProyecto3.get();
    }

    public Float getNotaPromedioEQT() {
        return this.NotaPromedioEQT.get();
    }

    public Float getNotaPProyectos() {
        return this.NotaPProyectos.get();
    }

    public Float getNotaFinal()  {
        return this.NotaFinal.get();
    }
    private float Notafinal(){
        float notacalculada = (getNotaPExamenes() + getNotaPQuices() + getNotaPTareas() + getNotaProyecto1() + getNotaProyecto2() + getNotaProyecto3()/6);
        return notacalculada;
    }

}
