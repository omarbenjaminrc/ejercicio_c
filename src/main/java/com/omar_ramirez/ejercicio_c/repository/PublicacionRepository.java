package com.omar_ramirez.ejercicio_c.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.omar_ramirez.ejercicio_c.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    
}
