package com.linag.ciclo3.clases;

public class Empresa {
    //Atributos
    private int Id;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
<<<<<<< HEAD
    private String  NIT;
=======
    private String NIT;
>>>>>>> main

    //Constructor

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NIT) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NIT = NIT;
    }
<<<<<<< HEAD


    //MÉTODO

=======
//METODO
>>>>>>> main


    //getters and setters

<<<<<<< HEAD

=======
>>>>>>> main
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
