package com.Alejonal91.ciclo3.repositories;

import com.Alejonal91.ciclo3.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {

}
