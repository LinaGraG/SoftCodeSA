package com.linag.ciclo3.services;/*
package com.linag.ciclo3.services;
*/

import com.linag.ciclo3.entities.Empleado;

import com.linag.ciclo3.repo.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    /*Metodo para VER todos los empleados registrados*/
    public List<Empleado> getAllEmpleado() {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }

    /*Metodo para BUSCAR empleados por ID*/
    public Optional<Empleado> getEmpleadoById(Integer id) {
        return empleadoRepository.findById(id);
    }

    /*Metodo para BUSCAR empleados por EMPRESA*/
    public ArrayList<Empleado> obtenerPorEmpresa(Integer id) {
        return empleadoRepository.findByEmpresa(id);
    }

    /*Metodo para GUARDAR o ACTUALIZAR  registros en empleados*/
    public Empleado saveOrUpdateEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    /*Metodo para  ELIMINAR un  registro de   EMPLEADO por ID*/

    public boolean deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
        if (empleadoRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
}




