package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empleado;
import com.linag.ciclo3.clases.Empresa;
import com.linag.ciclo3.clases.MovimientoDinero;

//@SpringBootApplication
public class main {

    public static void main(String[] args) {
        //SpringApplication.run(main.class, args);
        Empresa empresa = new Empresa("Code Doom S.A.S", "Calle Luna-Calle Sol", "123654789", "911-200101");

//EMPRESA
        //Nombre
        System.out.println(empresa.getNombreEmpresa());
        System.out.println("Modificacion Nombre Empresa");
        empresa.setNombreEmpresa("SoftCode S.A");
        System.out.println(empresa.getNombreEmpresa());

        //Direccion
        System.out.println(empresa.getDireccionEmpresa());
        System.out.println("Modificacion Direccion Empresa");
        empresa.setDireccionEmpresa("Calle Luna #384-400");
        System.out.println(empresa.getDireccionEmpresa());

        //Telefono
        System.out.println(empresa.getTelefonoEmpresa());
        System.out.println("Modificacion Telefono Empresa");
        empresa.setTelefonoEmpresa("987456321");
        System.out.println(empresa.getTelefonoEmpresa());

        //NIT
        System.out.println(empresa.getNIT());
        System.out.println("Modificacion NIT Empresa");
        empresa.setNIT("911-202221");
        System.out.println(empresa.getNIT());


        //EMPLEADO

        Empleado empleado = new Empleado("GONZALEZ,ROSA JULIA", "RosaJGonza@gmail.com", "la Salle A.S", "administrativo");
        //Nombre
        System.out.println(empleado.getNombreEmpleado());
        System.out.println("Modificacion Nombre Empleado");
        empleado.setNombreEmpleado("Nina Patrice Bell");
        System.out.println(empleado.getNombreEmpleado());

        //correo
        System.out.println(empleado.getCorreoEmpleado());
        System.out.println("Modificacion correo Empleado");
        empleado.setCorreoEmpleado("momabell@gmail.com");
        System.out.println(empleado.getCorreoEmpleado());

        //empresa
        System.out.println(empleado.getEmpresaEmpleado());
        System.out.println("Modificacion Empresa a la que el Empleado pertenece");
        empleado.setEmpresaEmpleado("Rio Bravo S.A.S");
        System.out.println(empleado.getEmpresaEmpleado());

        //rolEmpleado
        System.out.println(empleado.getRolEmpleado());
        System.out.println("Modificacion rol Empleado");
        empleado.setRolEmpleado("operativo");
        System.out.println(empleado.getRolEmpleado());

        //MOVIMIENTODINERO
        MovimientoDinero movimientoDinero= new MovimientoDinero(50000000,"ingreso","GONZALEZ,ROSA JULIA","la Salle A.S" );

        //montomovimiento
        System.out.println(movimientoDinero.getMontoMovimiento());
        System.out.println("Este es el nuevo Monto");
        movimientoDinero.setMontoMovimiento(100000000);
        System.out.println(movimientoDinero.getMontoMovimiento());

        //montos positivos y negativos
        System.out.println(movimientoDinero.getMontoMovimiento());
        System.out.println("Monto negativo");
        movimientoDinero.setMontoMovimiento(-500000);
        System.out.println("Monto positivo");
        movimientoDinero.setMontoMovimiento(90215);
        System.out.println(movimientoDinero.getMontoMovimiento());

        //ConceptoMovimiento
        System.out.println(movimientoDinero.getConceptoMovimiento());
        /*System.out.println("Este es el nuevo Monto");*/
        movimientoDinero.setConceptoMovimiento("Consignacion antes ingreso");
        System.out.println(movimientoDinero.getConceptoMovimiento());

        //Empleado
        System.out.println("Usuario encargado de registrar movimiento");
        empleado.setNombreEmpleado("Nina Patrice Bell");
        System.out.println(empleado.getNombreEmpleado());


    }


}
