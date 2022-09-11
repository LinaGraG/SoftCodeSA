package com.linag.ciclo3.controllers;


import com.linag.ciclo3.entities.Empleado;
import com.linag.ciclo3.entities.Empresa;
import com.linag.ciclo3.entities.MovimientoDinero;
import com.linag.ciclo3.services.EmpleadoService;
import com.linag.ciclo3.services.EmpresaService;
import com.linag.ciclo3.services.MovDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    EmpresaService empresaService;

    @Autowired
    EmpleadoService empleadoService;

    @Autowired
    MovDineroService movDineroService;


    //GET ENTERPRISES
    @GetMapping("/enterprises")
    public List<Empresa> verEmpresas() {
        return empresaService.getAllEmpresas();
    }

    //POST ENTERPRISES
    @PostMapping("/enterprises")
    public Empresa guardarEmpresa(@RequestBody Empresa emp) {
        return this.empresaService.saveOrUpdateEmpresa(emp);

    }

    //GET POR ID responses 200 en la ruta enterprises/[id]
    @GetMapping(path = "enterprises/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id) {
        return this.empresaService.getEmpresaById(id);
    }

    //PATCH POR ID responses 200 en la ruta enterprises/[id]
    @PatchMapping("/enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa) {
        Empresa emp = empresaService.getEmpresaById(id);
        emp.setNombre(empresa.getNombre());
        emp.setDireccion(empresa.getDireccion());
        emp.setTelefono(empresa.getTelefono());
        emp.setNIT(empresa.getNIT());
        return empresaService.saveOrUpdateEmpresa(emp);

    }

    //DELETE ENTERPRISE POR ID
    @DeleteMapping(path = "enterprises/{id}")
    public String DeleteEmpresa(@PathVariable("id") Integer id) {
        boolean respuesta = this.empresaService.deleteEmpresa(id);
        if (respuesta) {  //Si respuesta es true?
            return "Company successfully removed by id" + id;
        } else {
            return "Could not delete company by id" + id;
        }
    }
    /* USERS*/


    @GetMapping("/users") //Ver json de todas los empleados
    public List<Empleado> verEmpleados() {
        return empleadoService.getAllEmpleado();
    }

    @PostMapping("/users") //Guardar un empleado nuevo
    public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empl) {
        return Optional.ofNullable(this.empleadoService.saveOrUpdateEmpleado(empl));
    }

    @GetMapping(path = "users/{id}")//Consultar empleado por ID
    public Optional<Empleado> empleadoPorID(@PathVariable("id") Integer id) {
        return this.empleadoService.getEmpleadoById(id);
    }

    @GetMapping("/enterprises/{id}/users")// Consultar empleados por empresa
    public ArrayList<Empleado> EmpleadoPorEmpresa(@PathVariable("id") Integer id) {
        return this.empleadoService.obtenerPorEmpresa(id);
    }

    @PatchMapping("/users/{id}")
    public Empleado actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado) {
        Empleado empl = empleadoService.getEmpleadoById(id).get();
        empl.setNombre(empleado.getNombre());
        empl.setCorreo(empleado.getCorreo());
        empl.setEmpresa(empleado.getEmpresa());
        empl.setRol(empleado.getRol());
        return empleadoService.saveOrUpdateEmpleado(empl);
    }

    @DeleteMapping("/users/{id}") //Metodo para eliminar empleados por id
    public String DeleteEmpleado(@PathVariable("id") Integer id) {
        boolean respuesta = empleadoService.deleteEmpleado(id); //eliminamos usando el servicio de nuestro service
        if (respuesta) { //si la respuesta booleana es true, si se eliminò
            return "The employee with ID could be deleted successfully " + id;
        }//Si la respuesta booleana es false, no se eliminó
        return "Failed to successfully remove employee with Id " + id;
    }
    //MOVEMENTS

    @GetMapping("/movements")
    public List<MovimientoDinero> verMovDinero() {
        return movDineroService.getAllMovDinero();
    }

    @PostMapping("/movements")
    public MovimientoDinero guardarMovDinero(@RequestBody MovimientoDinero movimiento) {
        return movDineroService.saveOrUpdateMovDinero(movimiento);

    }

    @GetMapping("/movements/{id}")
    public MovimientoDinero movimientoPorId(@PathVariable("id") Integer id) {
        return movDineroService.getMovDineroById(id);


    }
    @GetMapping("/enterprises/{id}/movements")
    public ArrayList<MovimientoDinero> movimientosPorEmpresa(@PathVariable("id") Integer id) {
        return movDineroService.obtenerPorEmpresa(id);
    }

    @PatchMapping("/movements/{id}")
    public MovimientoDinero actualizarMovimiento(@PathVariable("id") Integer id, @RequestBody MovimientoDinero movimiento) {
        MovimientoDinero mov = movDineroService.getMovDineroById(id);
        mov.setConcepto(movimiento.getConcepto());
        mov.setMonto(movimiento.getMonto());
        mov.setUsuario(movimiento.getUsuario());
        return movDineroService.saveOrUpdateMovDinero(mov);
    }

    @DeleteMapping("/movements/{id}")
    public String deleteMovimiento(@PathVariable("id") Integer id) {
        boolean respuesta = movDineroService.deleteMovimientoDinero(id);
        if (respuesta) {
            return "Successfully deleted move with Id" + id;

        }
        return "Could not delete move with Id" + id;
    }

    @GetMapping("/users/{id}/movements")
    public ArrayList<MovimientoDinero> movimientosPorEmpleado(@PathVariable("id") Integer id) {
        return movDineroService.obtenerPorEmpleado(id);
    }

    /*@GetMapping("/enterprises/{id}/movements")
    public ArrayList<MovimientoDinero> movimientosPorEmpresa(@PathVariable("id") Integer id) {
        return movDineroService.obtenerPorEmpresa(id);
    }*/
/*
    @PostMapping("/enterprises/{id}/movements")
    public Empresa MovDineroPorId(@RequestBody Empresa emp) {
        return this.empresaService.saveOrUpdateEmpresa(emp);

    }*/
}
