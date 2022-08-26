package com.linag.ciclo3.clases;

public class Empresa {

    //Atributos
    private String nombreEmpresa;
    private String direccion;
    private int telefono;
    private int nit;

    //Costructor
        public Empresa(String nombreEmpresa, String direccion, int telefono, int nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    //metodo
    public String test(){
//		instanciar empresa
        Empresa emp = new Empresa( "nombreEmpresa", "direccion", "telefono6","nit");
// Cambiar nombre
        emp.setNombre("SoftCode S.A");
//	crear nombre
        System.out.println("Se Creo la empresa y se renombro");
        return emp.getNombre();

    }


    //Getters and Setters

    public String getNombreEmpresa()
    {return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
