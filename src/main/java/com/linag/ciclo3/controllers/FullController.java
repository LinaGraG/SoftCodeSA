package com.linag.ciclo3.controllers;


import com.linag.ciclo3.entities.Empresa;
import com.linag.ciclo3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FullController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping("/enterprises")
    public List<Empresa> verEmpresas(){
        return empresaService.getAllEmpresas();
    }
}