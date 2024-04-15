package com.omar_ramirez.ejercicio_c.service;

import java.util.List;
import java.util.Optional;

import com.omar_ramirez.ejercicio_c.model.Comentario;

public interface ComentarioService  {
    List<Comentario> getAllComentarios();
    Optional<Comentario> ComentarioById(Long id);
    Comentario createComentario(Comentario Comentario);
    Comentario updateComentario(Long id,Comentario Comentario);
    void deleteComentario(Long id);
}
