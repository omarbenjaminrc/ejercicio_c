package com.omar_ramirez.ejercicio_c.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar_ramirez.ejercicio_c.model.Publicacion;
import com.omar_ramirez.ejercicio_c.repository.PublicacionRepository;
@Service
public class PublicacionServiceImpl implements PublicacionService {
    @Autowired
    private PublicacionRepository publicacionRepository;
    @Override
    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> getPublicacionById(Long id) {
        return publicacionRepository.findById(id);
    }

    @Override
    public Publicacion createPublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    @Override
    public Publicacion updatePublicacion(Long id, Publicacion publicacion) {
        if(publicacionRepository.existsById(id)){
            publicacion.setId(id);
            return publicacionRepository.save(publicacion);
        }   else {
                return null;
        }
    }

    @Override
    public void deletePublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }



    
}


