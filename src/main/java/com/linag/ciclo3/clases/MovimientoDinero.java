package com.linag.ciclo3.clases;

public class MovimientoDinero {

//Atributos
    private int Id;
    private double monto;
    private String concepto;
    private Empleado usuario;

    public MovimientoDinero(int id, double monto, String concepto, Empleado usuario) {
        Id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "Id=" + Id +
                ", monto=" + monto +
                ", concepto='" + concepto + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
