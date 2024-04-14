package com.omar_ramirez.ejercicio_c.service;

import java.util.List;
import java.util.Optional;

import com.omar_ramirez.ejercicio_c.model.Comentario;

public interface ComentarioService  {
    List<Comentario> getAllComentarios();
    Optional<Comentario> ComentarioById(Long id);
    Comentario Comentario(Comentario Comentario);
    Comentario Comentario(Long id,Comentario Comentario);
    void Comentario(Long id);
}
