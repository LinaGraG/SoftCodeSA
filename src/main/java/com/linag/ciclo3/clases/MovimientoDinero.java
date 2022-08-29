package com.linag.ciclo3.clases;

<<<<<<< HEAD


public class MovimientoDinero {
    //Atributos
    private int Id;
    private long montoMovimiento;
    private String conceptoMovimiento;
    private Empleado empleado;
    private Empresa empresa;


    //MÉTODO





    //Getter and setter

    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

=======
public class MovimientoDinero {

//Atributos
    private int Id;
    private long montoMovimiento;
    private String conceptoMovimiento;
    private String empleado;
    private String empresa;

    //Constructor


    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento, String empleado, String empresa) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleado = empleado;
        this.empresa = empresa;
    }





    //Metodos



    //Getters and setters


>>>>>>> main
    public int getId() {
        return Id;
    }

<<<<<<< HEAD
    public void setId(int Id) {
        this.Id = Id;
=======
    public void setId(int id) {
        Id = id;
>>>>>>> main
    }

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
<<<<<<< HEAD
=======

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
>>>>>>> main
}
