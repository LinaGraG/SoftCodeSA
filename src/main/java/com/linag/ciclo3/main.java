package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empleado;
import com.linag.ciclo3.clases.Empresa;
import com.linag.ciclo3.clases.MovimientoDinero;

//@SpringBootApplication
public class main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa(1215464, "jdjsdjjsdlk","564jdhdhd","121112", "hshshs");
        Empleado empleado = new Empleado(113231212,"465444","jjjlkj@hkjhkh",empresa,"administrador");
        MovimientoDinero movimientoDinero= new MovimientoDinero(121332,54644.64654,"hfhfhfhfh",empleado);
        System.out.println(empresa);
        System.out.println(empleado);
        System.out.println(movimientoDinero);


//EMPRESA


    }
}