package com.proyectodos.backend.repositoy;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.modelo.GrupoPais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrupoPaisRepository extends JpaRepository<GrupoPais,Long> {

    public List<GrupoPais> findAll();
}
