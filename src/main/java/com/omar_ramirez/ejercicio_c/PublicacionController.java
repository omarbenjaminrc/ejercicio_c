package com.omar_ramirez.ejercicio_c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PublicacionController {

    private List<Publicacion> publicaciones = new ArrayList<>();

    public PublicacionController() {
        // Inicializa datos de ejemplo 
        publicaciones.add(new Publicacion(1,"Juan Pérez", "Esta es una publicación de ejemplo", Arrays.asList(5, 4, 3), Arrays.asList(
            new Comentario("Ana", "¡Me encantó tu publicación!"),
            new Comentario("Luis", "Interesante, pero tengo algunas dudas.")
        )));

        publicaciones.add(new Publicacion(2, "María López", "Otra publicación de ejemplo", Arrays.asList(5, 5, 5), Arrays.asList(
            new Comentario("Carlos", "Totalmente de acuerdo"),
            new Comentario("Elena", "Buen punto, no lo había visto así.")
        )));

        publicaciones.add(new Publicacion(3, "Carlos Martín", "Publicación sobre Spring Boot", Arrays.asList(4, 4, 5), Arrays.asList(
            new Comentario("Marta", "¿Puedes compartir más recursos?"),
            new Comentario("Jorge", "Esto me ayudó a entender mejor Spring Boot, gracias.")
        )));
    }

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
