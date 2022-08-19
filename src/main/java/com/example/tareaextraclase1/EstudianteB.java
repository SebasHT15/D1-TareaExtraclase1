package com.example.tareaextraclase1;

public class EstudianteB extends Estudiante{
    private Float NotaPProyectos;
    public EstudianteB(Integer Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3, Float NotaPProyectos, Float NotaFInal){
        //Se le pasan todos los parametros de la clase estudiante que van a estar relacionados, demuestra la herencia.
        super(Carne, NombreyApellido, Correo, Telefono, Nickname, TipoEstudiante,
                NotaPExamenes, NotaPQuices, NotaPTareas, NotaProyecto1, NotaPRoyecto2,
                NotaProyecto3, NotaFInal);
        //Se le indica que ya estan inicializados.
        this.NotaPProyectos = Notapproyectos();
    }
    public float Notapproyectos() {
        NotaPProyectos = (getNotaProyecto1() + getNotaProyecto2() + getNotaProyecto3()) / 3;
        return NotaPProyectos;
    }
}
