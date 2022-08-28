package com.linag.ciclo3.clases;

public class MovimientoDinero {

//Atributos
    private int Id;
    private long montoMovimiento;
    private String conceptoMovimiento;
    private Empleado empleado;
    private Empresa empresa;

    //Constructor

    public MovimientoDinero(int id, long montoMovimiento, String conceptoMovimiento, Empleado empleado, Empresa empresa) {
        Id = id;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleado = empleado;
        this.empresa = empresa;
    }

    //Metodos



    //Getters and setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
