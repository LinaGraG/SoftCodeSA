package com.linag.ciclo3.services;


import com.linag.ciclo3.entities.MovimientoDinero;
import com.linag.ciclo3.repositories.MovDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovDineroService {
    @Autowired
    MovDineroRepository movDineroRepository;

    public List<MovimientoDinero> getAllMovDinero() {
        List<MovimientoDinero> movDineroList = new ArrayList<>();
        movDineroRepository.findAll().forEach(movimientoDinero -> movDineroList.add(movimientoDinero));
        return movDineroList;
    }

    public MovimientoDinero getMovDineroById(Integer id) {
        return movDineroRepository.findById(id).get();
    }

    public MovimientoDinero saveOrUpdateMovDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero mov = movDineroRepository.save(movimientoDinero);
        return mov;
    }

    public boolean deleteMovimientoDinero(Integer id) {
        movDineroRepository.deleteById(id);
        if (this.movDineroRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
    public ArrayList<MovimientoDinero> obtenerPorEmpleado(Integer id){
        return this.movDineroRepository.findByEmpleado(id);
    }
    public ArrayList<MovimientoDinero> obtenerPorEmpresa(Integer id){
return movDineroRepository.findByEmpresa(id);
    }

}

