package com.proyectodos.backend.repositoy;

import com.proyectodos.backend.modelo.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstadioRepository extends JpaRepository<Estadio, Long> {

    public List<Estadio> findAll();


}
