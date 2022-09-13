package com.linag.ciclo3.repositories;

import com.linag.ciclo3.entities.Empleado;
import com.linag.ciclo3.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface EmpleadoRepository extends CrudRepository<Empleado,Integer> {
    @Query(value = "SELECT * FROM usuario WHERE empresa_id= ?1" , nativeQuery = true)
    public abstract ArrayList<Empleado> findByEmpresa(Integer id);


    @Query(value="SELECT * FROM usuario WHERE empleado_1 IN (SELECT id FROM usuario WHERE empresa_id=?1)", nativeQuery=true)
    public abstract ArrayList<Empleado> findByEmpleado(Integer id);


}
