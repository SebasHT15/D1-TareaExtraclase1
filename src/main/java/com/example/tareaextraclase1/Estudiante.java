package com.example.tareaextraclase1;

public class Estudiante {
    private Integer Carne;
    private String NombreyApellidos;
    private String Correo;
    private Integer Telefono;
    private String Nickname;
    private String TipoEstudiante;
    private Float NotaPExamenes;
    private Float NotaPQuices;
    private Float NotaPTareas;
    private Integer NotaProyecto1;
    private Integer NotaProyecto2;
    private Integer NotaProyecto3;
    private Float NotaFinal;
    //Estan en private porque solo esta clase puede accesarlos, esto demuestra el encapsulamiento.
    public Estudiante (Integer Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Integer NotaProyecto1, Integer NotaPRoyecto2,
                       Integer NotaProyecto3, Float NotaFInal) {
        this.Carne = Carne;
        this.NombreyApellidos = NombreyApellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Nickname = Nickname;
        this.TipoEstudiante = TipoEstudiante;
        this.NotaPExamenes = NotaPExamenes;
        this.NotaPQuices = NotaPQuices;
        this.NotaPTareas = NotaPTareas;
        this.NotaProyecto1 = NotaProyecto1;
        this.NotaProyecto2 = NotaPRoyecto2;
        this.NotaProyecto3 = NotaProyecto3;
        this.NotaFinal = NotaFInal;
    }
    public Integer getCarne() {
        return Carne;
    }
    public String getNombreyApellidos() {
        return NombreyApellidos;
    }
    public String getCorreo() {
        return Correo;
    }
    public Integer getTelefono() {
        return Telefono;
    }
    public String getNickname() {
        return Nickname;
    }
    public String getTipoEstudiante() {
        return TipoEstudiante;
    }
    public Float getNotaPExamene(){
        return NotaPExamenes;
    }
    public Float getNotaPQuices() {
        return NotaPQuices;
    }
    public Float getNotaPTareas() {
        return NotaPTareas;
    }
    public Integer getNotaProyecto1() {
        return NotaProyecto1;
    }
    public Integer getNotaProyecto2() {
        return NotaProyecto2;
    }
    public Integer getNotaProyecto3() {
        return NotaProyecto3;
    }
    public Float getNotaFinal() {
        return NotaFinal;
    }

}
