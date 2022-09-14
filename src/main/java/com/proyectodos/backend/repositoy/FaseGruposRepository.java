package com.proyectodos.backend.repositoy;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.modelo.FaseGrupos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaseGruposRepository extends JpaRepository<FaseGrupos, Long> {

    public List<FaseGrupos> findAll();
}
