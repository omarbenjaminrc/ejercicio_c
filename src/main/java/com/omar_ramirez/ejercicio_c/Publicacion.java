package com.omar_ramirez.ejercicio_c;
import java.util.List;

public class Publicacion {
    private Integer id;
    private String nombreDueno;
    private String contenido;
    private List<Integer> calificaciones;
    private List<Comentario> comentarios;

    // Constructor
    public Publicacion(Integer id, String nombreDueno, String contenido, List<Integer> calificaciones, List<Comentario> comentarios) {
        this.id = id;
        this.nombreDueno = nombreDueno;
        this.contenido = contenido;
        this.calificaciones = calificaciones;
        this.comentarios = comentarios;
    }

     // Getters
     public Integer getId() {
        return id;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public String getContenido() {
        return contenido;
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}



