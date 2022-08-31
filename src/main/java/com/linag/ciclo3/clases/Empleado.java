package com.linag.ciclo3.clases;


public class Empleado {
    //Atributos
    private int Id;
    private String usuario;
    private String correo;
    private Empresa empresa;
    private String rol;

    public Empleado(int id, String usuario, String correo, Empresa empresa, String rol) {
        Id = id;
        this.usuario = usuario;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

//    public Empleado(int id, String usuario, String correo, Empresa empresa, String rol) {
//        Id = id;
//
//        this.correo = correo;
//        this.empresa = empresa;
//        if (rol.equalsIgnoreCase("administrador") || rol.equalsIgnoreCase("operativo")) {
//            this.rol = rol;
//        } else {
//            System.out.println("Este rol no existe;");
//        }

//    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Id=" + Id +
                ", usuario='" + usuario + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa=" + empresa +
                ", rol='" + rol + '\'' +
                '}';
    }
}

