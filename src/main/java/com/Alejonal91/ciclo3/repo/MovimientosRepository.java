/*
package com.linag.ciclo3.repo;

import MovimientoDinero;
import com.linag.ciclo3.modelos.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository

public interface MovimientosRepository  extends JpaRepository <MovimientoDinero,Integer> {

    //!!!METODO QUE FILTRA MOVIMINETOS POR EMPLEADO

    @Query (value = "SELECT	*	FROM movimientos WHERE empleado_id=?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmpleado(Integer id);


//!!!!METODO PARA FILTRAR MOVIMIENTOS POR EMPRESA
@Query(value="select * from movimientos where empleado_id in (select id from empleado where empresa_id= ?1)", nativeQuery = true)
public abstract ArrayList<MovimientoDinero> findByEmpresa(Integer id);
}*/
