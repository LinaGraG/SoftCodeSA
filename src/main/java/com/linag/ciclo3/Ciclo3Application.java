package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empleado;
import com.linag.ciclo3.clases.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Ciclo3Application {

    public static void main(String[] args) {
        //SpringApplication.run(Ciclo3Application.class, args);
        Empresa empresa = new Empresa("Soft Code S.A", "Calle Luna-Calle Sol", "123654789", "911-200101");

//EMPRESA
        //Nombre
        System.out.println(empresa.getNombreEmpresa());
        empresa.setNombreEmpresa("SoftCode S.A");
        System.out.println(empresa.getNombreEmpresa());

        //Direccion
        System.out.println(empresa.getDireccionEmpresa());
        empresa.setDireccionEmpresa("Calle Luna #384-400");
        System.out.println(empresa.getDireccionEmpresa());

        //Telefono
        System.out.println(empresa.getTelefonoEmpresa());
        empresa.setTelefonoEmpresa("987456321");
        System.out.println(empresa.getTelefonoEmpresa());

        //NIT
        System.out.println(empresa.getNIT());
        empresa.setNIT("911-202221");
        System.out.println(empresa.getNIT());


        /*//EMPLEADO
        Empleado empleado = new Empleado("GONZALEZ,ROSA JULIA", "RosaJGonza@gmail.com", "administrativo");
        //Nombre
        System.out.println(empleado.getNombreEmpleado());
        empleado.setNombreEmpleado("Nina Patrice Bell");
        System.out.println(empleado.getNombreEmpleado());*/
    }


}
