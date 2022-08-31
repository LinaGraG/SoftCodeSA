package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empleado;
import com.linag.ciclo3.clases.Empresa;
import com.linag.ciclo3.clases.MovimientoDinero;

//@SpringBootApplication
public class main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa(0102030405, "Code Doom S.A.S","Calle Luna-Calle Sol","123654789", "911-200101");
        Empleado empleado = new Empleado(0102030405,"GONZALEZ,ROSA JULIA", "RosaJGonza@gmail.com", empresa, "administrativo");
        MovimientoDinero movimientoDinero= new MovimientoDinero(0102030405,546.4464654,"ingreso",empleado);
        System.out.println(empresa);
        System.out.println(empleado);
        System.out.println(movimientoDinero);

    }
}