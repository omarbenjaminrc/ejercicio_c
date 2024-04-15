package com.omar_ramirez.ejercicio_c.model;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombreDueno")
    private String nombreDueno;
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "calificaciones")
    private List<Integer> calificaciones;
    // @Column(name = "comentarios")
    // private List<Comentario> comentarios;

    // Constructor
    // public Publicacion(Long id, String nombreDueno, String contenido, List<Integer> calificaciones, List<Comentario> comentarios) {
    //     this.id = id;
    //     this.nombreDueno = nombreDueno;
    //     this.contenido = contenido;
    //     this.calificaciones = calificaciones;
    //     // this.comentarios = comentarios;
    // }

     // Getters
     public Long getId() {
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

    // public List<Comentario> getComentarios() {
    //     return comentarios;
    // }
    
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setCalificaciones(List<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    // public void setComentarios(List<Comentario> comentarios) {
    //     this.comentarios = comentarios;
    // }
}



