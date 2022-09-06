package com.linag.ciclo3.repositories;

import com.linag.ciclo3.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {

}
