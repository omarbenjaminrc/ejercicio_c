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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPublicacionById'");
    }

    @Override
    public Publicacion createPublicacion(Publicacion publicacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPublicacion'");
    }

    @Override
    public Publicacion updatePublicacion(Long id, Publicacion publicacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePublicacion'");
    }

    @Override
    public void deletePublicacion(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePublicacion'");
    }



    
}


