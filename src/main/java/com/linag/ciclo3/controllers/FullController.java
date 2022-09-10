package com.linag.ciclo3.controllers;


import com.linag.ciclo3.entities.Empleado;
import com.linag.ciclo3.entities.Empresa;
import com.linag.ciclo3.services.EmpleadoService;
import com.linag.ciclo3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FullController {

    @RestController
    public class Controllerfull {
        @Autowired
        EmpresaService empresaService;

        @Autowired
        EmpleadoService empleadoService;

       /* @Autowired
        MovimientosService movimientosService;*/

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
       /* EMPLEADOS*/

        //EMPLEADOS
        @GetMapping("/users") //Ver json de todas los empleados
        public List<Empleado> verEmpleados(){
            return empleadoService.getAllEmpleado();
        }

        @PostMapping("/users") //Guardar un empleado nuevo
        public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empl){
            return Optional.ofNullable(this.empleadoService.saveOrUpdateEmpleado(empl));
        }
        @GetMapping(path = "users/{id}")//Consultar empleado por ID
        public Optional<Empleado> empleadoPorID(@PathVariable("id") Integer id){
            return this.empleadoService.getEmpleadoById(id);
        }

        @GetMapping("/enterprises/{id}/users")// Consultar empleados por empresa
        public ArrayList<Empleado> EmpleadoPorEmpresa(@PathVariable("id") Integer id){
            return this.empleadoService.obtenerPorEmpresa(id);
        }

        @PatchMapping("/users/{id}")
        public Empleado actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado){
            Empleado empl=empleadoService.getEmpleadoById(id).get();
            empl.setNombre(empleado.getNombre());
            empl.setCorreo(empleado.getCorreo());
            empl.setEmpresa(empleado.getEmpresa());
            empl.setRol(empleado.getRol());
            return empleadoService.saveOrUpdateEmpleado(empl);
        }

        @DeleteMapping("/users/{id}") //Metodo para eliminar empleados por id
        public String DeleteEmpleado(@PathVariable("id") Integer id){
            boolean respuesta=empleadoService.deleteEmpleado(id); //eliminamos usando el servicio de nuestro service
            if (respuesta){ //si la respuesta booleana es true, si se eliminò
                return "The employee with ID could be deleted successfully "+ id;
            }//Si la respuesta booleana es false, no se eliminó
            return "Failed to successfully remove employee with Id "+ id;
        }
    }
}


//MOVIMIENTOS

        /*//Consultar los moviminetos
        @GetMapping("/movimientos")
        public List<MovimientoDinero> verMovimientos() {
            return movimientosService.getAllMovimientos();
        }

        //Guardar los movimientos
        @PostMapping("/movimientos")
        public MovimientoDinero guardarMovimiento(@RequestBody MovimientoDinero movimiento) {
            return movimientosService.saveOrUpdateMovimiento(movimiento);
        }

        //Consultar los movimientos por id
        @GetMapping("/movimientos/{id}")
        public MovimientoDinero movimientoPorId(@PathVariable("id") Integer id) {
            return movimientosService.getMovimientoById(id);
        }

        //Editar Movimientos
        @PatchMapping("/movimientos/{id}")
        public MovimientoDinero actualizarMovimiento(@PathVariable("id") Integer id, @RequestBody MovimientoDinero movimiento) {
            MovimientoDinero mov = movimientosService.getMovimientoById(id);
            mov.setConcepto(movimiento.getConcepto());
            mov.setMonto(movimiento.getMonto());
            mov.setUsuario(movimiento.getUsuario());
            return movimientosService.saveOrUpdateMovimiento(mov);

        }

        //Borra
        @DeleteMapping("/movimientos/{id}")
        public String deleteMovimiento(@PathVariable("id") Integer id) {
            boolean respuesta = movimientosService.deleteMovimiento(id);
            if (respuesta) {
                return "Se elimino correctamente el movimiento con id " + id;
            }
            return "No se pudo eliminar el movimiento con id " + id;
        }

        //Consultar movimiento por id de empleado
        @GetMapping("/empleados/{id}/movimientos")
        public ArrayList<MovimientoDinero> movimientosPorEmpleado(@PathVariable("id") Integer id) {
            return movimientosService.obtenerPorEmpleado(id);
        }

        //Consultar movimiento que pertenece a una empresa por id de empresa
        @GetMapping("/enterprises/{id}/movimientos")
        public ArrayList<MovimientoDinero> movimientosPorEmpresa(@PathVariable("id") Integer id) {
            return movimientosService.obtenerPorEmpresa(id);
        }
    }*/


