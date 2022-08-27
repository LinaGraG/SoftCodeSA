package com.linag.ciclo3.clases;

public class MovimientoDinero {
    //Atriibutos
    private int Id;
    private long montoMovimiento;
    private String  conceptoMovimiento;
//	private Empleado usuario;//
//	private Empresa empresa;//
//	private Date createdAt;//
//	private Date updateAt;//

    //MÉTODO





    //Getter and setter

    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
}
