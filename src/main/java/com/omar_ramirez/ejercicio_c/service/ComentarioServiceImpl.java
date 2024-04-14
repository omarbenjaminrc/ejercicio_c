package com.omar_ramirez.ejercicio_c.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar_ramirez.ejercicio_c.repository.ComentarioRepository;

@Service
public class ComentarioServiceImpl implements ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;
    @Override
    public List<com.omar_ramirez.ejercicio_c.model.Comentario> getAllComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Optional<com.omar_ramirez.ejercicio_c.model.Comentario> ComentarioById(Long id) {
        return comentarioRepository.findById(id);
        
    }

    @Override
    public com.omar_ramirez.ejercicio_c.model.Comentario Comentario(
            com.omar_ramirez.ejercicio_c.model.Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public com.omar_ramirez.ejercicio_c.model.Comentario Comentario(Long id,
            com.omar_ramirez.ejercicio_c.model.Comentario comentario) {
        if(comentarioRepository.existsById(id)){
            comentario.setId(id);
            return comentarioRepository.save(comentario);
        }   else {
                return null;
        }
    }

    @Override
    public void Comentario(Long id) {
        comentarioRepository.deleteById(id);
    }
    
}
