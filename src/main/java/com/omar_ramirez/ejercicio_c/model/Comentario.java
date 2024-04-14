package com.omar_ramirez.ejercicio_c.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "comentario")
    private String comentario;

    // Constructor
    public Comentario(String nickname, String comentario) {
        this.nickname = nickname;
        this.comentario = comentario;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComentario() {
        return comentario;
    }
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
}


}
