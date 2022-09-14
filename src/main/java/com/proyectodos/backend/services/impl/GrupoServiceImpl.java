package com.proyectodos.backend.services.impl;

import com.proyectodos.backend.modelo.GrupoPais;
import com.proyectodos.backend.repositoy.GrupoPaisRepository;
import com.proyectodos.backend.services.GrupoPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoPaisService {

    @Autowired
    private GrupoPaisRepository grupoPaisRepository;

    @Override
    public List<GrupoPais> mostrarGrupos() {
        return grupoPaisRepository.findAll();
    }
}
