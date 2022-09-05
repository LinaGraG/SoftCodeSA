package com.linag.ciclo3.service;

import com.linag.ciclo3.modelos.Empleado;
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

    //Metodo para ver todos los empleados registrados
    public List<Empleado> getAllEmpleado() {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;

    }

    //Metodo para buscar empleados por ID
    public Optional<Empleado> getEmpleadoById(Integer id) { //Existe optional ya si se [uede usar
        return empleadoRepository.findById(id);
    }

    //Metodo para buscar empleados por empresa
    public ArrayList<Empleado> obtenerPorEmpresa(Integer id) {
        return empleadoRepository.findByEmpresa(id);
    }

    //Metodo para Guardar o actulizar  registros en empleados
    public Empleado saveOrUpdateEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    //Metodo para eliminar un registro de Empleado por Id
    public boolean deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
        if (empleadoRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
}
