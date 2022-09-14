package com.proyectodos.backend.controller;

import com.proyectodos.backend.modelo.Estadio;
import com.proyectodos.backend.modelo.GrupoPais;
import com.proyectodos.backend.services.GrupoPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GrupoPaisController {

    @Autowired
    private GrupoPaisService grupoPaisService;

    @GetMapping("/grupos")
    public List<GrupoPais> obtenerGrupos(){
        return grupoPaisService.mostrarGrupos();
    }
}
