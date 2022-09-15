package com.linag.ciclo3.services;


import com.linag.ciclo3.entities.MovimientoDinero;
import com.linag.ciclo3.repositories.MovDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<MovimientoDinero> movDinero=movDineroRepository.findById(id);
        return movDinero.orElse(null);
    }

    public MovimientoDinero patchmovDinero(Integer id , MovimientoDinero movDinero) {
        Optional<MovimientoDinero> mov = movDineroRepository.findById(id);
        if (mov.isPresent()) {
            MovimientoDinero moviDinero = mov.get();
            moviDinero.setConcepto(movDinero.getConcepto());
            moviDinero.setMonto(movDinero.getMonto());
            moviDinero.setUsuario(movDinero.getUsuario());
            return this.movDineroRepository.save(moviDinero);

        }
        return null;
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

