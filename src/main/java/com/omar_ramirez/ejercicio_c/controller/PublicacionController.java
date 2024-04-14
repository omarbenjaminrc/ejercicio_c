package com.omar_ramirez.ejercicio_c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.omar_ramirez.ejercicio_c.model.Comentario;
import com.omar_ramirez.ejercicio_c.model.Publicacion;
import com.omar_ramirez.ejercicio_c.service.ComentarioService;
import com.omar_ramirez.ejercicio_c.service.PublicacionService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class PublicacionController {

    private List<Publicacion> publicaciones = new ArrayList<>();
        
    @GetMapping("/publicaciones")
    public List<Publicacion> obtenerTodasLasPublicaciones() {
    return publicaciones;
}

    @GetMapping("publicaciones/{id}")
    public Publicacion obtenerPublicacion(@PathVariable Integer id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId().equals(id)) {
                return publicacion;
            }
        }
        return null; 
    }

    @GetMapping("publicaciones/{id}/promedio")
    public double obtenerPromedioCalificaciones(@PathVariable Integer id) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId().equals(id)) {
                int suma = 0;
                List<Integer> calificaciones = publicacion.getCalificaciones();
                for (Integer calificacion : calificaciones) {
                    suma += calificacion;
                }
                return calificaciones.isEmpty() ? -1 : (double) suma / calificaciones.size();
            }
        }
        return -1;
    }
}
