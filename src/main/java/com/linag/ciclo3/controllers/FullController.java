package com.linag.ciclo3.controllers;


import com.linag.ciclo3.entities.Empresa;
import com.linag.ciclo3.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FullController {

    @RestController
    public class Controllerfull {
        @Autowired
        EmpresaService empresaService;
        @GetMapping("/enterprises")
        public List<Empresa> verEmpresas() {
            return empresaService.getAllEmpresas();
        }
    }
}


    /*    @Autowired
        EmpleadoService empleadoService;

        @Autowired
        MovimientosService movimientosService;
*/

        //EMPRESAS

        //Ver json de todas las empresas


       /* //Guardar el json del body como una nueva empresa o registro en nuestra bd
        @PostMapping("/enterprises")
        public Empresa guardarEmpresa(@RequestBody Empresa emp) {
            return this.empresaService.saveOrUpdateEmpresa(emp);

        }

        //responses 200 en la ruta enterprises/[id]  GET
        @GetMapping(path = "enterprises/{id}")
        public Empresa empresaPorID(@PathVariable("id") Integer id) {
            return this.empresaService.getEmpresaById(id);
        }

        //Actualizar Empresa (patch full)
        @PatchMapping("/enterprises/{id}")
        public Empresa actualizarEmpresa(@PathVariable("id") Integer id, @RequestBody Empresa empresa) {
            Empresa emp = empresaService.getEmpresaById(id);
            emp.setNombre(empresa.getNombre());
            emp.setDireccion(empresa.getDireccion());
            emp.setTelefono(empresa.getTelefono());
            emp.setNIT(empresa.getNIT());
            return empresaService.saveOrUpdateEmpresa(emp);

        }

        //Borrar empresa
        @DeleteMapping(path = "enterprises/{id}") //Eliminar registro de la bd
        public String DeleteEmpresa(@PathVariable("id") Integer id) {
            boolean respuesta = this.empresaService.deleteEmpresa(id);
            if (respuesta) {  //Si respuesta es true?
                return "Se elimino la empresa con id" + id;
            } else {
                return "No se pudo eliminar la empresa con id" + id;
            }
        }*/
       /* //EMPLEADOS

        //Ver json de todos los empleados
        @GetMapping("/empleados")
        public List<Empleado> verEmpleados() {
            return empleadoService.getAllEmpleado();
        }

        @PostMapping("/empleados") //Guardar un empleado nuevo
        public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empl) {
            return Optional.ofNullable(this.empleadoService.saveOrUpdateEmpleado(empl));
        }

        @GetMapping("/empleados/{id}")//Consultar empleado por ID
        public Optional<Empleado> empleadoPorID(@PathVariable("id") Integer id) {
            return this.empleadoService.getEmpleadoById(id);
        }


        @GetMapping("/enterprises/{id}/empleados")// Consultar empleados por empresa
        public ArrayList<Empleado> EmpleadoPorEmpresa(@PathVariable("id") Integer id) {
            return this.empleadoService.obtenerPorEmpresa(id);

        }

        @PatchMapping("/empleados/{id}") //Metodo para modificar empleado por id
        public Empleado actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado) {
            Empleado empl = empleadoService.getEmpleadoById(id).get();
            empl.setNombre(empleado.getNombre());
            empl.setCorreo(empleado.getCorreo());
            empl.setEmpresa(empleado.getEmpresa());
            empl.setRol(empleado.getRol());
            return empleadoService.saveOrUpdateEmpleado(empl);
        }

        @DeleteMapping("/empleados/{id}") //Metodo para eliminar empleado por id
        public String DeleteEmpleado(@PathVariable("id") Integer id) {
            boolean respuesta = empleadoService.deleteEmpleado(id); //eliminamos el servicio de nuestro service
            if (respuesta) {// si la respusta boolean es true, si se elimino
                return "Se puedo eliminar correctamente el empleado con id" + id;

            }// si la respusta boolean es false, no se elimino
            return "No se pudo eliminar correctamente el empleado con id" + id;
        }
//MOVIMIENTOS

        //Consultar los moviminetos
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


