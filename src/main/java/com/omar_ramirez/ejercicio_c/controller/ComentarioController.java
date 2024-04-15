package com.omar_ramirez.ejercicio_c.controller;


import com.omar_ramirez.ejercicio_c.model.Comentario;
import com.omar_ramirez.ejercicio_c.service.ComentarioService;

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
@RequestMapping("/comentarios")
public class ComentarioController {

    private static final Logger log = LoggerFactory.getLogger(ComentarioController.class);

    @Autowired
    private ComentarioService comentarioService;

    //get all 
    @GetMapping
    public List<Comentario> obtenerComentarios() {
        log.info("GET /comentarios");
        log.info("getAllComentario");
        return comentarioService.getAllComentarios();
    }

    //get id 
    @GetMapping("/{id}")
    public Comentario obtenerComentariosPorId(@PathVariable Long id) {
        log.info("GET /comentario/{id}");
        log.info("obtenerComentarioPorId");
        return comentarioService.ComentarioById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Comentario no encontrada"));
    }

    //Crear 
    @PostMapping("/crear")
    public Comentario crearComentario(@RequestBody Comentario comentario) {
        log.info("POST /comentarios");
        log.info("crearComentarios");
        return comentarioService.createComentario(comentario);
    }
 
    //modificar 
    @PutMapping("/{id}")
    public Comentario modificarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        log.info("PUT /comentairo/{id}");
        log.info("modificarComentario");
        return comentarioService.updateComentario(id, comentario);
    }

    //eliminar 
    @DeleteMapping("/{id}")
    public void eliminarComentario(@PathVariable Long id) {
        log.info("DELETE /comentario/{id}");
        log.info("eliminarComentario");
        comentarioService.deleteComentario(id);
        //retorno de mensaje de eliminacion de servicio json
        log.info("Comentario eliminado");

    }
}