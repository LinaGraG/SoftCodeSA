package com.linag.ciclo3.repositories;

import com.linag.ciclo3.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovDineroRepository extends JpaRepository<MovimientoDinero,Integer> {
    @Query (value = "SELECT * FROM movimientos WHERE empleado_id=?1",nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpleado(Integer id);

    @Query(value = "SELECT * FROM movimientos WHERE empleado_id IN (SELECT id FROM usuario WHERE empresa_id=?1)",nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpresa(Integer id);
}
