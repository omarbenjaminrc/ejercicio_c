package com.omar_ramirez.ejercicio_c.controller;

import com.omar_ramirez.ejercicio_c.model.Publicacion;
import com.omar_ramirez.ejercicio_c.service.PublicacionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {

    private static final Logger log = LoggerFactory.getLogger(PublicacionController.class);

    @Autowired
    private PublicacionService publicacionService;

    //get all 
    @GetMapping
    public List<Publicacion> obtenerPublicaciones() {
        log.info("GET /publicaciones");
        return publicacionService.getAllPublicaciones();
    }

    //get id 
    @GetMapping("/{id}")
    public Publicacion obtenerPublicacionPorId(@PathVariable Long id) {
        log.info("GET /publicaciones/{id}");
        return publicacionService.getPublicacionById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Publicacion no encontrada"));
    }

    //Crear 
    @PostMapping("/crear")
    public Publicacion crearPublicacion(@RequestBody Publicacion publicacion) {
        log.info("POST /publicaciones");
        return publicacionService.createPublicacion(publicacion);
    }
 
    //modificar 
    @PutMapping("/{id}")
    public Publicacion modificarPublicacion(@PathVariable Long id, @RequestBody Publicacion publicacion) {
        log.info("PUT /publicaciones/{id}");
        return publicacionService.updatePublicacion(id, publicacion);
    }

    //eliminar 
    @DeleteMapping("/{id}")
    public void eliminarPublicacion(@PathVariable Long id) {
        log.info("DELETE /publicaciones/{id}");
        publicacionService.deletePublicacion(id);
        //retorno de mensaje de eliminacion de servicio json
        log.info("Publicacion eliminada");
    }
}