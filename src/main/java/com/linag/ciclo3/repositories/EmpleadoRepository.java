package com.linag.ciclo3.repositories;

import com.linag.ciclo3.entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpleadoRepository extends CrudRepository<Empleado,Integer> {
}
