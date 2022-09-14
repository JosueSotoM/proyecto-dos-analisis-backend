package com.proyectodos.backend.services.impl;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.repositoy.EstadioRepository;
import com.proyectodos.backend.services.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadioServiceImpl implements EstadioService {
    @Autowired
    private EstadioRepository estadioRepository;

    @Override
    public List<Estadio> mostrarEstadio() {
        return estadioRepository.findAll();
    }
}
