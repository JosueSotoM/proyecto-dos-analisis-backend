package com.proyectodos.backend.controller;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.services.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @GetMapping("/estadios")
    public List<Estadio> obtenerEstadios(){
        return estadioService.mostrarEstadio();
    }
}
