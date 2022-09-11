package com.linag.ciclo3.services;

import com.linag.ciclo3.entities.Empresa;
import com.linag.ciclo3.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class EmpresaService {
    @Autowired   //Conectamos esta clase con el repository de Empresa
    EmpresaRepository empresaRepository;

    //Metodo que retornará la lista de empresas usando metodos heredados del jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));  //Recorremos el iterable que regresa el metodo findAll del Jpa y lo guardamos en la lista creada
        return empresaList;
    }

    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Empresa
    public Empresa saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp=empresaRepository.save(empresa);
        return emp;
    }

    //Metodo para eliminar empresas registradas teniendo el id
    public boolean deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);  //Eliminar

        if (empresaRepository.findById(id)!=null){  //Verificacion del servicio eliminacion
            return true;
        }
        return false;
    }
}
