package com.proyectodos.backend.services.impl;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.modelo.FaseGrupos;
import com.proyectodos.backend.repositoy.FaseGruposRepository;
import com.proyectodos.backend.services.FaseGruposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaseGruposServiceImpl implements FaseGruposService {
    @Autowired
    private FaseGruposRepository faseGruposRepository;

    @Override
    public List<FaseGrupos> mostrarFaseGrupos() {
        return faseGruposRepository.findAll();
    }

}
