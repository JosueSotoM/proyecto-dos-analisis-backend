package com.proyectodos.backend.controller;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.modelo.FaseGrupos;
import com.proyectodos.backend.services.FaseGruposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FaseGruposController {

    @Autowired
    private FaseGruposService faseGruposService;

    @GetMapping("/fase-grupos")
    public List<FaseGrupos> obtenerFaseGrupos(){
        return faseGruposService.mostrarFaseGrupos();
    }



}
