package com.linag.ciclo3.clases;

<<<<<<< HEAD
=======


>>>>>>> main
public class Empleado {
    //Atributos
    private int Id;
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;


<<<<<<< HEAD
    //Constructor
=======
//Constructor
>>>>>>> main

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }
<<<<<<< HEAD
    //MÉTODO



    //Getter and setter
=======

    public Empleado(String nombreEmpleado, String correoEmpleado, String administrativo) {

    }

    //METODO

    //getters and setters

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

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
