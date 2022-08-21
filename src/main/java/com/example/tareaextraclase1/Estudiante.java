package com.example.tareaextraclase1;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.nio.charset.spi.CharsetProvider;

public class Estudiante {//Se tuvo que cambiar a Simple-string,float,int-property para poder operar los datos y mostrarlos en pantalla. Tambien esta nos puede servir como ejemplo de clase, aunque el programa presenta diferentes clases con funciones distintas.
    //En la parte de abstraccion, la clase padre estudiante crea todos los objetos y metodos que van a ocupar las clases hijas, pero no hace operaciones especificas como las de promedios de eqt y proyectos.
    protected SimpleStringProperty Carne;//Se pusieron protected para que las clases hijas puedan operar y accesarlos.
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
    }//Este objeto va a tener atributos diferentes al resto, ya que proviene de una operacion, en cambio los demas ya son datos especificos.
    private float Notafinal(){//calcula la nota final, tambien sirve como ejemplo de metodo que realiza una operacion en la clase estudiante.
        float notacalculada = (getNotaPExamenes() + getNotaPQuices() + getNotaPTareas() + getNotaProyecto1() + getNotaProyecto2() + getNotaProyecto3()/6);
        return notacalculada;
    }
//Para la parte de polimorfismo las tres clases de estudiante son diferentes, pero tienen metodos y atributos identicos pero que al final de cuentas se comportan diferente cada una.
}
