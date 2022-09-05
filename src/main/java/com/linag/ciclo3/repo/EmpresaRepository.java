package com.linag.ciclo3.repo;

import com.linag.ciclo3.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotacion que le dice a spring que esto es un repositorio

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {

}

