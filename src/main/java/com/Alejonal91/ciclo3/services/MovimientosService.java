package com.Alejonal91.ciclo3.services;

/*

import com.linag.ciclo3.repo.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class MovimientosService {
    @Autowired
    MovimientosRepository movimientosRepository;*/

/*//!!!SERVICIOS BASICOS ENTIDAD MOVIMIENTO!!!

    //Metodo que muestra todods loa movimientos sin ningun filtro
    public List<MovimientoDinero> getAllMovimientos() {
        List<MovimientoDinero> movimientosList = new ArrayList<>();
        movimientosRepository.findAll().forEach(movimiento -> movimientosList.add(movimiento));  //Recorremos el iterable que regresa el metodo findAll del Jpa y lo guardamos en la lista creada
        return movimientosList;
    }

    // Ver movimientos pod id
    public MovimientoDinero getMovimientoById(Integer id) {
        return movimientosRepository.findById(id).get();
    }

    //Guardar o actualizar elemntos
    public MovimientoDinero saveOrUpdateMovimiento(MovimientoDinero movimientoDinero) {
        MovimientoDinero mov = movimientosRepository.save(movimientoDinero);
        return mov;
    }

    //Metodo para eliminar movimientos teniendo el id
    public boolean deleteMovimiento(Integer id) {//Eliminar usando el metodo que nos ofrece el reposotorio
        if (this.movimientosRepository.findById(id).isPresent()) {//Si al buscar el movimiento lo encontramos, no se eliminó (false)
            return false;
        }
        return true;//Si al buscar el movimiento no lo encontramos, si lo eliminò (true)
    }
    //!!!SERVICIOS FILTRADO ENTIDAD MOVIMIENTO!!!

    //Obterner teniendo en cuenta el id del empleado
    public ArrayList<MovimientoDinero> obtenerPorEmpleado(Integer id){
        return movimientosRepository.findByEmpleado(id);
    }
    //Obtener movimientos teniendo en cuenta el id de la empresa a la que pertencen los empleados que la registraron
    public ArrayList<MovimientoDinero> obtenerPorEmpresa(Integer id){
        return movimientosRepository.findByEmpresa(id);

    }*/


