package com.omar_ramirez.ejercicio_c;

public class Comentario {
    private String nickname;
    private String comentario;

    // Constructor
    public Comentario(String nickname, String comentario) {
        this.nickname = nickname;
        this.comentario = comentario;
    }

    // Getters
    public String getNickname() {
        return nickname;
    }

    public String getComentario() {
        return comentario;
    }

}
