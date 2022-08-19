package com.example.tareaextraclase1;

public class EstudianteA extends Estudiante{
    private Float NotaPromedioEQT;
    public EstudianteA(Integer Carne, String NombreyApellido, String Correo, Integer Telefono, String Nickname, String TipoEstudiante,
                       Float NotaPExamenes, Float NotaPQuices, Float NotaPTareas, Float NotaProyecto1, Float NotaPRoyecto2,
                       Float NotaProyecto3, Float NotaPromedioEQT, Float NotaFInal) {
        //Se le pasan todos los parametros de la clase estudiante que van a estar relacionados, demuestra la herencia.
        super(Carne, NombreyApellido, Correo, Telefono, Nickname, TipoEstudiante,
                NotaPExamenes, NotaPQuices, NotaPTareas, NotaProyecto1, NotaPRoyecto2,
                NotaProyecto3, NotaFInal);
        //Se le indica que ya estan inicializados.
        this.NotaPromedioEQT = Notapromedioeqt();
    }
    public float Notapromedioeqt() {
        NotaPromedioEQT = (getNotaPExamene() + getNotaPQuices() + getNotaPTareas())/3;
            return NotaPromedioEQT;
    }
}
